package br.com.fabricadeprogramador.appfdp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Everton on 25/09/2016.
 */
public class ResultadoActivity extends Activity {
    private final String TAG = "ResultadoActivity";
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.i(TAG,"Chamou o on create "+TAG);
        //Instanciando a intent passando o bundle
        //casting com Double
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double calculo = bundle.getDouble("calculo");


        Toast.makeText(this,calculo.toString(),Toast.LENGTH_SHORT).show();
    }
}
