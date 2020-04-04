package com.example.laba_02;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        EditText planetName = findViewById(R.id.plantName);
        TextView planetData = findViewById(R.id.planetData);
        TextView generalInformation = findViewById(R.id.generalInformation);
        Button applyButton = findViewById(R.id.applayBtn);
        Button linkButton = findViewById(R.id.linkBtn);

        linkButton.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.popmech.ru/science/12086-zvezdnye-ostrova-galaktiki/"));
            startActivity(intent);
        });

        Bundle idButton = getIntent().getExtras();

        assert idButton != null;
        int idButtonPlanet = idButton.getInt("keyButton");

        applyButton.setOnClickListener(view -> {
            String text = planetName.getText().toString();

            Intent intent = new Intent();
            intent.putExtra("result", text);
            intent.putExtra("idButton", idButtonPlanet);
            setResult(RESULT_OK, intent);

            finish();
        });

        //switch (idButtonPlanet){
            //case R.id.mercuryImgBtn: {
                //planetData.setText(planetData.getText().toString() + "Важно понимать, что входящие аргументы функции могут быть неявными");
            //}
            //case  R.id.venusImgBtn: {
                //planetData.setText(planetData.getText().toString() + "Если некорректные данные обнаружены на этом этапе");
            //}
            //case R.id.earthImgBtn: {
                //planetData.setText(planetData.getText().toString() + "входящие аргументы");
                //break;
            //}
        //}
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        setResult(RESULT_CANCELED);
    }
}
