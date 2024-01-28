package com.example.budgetempty;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class empty_budgetsub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emptybudget_sub1);

        ImageButton BbackButton = findViewById(R.id.BbackButton);
        ImageButton add_btn = findViewById(R.id.add_btn);

        BbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                Intent intent = new Intent(empty_budgetsub.this, emptybudget.class);
                startActivity(intent);
            }
        });



        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSmallDialog();
            }
        });
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    private void showSmallDialog() {
        // Create an AlertDialog.Builder instance
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Get the layout inflater
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View smallDialogLayout = inflater.inflate(R.layout.budget_sub1_child, null);

        // Set the small dialog layout
        builder.setView(smallDialogLayout);

        // Create the dialog
        AlertDialog dialog = builder.create();

        // Show the dialog
        dialog.show();
    }
}