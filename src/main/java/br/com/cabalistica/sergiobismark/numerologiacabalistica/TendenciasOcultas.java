package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class TendenciasOcultas extends AppCompatActivity {
    private MultiAutoCompleteTextView edttendencia;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(TendenciasOcultas.this, RespostaSubconsciente.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tendencias_ocultas);

        edttendencia = (MultiAutoCompleteTextView) findViewById(R.id.edttendencia);

        FloatingActionButton x1 = (FloatingActionButton) findViewById(R.id.x1);
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);

            }
        });

        Bundle bundle = getIntent().getExtras();

        String nomecompleto = bundle.getString("NOME");
        int valor1 = bundle.getInt("VALORES1");
        int valor2 = bundle.getInt("VALORES2");
        int valor3 = bundle.getInt("VALORES3");
        String valor4 = bundle.getString("VALORES4");
        String valor5 = bundle.getString("VALORES5");
        int valor6 = bundle.getInt("VALORES6");
        int valor7 = bundle.getInt("VALORES7");
        String valor8 = bundle.getString("VALORES8");
        int valor9 = bundle.getInt("VALORES9");
        String valor10 = bundle.getString("VALORES10");
        int valor11 = bundle.getInt("VALORES11");
        int valor12 = bundle.getInt("VALORES12");
        int valor13 = bundle.getInt("VALORES13");
        int valor14 = bundle.getInt("VALORES14");
        int valor15 = bundle.getInt("VALORES15");
        String valor16 = bundle.getString("VALORES16");
        String valor17 = bundle.getString("VALORES17");
        int valor18 = bundle.getInt("VALORES18");
        int valor19 = bundle.getInt("VALORES19");
        int valor20 = bundle.getInt("VALORES20");
        int valor21 = bundle.getInt("VALORES21");
        int valor22 = bundle.getInt("VALORES22");
        String valor23 = bundle.getString("VALORES23");
        String valor24 = bundle.getString("VALORES24");
        int valor25 = bundle.getInt("VALORES25");
        int valor26 = bundle.getInt("VALORES26");
        int valor27 = bundle.getInt("VALORES27");
        String valor28 = bundle.getString("VALORES28");

        String ler = "Descrevem os desejos a que uma pessoa foi exposta em vidas passadas. Caso não estejamos atentos e não nos policiarmos constantemente, é comum tornarmos a ter estes mesmos desejos de conduta nesta existência.\n\n";
        String numero = "";

        if (valor5.contains("1")){
            numero += "\nTENDÊNCIA OCULTA 1 - É o desejo da individualidade. Há uma tendência a ser autoritário, dominador, arrogante e um tanto egoísta. \n";
        }
        if (valor5.contains("2")){
            numero += "\nTENDÊNCIA OCULTA 2 - É o desejo de associações. Há uma tendência para depender demasiado dos outros, principalmente da família e dos amigos, tanto monetariamente como emocionalmente. \n";
        }
         if (valor5.contains("3")){
            numero += "TENDÊNCIA OCULTA 3 - É o desejo da auto – expressão. Há uma tendência à vaidade, à impaciência, à presunção, a dispersar energias, viver sem objetivos concretos e buscando sempre diversões e festas, sem se preocupar muito com o dia de amanhã.\n";
        }
         if (valor5.contains("4")){
            numero += "\nTENDÊNCIA OCULTA 4 - É o desejo de trabalho. Há uma tendência para asfixiar sua personalidade com quantidade excessiva de detalhes (perfeccionista), de ser teimoso, intolerante e obstinado. \n";
        }
         if (valor5.contains("5")){
            numero += "\nTENDÊNCIA OCULTA 5 - É o desejo de mudança e também de liberdade pessoal. Há uma tendência para viver à custa dos outros, abusar do sexo, de algumas drogas (cigarro e álcool), para mudanças sem motivo aparente e para ser precipitado e impulsivo. \n";
        }
        if (valor5.contains("6")){
            numero += "\nTENDÊNCIA OCULTA 6 - É o desejo de realização e responsabilidade. Há uma tendência para se preocupar excessivamente com a família, principalmente com os filhos (se os tiver), com os deveres profissionais, para ser teimoso, perfeccionista e para apegar-se a modelos inflexíveis e obstinados. \n";
        }
         if (valor5.contains("7")){
            numero += "\nTENDÊNCIA OCULTA 7 - É o desejo de sabedoria e conhecimento. Há uma tendência para o fingimento, para a intriga e até para o alcoolismo, pois normalmente sente-se incompreendido e até rejeitado pelos parentes, amigos, cônjuge ou simplesmente conhecidos.\n";
        }
         if (valor5.contains("8")){
            numero += "\nTENDÊNCIA OCULTA 8 - É o desejo do materialismo. Há uma tendência para se preocupar excessivamente em como ganhar dinheiro, obter bens materiais e também poder. \n";
        }
         if (valor5.contains("9")){
            numero += "\nTENDÊNCIA OCULTA 9 - É o desejo de conhecimento e amor universal. Há uma tendência para se preocupar excessivamente com os problemas mundiais em detrimento de si próprio e da família. \n";
        }

        edttendencia.setText(""+ler+numero);


        intent.putExtra("VALORES1", valor1);
        intent.putExtra("VALORES2", valor2);
        intent.putExtra("VALORES3", valor3);
        intent.putExtra("VALORES4", valor4);
        intent.putExtra("VALORES5", valor5);
        intent.putExtra("VALORES6", valor6);
        intent.putExtra("VALORES7", valor7);
        intent.putExtra("VALORES8", valor8);
        intent.putExtra("VALORES9", valor9);
        intent.putExtra("VALORES10", valor10);
        intent.putExtra("VALORES11", valor11);
        intent.putExtra("VALORES12", valor12);
        intent.putExtra("VALORES13", valor13);
        intent.putExtra("VALORES14", valor14);
        intent.putExtra("VALORES15", valor15);
        intent.putExtra("VALORES16", valor16);
        intent.putExtra("VALORES17", valor17);
        intent.putExtra("VALORES18", valor18);
        intent.putExtra("VALORES19", valor19);
        intent.putExtra("VALORES20", valor20);
        intent.putExtra("VALORES21", valor21);
        intent.putExtra("VALORES22", valor22);
        intent.putExtra("VALORES23", valor23);
        intent.putExtra("VALORES24", valor24);
        intent.putExtra("VALORES25", valor25);
        intent.putExtra("VALORES26", valor26);
        intent.putExtra("VALORES27", valor27);
        intent.putExtra("VALORES28", valor28);

    }
}
