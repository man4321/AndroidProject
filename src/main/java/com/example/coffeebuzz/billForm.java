package com.example.coffeebuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class billForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_form);

        Bundle bundle= getIntent().getExtras();
        String data = bundle.getString("TotalBill");
        TextView editText=findViewById(R.id.textView9);
        editText.setText(data);

    }
}
