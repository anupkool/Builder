package com.example.android.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public double getCost(){
        double cost = 0.0;

        for (Item item : items) {
            cost += item.price();
        }
        return cost+0.1*cost;
    }

    public String showItems(){
        String order = "";
        for (Item i : items) {
            order = order + i.name() + "  " + i.price() + "\n";
        }
        return order;
    }

}