package com.example.cl.serializebletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Person person = new Person();
    Button button;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
           case R.id.button:
               Intent intent = new Intent(MainActivity.this, SecondActvity.class);
               person.setName("Tom");
               intent.putExtra("person_data", person);
               startActivity(intent);
               break;
           case R.id.button1:
               Intent intent1 = new Intent(MainActivity.this, SecondActvity.class);
               person.setAge(20);
               intent1.putExtra("person_data", person);
               startActivity(intent1);
               break;
           default:
               break;
       }
    }
}
