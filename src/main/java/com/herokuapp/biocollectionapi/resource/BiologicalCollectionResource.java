package com.herokuapp.biocollectionapi.resource;

import com.herokuapp.biocollectionapi.dto.BiologicalCollectionResponse;
import com.herokuapp.biocollectionapi.service.BiologicalCollectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/biological-collections")
@CrossOrigin
@RequiredArgsConstructor
public class BiologicalCollectionResource implements BiologicalCollectionApi {

    private final BiologicalCollectionService biologicalCollectionService;

    @Override
    @GetMapping
    public ResponseEntity<Page<BiologicalCollectionResponse>> getAllBiologicalCollection(@RequestParam Long pageNumber, @RequestParam Long pageSize, @RequestParam(defaultValue = "id", required = false) String field) {
        return ResponseEntity.ok(biologicalCollectionService.getAllBiologicalPageSort(pageNumber, pageSize, field));
    }
}