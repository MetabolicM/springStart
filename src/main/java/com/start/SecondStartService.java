package com.start;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class SecondStartService extends FirstStartEntity{

    private Integer number;
    private String name;
    private Boolean aBoolean;

    public SecondStartService(Integer number, String name, Boolean aBoolean) {
        super(now().getMinute(), 'a');
        this.number = number;
        this.name = name;
        this.aBoolean = aBoolean;
    }

    public SecondStartService( long baseNum, char symbol, Integer number, String name, Boolean aBoolean) {
        super(baseNum, symbol);
        this.number = number;
        this.name = name;
        this.aBoolean = aBoolean;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }
}
