package com.example.smdassign3_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class ContactList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        RecyclerView recyclerView = findViewById(R.id.rv);


        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        ProfilePosts post1 = new ProfilePosts(R.drawable.hassan, "Hassan Hameed", "03228766598", "hassan56@gmail.com");
        ProfilePosts post2 = new ProfilePosts(R.drawable.uzair, "Uzair Rehman", "03335689899", "uzair88@gmail.com");
        ProfilePosts post3 = new ProfilePosts(R.drawable.zohaib, "Zohaib Nafees", "03457777788", "mustafa.ift86@gmail.com");
        ProfilePosts post4 = new ProfilePosts(R.drawable.maarij, "Maarij Fatima", "03023377339", "maarij77@gmail.com");
        ProfilePosts post5 = new ProfilePosts(R.drawable.hassan2, "Hassan Minhas", "03228899456", "hassan.minhas55@gmail.com");
        ProfilePosts post6 = new ProfilePosts(R.drawable.rimsha, "Rimsha Gul", "03348899456", "rimsha.gul55@gmail.com");

        ProfilePosts [] posts = {post1,post2,post3,post4,post5};
        ArrayList <ProfilePosts> allPosts = new ArrayList<ProfilePosts>();
        allPosts.add(post1);
        allPosts.add(post2);
        allPosts.add(post3);
        allPosts.add(post4);
        allPosts.add(post5);
        allPosts.add(post6);
        recyclerView.setAdapter(new MyAdapter(allPosts, this));
    }
}
