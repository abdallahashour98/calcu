package com.example.calcu;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import com.example.calcu.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final  TextView tv_result=findViewById(R.id.tvresul);
        final EditText txt_number1 =findViewById(R.id.txt_number1);
        final EditText txt_number2=findViewById(R.id.txt_number2);
        Button btn_Dividing =findViewById(R.id.btnDividing);
        Button btn_Hit =findViewById(R.id.btnHit);
        Button btn_Subtract =findViewById(R.id.btnSubtract);
        Button btn_plural =findViewById(R.id.btnplural);


       btn_Dividing.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override

            public void onClick(View v) {
                try {
                    int num1 =Integer.parseInt(txt_number1.getText().toString());
                    int num2 =Integer.parseInt(txt_number2.getText().toString());
                    int res =num1 / num2;
                    tv_result.setText(String.valueOf(res));
                }
                catch          (Exception ex)

                {
                        Toast.makeText(MainActivity.this, "can not divide by zero", Toast.LENGTH_SHORT).show();
               }

                    btn_Hit.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int num1 =Integer.parseInt(txt_number1.getText().toString());
                            int num2 =Integer.parseInt(txt_number2.getText().toString());
                            int res =num1 * num2;
                            tv_result.setText(String.valueOf(res));
                        }
                    });
                    btn_Subtract.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int num1 =Integer.parseInt(txt_number1.getText().toString());
                            int num2 =Integer.parseInt(txt_number2.getText().toString());
                            int res =num1 - num2;
                            tv_result.setText(String.valueOf(res));
                        }
                    });
                    btn_plural.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            int num1 = Integer.parseInt(txt_number1.getText().toString());
                            int num2 = Integer.parseInt(txt_number2.getText().toString());
                            int res = num1 + num2;
                            tv_result.setText(String.valueOf(res));

                        }


                    });








                }
            //}
        });
    }
}