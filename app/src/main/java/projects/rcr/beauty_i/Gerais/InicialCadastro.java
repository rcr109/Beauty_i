package projects.rcr.beauty_i.Gerais;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Clientes.ClientesOption;
import projects.rcr.beauty_i.Profissionais.ProfissionaisOption;
import projects.rcr.beauty_i.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicialCadastro extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial_cadastro);

        Button bLogin = (Button) findViewById(R.id.bLogin);
        Button bCadProf = (Button) findViewById(R.id.bCadProf);
        Button bCadCli  = (Button) findViewById(R.id.bCadCli);

        bCadProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InicialCadastro.this, ProfissionaisOption.class));
            }
        });

        bCadCli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InicialCadastro.this, ClientesOption.class));
            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InicialCadastro.this, MainActivity.class));
            }
        });

    }
}
