package com.diee.jpademo.dto;

import java.util.List;

public class CustomerWithOrdersDto extends CustomerDto {

    private List<OrderDto> orders;

    public CustomerWithOrdersDto() {
        super();
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
