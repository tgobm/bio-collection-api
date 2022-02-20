package com.herokuapp.biocollectionapi.resource;

import com.herokuapp.biocollectionapi.domain.BiologicalCollection;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "Biological Collection")
public interface BiologicalCollectionApi {

    @Operation(description = "List all biological collection paginated and sorting", operationId = "getAllBiologicalCollection", summary = "By passing the appropriate options, you can search the collections")
    ResponseEntity<Page<BiologicalCollection>> getAllBiologicalCollection(
            @Parameter(description = "the number of records that need to be skipped")
            @RequestParam Long offSet,
            @Parameter(description = "maximum number of records returned")
            @RequestParam Long pageSize,
            @Parameter(description = "field to sort by")
            @RequestParam String field);
}
