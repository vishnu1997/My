package com.example.vishnu.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView number = (TextView)findViewById(R.id.numbers);

        number.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"clicked numbers",Toast.LENGTH_SHORT).show();
                Intent num =  new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(num);
            }

        });

        TextView Phrase = (TextView)findViewById(R.id.phrases);

        Phrase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"clicked phrases",Toast.LENGTH_SHORT).show();
                Intent pha =  new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(pha);
            }

        });


        TextView color = (TextView)findViewById(R.id.colors);

        color.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"clicked colors",Toast.LENGTH_SHORT).show();
                Intent col =  new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(col);
            }

        });

        TextView family = (TextView)findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"clicked family",Toast.LENGTH_SHORT).show();
                Intent fam =  new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(fam);
            }

        });
    }
}
