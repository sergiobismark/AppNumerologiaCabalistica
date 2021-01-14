package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class RelacoesIntervalores extends AppCompatActivity {
    private MultiAutoCompleteTextView edtinterva;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(RelacoesIntervalores.this, NumeroAmor.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relacoes_intervalores);

        edtinterva = (MultiAutoCompleteTextView) findViewById(R.id.edtinterva);
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

        String ler = "Como já foi dito, muitos números acompanham o ser humano durante toda a sua vida. Alguns são harmônicos, outros conflitantes e, outros ainda, denotam certas capacidades e aptidões especiais. Como tudo na Natureza, a harmonia deve imperar também nos números, e qualquer tendência à desarmonia deve ser analisada mais profundamente.\n\n";
        String numero = "";

        if (valor27 == 1){
            numero = "RI-1- Indica independência, ambição e interesses próprios. Também mostra egoísmo e possessividade.";
        }
        else if (valor27 ==2){
            numero = "RI-2 – Indica que a pessoa é dotada de tato e diplomacia, possui grande amor à música e às artes de um modo geral. É harmônico e tem capacidade de cooperação. Por vezes, também indica insegurança e timidez.";
        }
        else if (valor27 ==3){
            numero = "RI-3 - Indica pessoa de rara capacidade de expressão, forte imaginação e senso de humor. Às vezes é sinal de irresponsabilidade e impaciência a uma atitude realista ou materialista.";
        }
        else if (valor27 ==4){
            numero = "RI-4 – Indica que a pessoa é econômica, honesta e tem tendência para o trabalho árduo. Pore´m, tem carência de concentração e julgamento imparcial; possibilidade de obstinação.";
        }
        else if (valor27 ==5){
            numero = "RI-5 – Indica pessoa impulsiva e nervosa, com grande desejo de sexo. As viagens e as mudanças lhe são altamente favoráveis.";
        }
        else if (valor27 ==6){
            numero = "RI-6 – Indica capacidade de assumir grandes responsabilidades. É de confiança, caseiro, pai e educador nato. Tem tendência a polêmicas, brigas e instabilidade emocional.";
        }
        else if (valor27 ==7){
            numero = "RI-7 – Indica poder de análise, agilidade mental, perfeccionismo, equilíbrio e cultura. Grande inclinação pelos assuntos metafísicos e a se retrair.";
        }
        else if (valor27 ==8){
            numero = "RI-8 – Indica capacidade para negócios, habilidade executiva, liderança, iniciativa, tato e grande senso de valores materiais. Tem tendência a se mostrar como dono da verdade.";
        }
        else if (valor27 ==9){
            numero = "RI-9 – Indica um modo de ver universal. Tem dons artísticos e literários. Adora viajar. Em muitos casos, também indica visão estreita e egocentrismo, ou demasiado desapego e afastamento da realidade.";
        }
        else {
            numero = "\n\n\n\n\n\nDEU RUIM, FALAR COM O SÉRGIO !! ";
        }

        edtinterva.setText(""+ler+numero);



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
