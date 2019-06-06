package com.avinash.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){

        EditText dollarAmountEditText = (EditText)findViewById(R.id.dollarAmountEditText);
        
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());
        
        Double RupeeAmount = dollarAmountDouble * 69.29 ;
        
        Toast.makeText(MainActivity.this,"₹" + String.format("%.2f",RupeeAmount), Toast.LENGTH_SHORT).show();
        
        Log.i("amount",dollarAmountEditText.getText().toString());



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
