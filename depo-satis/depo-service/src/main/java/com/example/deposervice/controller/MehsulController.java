package com.example.deposervice.controller;

import com.example.deposervice.dto.requset.MehsulRequset;
import com.example.deposervice.dto.requset.SifarisSayRequset;
import com.example.deposervice.dto.response.MehsulReponse;
import com.example.deposervice.service.MehsulService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/praducs")
@RequiredArgsConstructor
public class MehsulController {
    private final MehsulService mehsulService;
    @PostMapping
    private MehsulReponse cereate(@RequestBody MehsulRequset requset){
        return  mehsulService.cereate(requset);
    }
    @PutMapping("/{id}")
    private MehsulReponse update (@PathVariable Long id,@RequestBody MehsulRequset requset){
        return mehsulService.update(id, requset);
    }

    @GetMapping("/{id}")
    private  MehsulReponse getById(@PathVariable Long id){
      return   mehsulService.getByMehsulId(id);
    }
    @DeleteMapping("/{id}")
    private void  delete(@PathVariable Long id){
        mehsulService.dele(id);
    }

    @GetMapping("/say/{marka}")
    private MehsulReponse getByMarka(@PathVariable String marka){
        return  mehsulService.getMehsulByMarka(marka);

    }
    @PutMapping("/say/{marka}")
    public void updateSay (@PathVariable String marka,@RequestBody SifarisSayRequset sifarisSay){
        mehsulService.udateSay(sifarisSay,marka);
    }





}
