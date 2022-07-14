package com.company.M4Summative.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Games")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double price;
    private double ESRBRating;
    private String name;
    private String studio;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return Double.compare(games.price, price) == 0 && Double.compare(games.ESRBRating, ESRBRating) == 0 && Objects.equals(id, games.id) && Objects.equals(name, games.name) && Objects.equals(studio, games.studio) && Objects.equals(title, games.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, ESRBRating, name, studio, title);
    }

    public Games(Integer id, double price, double ESRBRating, String name, String studio, String title) {
        id = id;
        this.price = price;
        this.ESRBRating = ESRBRating;
        this.name = name;
        this.studio = studio;
        this.title = title;
    }

    public Games() {
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

    public double getESRBRating() {
        return ESRBRating;
    }

    public void setESRBRating(double ESRBRating) {
        this.ESRBRating = ESRBRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", price=" + price +
                ", ESRBRating=" + ESRBRating +
                ", name='" + name + '\'' +
                ", studio='" + studio + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}