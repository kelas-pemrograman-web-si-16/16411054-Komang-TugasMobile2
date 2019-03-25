package com.example.user.tugasmobile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Intent1 extends AppCompatActivity {

    Button btnLogin;
    EditText editNPM, editNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        editNPM = (EditText) findViewById(R.id.editNPM);
        editNama = (EditText) findViewById(R.id.editNama);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = editNama.getText().toString();
                String npm = editNPM.getText().toString();
                Intent a = null;

                if (nama.equals("Komang Nur Kertiani")  && npm.equals("16411054")){
                    a = new Intent(Intent1.this, Intent2.class);
                    a.putExtra("nama", editNama.getText().toString());
                    a.putExtra("npm", editNPM.getText().toString());
                    startActivity(a);
                }else{
                    Toast.makeText(getApplicationContext(), "Maaf Inputan Salah", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
