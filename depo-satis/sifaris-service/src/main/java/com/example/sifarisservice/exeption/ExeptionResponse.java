package com.example.sifarisservice.exeption;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Data
public class ExeptionResponse {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;
    private String path;


}
