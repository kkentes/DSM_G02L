package sv.edu.udb.dr_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView Dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dato=findViewById(R.id.txtD);

    }

    public void suma(View view){

        String num = Dato.getText().toString();

        int numero = Integer.parseInt(num);

    }
}