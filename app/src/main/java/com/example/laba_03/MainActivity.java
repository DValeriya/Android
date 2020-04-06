package com.example.laba_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Dodge", "$4500", "New York", R.drawable.car_img1, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("BMW", "$3000", "Kiev", R.drawable.car_img2, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("BMW", "$2000", "San Andreas", R.drawable.car_img3, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("Dodge", "$5000", "Odessa", R.drawable.car_img1, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("BMW", "$4400", "San Diego", R.drawable.car_img3, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("BMW", "$1200", "Lviv", R.drawable.car_img2,"Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("BMW", "$4300", "Odessa", R.drawable.car_img2, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("BMW", "$5600", "Minsk", R.drawable.car_img3, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("BMW", "$4300", "Odessa", R.drawable.car_img3, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));
        carList.add(new Car("Dodge", "$6500", "New York", R.drawable.car_img1, "Some text Some text Some text Some text Some text Some text Some textSome textSome text"));

        RecyclerView recyclerView = findViewById(R.id.car_list);

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new CarAdapter(carList));
    }
}
