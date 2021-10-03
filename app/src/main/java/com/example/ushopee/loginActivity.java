package com.example.ushopee;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    private Button next;
    private EditText number;
    private int num_val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast toast= Toast.makeText(this,"Hello you have logged in",Toast.LENGTH_SHORT);
        toast.show();
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=findViewById(R.id.number);
                num_val=Integer.parseInt(number.getText().toString());
                Toast.makeText(loginActivity.this, "you have enterd "+(num_val), Toast.LENGTH_SHORT).show();
                for(int i=0;i<num_val;i++){
                    ConstraintLayout layout =(ConstraintLayout)findViewById(R.id.parent_layout);
                    ConstraintLayout.LayoutParams lp=new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT,ConstraintLayout.LayoutParams.WRAP_CONTENT);
                    Button nb=new Button(loginActivity.this);
                    nb.setText("hello akanksha");
                    nb.setBackgroundColor(Color.rgb(255,0,0));
                    nb.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
                    layout.addView(nb,lp);


                }




            }
        });




    }
}