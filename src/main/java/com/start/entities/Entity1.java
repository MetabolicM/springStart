package com.start.entities;

import java.util.Objects;

public class Entity1 {

    private long baseNum;
    private char symbol;

    public Entity1(long baseInt, char symbol) {
        this.baseNum = baseInt;
        this.symbol = symbol;
    }

    public long getBaseNum() {
        return baseNum;
    }

    public void setBaseNum(long baseNum) {
        this.baseNum = baseNum;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "FirstStartEntity{" +
                "baseNum=" + baseNum +
                ", symbol=" + symbol +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity1 that = (Entity1) o;
        return baseNum == that.baseNum && symbol == that.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseNum, symbol);
    }
}
