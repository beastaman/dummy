package com.sapient.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Customer {
    private String custId;
    private String fName;
    private String lName;
    private String email;
    private String password;
}
