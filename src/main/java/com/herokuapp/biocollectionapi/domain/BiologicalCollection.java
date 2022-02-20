package com.herokuapp.biocollectionapi.domain;

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
    private Long id;

    private String tombo;

    private String phylum;

    private String subPhylum;

    private String bioClass;

    private String bioOrder;

    private String bioFamily;

    private String other;

    private String noSpecimen;

    private LocalDate collDate;

    private String collName;

    private String locality;

    private String bioType;

    private String condition;

    private String fixationRoute;

    private String cabinet;

    private String drawer;

    private String infoAddOther;

    private String loanName;

    private LocalDate loanDate;

    private LocalDate tomboDate;

    private String responsible;

    private byte[] image;

    private byte[] qrcode;
}
