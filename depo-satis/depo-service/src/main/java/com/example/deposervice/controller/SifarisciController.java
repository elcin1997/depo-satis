package com.example.deposervice.controller;

import com.example.deposervice.dto.requset.MehsulRequset;
import com.example.deposervice.dto.requset.SifarisciRequset;
import com.example.deposervice.dto.response.SifarisciResponse;
import com.example.deposervice.service.SifarisciService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sifarisciler")
@RequiredArgsConstructor
public class SifarisciController {
    private final SifarisciService sifarisciService;
    @PostMapping
    private SifarisciResponse cereate(@RequestBody SifarisciRequset requset){
        return  sifarisciService.cereate(requset);
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
