package com.example.encoreuntest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button m_addButton;
    private TextView m_textResult;
    private Button m_substractButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        m_addButton = findViewById(R.id.addButton);
        m_textResult = findViewById(R.id.compteur);
//        m_addButton.setOnClickListener(this);

//        m_substractButton = findViewById(R.id.substract);
//        m_substractButton.setOnClickListener(this);
    }

    //    @Override
    //   public void onClick(View v) {

    //      String currentText = m_textResult.getText().toString();
    //     int currentValue = Integer.parseInt(currentText);
    //      if (v == m_addButton){
    //          currentValue++;

    //      }
    //     else {
    //        currentValue--;
    //    }
    //    m_textResult.setText(String.valueOf(currentValue));
    // }

    public void onaddclick(View v) {
        String currentText = m_textResult.getText().toString();
        int currentValue = Integer.parseInt(currentText);
        currentValue++;
        m_textResult.setText(String.valueOf(currentValue));
    }

    public void onsubstractclick(View v) {
        String currentText = m_textResult.getText().toString();
        int currentValue = Integer.parseInt(currentText);
        currentValue--;
        m_textResult.setText(String.valueOf(currentValue));
    }
}