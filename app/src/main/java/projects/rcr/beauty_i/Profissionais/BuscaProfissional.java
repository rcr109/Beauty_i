package projects.rcr.beauty_i.Profissionais;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Clientes.clientes;
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

public class BuscaProfissional extends AppCompatActivity {

    String informacao;
    private ListView listView;
    DatabaseReference databaseReference;
    private List<profissionais> profissionaisList;
    private CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_profissional);
        Intent it = getIntent();
        informacao = it.getStringExtra("informacao");
        databaseReference = FirebaseDatabase.getInstance().getReference("profissionais");
        profissionaisList = new ArrayList<>();
        customAdapter = new CustomAdapter(BuscaProfissional.this,profissionaisList);
        listView = (ListView) findViewById(R.id.lvDetalheProf);
    }

    @Override
    protected void onStart() {


        if (informacao.equals("C")) {
            //orderByChild("especialidade").startAt("Manicure").endAt("Manicure").
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais= dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        super.onStart();

    }
}
