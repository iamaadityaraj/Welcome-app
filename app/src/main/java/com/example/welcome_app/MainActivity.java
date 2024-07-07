package com.example.welcome_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView welcome_text1;
    EditText welcome_editText1;
    Button welcome_btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        welcome_text1=findViewById(R.id.welcome_text1);
        welcome_editText1=findViewById(R.id.welcome_editText1);
        welcome_btn1=findViewById(R.id.welcome_btn1);

        welcome_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String InputText=welcome_editText1.getText().toString();
                Toast.makeText(MainActivity.this,
                        "namaste "+ InputText,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}