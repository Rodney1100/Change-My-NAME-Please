package com.company.M4Summative.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "processingFee")
public class ProcessingFee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotNull
    @Column(name = "console_id")
    private Integer id;

    @NotNull
    @Column(name = "product_type")
    @Length(max = 20,min = 1)
    private String productType;

    @NotNull
    private BigDecimal fee;


}
