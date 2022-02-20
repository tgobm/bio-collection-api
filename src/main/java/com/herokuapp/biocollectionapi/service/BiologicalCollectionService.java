package com.herokuapp.biocollectionapi.service;

import com.herokuapp.biocollectionapi.dto.BiologicalCollectionResponse;
import org.springframework.data.domain.Page;

public interface BiologicalCollectionService {

    Page<BiologicalCollectionResponse> getAllBiologicalPageSort(Long offSet, Long pageSize, String field);
}
