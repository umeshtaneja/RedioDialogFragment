package com.example.sagoo.radiodialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button btnShowDialog;
    private MyDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowDialog = findViewById(R.id.button);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new MyDialog();
                dialog.show(getSupportFragmentManager(),"dialog");
            }
        });
    }

}
