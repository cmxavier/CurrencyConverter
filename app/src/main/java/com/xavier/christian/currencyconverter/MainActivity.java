package com.xavier.christian.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewholder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewholder.editAmount = findViewById(R.id.edit_amount);
        this.mViewholder.textDollar = findViewById(R.id.text_dollar);
        this.mViewholder.textEuro = findViewById(R.id.text_euro);
        this.mViewholder.buttonCalculate = findViewById(R.id.button_calculate);
        this.mViewholder.buttonCalculate.setOnClickListener(this);

        this.clearValues();
    }

    private void clearValues(){
        this.mViewholder.textDollar.setText("");
        this.mViewholder.textEuro.setText("");
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.button_calculate){
            Double amount = Double.valueOf(this.mViewholder.editAmount.getText().toString());
            this.mViewholder.textDollar.setText(String.format("%.2f", amount *3));
            this.mViewholder.textEuro.setText(String.format("%.2f", amount *4));

        }
    }

    private static class ViewHolder{
        EditText editAmount;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }

}
