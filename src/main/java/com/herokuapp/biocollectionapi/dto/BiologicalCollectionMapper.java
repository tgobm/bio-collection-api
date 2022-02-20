package com.herokuapp.biocollectionapi.dto;

import com.herokuapp.biocollectionapi.domain.BiologicalCollection;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BiologicalCollectionMapper {

    BiologicalCollectionResponse fromEntityToResponse(BiologicalCollection entity);
}