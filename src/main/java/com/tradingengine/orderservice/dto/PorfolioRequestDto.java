package com.tradingengine.orderservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record PorfolioRequestDto(
        @NotEmpty
        String name
) {
}