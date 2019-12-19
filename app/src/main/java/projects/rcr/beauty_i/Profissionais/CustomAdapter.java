package projects.rcr.beauty_i.Profissionais;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import projects.rcr.beauty_i.Profissionais.profissionais;
import projects.rcr.beauty_i.R;

public class CustomAdapter extends ArrayAdapter<profissionais> {

    private Activity context;
    private List<profissionais> profissionaisList;

    public CustomAdapter(Activity context, List<profissionais> profissionaisList) {
        super(context, R.layout.sample_layout, profissionaisList);
        this.context = context;
        this.profissionaisList = profissionaisList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout,null,true);
        profissionais profissionais = profissionaisList.get(position);

        TextView tnome = view.findViewById(R.id.tvNome);
        TextView tespec = view.findViewById(R.id.tvEspecialidade);

        tnome.setText("Nome: "+profissionais.getNome());
        tespec.setText("Especialidade: "+profissionais.getEspecialidade());

        return view;
    }
}
