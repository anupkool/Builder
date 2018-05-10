package com.example.android.builder;

import android.content.Context;

public class MealBuilder {

    private Context mContext;

    public MealBuilder(Context context) {
        mContext = context;
    }

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new CheeseBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}