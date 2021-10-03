package com.example.ushopee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent);
                /*final DatabaseReference rootref;
                rootref= FirebaseDatabase.getInstance().getReference();
                rootref.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(!(snapshot.child("credentials").child("8008048963").exists())){
                            System.out.println("________________________________");
                            HashMap <String,Object> data=new HashMap<>();
                            data.put("name","shiridi");
                            data.put("password","ahsknaka");
                            data.put("phone","8008048963");
                            System.out.println("**************************************************");
                            rootref.child("credentials").child("8008048963").updateChildren(data).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull  Task<Void> task) {
                                    System.out.println("asdaasdaasdaasdaadaada");
                                    Toast.makeText(MainActivity.this, "Credentials have been succesfully uppdated", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                        else{
                            System.out.println("_______________________");
                        }

                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });*/
                Toast.makeText(MainActivity.this, "You have been succesfully logged in", Toast.LENGTH_SHORT).show();

            }
        });

    }

}