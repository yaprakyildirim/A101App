package com.example.a101app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import java.util.Calendar;

public class ContactActivity extends AppCompatActivity {
    Context context = this;
    EditText name,email,phone,message,etTarih;
    Button infoSend,btnTarihSec;
    String username,mail,tarih,number,msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        name = (EditText) findViewById(R.id.Name);
        email = (EditText) findViewById(R.id.Email);
        phone = (EditText) findViewById(R.id.Phone);
        btnTarihSec = (Button) findViewById(R.id.button_tarih_sec);
        etTarih = (EditText) findViewById(R.id.edittext_tarih);
        message = (EditText) findViewById(R.id.Message);
        infoSend=(Button) findViewById(R.id.Send);

        btnTarihSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar takvim = Calendar.getInstance();
                int yil = takvim.get(Calendar.YEAR);
                int ay = takvim.get(Calendar.MONTH);
                int gun = takvim.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dpd = new DatePickerDialog(context,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                month += 1;

                                etTarih.setText(dayOfMonth + "/" + month + "/" + year);
                            }
                        }, yil, ay, gun);

                dpd.setButton(DatePickerDialog.BUTTON_POSITIVE, "Seç", dpd);
                dpd.setButton(DatePickerDialog.BUTTON_NEGATIVE, "İptal", dpd);
                dpd.show();
            }
        });
        TakeValue();
        Click();
    }

    void TakeValue() {
        username = name.getText().toString();
        mail = email.getText().toString();
        tarih = etTarih.getText().toString();
        number = phone.getText().toString();
        msj = message.getText().toString();
    }
    void Click() {
                infoSend.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        TakeValue();
                        Log.i("Values",""+username+" "+ mail+" "+tarih+" "+ number+" "+msj);
                    }
                });
            }
}