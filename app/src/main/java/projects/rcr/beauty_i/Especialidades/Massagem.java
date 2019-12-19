package projects.rcr.beauty_i.Especialidades;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Profissionais.DetalhesProf;
import projects.rcr.beauty_i.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Massagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massagem);

        Button bshiatsu = (Button) findViewById(R.id.btmassshiatsu);
        Button bdrena = (Button) findViewById(R.id.btmassdre);
        Button bmodela = (Button) findViewById(R.id.btmassmode);
        Button banti = (Button) findViewById(R.id.btmassanti);
        Button bpedra = (Button) findViewById(R.id.btmasspedra);
        Button breiki = (Button) findViewById(R.id.btmassreiki);
        Button breflex = (Button) findViewById(R.id.btmassrefle);
        Button bayr = (Button) findViewById(R.id.btmassayr);

        bshiatsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this, DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });

        bdrena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this,DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });

        bmodela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this,DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });

        banti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this,DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });
        bpedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this,DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });

        breiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this,DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });

        breflex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this,DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });

        bayr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Massagem.this,DetalhesProf.class);
                intent.putExtra("informacao","S");
                startActivity(intent);
            }
        });
    }
}
