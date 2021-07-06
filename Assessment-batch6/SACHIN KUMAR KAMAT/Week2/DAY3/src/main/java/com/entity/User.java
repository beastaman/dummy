package com.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class User {
    private String userId;
    private String password;
    private String status;
}
