package com.example.apms;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class uic_verification extends AppCompatActivity
{
    int uiccode;
    int realcode = 267762;
    EditText uic;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uic_verification);
        uic = findViewById(R.id.uicCode);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(v -> {
            uiccode = Integer.parseInt(uic.getText().toString());
            if (uiccode == realcode)
            {
                Intent i = new Intent(getApplicationContext(), user_verification.class);
                startActivity(i);
            }
            else
            {
                Toast.makeText(uic_verification.this, "SORRY WRONG UIC", Toast.LENGTH_SHORT).show();
            }
        });
    }
}