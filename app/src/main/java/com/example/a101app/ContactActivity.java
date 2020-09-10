package com.example.a101app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactActivity extends AppCompatActivity {

    EditText name,email,phone,message;
    Button infoSend;
    String username,mail,number,msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        name = (EditText) findViewById(R.id.Name);
        email = (EditText) findViewById(R.id.Email);
        phone = (EditText) findViewById(R.id.Phone);
        message =   (EditText) findViewById(R.id.Message);
        infoSend=(Button) findViewById(R.id.Send);
        TakeValue();
        Click();
    }

    void TakeValue()
    {
        username = name.getText().toString();
        mail = email.getText().toString();
        number = phone.getText().toString();
        msj = message.getText().toString();
    }
    void Click()
    {
        infoSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TakeValue();
                Log.i("Values",""+username+" "+mail+" "+number+" "+msj);
            }
        });
    }

}