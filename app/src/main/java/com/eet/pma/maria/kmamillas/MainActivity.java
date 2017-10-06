package com.eet.pma.maria.kmamillas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_km);
        Button button2 = (Button) findViewById(R.id.button_m);

        final EditText edit_km = (EditText) findViewById(R.id.edit_km); //final = const
        final EditText edit_m = (EditText) findViewById(R.id.edit_m);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String skm = edit_km.getText().toString();
                if ((skm==null) || skm.equals("")) return; //si en el quadre no posem cap numero no ho converteix
                float km = Float.parseFloat(skm); //passa l'string a float
                float milles = km / 1.609f;
                String smilles = String.format("%f", milles); //imprimir un real, passar-ho a string
                edit_m.setText(smilles); //posar el resultat al quadre de text de les milles

                //Log.i("Maria","boto de km apretat"); //crea un missatge a la pestanya de compilació
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sm = edit_m.getText().toString();
                if ((sm==null) || sm.equals("")) return;
                float m = Float.parseFloat(sm);
                float quilometres = m * 1.609f;
                String squilometres = String.format("%f", quilometres);
                edit_km.setText(squilometres);
            }
        });
    }
}


