package com.example.laba_02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    public static int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageButton mercuryButton = findViewById(R.id.mercuryImgBtn);
        ImageButton venusButton = findViewById(R.id.venusImgBtn);
        ImageButton earthButton = findViewById(R.id.earthImgBtn);
        ImageButton marsButton = findViewById(R.id.marsImgBtn);
        ImageButton jupiterButton = findViewById(R.id.jupiterImgBtn);
        ImageButton saturnButton = findViewById(R.id.saturnImgBtn);

        mercuryButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("keyButton", R.id.mercuryImgBtn);
            startActivityForResult(intent, REQUEST_CODE);
        });
        venusButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("keyButton", R.id.venusImgBtn);
            startActivityForResult(intent, REQUEST_CODE);
        });
        earthButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("keyButton", R.id.earthImgBtn);
            startActivityForResult(intent, REQUEST_CODE);
        });
        marsButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("keyButton", R.id.marsImgBtn);
            startActivityForResult(intent, REQUEST_CODE);
        });
        jupiterButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("keyButton", R.id.jupiterImgBtn);
            startActivityForResult(intent, REQUEST_CODE);
        });
        saturnButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            intent.putExtra("keyButton", R.id.saturnImgBtn);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (data != null) {
                String namePlanet = data.getStringExtra("result");

                int idButtonPlanet = data.getExtras().getInt("idButton");

                if (namePlanet != null) {
                    if (namePlanet.equals("Меркурий") && idButtonPlanet == R.id.mercuryImgBtn) {
                        TextView mercury = findViewById(R.id.mercuryName);
                        mercury.setText(namePlanet);
                    }
                    else if (namePlanet.equals("Венера") && idButtonPlanet == R.id.venusImgBtn) {
                        TextView venus = findViewById(R.id.venusName);
                        venus.setText(namePlanet);
                    }
                    else if (namePlanet.equals("Земля") && idButtonPlanet == R.id.earthImgBtn) {
                        TextView earth = findViewById(R.id.earthName);
                        earth.setText(namePlanet);
                    }
                    else if (namePlanet.equals("Марс") && idButtonPlanet == R.id.marsImgBtn) {
                        TextView mars = findViewById(R.id.marsName);
                        mars.setText(namePlanet);
                    }
                    else if (namePlanet.equals("Юпитер") && idButtonPlanet == R.id.jupiterImgBtn) {
                        TextView jupiter = findViewById(R.id.jupiterName);
                        jupiter.setText(namePlanet);
                    }
                    else if (namePlanet.equals("Сатурн") && idButtonPlanet == R.id.saturnImgBtn) {
                        TextView saturn = findViewById(R.id.saturnName);
                        saturn.setText(namePlanet);
                    }
                    else {
                        Toast.makeText(this, "Ответ не верный, попробуйте еще раз", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
    }
}

