package com.herokuapp.biocollectionapi.repository;

import com.herokuapp.biocollectionapi.domain.BiologicalCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiologicalCollectionRepository extends JpaRepository<BiologicalCollection, Long> {
}