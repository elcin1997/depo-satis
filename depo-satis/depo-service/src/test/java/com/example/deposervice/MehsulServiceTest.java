package com.example.deposervice;

import com.example.deposervice.domain.Mehsul;
import com.example.deposervice.dto.requset.MehsulRequset;
import com.example.deposervice.dto.response.MehsulReponse;
import com.example.deposervice.mapper.MehsulMapper;
import com.example.deposervice.repository.MehsulRepository;
import com.example.deposervice.service.MehsulService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MehsulServiceTest {
    @InjectMocks
    private MehsulService mehsulService;
    @Mock
    private MehsulRepository mehsulRepository;
    @Mock
    private MehsulMapper mapper;



    @Test
    void  givenValidParametCreateSuccess(){
        var result=getMehsulReponse();
        Mockito.when(mehsulRepository.save(any(Mehsul.class))).thenReturn(getMehsul());




        MehsulReponse reponse = mehsulService.cereate(getMhesulRequest());



        Assertions.assertEquals(result.getId(),reponse.getId());
        Assertions.assertEquals(result.getMarka(),reponse.getMarka());
        Assertions.assertEquals(result.getKatiqoriya(),reponse.getKatiqoriya());
        Assertions.assertEquals(result.getSay(),reponse.getSay());

    }


    private MehsulRequset getMhesulRequest(){
        MehsulRequset mehsulRequset =new MehsulRequset();
        mehsulRequset.setMarka("Samung A24");
        mehsulRequset.setKatiqoriya("Telefon");
        mehsulRequset.setSay(15);
        return mehsulRequset;
    }
    private Mehsul getMehsul(){
        Mehsul mehsul =new Mehsul();
        mehsul.setId(1L);
        mehsul.setMarka("Samung A24");
        mehsul.setKatiqoriya("Telefon");
        mehsul.setSay(15);
        return mehsul;
    }

    private MehsulReponse getMehsulReponse(){
        MehsulReponse mehsulReponse=new MehsulReponse();
        mehsulReponse.setId(1L);
        mehsulReponse.setMarka("Samung A24");
        mehsulReponse.setKatiqoriya("Telefon");
        mehsulReponse.setSay(15);
        return mehsulReponse;
    }

}
