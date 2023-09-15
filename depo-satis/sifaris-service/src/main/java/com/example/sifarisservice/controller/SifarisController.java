package com.example.sifarisservice.controller;

import com.example.sifarisservice.cllient.SifarisClinet;
import com.example.sifarisservice.cllient.dto.response.MehsulClinetResponse;
import com.example.sifarisservice.domain.Sifaris;
import com.example.sifarisservice.service.SifarisService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sifarisler")
@RequiredArgsConstructor
public class SifarisController {
    private final SifarisService sifarisService;

    @PostMapping()
    public Sifaris sifarisEt( @RequestBody @Valid Sifaris sifaris){

        return new ResponseEntity<>( sifarisService.satis(sifaris), HttpStatus.CREATED).getBody();

    }

}
