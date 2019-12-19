package projects.rcr.beauty_i.Gerais;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.R;

import android.os.Bundle;
import android.widget.Toast;

public class frmdemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmdemo);
        Toast.makeText(frmdemo.this, "Conectado com sucesso.", Toast.LENGTH_LONG).show();
    }
}
