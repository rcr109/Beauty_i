package projects.rcr.beauty_i.Clientes;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClientesOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_option);

        Button bCadCli = (Button) findViewById(R.id.bCadCliente);
        Button bConCli = (Button) findViewById(R.id.bBuscaCliente);

        bCadCli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClientesOption.this, CadCliente.class));
            }
        });

        bConCli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClientesOption.this, BuscaClientes.class);
                intent.putExtra("informacao","C");
                startActivity(intent);
            }
        });
    }
}
