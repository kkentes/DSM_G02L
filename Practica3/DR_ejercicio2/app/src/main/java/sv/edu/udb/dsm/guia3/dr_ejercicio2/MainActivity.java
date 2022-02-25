package sv.edu.udb.dsm.guia3.dr_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickbtn(View v){
        Intent llamar = new Intent(this,Relative_layout.class);
        startActivity(llamar);
    }

}