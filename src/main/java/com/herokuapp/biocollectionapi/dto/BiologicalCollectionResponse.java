package com.herokuapp.biocollectionapi.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class BiologicalCollectionResponse implements Serializable {

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

    private String espMatType;

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