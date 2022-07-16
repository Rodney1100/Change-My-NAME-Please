package com.company.M4Summative.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;


public class SalesTaxRate {
    @Entity
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Table(name = "sales_tax_rate")
    public class TShirts {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @NotNull
        @Length(max = 2)
        private String state;

        @NotNull
        private BigDecimal rate;

        public TShirts(String state, BigDecimal rate) {
            this.state = state;
            this.rate = rate;
        }

        @Override
        public String toString() {
            return "TShirts{" +
                    "state='" + state + '\'' +
                    ", rate=" + rate +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TShirts tShirts = (TShirts) o;
            return Objects.equals(state, tShirts.state) && Objects.equals(rate, tShirts.rate);
        }


        @Override
        public int hashCode() {
            return Objects.hash(state, rate);
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public BigDecimal getRate() {
            return rate;
        }

        public void setRate(BigDecimal rate) {
            this.rate = rate;
        }
    }
}

