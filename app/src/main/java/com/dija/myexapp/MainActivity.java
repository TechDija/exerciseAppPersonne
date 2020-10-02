package com.dija.myexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nomInput;
    EditText prenomInput;
    EditText ageInput;
    Button sendButton;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomInput = (EditText) findViewById(R.id.nom_input);
        prenomInput = (EditText) findViewById(R.id.prenom_input);
        ageInput = (EditText) findViewById(R.id.age_input);
        sendButton = (Button) findViewById(R.id.boutonEnvoyer);
        display = (TextView) findViewById(R.id.displayer);

    sendButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String mName = nomInput.getText().toString();
            String mFirstName = prenomInput.getText().toString();
            String mAge = ageInput.getText().toString();

            display.setText("nom: "+mName+ "\nage: "+mAge);

            Personne personne  = new Personne("Sow", "Dija", "30");

            personne.setNom(mName);
            personne.setPrenom(mFirstName);
            personne.setAge(mAge);
        }
    });
    }
}