package com.example.ejer_radiogroup_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.ejer_radiogroup_radiobutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //binding.rGroup.setOnCheckedChangeListener(this);
        binding.rGroup.setOnClickListener(this);
    }

    /*@Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int valor1 = Integer.parseInt(binding.txtValor1.getText().toString());
        int valor2 = Integer.parseInt(binding.txtValor2.getText().toString());

        if (R.id.rBSuma == i) {
            int suma = valor1 + valor2;
            binding.txtResultado.setText(suma);
        } else if (R.id.rBResta == i) {
            int resta = valor1 - valor2;
            binding.txtResultado.setText(resta);
        } else if (R.id.rBMultiplicacion == i) {
            int multiplicacion = valor1 * valor2;
            binding.txtResultado.setText(multiplicacion);
        } else if (R.id.rBDivision == i) {
            double division = valor1 / valor2;
            binding.txtResultado.setText((int) division);
        }
    }*/

    @Override
    public void onClick(View view) {
        int id = view.getId();
        int valor1 = Integer.parseInt(binding.txtValor1.getText().toString());
        int valor2 = Integer.parseInt(binding.txtValor2.getText().toString());

        switch (id) {
            case R.id.rBSuma:
                int suma = valor1 + valor2;
                binding.txtResultado.setText(suma);
                break;
            case R.id.rBResta:
                int resta = valor1 - valor2;
                binding.txtResultado.setText(resta);
                break;
            case R.id.rBMultiplicacion:
                int multiplicacion = valor1 * valor2;
                binding.txtResultado.setText(multiplicacion);
                break;
            case R.id.rBDivision:
                double division = valor1 / valor2;
                binding.txtResultado.setText((int) division);
                break;
        }
    }
}