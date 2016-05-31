package com.samset.registrationpagedesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.design1);
        btn2= (Button) findViewById(R.id.design2);
        btn3= (Button) findViewById(R.id.design3);
        //btn4= (Button) findViewById(R.id.design4);
        //btn5= (Button) findViewById(R.id.design5);
        //btn6= (Button) findViewById(R.id.design6);
       // btn7= (Button) findViewById(R.id.design7);
       // btn8= (Button) findViewById(R.id.design8);
        //btn9= (Button) findViewById(R.id.design9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
       // btn4.setOnClickListener(this);
       // btn5.setOnClickListener(this);
        //btn6.setOnClickListener(this);
       // btn7.setOnClickListener(this);
       // btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,DesignActivity.class);

        if (v==btn1)
        {
         intent.putExtra("id",0);
        }else if (btn2==v)
        {
            intent.putExtra("id",1);
        }else if (btn3==v)
        {
            intent.putExtra("id",2);
        }

        startActivity(intent);
    }
}
