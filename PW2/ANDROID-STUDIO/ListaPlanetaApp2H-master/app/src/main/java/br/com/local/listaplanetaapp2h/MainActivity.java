package br.com.local.listaplanetaapp2h;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar a variável que irá receber a ListView do XML
    ListView listView;
    //Criar os arrays que serão inseridos na listView

    String nomePlanetas[] = {"HULK", "BOLT - SUPERCÃO", "BATMAN", "CAPITÃO AMERICA",
            "CHAPOLIN", "SUPERHOMEM", "HOMEM ARANHA", "HOMEM DE FERRO", "THOR", "WOLVERINE", "ABUTRE"};

    int imgPlanetas[] = {R.drawable.shrek, R.drawable.bolt,
            R.drawable.batman, R.drawable.capitao, R.drawable.chap,
            R.drawable.sup, R.drawable.spider, R.drawable.ferro,
            R.drawable.thor, R.drawable.wolv, R.drawable.veio};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //a variavel listview está recebendo a listView XML
        listView = findViewById(R.id.listaPlanetas);

        //Criar o objeto/classe que irá inserir o modelo na listView

        CustomAdapter adapter = new CustomAdapter();

        //Carregar o baseAdapter na listView
        listView.setAdapter(adapter);

        /*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no item da lista de nome: " + nomePlanetas[position],
                        Toast.LENGTH_SHORT).show();
            }
        });*/

        //Criando evento de click na listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), VisualizaPlaneta_MainActivity.class);
                //Passando valores de uma janela para outra
                intent.putExtra("nomePlaneta", nomePlanetas[i]);
                intent.putExtra("imagemPlaneta", imgPlanetas[i]);

                startActivity(intent);

            }
        });


    }

    //inner class - Classe dentro de outra Classe
    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imgPlanetas.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        //Montar o modelo para ser inserido na lista de planetas - ListView
        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            TextView txtNomePlaneta;
            ImageView imagemPlaneta;

            //instanciando o modelo com os componentes para inserir na Lista
            View carregaView = getLayoutInflater().inflate(R.layout.modelo_lista_planetas, null);

            txtNomePlaneta = carregaView.findViewById(R.id.txtListaPlaneta);
            imagemPlaneta = carregaView.findViewById(R.id.imgListaPlaneta);

            //Carregando os valores nos componentes

            txtNomePlaneta.setText(nomePlanetas[position]);
            imagemPlaneta.setImageResource(imgPlanetas[position]);

            return carregaView;
        }
    }
}