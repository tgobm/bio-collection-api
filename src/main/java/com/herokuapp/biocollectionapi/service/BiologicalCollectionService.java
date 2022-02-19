package com.herokuapp.biocollectionapi.service;

import com.herokuapp.biocollectionapi.domain.BiologicalCollection;
import org.springframework.data.domain.Page;

public interface BiologicalCollectionService {

    Page<BiologicalCollection> getAllBiologicalPageable(int offSet, int pageSize);
}
