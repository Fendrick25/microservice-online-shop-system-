package com.online.shop.system.order.service.domain.dto.message;

import com.online.shop.system.order.service.domain.valueobject.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class UpdateOrderDetail {
    @NotNull
    private UUID orderID;
    @NotNull
    private UUID userID;
    @NotNull
    private OrderStatus orderStatus;
    private String message;
}
