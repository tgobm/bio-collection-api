package com.herokuapp.biocollectionapi.resource;

import com.herokuapp.biocollectionapi.service.BiologicalCollectionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {BiologicalCollectionResource.class})
@ExtendWith(SpringExtension.class)
class BiologicalCollectionResourceTest {

    @Autowired
    private BiologicalCollectionResource biologicalCollectionResource;

    @MockBean
    private BiologicalCollectionService biologicalCollectionService;

    @Test
    void testGetAllBiologicalCollection() throws Exception {
        when(this.biologicalCollectionService.getAllBiologicalPageSort((Long) any(), (Long) any(), (String) any()))
                .thenReturn(new PageImpl<>(new ArrayList<>()));
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/api/biological-collections")
                .param("field", "foo");
        MockHttpServletRequestBuilder paramResult1 = paramResult.param("offSet", String.valueOf(1L));
        MockHttpServletRequestBuilder requestBuilder = paramResult1.param("pageSize", String.valueOf(1L));
        MockMvcBuilders.standaloneSetup(this.biologicalCollectionResource)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"));
    }
}