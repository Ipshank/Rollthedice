package com.example.rollthedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {




    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }    public void Roll1k10(View view)
    {
        TextView textView2 =(TextView)findViewById(R.id.textView2);
        TextView textView3 =(TextView)findViewById(R.id.textView3);
        TextView textView4 =(TextView)findViewById(R.id.textView4);

        int random1 = r.nextInt(10) + 1;
        textView2.setText(Integer.toString(random1));
        textView3.setText("-");
        textView4.setText("-");

    }

    public void Roll2k10(View view)
    {
        TextView textView2 =(TextView)findViewById(R.id.textView2);
        TextView textView3 =(TextView)findViewById(R.id.textView3);
        TextView textView4 =(TextView)findViewById(R.id.textView4);

        int random2 = r.nextInt(19) + 2;
        textView3.setText(Integer.toString(random2));
        textView2.setText("-");
        textView4.setText("-");
    }

    public void Roll1k100(View view)
    {
        TextView textView2 =(TextView)findViewById(R.id.textView2);
        TextView textView3 =(TextView)findViewById(R.id.textView3);
        TextView textView4 =(TextView)findViewById(R.id.textView4);

        int random3 = r.nextInt(100) + 1;
        textView4.setText(Integer.toString(random3));
        textView2.setText("-");
        textView3.setText("-");
    }
}
