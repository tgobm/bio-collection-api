package com.herokuapp.biocollectionapi.resource;

import com.herokuapp.biocollectionapi.domain.BiologicalCollection;
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
public class BiologicalCollectionResource {

    private final BiologicalCollectionService biologicalCollectionService;

    @GetMapping
    private ResponseEntity<Page<BiologicalCollection>> getAllBiologicalPageable(@RequestParam int offSet, @RequestParam int pageSize) {
        return ResponseEntity.ok(biologicalCollectionService.getAllBiologicalPageable(offSet, pageSize));
    }
}