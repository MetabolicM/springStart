package com.start;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "secondDao")
public class SecondDao {

    @Value("123")
    private Integer number;
    @Value("someName")
    private String daoName;
}
