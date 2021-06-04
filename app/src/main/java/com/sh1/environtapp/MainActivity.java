package com.sh1.environtapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    String[] noticias;
    ArrayAdapter<String> adapter;
    HashMap<String, String> map;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner2);
        map = new HashMap<String, String>();
        map.put("El Dia","https://eldia.com.do");
        map.put("Diario Libre","https://www.diariolibre.com");
        map.put("Listin Diario","https://listindiario.com");
        noticias = new String[]{"El Dia","Diario Libre","Listin Diario"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,noticias);
        spinner.setAdapter(adapter);
    }

    public void prueba (View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        if(spinner.getSelectedItem().toString().isEmpty()){return ;}
        intent.putExtra("text",map.get(spinner.getSelectedItem().toString()));
        startActivity(intent);
    }
}