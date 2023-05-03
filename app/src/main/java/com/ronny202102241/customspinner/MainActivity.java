package com.ronny202102241.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        List<String> characterList = new ArrayList<>();
        characterList.add("Albania");
        characterList.add("belgia");
        characterList.add("Hungary");
        characterList.add("Iran");
        characterList.add("Slovenia");

        CharacterAdapter ca = new CharacterAdapter(getApplicationContext(), characterList);
        spinner1.setAdapter(ca);
    }
}