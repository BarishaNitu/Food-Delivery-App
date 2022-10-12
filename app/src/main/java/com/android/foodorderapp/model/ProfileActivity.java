package com.android.foodorderapp.model;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.foodorderapp.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    TextView emailText,naming;
    EditText userName,userPhone;
    ImageView userProfile;
    Button saveButton;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       // View root = inflater.inflate(R.layout.activity_profile, container, false);
        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        emailText=findViewById(R.id.email);
        userProfile=findViewById(R.id.image);
        saveButton=findViewById(R.id.button3);
        userName=findViewById(R.id.setName);
        userPhone=findViewById(R.id.setPhone);
        naming=findViewById(R.id.name);
        mAuth=FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();
     if(user!=null){

        emailText.setText(user.getEmail());
        //nameText.setText();
        //Picasso.get().load("https://cdn.vectorstock.com/i/preview-1x/66/14/default-avatar-photo-placeholder-profile-picture-vector-21806614.jpg").fit().into(userProfile);
        //userProfile.setImageURI(user.getPhotoUrl());
    }
        else{
        Toast.makeText(this, "User not there", Toast.LENGTH_SHORT).show();
    }
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=userName.getText().toString();
                String phone=userPhone.getText().toString();
                String emaaaail=user.getEmail();
                HashMap<String,Object>hashMap=new HashMap<>();
                hashMap.put("email",emaaaail);
                hashMap.put("name",name);
                hashMap.put("phone",phone);
               databaseReference.child("Users")
                       //.child(emaaaail)
                       .setValue(hashMap)
                       .addOnSuccessListener(new OnSuccessListener<Void>() {
                           @Override
                           public void onSuccess(Void unused) {
                               Toast.makeText(ProfileActivity.this,"Data Added",Toast.LENGTH_SHORT).show();
                           }
                       })
                       .addOnFailureListener(new OnFailureListener() {
                           @Override
                           public void onFailure(@NonNull Exception e) {
                               Toast.makeText(ProfileActivity.this,"Data Adding failed",Toast.LENGTH_SHORT).show();
                           }
                       });
               databaseReference=FirebaseDatabase.getInstance().getReference().child("Users");
               databaseReference.addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot snapshot) {
                       String name1=snapshot.child("name").getValue().toString();
                       naming.setText("Name: \n\n"+name1);
                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError error) {

                   }
               });
            }
        });
}}