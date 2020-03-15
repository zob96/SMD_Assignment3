package com.example.smdassign3_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetails extends AppCompatActivity {

    String name;
    String number;
    String email;
    int image;
    TextView textViewName;
    TextView textViewNumber;
    TextView textViewEmail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        textViewName= findViewById(R.id.contact_name);
        textViewEmail= findViewById(R.id.contact_email);
        textViewNumber= findViewById(R.id.contact_number);
        imageView= findViewById(R.id.ContactImg);

        name=  getIntent().getStringExtra("name");
        number= getIntent().getStringExtra("number");
        email= getIntent().getStringExtra("email");
        image= getIntent().getIntExtra("image", image);

        textViewName.setText(name);
        textViewNumber.setText(number);
        textViewEmail.setText(email);
        imageView.setImageResource(image);


        getIntent().removeExtra("name");


    }
}
