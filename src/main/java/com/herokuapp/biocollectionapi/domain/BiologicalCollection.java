package com.herokuapp.biocollectionapi.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "biological_collection")
public class BiologicalCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "represents primary key value")
    private Long id;

    @Schema(description = "represents the ID of a collection record")
    private String tombo;

    @Schema(description = "represents taxonomic classification")
    private String phylum;

    @Schema(description = "represents taxonomic classification")
    private String subPhylum;

    @Schema(description = "represents taxonomic classification")
    private String bioClass;

    @Schema(description = "represents taxonomic classification")
    private String bioOrder;

    @Schema(description = "represents taxonomic classification")
    private String bioFamily;

    @Schema(description = "represents additional taxonomic identification information")
    private String other;

    @Schema(description = "represents number of specimens in string type", example = "hundreds")
    private String noSpecimen;

    @Schema(description = "represents collection date")
    private LocalDate collDate;

    @Schema(description = "represents the collector name")
    private String collName;

    @Schema(description = "represents the collection site")
    private String locality;

    @Schema(description = "represents the type of material specification")
    private String bioType;

    @Schema(description = "represents the condition of the material")
    private String condition;

    @Schema(description = "represents the fixation route", example = "70% alcohol")
    private String fixationRoute;

    @Schema(description = "represents the storage location: closet")
    private String cabinet;

    @Schema(description = "represents storage location: drawer")
    private String drawer;

    @Schema(description = "represents additional information")
    private String infoAddOther;

    @Schema(description = "represents responsible for the loan")
    private String loanName;

    @Schema(description = "represents the borrowing date of the tombo")
    private LocalDate loanDate;

    @Schema(description = "represents the date of the tombo")
    private LocalDate tomboDate;

    @Schema(description = "represents the person responsible for the tombo")
    private String responsible;

    @Schema(description = "represents the image of each record")
    private byte[] image;

    @Schema(description = "represents registry qrcode image")
    private byte[] qrcode;
}
