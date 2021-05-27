package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 public Button btn_0,btn_00 ,btn_1,btn_2 ,btn_3, btn_4 ,btn_5,btn_6 ,btn_7, btn_8 ,btn_9,btn_dot;
 public Button btn_sin ,btn_cos,btn_delete ,btn_mod, btn_div ,btn_multiplication,btn_sous ,btn_add, btn_equal ,btn_clear;
 public TextView screen;
 public TextView screen2;
  String data;
 CharSequence value  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.screen = (TextView) findViewById(R.id.screen);
        this.screen2 = (TextView) findViewById(R.id.screen2);

        this.btn_00 = (Button) findViewById(R.id.btn_00);
        this.btn_0 = (Button) findViewById(R.id.btn_0);
        this.btn_1 = (Button) findViewById(R.id.btn_1);
        this.btn_2 = (Button) findViewById(R.id.btn_2);
        this.btn_3 = (Button) findViewById(R.id.btn_3);
        this.btn_4 = (Button) findViewById(R.id.btn_4);
        this.btn_5 = (Button) findViewById(R.id.btn_5);
        this.btn_6 = (Button) findViewById(R.id.btn_6);
        this.btn_7 = (Button) findViewById(R.id.btn_7);
        this.btn_8 = (Button) findViewById(R.id.btn_8);
        this.btn_9 = (Button) findViewById(R.id.btn_9);
        this.btn_dot = (Button) findViewById(R.id.btn_dot);

        this.btn_add = (Button) findViewById(R.id.btn_add);
        this.btn_multiplication = (Button) findViewById(R.id.btn_mult);
        this.btn_sous = (Button) findViewById(R.id.btn_sous);
        this.btn_mod = (Button) findViewById(R.id.btn_mod);
        this.btn_delete = (Button) findViewById(R.id.btn_delete);
        //this.btn_sin = (Button) findViewById(R.id.btn_sin);
       // this.btn_cos = (Button) findViewById(R.id.btn_cos);
        this.btn_div = (Button) findViewById(R.id.btn_div);
        this.btn_clear=(Button) findViewById(R.id.btn_clear);
        this.btn_equal = (Button) findViewById(R.id.btn_equal);

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
                screen2.setText("");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "0" );
                screen2.setText(" ");

            }
        });

        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                if (data.length() < 1) {
                    screen2.setText("");
                } else {
                    screen.setText(data + "00");
                    screen2.setText(" ");
                }
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "1" );
                screen2.setText(" ");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "2" );
                screen2.setText(" ");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "3" );
                screen2.setText(" ");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "4" );
                screen2.setText(" ");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "5" );
                screen2.setText(" ");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "6" );
                screen2.setText(" ");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "7" );
                screen2.setText(" ");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "8" );
                screen2.setText(" ");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText( data + "9" );
                screen2.setText(" ");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText(data + "+");
                screen2.setText(" ");
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText(data + "×");
            }
        });

        btn_sous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText(data + "-");
            }
        });

        btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText(data + "%");
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText(data + "/");
            }
        });


        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = screen.getText().toString();
                screen.setText(data + ".");
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.length() > 0) {
                    data = screen.getText().toString();
                    data = data.substring(0, data.length() - 1);
                    screen.setText(data);
                }

            }
        });



        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data = screen.getText().toString();
                if (data.length() < 1) {
                    screen2.setText("");
                } else {
                    data = data.replaceAll("×", "*");
                    data = data.replaceAll("%", "/100");
                    data = data.replaceAll("÷", "/");

                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);

                    String finalResult = "";

                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable, data, "Javsscript", 1, null).toString();

                    screen2.setText(finalResult);

                }
            }
        });



    }

}