package com.sapient.springdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

//@Component("details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Detail {
    private String name;
    private Integer age;
}
