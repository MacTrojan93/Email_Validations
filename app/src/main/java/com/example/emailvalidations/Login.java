package com.example.emailvalidations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
    private AppCompatAutoCompleteTextView autoTextView;
    private AppCompatAutoCompleteTextView autoTextViewCustom;
    private android.widget.EditText editText;
    private AppCompatCheckBox checkBox;
    ImageButton createNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        checkBox = (AppCompatCheckBox) findViewById(R.id.checkbox_pass);
        editText = findViewById(R.id.txtpassword);
        createNew = findViewById(R.id.btn_NewUser);

        createNew.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent mapping = new Intent(getApplicationContext(), CreateNew.class);
                startActivity(mapping);
            }


        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    //show password
                    editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    //hide password
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
}