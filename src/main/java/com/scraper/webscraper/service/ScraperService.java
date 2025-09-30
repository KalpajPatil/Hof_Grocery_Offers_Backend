package com.scraper.webscraper.service;

import com.scraper.webscraper.entity.Aldi;
import com.scraper.webscraper.entity.Kaufland;
import com.scraper.webscraper.repository.AldiScraperRepo;
import com.scraper.webscraper.repository.ScraperRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScraperService {

    private final ScraperRepository scraperRepository;
    private final AldiScraperRepo aldiScraperRepo;

    public ScraperService(ScraperRepository scraperRepository, AldiScraperRepo aldiScraperRepo){
        this.scraperRepository = scraperRepository;
        this.aldiScraperRepo = aldiScraperRepo;
    }

    public List<Kaufland> getAllKauflandProductsOnOffer(){
        return scraperRepository.findAll();
    }

    public List<Aldi> getAllAldiProductsOnOffer(){
        return aldiScraperRepo.findAll();
    }


}
