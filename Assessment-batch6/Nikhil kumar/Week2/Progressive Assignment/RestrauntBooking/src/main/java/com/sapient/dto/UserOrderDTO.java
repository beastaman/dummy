package com.sapient.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class UserOrderDTO {
    private String uid;
    private String fid;
    private String qty;
}
