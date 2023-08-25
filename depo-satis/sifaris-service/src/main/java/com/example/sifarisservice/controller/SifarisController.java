package com.example.sifarisservice.controller;

import com.example.sifarisservice.cllient.SifarisClinet;
import com.example.sifarisservice.cllient.dto.response.MehsulClinetResponse;
import com.example.sifarisservice.domain.Sifaris;
import com.example.sifarisservice.service.SifarisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sifarisler")
@RequiredArgsConstructor
public class SifarisController {
    private final SifarisService sifarisService;

    @PostMapping()
    public Sifaris sifarisEt( @RequestBody Sifaris sifaris){

        return  sifarisService.satis(sifaris);

    }

}
