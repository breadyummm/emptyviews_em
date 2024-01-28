package com.example.budgetempty;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class emptyfood_budgetj extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_foodbudget);

        ImageButton BbackButton = findViewById(R.id.BbackButton);
        EditText textNotes = findViewById(R.id.textNotes);
        ImageButton add_btn = findViewById(R.id.add_btn);

        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                Intent intent = new Intent(emptyfood_budgetj.this, empty_budgetsub.class);
                startActivity(intent);
            }
        });

        String userNotes = textNotes.getText().toString();

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSmallDialog();
            }
        });
    }
    private void showSmallDialog() {
        // Create an AlertDialog.Builder instance
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Get the layout inflater
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View smallDialogLayout = inflater.inflate(R.layout.food_child, null);

        // Set the small dialog layout
        builder.setView(smallDialogLayout);

        // Create the dialog
        AlertDialog dialog = builder.create();

        // Show the dialog
        dialog.show();
    }
}
