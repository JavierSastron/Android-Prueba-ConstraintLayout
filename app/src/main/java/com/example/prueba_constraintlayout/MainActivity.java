package com.example.prueba_constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private Button btnAnonimaCancel;
    private Button btnImplements;
    private final CharSequence CANCELTEXT = "Mensaje de cancelación que no hace nada Onclick ";
    private final CharSequence IMPLEMENTTXT = "Onclick de clase implements";
    private final CharSequence ONCLICKTXT = "Onclick desde método btnEvent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnonimaCancel = (Button) findViewById(R.id.btnCancel);
        btnImplements = (Button) findViewById(R.id.btnImplements);

        //Clase Anónima
        btnAnonimaCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), CANCELTEXT, Toast.LENGTH_LONG).show();
            }
        });

        //Clase implements (Interfaz)
        btnImplements.setOnClickListener(this);

    }

    //Clase implements (Método de la interfaz)
    @Override
    public void onClick(View v) {
        // Sw -> Validar de donde viene y reutilizar el código
        switch (v.getId()) {
            case R.id.btnImplements:
                Toast.makeText(getApplicationContext(), IMPLEMENTTXT, Toast.LENGTH_LONG).show();
                break;
            case R.id.btnOnclick:
                Toast.makeText(getApplicationContext(), ONCLICKTXT, Toast.LENGTH_LONG).show();
                break;
        }
    }

    // Clase OnClick
    public void btnEvent(View view) {
        Toast.makeText(getApplicationContext(), ONCLICKTXT, Toast.LENGTH_LONG).show();
    }
}