package com.example.ap_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ap_project.databinding.ActivityMainBinding;
import com.example.ap_project.databinding.ActivityResultImcBinding;

import java.io.Serializable;

public class ResultImcActivity extends AppCompatActivity{
    private ActivityResultImcBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultImcBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent myIntent = getIntent();
        Personne unePersonne = (Personne) myIntent.getSerializableExtra("Personne");

        binding.textViewResult.setText(unePersonne.interpretationIMC());

        binding.buttonSendResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }

    }

}