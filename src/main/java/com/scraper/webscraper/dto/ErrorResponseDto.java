package com.scraper.webscraper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseDto {
    private int errorCode;
    private String errorMessage;
    private LocalDateTime errorTimestamp;
    private boolean hasError;
}
