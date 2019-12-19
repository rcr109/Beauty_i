package projects.rcr.beauty_i.Profissionais;

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

public class DetalhesProf extends AppCompatActivity {

    String informacao;
    private ListView listView;
    DatabaseReference databaseReference;
    private List<profissionais> profissionaisList;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_prof);
        Intent it = getIntent();
        informacao = it.getStringExtra("informacao");
        databaseReference = FirebaseDatabase.getInstance().getReference("profissionais");
        profissionaisList = new ArrayList<>();
        customAdapter = new CustomAdapter(DetalhesProf.this,profissionaisList);
        listView = (ListView) findViewById(R.id.lvDetalheProf);
    }

    @Override
    protected void onStart() {


        if (informacao.equals("M")) {
            databaseReference.orderByChild("especialidade").startAt("Manicure").endAt("Manicure").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        if (informacao.equals("P")) {
            databaseReference.orderByChild("especialidade").startAt("Pedicure").endAt("Pedicure").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        if (informacao.equals("A")) {
            databaseReference.orderByChild("especialidade").startAt("Maquiagem").endAt("Maquiagem").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        if (informacao.equals("C")) {
            databaseReference.orderByChild("especialidade").startAt("Cabelo").endAt("Cabelo").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        if (informacao.equals("S")) {
            databaseReference.orderByChild("especialidade").startAt("Massagem").endAt("Massagem").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        if (informacao.equals("E")) {
            databaseReference.orderByChild("especialidade").startAt("Peeling").endAt("Peeling").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        if (informacao.equals("O")) {
            databaseReference.orderByChild("especialidade").startAt("Corpo").endAt("Corpo").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
                        profissionaisList.add(profissionais);
                    }
                    listView.setAdapter(customAdapter);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                }
            });
        }

        if (informacao.equals("R")) {
            databaseReference.orderByChild("especialidade").startAt("Rosto").endAt("Rosto").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    profissionaisList.clear();
                    for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                        profissionais profissionais = dataSnapshot1.getValue(projects.rcr.beauty_i.Profissionais.profissionais.class);
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
