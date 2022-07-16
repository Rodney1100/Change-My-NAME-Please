package com.company.M4Summative.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "t_shirt")
public class TShirts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotNull
    @Column(name = "t_shirt_id")
    private Integer id;

    @NotNull
    @Length(max = 20)
    private String size;

    @NotNull
    @Length(max = 20)
    private double color;

    @NotNull
    @Length(max = 255, min = 1)
    private String description;

    @NotNull
    private BigDecimal price;

    @NotNull
    private int quantity;


    public TShirts(Integer id, String size, double color, String description, BigDecimal price, int quantity) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public TShirts() {
    }

    @Override
    public String toString() {
        return "TShirts{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", color=" + color +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getColor() {
        return color;
    }

    public void setColor(double color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}