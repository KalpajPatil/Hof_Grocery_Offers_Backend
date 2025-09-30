package com.scraper.webscraper.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "discount_items_kaufland")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Kaufland {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String subtitle;

    private String image;

    private float discount;

    private float old_price;

    private float current_price;

}
