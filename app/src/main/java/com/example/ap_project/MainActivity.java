package com.example.ap_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ap_project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public Personne unePersonne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.buttonIMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float taille = Float.parseFloat(binding.editTextTaille.getText().toString()) / 100;
                float masse = Float.parseFloat(binding.editTextMasse.getText().toString());
                String pseudo = binding.editTextPseudo.getText().toString();
                unePersonne = new Personne(taille, masse, pseudo);
                binding.textViewResult.setText(String.valueOf(unePersonne.interpretationIMC()));
            }
        });

    }
}