package sv.edu.udb.dr_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Actividad2 extends AppCompatActivity {
    public TextView tvNombre;
    public TextView tvSALARIO;
    private TextView tvISSS;
    private TextView tvAFP;
    private TextView tvRENTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        tvNombre=(TextView)findViewById(R.id.txtNom);

        tvSALARIO=(TextView)findViewById(R.id.SALneto);
        tvISSS=(TextView)findViewById(R.id.isss);
        tvAFP=(TextView)findViewById(R.id.afp);
        tvRENTA=(TextView)findViewById(R.id.renta);

        Bundle bundle = getIntent().getExtras();
        String H=bundle.getString("txtNumero");
        String N=bundle.getString("txtNombre");

        int Horas = Integer.parseInt(H);


        double salario = Horas * 8.50;

        double ISSS = salario * 0.02;
        double AFP = salario * 0.03;
        double RENTA = salario * 0.04;


        tvSALARIO.setText(String.valueOf(salario));
        tvISSS.setText(String.valueOf(ISSS));
        tvAFP.setText(String.valueOf(AFP));
        tvRENTA.setText(String.valueOf(RENTA));
        tvNombre.setText(N);

    }

    public void Finalizar(View v){
        finish();
    }
}