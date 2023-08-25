package com.example.deposervice.mapper;

import com.example.deposervice.domain.Sifarisci;
import com.example.deposervice.dto.requset.SifarisciRequset;
import com.example.deposervice.dto.response.SifarisciResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SifarisciMapper {
    SifarisciMapper INSTANCE= Mappers.getMapper(SifarisciMapper.class);
    @Mapping(target = "ad",source = "ad")
    @Mapping(target = "soyAd",source = "soyAd")
    @Mapping(target = "finKod",source = "finKod")

    Sifarisci sifarisciRequsetToSifarisci(SifarisciRequset requset);
    @Mapping(target = "id",source = "id")
    @Mapping(target = "ad",source = "ad")
    @Mapping(target = "soyAd",source = "soyAd")
    @Mapping(target = "finKod",source = "finKod")

    SifarisciResponse ciferisciToSifarsiciResponse(Sifarisci sifarisci);
}
