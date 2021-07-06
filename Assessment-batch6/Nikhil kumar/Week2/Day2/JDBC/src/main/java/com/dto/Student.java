package com.dto;

import lombok.*;

@Data
@Builder
public class Student {
    private String id;
    private String fName;
    private String lName;
    private String dob;
    private String area;
    private String phone;
}
