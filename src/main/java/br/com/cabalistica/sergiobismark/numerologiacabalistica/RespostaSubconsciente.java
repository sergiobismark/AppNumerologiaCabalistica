package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class RespostaSubconsciente extends AppCompatActivity {
    private MultiAutoCompleteTextView edtsub;
    private FloatingActionButton x1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(RespostaSubconsciente.this, DividasCarmicas.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_subconsciente);

        edtsub = (MultiAutoCompleteTextView) findViewById(R.id.edtsub);

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

        String ler = "Este número nos diz como será a reação instintiva e automática de uma pessoa, quando em uma situação de emergência. \n";
        String numero = "";

        if (valor6 == 1){
            numero = "\n\n\n\n\n\nNumero 1 - SEM TEXTO\n\n\n\n\n\n ";
        }
        else if (valor6 == 2){
            numero = "\nRESPOSTA SUBCONSCIENTE 2 – É um ser arrogante, mentiroso, que não respeita regras, querendo que tudo e todos girem em torno de si (egocêntrico).";
        }
        else if (valor6 ==3){
            numero = "\nRESPOSTA SUBCONSCIENTE 3 - É dispersivo e até indisciplinado; normalmente reage de forma explosiva e até de certa maneira destrutiva. ";
        }
        else if (valor6 == 4){
            numero = "\nRESPOSTA SUBCONSCIENTE 4 - Normalmente é um ser que vive perdido num labirinto de detalhes. As suas reações são fracas, tem tendência a vacilar e até atrapalhar os outros. ";
        }
        else if (valor6 == 5){
            numero = "\nRESPOSTA SUBCONSCIENTE 5 - DÉ uma pessoa tensa e nervosa. Numa crise tem tendência a agir de forma confusa e impulsiva.";
        }
        else if (valor6 == 6){
            numero = "\nRESPOSTA SUBCONSCIENTE 6 - É um ser sentimental. Sua primeira preocupação numa crise é com os entes queridos, seus objetos de estimação e animais (se os tiver). ";
        }
        else if (valor6 == 7){
            numero = "\nRESPOSTA SUBCONSCIENTE 7 - Normalmente é arredio e não gosta de se envolver com problemas alheios. Em uma emergência, considerará analiticamente a situação e, então, normalmente se retirará para dentro de si mesmo e rezará. Se existirem perdas materiais ou de vidas, poderá se entregar a vícios, como a bebida ou drogas.";
        }
        else if (valor6 == 8){
            numero = "\nRESPOSTA SUBCONSCIENTE 8 - É eficiente e organizado. Numa crise ou em qualquer ocasião, pode-se contar com ele, pois é seguro e digno de confiança. ";
        }
        else if (valor6 == 9){
            numero = "\nRESPOSTA SUBCONCIENTE 9 - É um ser entediado. A maioria das coisas tem pouca importância para ele. Numa crise é melhor não contar com ele, pois é impessoal, filósofo, introspectivo, resignado e indeciso. ";
        }
        else {
            numero = "\n\n\n\nDeu ruim, Falar com o Sèrgio ! ";
        }

        edtsub.setText(""+ler+numero);

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
