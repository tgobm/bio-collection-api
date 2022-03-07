package com.herokuapp.biocollectionapi.resource;

import com.herokuapp.biocollectionapi.dto.BiologicalCollectionResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

@Tag(name = "Biological Collection")
public interface BiologicalCollectionApi {

    @Operation(description = "List all biological collection paginated and sorting", operationId = "getAllBiologicalCollection", summary = "By passing the appropriate options, you can search the collections")
    ResponseEntity<Page<BiologicalCollectionResponse>> getAllBiologicalCollection(
            @Parameter(description = "page number")
                    Long pageNumber,
            @Parameter(description = "maximum number of records returned")
                    Long pageSize,
            @Parameter(description = "field to sort by")
                    String field);
}