package com.sapient.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringUserApplicationTests {

    @Autowired private Detail1 detail1;

    @Test
    void contextLoads() {
        detail1.display();
    }

}
