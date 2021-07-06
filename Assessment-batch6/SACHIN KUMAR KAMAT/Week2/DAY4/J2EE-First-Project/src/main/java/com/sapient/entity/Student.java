package com.sapient.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Student {
    private String id;
    private String fName;
    private String lName;
    private String dob;
    private String area;
    private String phone;
}
