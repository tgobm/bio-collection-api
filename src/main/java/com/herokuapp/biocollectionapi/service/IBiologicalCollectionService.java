package com.herokuapp.biocollectionapi.service;

import com.herokuapp.biocollectionapi.domain.BiologicalCollection;
import com.herokuapp.biocollectionapi.repository.BiologicalCollectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class IBiologicalCollectionService implements BiologicalCollectionService {

    private final BiologicalCollectionRepository biologicalCollectionRepository;

    @Override
    public Page<BiologicalCollection> getAllBiologicalPageable(int offSet, int pageSize) {
        return biologicalCollectionRepository.findAll(PageRequest.of(offSet, pageSize));
    }
}
