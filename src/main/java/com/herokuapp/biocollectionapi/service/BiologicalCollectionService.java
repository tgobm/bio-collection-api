package com.herokuapp.biocollectionapi.service;

import com.herokuapp.biocollectionapi.dto.BiologicalCollectionResponse;
import org.springframework.data.domain.Page;

public interface BiologicalCollectionService {

    Page<BiologicalCollectionResponse> getAllBiologicalPageSort(Long pageNumber, Long pageSize, String field);
}