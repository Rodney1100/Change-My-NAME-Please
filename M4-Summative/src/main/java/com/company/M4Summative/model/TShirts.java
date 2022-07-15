package com.company.M4Summative.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "TShirts")
public class TShirts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double price;
    private String name;
    private String size;
    private String color;

    public TShirts(Integer id, double price, String name, String size, String color) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public TShirts() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TShirts tShirts = (TShirts) o;
        return Double.compare(tShirts.price, price) == 0 && Objects.equals(id, tShirts.id) && Objects.equals(name, tShirts.name) && Objects.equals(size, tShirts.size) && Objects.equals(color, tShirts.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, name, size, color);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TShirts{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}