package br.com.fabricadeprogramador.appfdp;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Fazendo tests com logCat
    private final String TAG = "MainActivity";

    @Override
    protected void onResume() {
        Log.i(TAG,"Chamou o onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"Chamou o onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"Chamou o onDestroy");
        super.onDestroy();

    }

    @Override
    protected void onStart() {
        Log.i(TAG,"Chamou o onStart");
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"Chamou o OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button somar = (Button) findViewById(R.id.btnSomar);
        Button subtrair = (Button) findViewById(R.id.btnSub);
        Button multiplicar = (Button) findViewById(R.id.btnMult);
        Button dividir = (Button) findViewById(R.id.btnDiv);

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n1 = (EditText) findViewById(R.id.ed01);
                EditText n2 = (EditText) findViewById(R.id.ed02);

                String strN1 = n1.getText().toString();
                String strN2 = n2.getText().toString();
                if((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else{
                    Double num1 = new Double(strN1);
                    Double num2 = new Double(strN2);
                    Double somar = num1+num2;
                    //Toast.makeText(MainActivity.this,"O valor da soma é "+somar,Toast.LENGTH_SHORT).show();
                    //Intent ==> views this e resultado.class criando a navegação
                    Intent irParaResultado = new Intent(MainActivity.this,ResultadoActivity.class);
                    //iniciando a view target, nao esquecer do mainfest
                    //Bundle == bando de parametros
                    Bundle bundle = new Bundle();
                    bundle.putDouble("calculo",somar);
                    irParaResultado.putExtras(bundle);

                    startActivity(irParaResultado);
                }
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n1 = (EditText) findViewById(R.id.ed01);
                EditText n2 = (EditText) findViewById(R.id.ed02);

                String strN1 = n1.getText().toString();
                String strN2 = n2.getText().toString();
                if((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else{
                    Double num1 = new Double(strN1);
                    Double num2 = new Double(strN2);
                    Double sub = num1-num2;

                    Intent irParaResultado = new Intent(MainActivity.this,ResultadoActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("calculo",sub);
                    irParaResultado.putExtras(bundle);

                    startActivity(irParaResultado);
                    //Toast.makeText(MainActivity.this,"O valor da subtração é "+sub,Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n1 = (EditText) findViewById(R.id.ed01);
                EditText n2 = (EditText) findViewById(R.id.ed02);

                String strN1 = n1.getText().toString();
                String strN2 = n2.getText().toString();
                if((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else{
                    Double num1 = new Double(strN1);
                    Double num2 = new Double(strN2);
                    Double mul = num1*num2;
                    Intent irParaResultado = new Intent(MainActivity.this,ResultadoActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putDouble("calculo",mul);
                    irParaResultado.putExtras(bundle);

                    startActivity(irParaResultado);

                    // Toast.makeText(MainActivity.this,"O valor da multiplicação é "+mul,Toast.LENGTH_SHORT).show();
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n1 = (EditText) findViewById(R.id.ed01);
                EditText n2 = (EditText) findViewById(R.id.ed02);

                String strN1 = n1.getText().toString();
                String strN2 = n2.getText().toString();
                if((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }

                else{
                    Double num1 = new Double(strN1);
                    if(num1 == 0 ){
                        Toast.makeText(MainActivity.this,"O primeiro valor não pode ser 0 ",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Double num2 = new Double(strN2);
                        Double div = num1 / num2;
                        Intent irParaResultado = new Intent(MainActivity.this,ResultadoActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putDouble("calculo",div);
                        irParaResultado.putExtras(bundle);
                        startActivity(irParaResultado);
                        //Toast.makeText(MainActivity.this, "O valor da divisão é " + div, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }
}
