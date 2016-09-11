package com.lifeistech.android.randomint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    TextView t;
    TextView e;
    TextView x;
    TextView textview;
    int num1;
    int num2;
    int num3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.textView);
        e = (TextView) findViewById(R.id.textView2);
        x = (TextView) findViewById(R.id.textView3);
        textview = (TextView)findViewById(R.id.textView4
        );
        int ra = r.nextInt(9);
        int ran = r.nextInt(9);
        int rand = r.nextInt(3);

        if (ra == 0) {
            num1 = 0;
            t.setText(String.valueOf(num1));

        } else if (ra == 1) {
            num1 = 1;
            t.setText(String.valueOf(num1));
        } else if (ra == 2) {
            num1 = 2;
            t.setText(String.valueOf(num1));
        } else if (ra == 3) {
            num1 = 3;
            t.setText(String.valueOf(num1));
        } else if (ra == 4) {
            num1 = 4;
            t.setText(String.valueOf(num1));
        } else if (ra == 5) {
            num1 = 5;
            t.setText(String.valueOf(num1));
        } else if (ra == 6) {
            num1 = 6;
            t.setText(String.valueOf(num1));
        } else if (ra == 7) {
            num1 = 7;
            t.setText(String.valueOf(num1));
        } else if (ra == 8) {
            num1 = 8;
            t.setText(String.valueOf(num1));
        } else if (ra == 9) {
            num1 = 9;
            t.setText(String.valueOf(num1));
        }
        if (ran == 0) {
            num3 = 0;
            x.setText(String.valueOf(num3));
        } else if (ran == 1) {
            num3 = 1;
            x.setText(String.valueOf(num3));
        } else if (ran == 2) {
            num3 = 2;
            x.setText(String.valueOf(num3));

        } else if (ran == 3) {
            num3 = 3;
            x.setText(String.valueOf(num3));
        } else if (ran == 4) {
            num3 = 4;
            x.setText(String.valueOf(num3));
        } else if (ran == 5) {
            num3 = 5;
            x.setText(String.valueOf(num3));
        } else if (ran == 6) {
            num3 = 6;
            x.setText(String.valueOf(num3));
        } else if (ran == 7) {
            num3 = 7;
            x.setText(String.valueOf(num3));
        } else if (ran == 8) {
            num3 = 8;
            x.setText(String.valueOf(num3));
        } else if (ran == 9) {
            num3 = 9;
            x.setText(String.valueOf(num3));

        }
        if (rand == 0) {
            e.setText("+");
            plus();
        }else if (rand == 1){
            e.setText("-");
            minus();
        }else if (rand == 2) {
            e.setText("*");
            kakeru();
        }

    }

    private void plus() {
        num2 = num1 + num3;
        textview.setText(String.valueOf(num2));
    }



    private void minus() {
        num2 = num1 - num3;
        textview.setText(String.valueOf(num2));

    }

    private void kakeru() {
        num2 = num1 * num3;
        textview.setText(String.valueOf(num2));

    }

}
