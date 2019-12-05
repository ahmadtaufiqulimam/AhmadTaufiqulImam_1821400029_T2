package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText alas,tinggi;
    Button hitung ;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        alas = (EditText) findViewById(R.id.ed_alas);
        tinggi = (EditText) findViewById( R.id.ed_tinggi);
        hitung = (Button) findViewById(R.id.bt_hitung);
        hasil = (TextView) findViewById(R.id.tx_hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (alas.length()== 0 && tinggi.length()==0){
                    Toast.makeText(getApplication(), "Alas Dan Tinggi Tidak Boleh Kosong ", Toast.LENGTH_LONG).show();
                }
                else if(alas.length()==0) {
                    Toast.makeText(getApplication(), "Alas Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(), "Tinggi Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }
                else {
                    String isiAlas = alas.getText().toString();
                    String isiTinggi= tinggi.getText().toString();

                    double alas = Double.parseDouble(isiAlas);
                    double tinggi = Double.parseDouble(isiTinggi);

                    double hs = LuasSegitiga (alas,tinggi);

                    hasil.setText(hasil.toString());
                }
            }
        });
    }
    public double LuasSegitiga (double alas , double tinggi){return alas*tinggi;}
}
