package projects.rcr.beauty_i.Clientes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class BuscaClientes extends AppCompatActivity {

    String informacao;
    private ListView listView;
    DatabaseReference databaseReference;
    private List<clientes> clientesList;
    private CustomAdapterCli customAdapterCli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_clientes);
        Intent it = getIntent();
        informacao = it.getStringExtra("informacao");
        databaseReference = FirebaseDatabase.getInstance().getReference("clientes");
        clientesList = new ArrayList<>();
        customAdapterCli = new CustomAdapterCli(BuscaClientes.this,clientesList);
        listView = (ListView) findViewById(R.id.lvDetalheCli);
    }

    @Override
    protected void onStart() {


        if (informacao.equals("C")) {
            //orderByChild("especialidade").startAt("Manicure").endAt("Manicure").
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    clientesList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        clientes clientes = dataSnapshot1.getValue(projects.rcr.beauty_i.Clientes.clientes.class);
                        clientesList.add(clientes);
                    }
                    listView.setAdapter(customAdapterCli);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        super.onStart();

    }
}
