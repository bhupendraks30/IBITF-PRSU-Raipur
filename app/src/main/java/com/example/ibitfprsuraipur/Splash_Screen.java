package com.example.ibitfprsuraipur;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash_Screen extends AppCompatActivity {
    private ImageView imgIcon;
    private TextView txtTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imgIcon=findViewById(R.id.imgIcon);
        txtTitle=findViewById(R.id.txtTitle);
        Animation imgAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
        Animation txtAmin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);

        imgIcon.startAnimation(imgAnim);
        txtTitle.startAnimation(txtAmin);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
            finish();
        },5000);
    }
}