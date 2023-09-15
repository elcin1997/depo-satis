package com.example.deposervice.controller;

import com.example.deposervice.dto.requset.MehsulRequset;
import com.example.deposervice.dto.requset.SifarisciRequset;
import com.example.deposervice.dto.response.SifarisciResponse;
import com.example.deposervice.service.SifarisciService;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sifarisciler")
@RequiredArgsConstructor
public class SifarisciController {
    private final SifarisciService sifarisciService;
    @PostMapping
    private SifarisciResponse cereate(@RequestBody @Valid SifarisciRequset requset){
        return new ResponseEntity<> (sifarisciService.cereate(requset), HttpStatus.CREATED).getBody();
    }
    @PutMapping("/{id}")
    private SifarisciResponse update(@PathVariable Long id, @RequestBody SifarisciRequset requset){
        return sifarisciService.update(id,requset);
    }

    @GetMapping("/{id}")
    private  SifarisciResponse getById(@PathVariable Long id){
        return sifarisciService.getSifarisciById(id);
    }

    @DeleteMapping("/{id}")
    private  void  dele(@PathVariable Long id){
        sifarisciService.delete(id);
    }
}
