package projects.rcr.beauty_i.Especialidades;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Profissionais.DetalhesProf;
import projects.rcr.beauty_i.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pedicure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedicure);

        Button buConv = (Button) findViewById(R.id.btpUnhaC);
        Button buspa = (Button) findViewById(R.id.btpSpa);

        buConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pedicure.this, DetalhesProf.class);
                intent.putExtra("informacao","P");
                startActivity(intent);
            }
        });

        buspa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pedicure.this,DetalhesProf.class);
                intent.putExtra("informacao","P");
                startActivity(intent);
            }
        });
    }
}
