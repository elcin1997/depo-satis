package com.example.sifarisservice.cllient;

import com.example.sifarisservice.cllient.dto.request.SifarisSayRequset;
import com.example.sifarisservice.cllient.dto.response.MehsulClinetResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "mehsul-clinet",url = "http://localhost:8080/")
public interface SifarisClinet {
    @GetMapping("/praducs/say/{marka}")
    MehsulClinetResponse getSay(@PathVariable String marka);
    @PutMapping("/praducs/say/{marka}")
   void  updateSay(@PathVariable String marka,@RequestBody SifarisSayRequset requset);



}
