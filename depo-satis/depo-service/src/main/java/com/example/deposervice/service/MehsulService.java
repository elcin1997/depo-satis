package com.example.deposervice.service;

import com.example.deposervice.dto.requset.MehsulRequset;
import com.example.deposervice.dto.requset.SifarisSayRequset;
import com.example.deposervice.dto.response.MehsulReponse;
import com.example.deposervice.mapper.MehsulMapper;
import com.example.deposervice.repository.MehsulRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MehsulService {
    private final MehsulRepository mehsulRepository;
    MehsulMapper mapper =MehsulMapper.INSTANCE;
    public MehsulReponse cereate(MehsulRequset requset){
        var entitiy =mapper.mehsulRequsetToMehsul(requset);
        var mehsul =mehsulRepository.save(entitiy);
        return mapper.mehstuToMehsulReponse(mehsul);
    }

    public  MehsulReponse update(Long id,MehsulRequset requset){
        var entitiy =mehsulRepository.findById(id).orElseThrow(() ->  new RuntimeException("bazada mehsul yoxdu"));
        entitiy=mapper.mehsulRequsetToMehsul(requset);
        entitiy.setId(id);
        return  mapper.mehstuToMehsulReponse(entitiy);
    }
    public MehsulReponse getByMehsulId(Long id){
        var mehsul = mehsulRepository.findById(id).get();
        return mapper.mehstuToMehsulReponse(mehsul);
    }
    public void  dele(Long id){
        mehsulRepository.deleteById(id);
    }

    public MehsulReponse getMehsulByMarka(String marka){
        var mehsul = mehsulRepository.getMehsulByMarka(marka).orElseThrow(()-> new RuntimeException("bazada bu marka yoxdu"));
        return  mapper.mehstuToMehsulReponse(mehsul);
    }

    public  void  udateSay(SifarisSayRequset requset,String marka){


        var mehsul =mehsulRepository.getMehsulByMarka(marka).orElseThrow(()-> new RuntimeException("bazada bu marka yoxdu"));
        var say = mehsul.getSay()-requset.getSifarisSay();
        mehsul.setSay(say);

        mehsulRepository.save(mehsul);

    }



}
