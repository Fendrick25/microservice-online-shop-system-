package com.online.shop.system.product.service.messaging.listener.kafka;

import com.online.shop.system.kafka.avro.model.ProductRatingAvroModel;
import com.online.shop.system.kafka.consumer.KafkaConsumer;
import com.online.shop.system.product.service.domain.ports.input.message.listener.ProductReviewMessageListener;
import com.online.shop.system.product.service.messaging.mapper.ProductMessagingDataMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProductRatingKafkaListener implements KafkaConsumer<ProductRatingAvroModel> {

    private final ProductReviewMessageListener productReviewMessageListener;
    private final ProductMessagingDataMapper productMessagingDataMapper;

    @Override
    @KafkaListener(id = "${kafka-consumer-config.product-review-group-id}", topics = "${product-service.product-review-topic-name}")
    public void receive(@Payload List<ProductRatingAvroModel> messages,
                        @Header(KafkaHeaders.RECEIVED_KEY) List<String> keys,
                        @Header(KafkaHeaders.RECEIVED_PARTITION) List<Integer> partitions,
                        @Header(KafkaHeaders.OFFSET) List<Long> offsets) {
        log.info("{} number of product-review create messages received with keys {}, partitions {} and offsets {}",
                messages.size(),
                keys.toString(),
                partitions.toString(),
                offsets.toString());

        messages.forEach(productRatingAvroModel ->
                productReviewMessageListener.productReviewCreated(productMessagingDataMapper
                        .productRatingAvroModelToProductRating(productRatingAvroModel)));
    }
}
