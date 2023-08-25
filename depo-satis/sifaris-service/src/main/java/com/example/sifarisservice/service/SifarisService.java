package com.example.sifarisservice.service;

import com.example.sifarisservice.cllient.SifarisClinet;
import com.example.sifarisservice.cllient.dto.request.SifarisSayRequset;
import com.example.sifarisservice.cllient.dto.response.MehsulClinetResponse;
import com.example.sifarisservice.domain.Sifaris;
import com.example.sifarisservice.repository.SifarisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SifarisService {
    private final SifarisRepository sifarisRepository;
    private final SifarisClinet sifarisClinet;
    public Sifaris satis(Sifaris sifaris){
        MehsulClinetResponse say = sifarisClinet.getSay(sifaris.getSifarisMarka());
        if(sifaris.getSifarisSay().compareTo(say.getSay()) >0){
            throw new RuntimeException("bazada kifayet qeder mehsul yoxdur");
        }
        Sifaris savedsifaris = sifarisRepository.save(sifaris);

       sifarisClinet.updateSay(savedsifaris.getSifarisMarka(),new SifarisSayRequset(savedsifaris.getSifarisSay()));



        return  savedsifaris;
    }
}
