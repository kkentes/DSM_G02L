package sv.edu.udb.dr_ejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Nombre;
    private EditText horas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre=(EditText)findViewById(R.id.txtNombre);
        horas=(EditText)findViewById(R.id.txtNumero);
    }

    public void actividad2 (View v){


        Intent i=new Intent(this, Actividad2.class);
        i.putExtra("txtNombre", Nombre.getText().toString());
        i.putExtra("txtNumero", horas.getText().toString());
        startActivity(i);

    }
}