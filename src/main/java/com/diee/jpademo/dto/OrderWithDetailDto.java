package com.diee.jpademo.dto;

import java.util.List;

public class OrderWithDetailDto extends OrderDto {

    private List<OrderDetailDto> orderDetails;

    public OrderWithDetailDto() {
        super();
    }

    public List<OrderDetailDto> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetailDto> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
