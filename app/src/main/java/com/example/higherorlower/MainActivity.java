package com.example.higherorlower;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    int number;
    public void generateRandomNumber(){
        number = (int)(Math.random() * 50 + 1);
    }
    public void guessed(View view){
        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        String numberInString = numberEditText.getText().toString();
        int guessedNumber = Integer.parseInt(numberInString);
        if(guessedNumber>number)    Toast.makeText(this, "Lower!", LENGTH_SHORT).show();
        else if(guessedNumber<number)    Toast.makeText(this, "Higher!", LENGTH_SHORT).show();
        else{
            Toast.makeText(this, "You got it!", LENGTH_SHORT).show();
            generateRandomNumber();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}