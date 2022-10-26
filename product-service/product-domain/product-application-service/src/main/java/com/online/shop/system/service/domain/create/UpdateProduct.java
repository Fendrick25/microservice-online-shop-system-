package com.online.shop.system.service.domain.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder
public class UpdateProduct {
    @NotNull
    private final UUID productID;
    @NotNull
    private final String name;
    @NotNull
    private final String description;
    @NotNull
    private final BigDecimal price;
    @NotNull
    private final int quantity;
}
