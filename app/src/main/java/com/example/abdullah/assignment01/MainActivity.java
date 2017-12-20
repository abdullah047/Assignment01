package com.example.abdullah.assignment01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contact> contactList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            contactList.add(new Contact("Name =  " + i, i % 2 == 3));
        }

        ListView listview1 = (ListView) findViewById(R.id.lv);
        ContactAdapter contactAdapter = new ContactAdapter(this, contactList);
        listview1.setAdapter(contactAdapter);

    }
}
