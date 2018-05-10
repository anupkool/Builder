package com.example.android.builder;

/**
 * @author Anup
 *
 * Item can be Burger or Drink. As they are different classes, maybe Item should be an interface
 */

public interface Item {
    String name();
    double price();
}
