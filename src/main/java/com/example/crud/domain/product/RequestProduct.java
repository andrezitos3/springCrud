package com.example.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(String id, @NotBlank String nome, @NotNull Integer preco_em_reais) {
}


