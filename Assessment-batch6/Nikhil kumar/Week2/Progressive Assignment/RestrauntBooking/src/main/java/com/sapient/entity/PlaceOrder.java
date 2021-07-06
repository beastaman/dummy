package com.sapient.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@ToString
public class PlaceOrder {
    private String custId;
    private String orderId;
    private String totalPrice;
    private String bookTime;
    private String orderStatus;
}
