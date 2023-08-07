package com.db.grad.javaapi.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Security {

    @Id
    private Long id;

    private String isin;

    private String cusip;

    private String issuer;

    private Date maturityDate;

    private  float coupon;

    private String type;

    private int faceValue;

    private String status;

    public Security() {
    }

    public Security(Long id, String isin, String cusip, String issuer, Date maturityDate, float coupon, String type, int faceValue, String status) {
        this.id = id;
        this.isin = isin;
        this.cusip = cusip;
        this.issuer = issuer;
        this.maturityDate = maturityDate;
        this.coupon = coupon;
        this.type = type;
        this.faceValue = faceValue;
        this.status = status;
    }
    @Column(nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }
    @Column(nullable = false)
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
    @Column(nullable = false)
    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }
    @Column(nullable = false)
    public float getCoupon() {
        return coupon;
    }

    public void setCoupon(float coupon) {
        this.coupon = coupon;
    }
    @Column(nullable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Column(nullable = false)
    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
    @Column(nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
