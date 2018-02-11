package com.example.narmada.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button validateB;
    public TextView result;
    public EditText inputText;
    private boolean click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validateB = findViewById(R.id.button);
        final Validator  valid_ate = new Validator();
        inputText = findViewById(R.id.editText);
        result = findViewById(R.id.textView);
        click = false;
        validateB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!click) {
                    String in = String.valueOf(inputText.getText());
                    int pass = valid_ate.validate(in);
                    System.out.println(pass);
                    if(pass == 5) {
                        result.setText("strong");
                    }
                    else {
                        result.setText("weak");
                    }

                }
            }

        });





    }
}
