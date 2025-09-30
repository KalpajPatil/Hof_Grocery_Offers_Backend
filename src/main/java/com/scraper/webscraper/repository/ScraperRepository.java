package com.scraper.webscraper.repository;

import com.scraper.webscraper.entity.Kaufland;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScraperRepository extends JpaRepository<Kaufland, Integer> {
}
