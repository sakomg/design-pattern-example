package com.alexanderkomegunov.strategy;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("reading");
    }
}
