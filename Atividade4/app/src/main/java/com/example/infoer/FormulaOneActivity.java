package com.example.infoer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import objects.InfoPassFOne.SearchPrintF1;

public class FormulaOneActivity extends AppCompatActivity {

    private SearchPrintF1 searchPrintF1;
    private TextView circuit;
    private TextView local;
    private TextView date;
    private TextView predict;
    private TextView tempMin;
    private TextView tempMax;
    private TextView tempType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_one);
        Intent intent = getIntent();
        String formula1String = intent.getStringExtra("f1_search");
        ObjectMapper om = new ObjectMapper();
        try {
            searchPrintF1 = om.readValue(formula1String, SearchPrintF1.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        circuit.setText(searchPrintF1.getCurcuitName());
        local.setText(searchPrintF1.getLocal());
        date.setText(searchPrintF1.getDate());
        predict.setText(searchPrintF1.getWeatherPredct());
        tempMin.setText(Double.toString(searchPrintF1.getTempMin()));
        tempMax.setText(Double.toString(searchPrintF1.getTempMax()));
        tempType.setText(searchPrintF1.getWeatherType());

    }
}
