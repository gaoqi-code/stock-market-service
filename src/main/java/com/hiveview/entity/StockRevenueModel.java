package com.hiveview.entity;

import java.math.BigDecimal;

public class StockRevenueModel {
    private Integer id;

    private Double changeQuantity;

    private Double revenueNum;

    private String revenueCode;

    private Double feeNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getChangeQuantity() {
        return changeQuantity;
    }

    public void setChangeQuantity(Double changeQuantity) {
        this.changeQuantity = changeQuantity;
    }

    public Double getRevenueNum() {
        return revenueNum;
    }

    public void setRevenueNum(Double revenueNum) {
        this.revenueNum = revenueNum;
    }

    public String getRevenueCode() {
        return revenueCode;
    }

    public void setRevenueCode(String revenueCode) {
        this.revenueCode = revenueCode;
    }

    public Double getFeeNum() {
        return feeNum;
    }

    public void setFeeNum(Double feeNum) {
        this.feeNum = feeNum;
    }
}