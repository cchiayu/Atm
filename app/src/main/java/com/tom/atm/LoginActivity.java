package com.tom.atm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.IllegalFormatCodePointException;

public class LoginActivity extends AppCompatActivity {

    private EditText edUsername;
    private EditText edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View v){
        edUsername = findViewById(R.id.username);
        edPassword= findViewById(R.id.password);
        String username = edUsername.getText().toString();
        String password = edPassword.getText().toString();
        if("Jack".equals(username)&&"1234".equals(password)){
            setResult(RESULT_OK);
            finish();
        } else{
            new AlertDialog.Builder(this)
                    .setTitle("登入訊息")
                    .setMessage("登入錯誤")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }
}