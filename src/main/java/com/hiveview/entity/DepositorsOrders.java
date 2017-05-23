package com.hiveview.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DepositorsOrders {

    /**待审核*/
    public static final int STATUS_AUDITING=1;
    /**未通过*/
    public static final int STATUS_NOPASS=2;
    /**打款中*/
    public static final int STATUS_PAYING=3;
    /**打款中*/
    public static final int STATUS_PAYED=4;
    /**打款失败*/
    public static final int STATUS_PAYFAIL=5;

    private Integer id;

    private Integer userId;

    private String orderNo;

    private BigDecimal balance;

    private BigDecimal amount;

    private BigDecimal feeAmount;

    private Date addTime;

    private Date updateTime;

    private Date payTime;

    private String payOrderNo;

    private Integer orderStatus;

    private String rejection;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getRejection() {
        return rejection;
    }

    public void setRejection(String rejection) {
        this.rejection = rejection;
    }
}