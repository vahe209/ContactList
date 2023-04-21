package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText textName, textPhone;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        List<Item> items = new ArrayList<>();
        btn = findViewById(R.id.button);
        textName = (EditText) findViewById(R.id.EditName);
        textPhone = (EditText) findViewById(R.id.EditPhone);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.add(new Item(textName.getText().toString(), textPhone.getText().toString(),R.drawable.icon));
                RecyclerView recyclerView = findViewById(R.id.rv);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
            }
        });


//


    }
    }
