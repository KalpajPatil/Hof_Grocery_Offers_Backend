package com.scraper.webscraper.controller;

import com.scraper.webscraper.entity.Aldi;
import com.scraper.webscraper.entity.Kaufland;
import com.scraper.webscraper.exception.AldiOfferException;
import com.scraper.webscraper.exception.KauflandOfferException;
import com.scraper.webscraper.service.ScraperService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ScraperController {

    private final ScraperService scraperService;

    public ScraperController(ScraperService scraperService){
        this.scraperService = scraperService;
    }

    @GetMapping("/kaufland")
    public ResponseEntity<List<Kaufland>> getKauflandProductsOnOffer() throws KauflandOfferException {
        if(!scraperService.getAllKauflandProductsOnOffer().isEmpty()){
            return new ResponseEntity<>(scraperService.getAllKauflandProductsOnOffer(), HttpStatus.OK);
        }else{
            throw new KauflandOfferException("no products on offer today, come back tomorrow");
        }
    }

    @GetMapping("/aldi")
    public ResponseEntity<List<Aldi>> getAldiProductsOnOffer() throws AldiOfferException {
        if(!scraperService.getAllAldiProductsOnOffer().isEmpty()){
            return new ResponseEntity<>(scraperService.getAllAldiProductsOnOffer(), HttpStatus.OK);
        }else{
            throw new AldiOfferException("no products on offer today, come back tomorrow");
        }
    }

}


