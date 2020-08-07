package com.example.fullcalcshabalkova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
private String lastAction;
private Float lastNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.textView);
        final Button btDot = findViewById(R.id.button_);
        final Button bt0 = findViewById(R.id.button0);
        final Button bt1 = findViewById(R.id.button1);
        final Button bt2 = findViewById(R.id.button2);
        final Button bt3 = findViewById(R.id.button3);
        final Button bt4 = findViewById(R.id.button4);
        final Button bt5 = findViewById(R.id.button5);
        final Button bt6 = findViewById(R.id.button6);
        final Button bt7 = findViewById(R.id.button7);
        final Button bt8 = findViewById(R.id.button8);
        final Button bt9 = findViewById(R.id.button9);
        final Button btC = findViewById(R.id.buttonC);
        final Button btSign = findViewById(R.id.buttonSign);
        final Button btPerc = findViewById(R.id.buttonPercentage);
        final Button btDiv = findViewById(R.id.buttonDiv);
        final Button btMul = findViewById(R.id.buttonMulti);
        final Button btMin = findViewById(R.id.buttonMin);
        final Button btPlus = findViewById(R.id.buttonPlus);
        final Button btEqv = findViewById(R.id.buttonEql);



        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });

        btSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //           String text = textView.getText().toString();
                //            if (text.contains("-")){
                Toast.makeText(MainActivity.this, "Not working in this version", Toast.LENGTH_SHORT).show();
                //           }
                //         else {
                //              text = "-" + text;
                //             textView.setText(text);
                //       }
            }
        });

        btPerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Not working in this version", Toast.LENGTH_SHORT).show();
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                try {
                    lastNum = Float.parseFloat(text);
                    lastAction = "div";
                    textView.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Wrong number Format", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                try {
                    lastNum = Float.parseFloat(text);
                    lastAction = "mul";
                    textView.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Wrong number Format", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                try {
                    lastNum = Float.parseFloat(text);
                    lastAction = "min";
                    textView.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Wrong number Format", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                try {
                    lastNum = Float.parseFloat(text);
                    lastAction = "plus";
                    textView.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Wrong number Format", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btEqv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                Float newNum = Float.parseFloat(text);
                Float total;
                switch (lastAction) {
                    case "div":
                        total = lastNum/newNum;
                        textView.setText(total.toString());
                        break;
                    case "mul":
                        total = lastNum*newNum;
                        textView.setText(total.toString());
                        break;
                    case "min":
                        total = lastNum-newNum;
                        textView.setText(total.toString());
                         break;

                    case "plus":
                        total = lastNum+newNum;
                        textView.setText(total.toString());
                        break;

                }

            }
        });

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView.getText().toString();
                try {
                    Float num = Float.parseFloat(text);
                    addText(btDot, textView);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Wrong number Format", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt0, textView);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt1, textView);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt2, textView);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt3, textView);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt4, textView);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt5, textView);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt6, textView);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt7, textView);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt8, textView);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addText(bt9, textView);
            }
        });

    }

    public static void addText(Button btn, TextView txt) {
        String text = txt.getText().toString();
        text = text + btn.getText().toString();
        txt.setText(text);
    }
}