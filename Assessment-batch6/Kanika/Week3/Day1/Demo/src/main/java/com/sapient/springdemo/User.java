package com.sapient.springdemo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private String address;
}
