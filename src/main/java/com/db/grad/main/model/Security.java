package com.db.grad.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String isin;

    private String cusip;


    private Date maturityDate;

    private float coupon;

    private String type;

    private Float faceValue;

    private String status;

    private String issuer;
}
