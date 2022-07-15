package com.company.M4Summative.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Consoles")
public class Consoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double price;
    private String name;
    private String manufacturer;

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consoles consoles = (Consoles) o;
        return Double.compare(consoles.price, price) == 0 && Objects.equals(id, consoles.id) && Objects.equals(name, consoles.name) && Objects.equals(manufacturer, consoles.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, name, manufacturer);
    }

    public Consoles(Integer id, double price, String name, String manufacturer) {
        id = id;
        this.price = price;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public Consoles() {
    }

    @Override
    public String toString() {
        return "Consoles{" + "id=" + id + ", price=" + price + ", name='" + name + '\'' + ", manufacturer='" + manufacturer + '\'' + '}';
    }
}