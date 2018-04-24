package com.allandroidprojects.ecomsample.startup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.allandroidprojects.ecomsample.R;

public class Login extends AppCompatActivity {
    EditText user;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
       user = (EditText)findViewById(R.id.id);
        pass = (EditText)findViewById(R.id.passwd);
        String User = user.getText().toString();
        String Pass = pass.getText().toString();
        if(User.contains("Ikhsan") && Pass.contains("ikhsan")){
            Toast.makeText(Login.this, "Login Success", Toast.LENGTH_LONG).show();
            Intent i = new Intent(Login.this, WelcomeActivity.class);
            startActivity(i);
            this.finish();
        }else{
            Toast.makeText(Login.this, "Unable to login user", Toast.LENGTH_LONG).show();
        }
    }
}
