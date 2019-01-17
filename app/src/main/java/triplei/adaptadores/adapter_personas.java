package triplei.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import triplei.adaptadores.Entities.Entidades_Personas;

public class adapter_personas extends BaseAdapter{

    private Context context;
    private int layout;
    private ArrayList<Entidades_Personas> personas;

    public adapter_personas (Context context, int layout, ArrayList<Entidades_Personas> personas){
        this.context = context;
        this.layout = layout;
        this.personas = personas;
    }

    @Override
    public int getCount() {
        return this.personas.size();
    }

    @Override
    public Object getItem(int position) {
        return this.personas.get(position);
    }

    @Override
    public long getItemId(int Id) {
        return Id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.adaptador_lista, null);

        Entidades_Personas entidades = personas.get(position);

        TextView adap_avatar = view.findViewById(R.id.adap_avatar);
        TextView adap_title = view.findViewById(R.id.adap_title);
        TextView adapt_desc = view.findViewById(R.id.adapt_desc);
        TextView adap_anex = view.findViewById(R.id.adap_anex);

            adap_avatar.setText("P");
            adap_title.setText(entidades.getNombre());
            adapt_desc.setText(entidades.getA_Paterno() + " " + entidades.getA_Materno());
            adap_anex.setText(entidades.getEmail() + " " + entidades.getTelefono());

        return view;
    }
}
