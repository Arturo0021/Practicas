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

    // Variables globales
    private ListView adaptador_list;
    private Entidades_Personas personas;
    private Collection_Personas collection_personas;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);

        // Referencia de item de xml a la clase
        adaptador_list = (ListView)findViewById(R.id.adaptador_list);
        // Contexto de la actividad principal
        context = this;

        // Instancia a las Entidades
        personas = new Entidades_Personas();
        // Instancia a la Colección ArrayList<>
        collection_personas = new Collection_Personas();

        // Seteamos los datos a las entidades
        personas.setNombre("Fernando");
        personas.setA_Paterno("Ramirez");
        personas.setA_Materno("Perez");
        personas.setEmail("fernando.perez@dominio.mx");
        personas.setTelefono("123123123123");

        // Agregamos la primera información a la lista
        collection_personas.add(personas);

        // Generamos una nueva instancia para agregar una nueva entidad
        personas = new Entidades_Personas();

        // Agregamos los Segundos datos a guardar
        personas.setNombre("Ivan Arturo");
        personas.setA_Paterno("Sabino");
        personas.setA_Materno("Guerra");
        personas.setEmail("ivan.guerra@dominio.mx");
        personas.setTelefono("010101010101");

        // Agregamos los datos a la lista
        collection_personas.add(personas);

        // Instanciamos el adaptador y pasamos las variables que necesita para general el inflater de la vista
        adapter_personas adapter = new adapter_personas(context, R.layout.adaptador_lista, collection_personas);

        // Seteamos el Adaptador  --> Id de la Lista del XML principal . setadapter
        adaptador_list.setAdapter(adapter);


        // Este for nos ayudo a ver que realmente la informacion se guardo correctamente en el ArrayList

        /*for(Entidades_Personas p : collection_personas) {
            Log.i("#TAG", p.getNombre());
            Log.i("#TAG", p.getA_Paterno());
            Log.i("#TAG", p.getA_Materno());
        }*/

    }
}
