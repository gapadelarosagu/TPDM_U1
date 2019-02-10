package mx.edu.ittepic.tpdm_u1_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    //aqui van los globales
    EditText campotexto;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //enlazando con xml aqui

        btn = findViewById(R.id.boton);
        campotexto = findViewById(R.id.campotexto);


    }
}
