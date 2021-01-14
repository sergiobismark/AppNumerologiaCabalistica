package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class InicioNumerologia extends AppCompatActivity {
    private MultiAutoCompleteTextView edtcabala;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(InicioNumerologia.this, Motivacao.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_numerologia);


        edtcabala = (MultiAutoCompleteTextView) findViewById(R.id.edtcabala);

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

        String numero = "O Mapa Numerológico Cabalístico Pessoal é um instrumento personalizado que serve para orientar o ser humano a planejar a sua vida de uma maneira prática e mais inteligente, revelando-lhes fatos a respeito de sua existência que possam contribuir para despertar todas as suas potencialidades e, dessa maneira, tirar o máximo proveito da vida. Para tanto, são usados dois conjuntos de números: um obtido a partir do nome de batismo e outro derivado da data real do nascimento. O terceiro fator, e de igual importância (o que difere a Numerologia Cabalística das demais), é a assinatura, que é analisada através do Tarô egípcio e da Radiestesia, a qual pode ser positiva, negativa ou neutra. \nOs números que se originam do “nome”, descrevem a personalidade da pessoa, como ela é internamente, o que a faz agir de certa maneira, como as pessoas a vêem e quais são os seus talentos e virtudes ocultas. \nOs números baseados na data do nascimento (dia, mês e ano), nos indicam o ambiente a que uma pessoa será exposta nas diferentes fases da vida, quais as oportunidades que se apresentarão e os obstáculos que provavelmente enfrentará ao longo da existência. \nBasicamente, é a combinação dessas três coisas – nome, data do nascimento e assinatura – que fazem com que uma pessoa tenha caráter singular em relação à outra. Milhares de pessoas fazem aniversário no mesmo dia, e algumas têm até o mesmo nome, entretanto, a assinatura é única e, desse modo, não existem seres humanos com as três características idênticas, ou seja, com as mesmas combinações.";


        edtcabala.setText(""+numero);


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
