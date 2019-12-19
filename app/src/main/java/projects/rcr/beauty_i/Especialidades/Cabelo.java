package projects.rcr.beauty_i.Especialidades;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Profissionais.DetalhesProf;
import projects.rcr.beauty_i.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cabelo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabelo);

        Button btesco = (Button) findViewById(R.id.btescova);
        Button btcort = (Button) findViewById(R.id.btcorte);
        Button bthidr = (Button) findViewById(R.id.bthidra);
        Button btprog = (Button) findViewById(R.id.btprog);
        Button btsela = (Button) findViewById(R.id.btsela);
        Button btColo = (Button) findViewById(R.id.btcolor);
        Button btbaby = (Button) findViewById(R.id.btbaby);

        btbaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cabelo.this, DetalhesProf.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });

        btesco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cabelo.this,DetalhesProf.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });

        btcort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cabelo.this,DetalhesProf.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });

        bthidr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cabelo.this,DetalhesProf.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });

        btprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cabelo.this,DetalhesProf.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });

        btsela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cabelo.this,DetalhesProf.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });

        btColo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cabelo.this,DetalhesProf.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });

    }
}
