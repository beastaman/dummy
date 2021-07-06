package com.sapient.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Order {
    private String orderId;
    private String branchId;
    private String custId;
    private String totalPrice;
}
