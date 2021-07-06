package com.sapient.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Table {
    private String tableId;
    private String status;
    private Integer price;
    private String branchId;
}
