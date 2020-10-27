package com.example.changemany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Spinner spinner1, spinner2;

    String[] items = {"VND", "USD", "JPY", "CNY", "EUR",
            "GBP", "CAD", "AUD", "SGD", "IDR", "THB", "PHP"};
    public static final int USDCheck = 23000;
    public static final int JPYCheck = 200;
    public static final int CNYCheck = 3500;
    public static final int EURCheck = 27000;
    public static final int GBPCheck = 30000;
    public static final int CADCheck = 18000;
    public static final int AUDCheck = 16500;
    public static final int SGDCheck = 17000;
    public static final int IDRCheck = 1500;
    public static final int THBCheck = 700;
    public static final int PHPCheck = 500;

    protected int check(String rate1, String rate2, int value){
        int tmg = 0;

        if(rate1 == "VND"){
            tmg = value;
        }else if(rate1 == "USD"){
            tmg = USDCheck*value;
        }else if(rate1 == "JPY"){
            tmg = JPYCheck*value;
        }else if(rate1 == "CNY"){
            tmg = CNYCheck*value;
        }else if(rate1 == "EUR"){
            tmg = EURCheck*value;
        }else if(rate1 == "GBP"){
            tmg = GBPCheck*value;
        }else if(rate1 == "CAD"){
            tmg = CADCheck*value;
        }else if(rate1 == "AUD"){
            tmg = AUDCheck*value;
        }else if(rate1 == "SGD"){
            tmg = SGDCheck*value;
        }else if(rate1 == "IDR"){
            tmg = IDRCheck*value;
        }else if(rate1 == "THB"){
            tmg = THBCheck*value;
        }else if(rate1 == "PHP"){
            tmg = PHPCheck*value;
        }

        if(rate2 == "VND"){
            return tmg;
        }else if(rate2 == "USD"){
            return tmg/USDCheck;
        }else if(rate2 == "JPY"){
            return tmg/JPYCheck;
        }else if(rate2 == "CNY"){
            return tmg/CNYCheck;
        }else if(rate2 == "EUR"){
            return tmg/EURCheck;
        }else if(rate2 == "GBP"){
            return tmg/GBPCheck;
        }else if(rate2 == "CAD"){
            return tmg/CNYCheck;
        }else if(rate2 == "AUD"){
            return tmg/AUDCheck;
        }else if(rate2 == "SGD"){
            return tmg/SGDCheck;
        }else if(rate2 == "IDR"){
            return tmg/IDRCheck;
        }else if(rate2 == "THB"){
            return tmg/THBCheck;
        }else if(rate2 == "PHP"){
            return tmg/PHPCheck;
        }
        return 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,
                items);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        spinner1.setSelection(1);
        spinner2.setSelection(0);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = items[i];
                Log.v("TAG", "Selected: " + item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = items[i];
                Log.v("TAG", "Selected: " + item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}