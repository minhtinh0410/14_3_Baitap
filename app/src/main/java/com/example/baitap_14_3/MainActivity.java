package com.example.baitap_14_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView lvFoods;
CustomFoodsView adt;
ArrayList<Foods> arrayList;
private int imgPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

lvFoods = findViewById(R.id.lvFoods);

arrayList = new ArrayList<>();
arrayList.add(new Foods("Tasty donut", "$10.00", R.drawable.donut_yellow));
        arrayList.add(new Foods("Pink donut", "$10.00", R.drawable.tasty_donut));
        arrayList.add(new Foods("Floating donut", "$10.00", R.drawable.green_donut));
        arrayList.add(new Foods("Red donut", "$10.00", R.drawable.donut_red));

        adt = new CustomFoodsView(this, R.layout.item_listview, arrayList);

lvFoods.setAdapter(adt);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgPlus){
    Intent intent = new Intent(MainActivity.this,
            MainActivity2.class);
    startActivity(intent);
        }
    }
}