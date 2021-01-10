package com.example.dzikir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mSentuhAkuBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSentuhAkuBtn = findViewById(R.id.btn_dzikir);

        mSentuhAkuBtn.setOnClickListener(new View.OnClickListener() {
            int counter = 0;
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Tombol telah disentuh sebanyak "+ counter++ +"kali", Toast.LENGTH_SHORT).show();
            }
        });
    }
}