package com.example.deposervice.service;

import com.example.deposervice.dto.requset.SifarisciRequset;
import com.example.deposervice.dto.response.SifarisciResponse;
import com.example.deposervice.exeption.SifarisNotFound;
import com.example.deposervice.mapper.SifarisciMapper;
import com.example.deposervice.repository.SifariscIRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SifarisciService {
    private  final SifariscIRepository sifariscIRepository;
    SifarisciMapper mapper=SifarisciMapper.INSTANCE;

    public SifarisciResponse cereate (SifarisciRequset requset){
        var entitiy=mapper.sifarisciRequsetToSifarisci(requset);
        var sifarisci = sifariscIRepository.save(entitiy);
        return  mapper.ciferisciToSifarsiciResponse(sifarisci);
    }
    public SifarisciResponse update(Long id,SifarisciRequset requset){
        var entitiy =sifariscIRepository.findById(id).orElseThrow(()-> new SifarisNotFound("bele bir istifadeci movcud deyil"));
        entitiy=mapper.sifarisciRequsetToSifarisci(requset);
        entitiy.setId(id);
        return mapper.ciferisciToSifarsiciResponse(entitiy);
    }
    public  SifarisciResponse getSifarisciById(Long id){
        var sifarisci1 =sifariscIRepository.findById(id).orElseThrow(()->new SifarisNotFound("bele bir istifadeci movcud deyil"));
        var sifarisci =sifariscIRepository.findById(id).get();
        return mapper.ciferisciToSifarsiciResponse(sifarisci);


        }
    public void  delete (Long id){
        sifariscIRepository.deleteById(id);
    }




}
