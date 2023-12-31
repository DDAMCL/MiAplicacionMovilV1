package com.marco.blocknotaslogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TipoNotaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private CheckBox seleccionarChk;
    String[] gender = {"Trabajo", "Escuela"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiponota);

        seleccionarChk = (CheckBox) findViewById(R.id.chk);

        Spinner spin = (Spinner) findViewById(R.id.spinnerGender);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,gender);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void btnChekPet(View v){
        String mensaje;
        if (seleccionarChk.isChecked() == true){
            Intent myIntent = new Intent(TipoNotaActivity.this, HomeActivity.class);
            startActivity(myIntent);
        } else {
            mensaje = "No Seleccionado";
            Toast tost = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT);
            tost.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            tost.show();
        }

    }
}
