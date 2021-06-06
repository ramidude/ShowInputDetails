package com.example.hw_2_showdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView textViewFirstName;
    public EditText editTextFirstName;
    public TextView textViewLastName;
    public EditText editTextLastName;
    public TextView textViewEmail;
    public EditText editTextEmail;
    public TextView textViewPhone;
    public EditText editTextPhone;
    public Button buttonShowDetails;
    public TextView textViewShowDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewFirstName = findViewById(R.id.textViewFirstName);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        textViewLastName = findViewById(R.id.textViewLastName);
        editTextLastName = findViewById(R.id.editTextLastName);
        textViewEmail = findViewById(R.id.textViewEmail);
        editTextEmail = findViewById(R.id.editTextEmail);
        textViewPhone = findViewById(R.id.textViewPhone);
        editTextPhone = findViewById(R.id.editTextPhone);
        textViewShowDetails = findViewById(R.id.textViewShowDetails);
        buttonShowDetails = findViewById(R.id.buttonShowDetails);
    }

    public void displayData(View view) {
        String details =
                textViewFirstName.getText() + " " + editTextFirstName.getText() + "\n" +
                textViewLastName.getText() + " " + editTextLastName.getText() + "\n" +
                textViewEmail.getText() + " " + editTextEmail.getText() + "\n" +
                textViewPhone.getText() + " " + editTextPhone.getText() + "\n";

        textViewShowDetails.setText(details);
    }

    public void closeMe(View view) {
        Toast.makeText(this, "Have a nice one :)", Toast.LENGTH_SHORT).show();
        finish();
    }
}