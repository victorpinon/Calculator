package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView screen, currOp;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSubstract, btnEquals, btnMultiply, btnDivide, btnClear, btnSin, btnCos, btnTan, btnDot;
    boolean add, substract, multiply, divide, sin, cos, tan;
    float valueOne, valueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView)findViewById(R.id.screen);
        currOp = (TextView)findViewById(R.id.currOp);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSubstract = (Button)findViewById(R.id.btnSubstract);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnSin = (Button)findViewById(R.id.btnSin);
        btnCos = (Button)findViewById(R.id.btnCos);
        btnTan = (Button)findViewById(R.id.btnTan);
        btnDot = (Button)findViewById(R.id.btnDot);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!screen.getText().equals("")){
                    add = true;
                    substract = false;
                    multiply = false;
                    divide = false;
                    sin = false;
                    cos = false;
                    tan = false;

                    valueOne = Float.parseFloat(screen.getText() + "");

                    currOp.setText("Current Operation: Addition");
                    screen.setText("");
                }
            }
        });

        btnSubstract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!screen.getText().equals("")){
                    add = false;
                    substract = true;
                    multiply = false;
                    divide = false;
                    sin = false;
                    cos = false;
                    tan = false;

                    valueOne = Float.parseFloat(screen.getText() + "");

                    currOp.setText("Current Operation: Substract");
                    screen.setText("");
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!screen.getText().equals("")){
                    add = false;
                    substract = false;
                    multiply = true;
                    divide = false;
                    sin = false;
                    cos = false;
                    tan = false;

                    valueOne = Float.parseFloat(screen.getText() + "");

                    currOp.setText("Current Operation: Multiply");
                    screen.setText("");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!screen.getText().equals("")){
                    add = false;
                    substract = false;
                    multiply = false;
                    divide = true;
                    sin = false;
                    cos = false;
                    tan = false;

                    valueOne = Float.parseFloat(screen.getText() + "");

                    currOp.setText("Current Operation: Divide");
                    screen.setText("");
                }
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                add = false;
                substract = false;
                multiply = false;
                divide = false;
                sin = true;
                cos = false;
                tan = false;

                currOp.setText("Current Operation: Sin");
                screen.setText("");
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                add = false;
                substract = false;
                multiply = false;
                divide = false;
                sin = false;
                cos = true;
                tan = false;

                currOp.setText("Current Operation: Cos");
                screen.setText("");
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                add = false;
                substract = false;
                multiply = false;
                divide = false;
                sin = false;
                cos = false;
                tan = true;

                currOp.setText("Current Operation: Tan");
                screen.setText("");
            }
        });



        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                add = false;
                substract = false;
                multiply = false;
                divide = false;
                sin = false;
                cos = false;
                tan = false;

                currOp.setText("Current Operation: None");
                screen.setText("");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (add==true){
                    valueTwo = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(valueOne+valueTwo));
                    add = false;
                    currOp.setText("Current Operation: None");
                } else if (substract==true) {
                    valueTwo = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(valueOne-valueTwo));
                    substract= false;
                    currOp.setText("Current Operation: None");
                } else if (multiply==true) {
                    valueTwo = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(valueOne*valueTwo));
                    multiply = false;
                    currOp.setText("Current Operation: None");
                } else if (divide==true) {
                    valueTwo = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(valueOne/valueTwo));
                    divide = false;
                    currOp.setText("Current Operation: None");
                } else if (sin==true) {
                    valueOne = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(Math.sin(valueOne)));
                    sin = false;
                    currOp.setText("Current Operation: None");
                } else if (cos==true) {
                    valueOne = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(Math.cos(valueOne)));
                    cos = false;
                    currOp.setText("Current Operation: None");
                } else if (tan==true) {
                    valueOne = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(Math.tan(valueOne)));
                    tan = false;
                    currOp.setText("Current Operation: None");
                } else if (currOp.getText().equals("Current Operation: None") || currOp.getText().equals("Insert an operation!")){
                    currOp.setText("Insert an operation!");
                }

                valueOne = 0;
                valueTwo = 0;
            }
        });




    }
}
