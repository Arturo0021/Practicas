package triplei.adaptadores;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import triplei.adaptadores.Entities.Collection_Personas;
import triplei.adaptadores.Entities.Entidades_Personas;

public class Main_Activity extends AppCompatActivity {

    private ListView adaptador_list;
    private Entidades_Personas personas;
    private Collection_Personas collection_personas;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);

        adaptador_list = (ListView)findViewById(R.id.adaptador_list);
        context = this;

        personas = new Entidades_Personas();
        collection_personas = new Collection_Personas();

        personas.setNombre("Fernando");
        personas.setA_Paterno("Ramirez");
        personas.setA_Materno("Perez");
        personas.setEmail("fernando.perez@dominio.mx");
        personas.setTelefono("123123123123");
        collection_personas.add(personas);

        personas = new Entidades_Personas();

        personas.setNombre("Ivan Arturo");
        personas.setA_Paterno("Sabino");
        personas.setA_Materno("Guerra");
        personas.setEmail("ivan.guerra@dominio.mx");
        personas.setTelefono("010101010101");
        collection_personas.add(personas);

        adapter_personas adapter = new adapter_personas(context, R.layout.adaptador_lista, collection_personas);
        adaptador_list.setAdapter(adapter);

        /*for(Entidades_Personas p : collection_personas) {
            Log.i("#TAG", p.getNombre());
            Log.i("#TAG", p.getA_Paterno());
            Log.i("#TAG", p.getA_Materno());
        }*/

    }
}
