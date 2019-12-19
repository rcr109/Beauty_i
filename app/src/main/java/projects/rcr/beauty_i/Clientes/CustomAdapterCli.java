package projects.rcr.beauty_i.Clientes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import projects.rcr.beauty_i.R;

public class CustomAdapterCli extends ArrayAdapter<clientes> {

    private Activity context;
    private List<clientes> clientesList;

    public CustomAdapterCli(Activity context, List<clientes> clientesList) {
        super(context, R.layout.sample_layout, clientesList);
        this.context = context;
        this.clientesList = clientesList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout,null,true);
        clientes clientes = clientesList.get(position);

        TextView tnome = view.findViewById(R.id.tvNome);
        TextView temail = view.findViewById(R.id.tvEspecialidade);

        tnome.setText("Nome: "+clientes.getNome());
        temail.setText("Email: "+clientes.getEmail());

        return view;
    }
}
