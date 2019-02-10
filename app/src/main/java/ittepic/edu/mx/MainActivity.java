package ittepic.edu.mx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1,numero2;
    TextView resultado;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    numero1=findViewById(R.id.numero1);
    numero2=findViewById(R.id.numero2);
    resultado=findViewById(R.id.resultado);
    boton=findViewById(R.id.boton);
    boton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int val1=Integer.parseInt(numero1.getText().toString());
            int val2=Integer.parseInt(numero2.getText().toString());
            int res=val1+val2;
            resultado.setText("Restado:"+res);
            numero1.setText("");
            numero2.setText("");
        }
    });



    }
}
