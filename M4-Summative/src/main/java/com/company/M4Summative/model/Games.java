package com.company.M4Summative.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Game")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotNull
    @Column(name = "game_id")
    private Integer id;

    @NotNull
//  @NotEmpty(message = "You must supply a value for Title")
    @Length(max = 50, min = 1)
    private String title;

    @NotNull
    @Column(name = "esrb_rating ")
//  @NotEmpty(message = "You must supply a value for ESRBRating")
    @Length(max = 50, min = 1)
    private int ESRBRating;

    @NotNull
//  @NotEmpty(message = "You must supply a value for description ")
    @Length(max = 255, min = 1)
    private String description;

    @NotNull
//  @NotEmpty(message = "You must supply a value for Price")
    private BigDecimal price;

    @NotNull
//  @NotEmpty(message = "You must supply a value for Name")
    private String name;

    @NotNull
//  @NotEmpty(message = "You must supply a value for Studio")
    @Length(max = 50, min = 1)
    private String studio;

    @NotNull
    private int quantity;

    public Games(Integer id, String title, int ESRBRating, String description, BigDecimal price, String name, String studio, int quantity) {
        this.id = id;
        this.title = title;
        this.ESRBRating = ESRBRating;
        this.description = description;
        this.price = price;
        this.name = name;
        this.studio = studio;
        this.quantity = quantity;
    }

    public Games() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return ESRBRating == games.ESRBRating && quantity == games.quantity && Objects.equals(id, games.id) && Objects.equals(title, games.title) && Objects.equals(description, games.description) && Objects.equals(price, games.price) && Objects.equals(name, games.name) && Objects.equals(studio, games.studio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, ESRBRating, description, price, name, studio, quantity);
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", ESRBRating=" + ESRBRating +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", studio='" + studio + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getESRBRating() {
        return ESRBRating;
    }

    public void setESRBRating(int ESRBRating) {
        this.ESRBRating = ESRBRating;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}