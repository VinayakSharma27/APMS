package com.example.apms;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import java.util.Random;
import de.nitri.gauge.Gauge;
public class home_module extends AppCompatActivity {
    Gauge widget1;
    Gauge widget2;
    Gauge widget3;
    Gauge widget4;
    Gauge widget5;
    Button analyze;
    Button profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_module);
        widget1 = findViewById(R.id.wid1);
        widget2 = findViewById(R.id.wid2);
        widget3 = findViewById(R.id.wid3);
        widget4 = findViewById(R.id.wid4);
        widget5 = findViewById(R.id.wid5);
        analyze = findViewById(R.id.analyze);
        profile = findViewById(R.id.profile);
        widget1.setValue(0);
        widget2.setValue(0);
        widget3.setValue(0);
        widget4.setValue(0);
        widget5.setValue(0);
        analyze.setOnClickListener(v -> {
            for (int i = 0; i < 1; i++)
            {
                Random rand = new Random();
                int x = rand.nextInt(50);
                widget1.moveToValue(x);
            }
            for (int i = 0; i < 1; i++)
            {
                Random rand = new Random();
                int x = rand.nextInt(50);
                widget2.moveToValue(x);
            }
            for (int i = 0; i < 1; i++)
            {
                Random rand = new Random();
                int x = rand.nextInt(50);
                widget3.moveToValue(x);
            }
            for (int i = 0; i < 1; i++)
            {
                Random rand = new Random();
                int x = rand.nextInt(50);
                widget4.moveToValue(x);
            }
            for (int i = 0; i < 1; i++)
            {
                Random rand = new Random();
                int x = rand.nextInt(50);
                widget5.moveToValue(x);
            }
        });
        profile.setOnClickListener(v -> openNewActivity());
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, profile_module.class);
        startActivity(intent);
    }

}