package ru.gb.course1.l4resources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.greetings_text_view).setOnClickListener(v -> {
            Toast.makeText(this, "OLOLO", Toast.LENGTH_SHORT).show();
        });
    }
}