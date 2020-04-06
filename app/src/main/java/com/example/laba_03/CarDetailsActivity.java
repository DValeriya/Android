package com.example.laba_03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CarDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        Car car = (Car) getIntent().getSerializableExtra("car");

        TextView name = findViewById(R.id.name);
        TextView price = findViewById(R.id.price);
        TextView description = findViewById(R.id.description);
        TextView city = findViewById(R.id.city);
        ImageView photo = findViewById(R.id.img);

        name.setText(car.getName());
        price.setText(car.getPrice());
        description.setText(car.getDescription());
        city.setText(car.getCity());
        photo.setImageResource(car.getPhoto());
    }
}
