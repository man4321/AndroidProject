package com.example.coffeebuzz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button4;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button5;
    private TextView coffee;
    private TextView coffee2;
    private TextView coffee3;
    public TextView amount;

    public int count=0;
    private int cff=0,cff2=0,cff3=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        coffee = findViewById(R.id.coffee);
        button5= findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cff=0;
                cff2=0;
                cff3=0;
                count=0;
                coffee.setText(Integer.toString(cff));
                coffee2.setText(Integer.toString(cff2));
                coffee3.setText(Integer.toString(cff3));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addcoffee();

            }
        });
        button2 = findViewById(R.id.button2);
        coffee2 = findViewById(R.id.coffee2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addsecondcoffee();
            }
        });

        button3 = findViewById(R.id.button3);
        coffee3= findViewById(R.id.coffee3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addthirdcoffee();
            }
        });
        amount =  findViewById(R.id.textView9);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrder();

            }
        });
    }
        void addcoffee(){
            count+=80;
            cff+=1;
            coffee.setText(Integer.toString((cff)));

        };
        void addsecondcoffee(){
                count+=100;
                cff2+=1;
                coffee2.setText(Integer.toString(cff2));
         };

        void addthirdcoffee(){
            count+=50;
            cff3+=1;
            coffee3.setText(Integer.toString(cff3));

        }


    public void openOrder() {
            String data = Integer.toString(count);
        Intent  intent = new Intent(this,billForm.class);
        intent.putExtra("TotalBill",data);
        startActivity(intent);



    }

}
