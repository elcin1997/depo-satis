package com.example.deposervice.mapper;

import com.example.deposervice.domain.Mehsul;
import com.example.deposervice.dto.requset.MehsulRequset;
import com.example.deposervice.dto.response.MehsulReponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MehsulMapper {
    MehsulMapper INSTANCE = Mappers.getMapper(MehsulMapper.class);

    @Mapping(target = "marka",source = "marka")
    @Mapping(target = "katiqoriya",source = "katiqoriya")
    @Mapping(target = "say",source ="say")
    Mehsul mehsulRequsetToMehsul(MehsulRequset requset);

    @Mapping(target = "id",source = "id")
    @Mapping(target = "marka",source = "marka")
    @Mapping(target = "katiqoriya",source = "katiqoriya")
    @Mapping(target = "say",source ="say")
    MehsulReponse mehstuToMehsulReponse(Mehsul mehsul);

}
