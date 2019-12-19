package projects.rcr.beauty_i.Especialidades;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Profissionais.DetalhesProf;
import projects.rcr.beauty_i.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manicure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manicure);
        Button unhaC = (Button) findViewById(R.id.btConvencional);
        Button unhaG = (Button) findViewById(R.id.btUnhaGel);
        Button unhaP = (Button) findViewById(R.id.btUnhaPorcelana);
        Button mSpa  = (Button) findViewById(R.id.btSpa);

        unhaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Manicure.this, DetalhesProf.class);
                intent.putExtra("informacao","M");
                startActivity(intent);
            }
        });

        unhaG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Manicure.this,DetalhesProf.class);
                intent.putExtra("informacao","M");
                startActivity(intent);
            }
        });

        unhaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Manicure.this,DetalhesProf.class);
                intent.putExtra("informacao","M");
                startActivity(intent);
            }
        });

        mSpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Manicure.this,DetalhesProf.class);
                intent.putExtra("informacao","M");
                startActivity(intent);
            }
        });

    }
}
