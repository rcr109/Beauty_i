package projects.rcr.beauty_i.Profissionais;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.R;

public class CadProfissional extends AppCompatActivity {

DatabaseReference reff;
projects.rcr.beauty_i.Profissionais.profissionais profissionais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_profissional);

        final EditText txtNomeProf = (EditText) findViewById(R.id.txtNomeProf);
        final EditText txtEspecProf = (EditText) findViewById(R.id.txtEspecProf);
        final EditText txtTelProf = (EditText) findViewById(R.id.txtTelProf);
        Button bCadProf = (Button) findViewById(R.id.btn_CadProf);

        profissionais = new profissionais();
        reff= FirebaseDatabase.getInstance().getReference().child("profissionais");

        bCadProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = (txtNomeProf.getText().toString().trim());
                String espec = (txtEspecProf.getText().toString().trim());
                String tele = (txtTelProf.getText().toString().trim());

                profissionais.setNome(txtNomeProf.getText().toString().trim());
                profissionais.setEspecialidade(txtEspecProf.getText().toString().trim());
                profissionais.setTelefon(txtTelProf.getText().toString().trim());

                reff.push().setValue(profissionais);
                Toast.makeText(CadProfissional.this, "Cadastro efetuado com sucesso.", Toast.LENGTH_LONG).show();
                txtNomeProf.setText("");
                txtEspecProf.setText("");
                txtTelProf.setText("");



            }
        });




    }
}
