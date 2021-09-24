package com.start;

public class StartService {
    FirstStartEntity first;
    SecondStartService second;

    public StartService(FirstStartEntity first, SecondStartService second) {
        this.first = first;
        this.second = second;
    }

    public FirstStartEntity getFirst() {
        return first;
    }

    public void setFirst(FirstStartEntity first) {
        this.first = first;
    }

    public SecondStartService getSecond() {
        return second;
    }

    public void setSecond(SecondStartService second) {
        this.second = second;
    }

    public void testFirst(){
        System.out.println("First: " + first.getBaseNum() + " " + first.getSymbol());
    }

    public void testSecond(){
        System.out.println("Second: " + second.getBaseNum() + " " + second.getSymbol() + " " + second.getNumber() + " "
                + second.getName() + " " + second.getaBoolean());
    }
}
