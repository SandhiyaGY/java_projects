package com.projects.Festibill.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="festivals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Festival {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private Double discountPercentage;

    private Double minimumAmount;
}