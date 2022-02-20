package com.herokuapp.biocollectionapi.service;

import com.herokuapp.biocollectionapi.dto.BiologicalCollectionMapper;
import com.herokuapp.biocollectionapi.repository.BiologicalCollectionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {IBiologicalCollectionService.class})
@ExtendWith(SpringExtension.class)
class IBiologicalCollectionServiceTest {

    @MockBean
    private BiologicalCollectionMapper biologicalCollectionMapper;

    @MockBean
    private BiologicalCollectionRepository biologicalCollectionRepository;

    @Autowired
    private IBiologicalCollectionService iBiologicalCollectionService;

    @Test
    void testGetAllBiologicalPageSort() {
        when(this.biologicalCollectionRepository.findAll((org.springframework.data.domain.Pageable) any()))
                .thenReturn(new PageImpl<>(new ArrayList<>()));
        assertTrue(this.iBiologicalCollectionService.getAllBiologicalPageSort(1L, 3L, "Field").toList().isEmpty());
        verify(this.biologicalCollectionRepository).findAll((org.springframework.data.domain.Pageable) any());
    }
}