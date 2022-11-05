package com.online.shop.system.product.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateProductReview {
    @NotNull
    private final UUID productID;
    @NotNull
    private final UUID userID;
    @NotNull
    private final String username;
    @NotNull
    private final int rating;
    private String description;
}