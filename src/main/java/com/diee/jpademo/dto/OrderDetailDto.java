package com.diee.jpademo.dto;

import java.math.BigDecimal;

public class OrderDetailDto {

    private String productCode;
    private Integer quantityOrdered;
    private Number priceEach;
    private Integer orderLineNumber;


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(Integer quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public Number getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(Number priceEach) {
        this.priceEach = priceEach;
    }

    public Integer getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(Integer orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }
}
