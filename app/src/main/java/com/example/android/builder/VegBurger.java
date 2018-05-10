package com.example.android.builder;

/**
 * @author Anup
 *
 * VegBurger Extends the Burger which inturns implements Item which has property of name and Price
 */

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 15.0;
    }
}
