package com.example.infoer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.squareup.picasso.Picasso;

import objects.InfoPassFOne.SearchPrintF1;
import objects.formulaOne.FOne;
import objects.weather.Weatheretor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utilities.RetrofitConfigF1;
import utilities.RetrofitConfigWeather;


public class MainActivity extends AppCompatActivity {

    private ImageButton soccer;
    private ImageButton formulaOne;
    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    private SearchPrintF1 searchPrintF1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soccer = (ImageButton) findViewById(R.id.imageButtonSoccer);

        Picasso.get().load("https://image.flaticon.com/icons/png/512/26/26356.png")
                .fit().centerInside().into(soccer);


        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TeamSelectorActivity.class);
                startActivity(intent);
            }
        });

    }

}
