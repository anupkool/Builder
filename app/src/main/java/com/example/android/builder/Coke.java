package com.example.android.builder;

/**
 * @author Anup
 *
 * Coke Extends the ColdDrink which inturns implements Item which has property of name and Price
 *
 */

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 6.0;
    }
}
