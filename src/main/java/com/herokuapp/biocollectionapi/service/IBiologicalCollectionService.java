package com.herokuapp.biocollectionapi.service;

import com.herokuapp.biocollectionapi.dto.BiologicalCollectionMapper;
import com.herokuapp.biocollectionapi.dto.BiologicalCollectionResponse;
import com.herokuapp.biocollectionapi.repository.BiologicalCollectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class IBiologicalCollectionService implements BiologicalCollectionService {

    private final BiologicalCollectionMapper biologicalCollectionMapper;

    private final BiologicalCollectionRepository biologicalCollectionRepository;

    @Override
    public Page<BiologicalCollectionResponse> getAllBiologicalPageSort(Long offSet, Long pageSize, String field) {
        return biologicalCollectionRepository
                .findAll(PageRequest.of(offSet.intValue(), pageSize.intValue()).withSort(Sort.by(field))) //
                .map(biologicalCollectionMapper::fromEntityToResponse);
    }
}