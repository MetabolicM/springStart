package com.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "secondService")
public class SecondStartService{

    @Autowired
    SecondDao secondDao;
    @Value("someStr")
    private String name;

}
