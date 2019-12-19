package projects.rcr.beauty_i.Clientes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.R;

public class CadCliente extends AppCompatActivity {

    DatabaseReference reff;
    projects.rcr.beauty_i.Clientes.clientes clientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_cliente);

        final EditText txtNomeCli = (EditText) findViewById(R.id.txtNomeCli);
        final EditText txtEmaCli = (EditText) findViewById(R.id.txtEmaCli);
        final EditText txtTelCli = (EditText) findViewById(R.id.txtTelCli);
        Button bCadCli = (Button) findViewById(R.id.btn_CadCli);

        clientes = new clientes();
        reff= FirebaseDatabase.getInstance().getReference().child("clientes");

        bCadCli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = (txtNomeCli.getText().toString().trim());
                String ema = (txtEmaCli.getText().toString().trim());
                String tele = (txtTelCli.getText().toString().trim());

                clientes.setNome(txtNomeCli.getText().toString().trim());
                clientes.setEmail(txtEmaCli.getText().toString().trim());
                clientes.setTelefon(txtTelCli.getText().toString().trim());

                reff.push().setValue(clientes);
                Toast.makeText(CadCliente.this, "Cadastro efetuado com sucesso.", Toast.LENGTH_LONG).show();
                txtNomeCli.setText("");
                txtEmaCli.setText("");
                txtTelCli.setText("");



            }
        });




    }
}
