package com.example.ibitfprsuraipur;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Login_Activity extends AppCompatActivity {
    private TextView txtForgotPassword;
    private TextView txtCreateAccount;
    private Button btnSingIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtCreateAccount=findViewById(R.id.login_activity_create_ac_text);
        txtForgotPassword=findViewById(R.id.login_activity_forgot_password_text);
        btnSingIn=findViewById(R.id.login_activity_sign_in_btn);
        txtCreateAccount.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(),Account_Creation_Activity.class));
        });

    }
}