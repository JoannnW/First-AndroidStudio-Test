package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText mom;
    private EditText dad;
    private Button add;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mom = (EditText) findViewById(R.id.editTextNumber);
        dad = (EditText) findViewById(R.id.editTextNumber4);
        add = (Button) findViewById(R.id.button);
        total = (TextView) findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int momGifts = Integer.parseInt(mom.getText().toString());
                int dadGifts = Integer.parseInt(dad.getText().toString());
                int sum = momGifts + dadGifts;

                total.setText("The total no. of Gifts is: " + sum);
            }
        });
    }
}