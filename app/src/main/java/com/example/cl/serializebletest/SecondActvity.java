package com.example.cl.serializebletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by cl on 2015/8/31.
 */
public class SecondActvity extends Activity{
   Person person = new Person();
   Button button ;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        person = (Person) getIntent().getSerializableExtra("person_data");

        Log.d(SecondActvity.ACTIVITY_SERVICE,person.getName());
      //  Log.d(SecondActvity.ACTIVITY_SERVICE, String.valueOf(person.getAge()));

        button = (Button) findViewById(R.id.return_view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActvity.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
