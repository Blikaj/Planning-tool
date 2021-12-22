package com.example.planningtool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.btnMyNotes_1):
                Intent first_category = new Intent(this, Notebook.class);
                first_category.putExtra("category", "Важные дела");
                startActivity(first_category);
                break;


            case (R.id.btnMyNotes_2):
                Intent third_category = new Intent(this, Notebook.class);
                third_category.putExtra("category", "Неважные дела");
                startActivity(third_category);
                break;

        }
    }
}