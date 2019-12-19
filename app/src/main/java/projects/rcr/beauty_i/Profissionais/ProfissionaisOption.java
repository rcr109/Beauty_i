package projects.rcr.beauty_i.Profissionais;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Profissionais.BuscaProfissional;
import projects.rcr.beauty_i.Profissionais.CadProfissional;
import projects.rcr.beauty_i.R;

public class ProfissionaisOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profissionais_option);

        Button bCadPro = (Button) findViewById(R.id.bCadProfissional);
        Button bConPro = (Button) findViewById(R.id.bBuscaProfissional);

        bCadPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfissionaisOption.this, CadProfissional.class));
            }
        });

        bConPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfissionaisOption.this, BuscaProfissional.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });
    }
}
