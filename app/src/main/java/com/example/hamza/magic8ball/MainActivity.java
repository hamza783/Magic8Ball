package com.example.hamza.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    Button mainText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (Button)findViewById(R.id.button);
        mainText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = rand.nextInt(5);
                String text;
                switch (num) {
                    case 0: text = "Yes";
                        break;
                    case 1: text = "NO";
                        break;
                    case 2: text = "May be";
                        break;
                    case 3: text = "No way";
                        break;
                    case 4: text = "Definitely";
                        break;
                    default: text="I don't know";
                        break;
                }
                mainText.setText(text);
            }
        });
    }
}
