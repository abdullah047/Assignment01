package com.example.abdullah.assignment01;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import java.util.List;

public class ContactAdapter extends ArrayAdapter {

    public ContactAdapter(Context context, List objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View v = LayoutInflater.from(getContext()).inflate(R.layout.activity_contact_adapter , parent, false);
        TextView txt1 = (TextView) v.findViewById(R.id.txt1);
        TextView txt2 = (TextView) v.findViewById(R.id.txt2);
        ImageButton imageButton=(ImageButton)v.findViewById(R.id.imageButton);

        final Contact contact = (Contact) getItem(position);
        txt1.setText(contact.getName());
        txt2.setText(contact.getPhone() );
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),Detail.class);
                intent.putExtra("name",contact.getName());
                intent.putExtra("phone",contact.getPhone());
                getContext().startActivity(intent);

            }
        });

        return v;
    }
}
