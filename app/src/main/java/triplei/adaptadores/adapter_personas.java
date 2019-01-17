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

    // Datos Que usaremos para generar el adaptador
    private Context context;
    private int layout;
    private ArrayList<Entidades_Personas> personas;

    // Constructor
    public adapter_personas (Context context, int layout, ArrayList<Entidades_Personas> personas){
        this.context = context;
        this.layout = layout;
        this.personas = personas;
    }

    @Override
    public int getCount() {
        // Cuenta los objetos guardados en el ArrayList
        return this.personas.size();
    }

    @Override
    public Object getItem(int position) {
        // Envia el objeto dependiendo de la posicion
        return this.personas.get(position);
    }

    @Override
    public long getItemId(int Id) {
        // Retorna un Id
        return Id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // la vista que llega desde nuestra actividad principal
        View view = convertView;
        // Inflater que sobre pone el layout que vamos a mostrar
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.adaptador_lista, null);

        // Las entidades personas seran = al objeto de la posicion reocorrida
        Entidades_Personas entidades = personas.get(position);

        // Los items del XML creado para mostrar las listas
        TextView adap_avatar = view.findViewById(R.id.adap_avatar);
        TextView adap_title = view.findViewById(R.id.adap_title);
        TextView adapt_desc = view.findViewById(R.id.adapt_desc);
        TextView adap_anex = view.findViewById(R.id.adap_anex);

        // Seteamos sus valores conforme queramos mostrarlos en los items que vayamos a usar
            adap_avatar.setText("P");
            adap_title.setText(entidades.getNombre());
            adapt_desc.setText(entidades.getA_Paterno() + " " + entidades.getA_Materno());
            adap_anex.setText(entidades.getEmail() + " " + entidades.getTelefono());

         // Retornamos la nueva vista
        return view;
    }
}
