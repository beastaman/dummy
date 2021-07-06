package com.sapient.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class UserTableDTO {
    private String uid;
    private String tid;
}
