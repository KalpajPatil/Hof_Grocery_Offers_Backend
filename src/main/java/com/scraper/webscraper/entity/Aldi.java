package com.scraper.webscraper.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "discount_items_aldi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aldi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private float price;

    private String image;
}
