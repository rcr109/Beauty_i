package projects.rcr.beauty_i.Gerais;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import projects.rcr.beauty_i.Especialidades.Cabelo;
import projects.rcr.beauty_i.Especialidades.Corpo;
import projects.rcr.beauty_i.Especialidades.Manicure;
import projects.rcr.beauty_i.Especialidades.Maquiagem;
import projects.rcr.beauty_i.Especialidades.Massagem;
import projects.rcr.beauty_i.Especialidades.Pedicure;
import projects.rcr.beauty_i.Especialidades.Peeling;
import projects.rcr.beauty_i.Especialidades.Rosto;
import projects.rcr.beauty_i.R;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Button btmani = findViewById(R.id.btmani);
        Button btpedi = findViewById(R.id.btpedi);
        Button btmaq = findViewById(R.id.btmaqui);
        Button btcabe = findViewById(R.id.btcabe);
        Button btmass = findViewById(R.id.btmass);
        Button btpeel = findViewById(R.id.btPeeling);
        Button btcorp = findViewById(R.id.btCorpo);
        Button btrost = findViewById(R.id.btRosto);

        btmani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Manicure.class));
            }
        });

        btpedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Pedicure.class));
            }
        });

        btmaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Maquiagem.class));
            }
        });

        btcabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cabelo.class));
            }
        });

        btmass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Massagem.class));
            }
        });

        btpeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Peeling.class));
            }
        });

        btcorp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Corpo.class));
            }
        });

        btrost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Rosto.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
