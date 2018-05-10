package com.example.android.builder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    Button btn_order_meat;
    Button btn_order_veg;

    MealBuilder mealBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mealBuilder = new MealBuilder(this);

        loadViews();
        loadListners();
    }


    private void loadViews() {
        btn_order_meat = (Button) findViewById(R.id.btn_order_meat);
        btn_order_veg = (Button) findViewById(R.id.btn_order_veg);

    }

    private void loadListners() {
        btn_order_meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Order = mealBuilder.prepareNonVegMeal().showItems();
                double price = mealBuilder.prepareNonVegMeal().getCost();

                String orderprice = "Thanks for the Order \n"+Order + "\n" + "Total Price: $" + price;

                Toast.makeText(MainActivity.this, orderprice, Toast.LENGTH_SHORT).show();
//               Toast.makeText(MainActivity.this, (int) price, Toast.LENGTH_SHORT).show();
            }
        });

        btn_order_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Order = mealBuilder.prepareVegMeal().showItems();
                double price = mealBuilder.prepareVegMeal().getCost();
                String orderprice = "Thanks for the Order \n"+Order + "\n" + "Total Price: $" + price;
                Toast.makeText(MainActivity.this, orderprice, Toast.LENGTH_SHORT).show();
//                Toast.makeText(MainActivity.this, (int) price, Toast.LENGTH_SHORT).show();
            }
        });
    }

}

