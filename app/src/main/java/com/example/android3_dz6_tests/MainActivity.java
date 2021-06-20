package com.example.android3_dz6_tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.android3_dz6_tests.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Math math = new Math();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnApply.setOnClickListener(v -> {
//            binding.tvResult.setText("Hello");
//            binding.tvResult.setVisibility(View.GONE);
            int oper1 = Integer.parseInt(binding.etOper1.getText().toString());
            int oper2 = Integer.parseInt(binding.etOper2.getText().toString());
            binding.tvResult.setText(String.valueOf(math.add(oper1, oper2)));
        });
    }
}