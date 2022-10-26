package com.online.shop.system.service.domain.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;


@Getter
@Builder
@AllArgsConstructor
public class UpdateCategory {
    @NotNull
    private final UUID categoryID;
    @NotNull
    private final String name;
}
