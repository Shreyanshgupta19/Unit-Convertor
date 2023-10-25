package com.example.unitconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText t1;
    TextView res,butt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.t1);
        res = (TextView) findViewById(R.id.result);
        butt = (Button) findViewById(R.id.button);
    }

   public void process(View view){
        Double n1 = Double.parseDouble(t1.getText().toString());

        Double butt = n1*1000;

                res.setText( butt + " gm");
   }
}