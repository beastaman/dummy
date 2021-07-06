package com.sapient.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class FoodItem {
    private String foodId;
    private String foodName;
    private String foodPrice;
}
