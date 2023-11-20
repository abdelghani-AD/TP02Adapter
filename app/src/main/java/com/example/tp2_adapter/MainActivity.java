package com.example.tp2_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.histrique);
//        ArrayList<String> langage = new ArrayList<>();
//        langage.add("Java");
//        langage.add("C#");
//        langage.add("Python");
//        langage.add("Kotlin");
//        langage.add("Swift");
        HashMap<String,Integer> donnees = new HashMap<>();
        donnees.put("Java",1859);
        donnees.put("C#",1890);
        donnees.put("Python",1875);
        donnees.put("Kotlin",1986);
        donnees.put("Swift",1972);
        ClassAdapter adapter = new ClassAdapter(donnees,this);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setAdapter(adapter);
    }
}