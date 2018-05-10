package com.example.android.builder;

/**
 * @author Anup
 *
 * VegBurger Extends the Burger which inturns implements Item which has property of name and Price
 */

public class CheeseBurger extends Burger {
    @Override
    public String name() {
        return "CheeseBurger";
    }

    @Override
    public double price() {
        return 20.0;
    }
}