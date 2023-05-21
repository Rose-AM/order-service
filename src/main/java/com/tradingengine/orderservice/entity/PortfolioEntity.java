package com.tradingengine.orderservice.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name = "portfolio")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PortfolioEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long portfolioId;
    private String name;
    private  Long clientId;
}