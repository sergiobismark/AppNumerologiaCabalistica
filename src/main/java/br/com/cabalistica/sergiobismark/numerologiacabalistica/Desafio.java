package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class Desafio extends AppCompatActivity {
    private MultiAutoCompleteTextView edtdesafio;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(Desafio.this, MomentosDecisivos.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio);

        edtdesafio = (MultiAutoCompleteTextView) findViewById(R.id.edtdesafio);

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


        String ler = "Paralelos aos Ciclos de Vida, existem os Desafios, que nada mais são que certas fraquezas, obstáculos que se entrepõem no caminho de cada um de nós. Os Desafios representam etapas em que a pessoa tem certa dificuldade para encontrar o seu rumo e que tende a agir de forma extremada e precipitada.\n";
        String numero = "";

        if (valor18 ==1 || valor19 ==1 || valor20 == 1){
            numero += "\nDesafio 1 - O consulente precisará aprender a se situar num meio termo entre um sentimento excessivo ou insuficiente de sua própria personalidade ou importância. Precisa aprender a ser firme, positivo independente e autoconfiante, sem impor sua vontade às outras pessoas ou esperar que tudo gire em torno  de si.\n";
        }
        if (valor18 ==2|| valor19 ==2 || valor20 ==2 ){
            numero +="\nDesafio 2 - Poderá tender a ser tão sensível em relação aos seus próprios sentimentos e a passar tanto tempo pensando neles, que acabará não tomando conhecimento dos sentimentos dos outros. Pequenas coisas são ampliadas fora de qualquer proporção e nunca esquecidas ou perdoadas. O consulente precisa aprender a cuidar de si mesmo, a cultivar uma atitude mais liberal e tolerante em relação à vida e a parar de utilizar seus próprios sentimentos e emoções como ponto de referência para tudo.\n";
        }
        if (valor18 ==3 || valor19 ==3 || valor20 ==3 ){
            numero +="\nDesafio 3 - Precisará aprender a situar-se num meio termo, entre ter medo de contatos sociais e ser por demais festeiro. Tem de aprender a ser sociável e a exprimir suas idéias e sentimentos  sem dispersar suas energias ou comportar-se como pessoa fútil.\n";
        }
        if (valor18 ==4 || valor19 ==4 || valor20 ==4 ){
            numero +="\nDesafio 4 - É o mais fácil de todos os desafios, visto que não há nenhum conflito envolvido. Precisa aprender a situar-se num meio termo entre agir como um “burro de carga” ou ser preguiçoso. \n";
        }
        if (valor18 ==5 || valor19 ==5 || valor20 ==5 ){
            numero +="\nDesafio 5 - Precisa aprender a situar-se num meio- termo entre desejar uma liberdade excessiva e ter um receio injustiçado dela - entre uma ânsia exagerada de experiências sensuais e o medo de tentar coisas novas. Precisa aprender a não buscar sexo, álcool e drogas e - o mais difícil de tudo - precisa aprender  quando e como renunciar a pessoas ou coisas cuja presença na sua vida não tem mais razão de ser.\n";
        }
        if (valor18 ==6 || valor19 ==6 || valor20 ==6 ){
            numero +="\nDesafio 6 - Precisa aprender a situar-se num meio termo entre comportar-se como um “capacho” ou ser demasiado exigente e dominador. Precisa aprender a aceitar as pessoas como elas são sem esperar que elas vivam de acordo com os seus padrões; respeitar os pontos de vista de todos e não estabelecer regras além de você mesmo.\n";
        }
        if (valor18 ==7 || valor19 ==7 || valor20 ==7 ){
            numero +="\nDesafio 7 - Precisará aprender a situar-se num meio termo entre o orgulho excessivo e a modéstia exagerada. Deveria tomar cuidado para não se refugiar dentro de si mesmo e nem tentar escapar das coisas desagradáveis da vida, recorrendo ao álcool e às drogas. É particularmente uma boa educação, aprender a compreender o que se passa no mundo à sua volta e - acima de tudo - ter fé.\n";
        }
        if (valor18 ==8 || valor19 ==8 || valor20 ==8 ){
            numero +="\nDesafio 8 - Precisará aprender a situar-se num meio termo entre uma preocupação excessiva com as questões materiais, e um desinteresse exagerado em relação a esse assunto. Precisa aprender a utilizar corretamente o dinheiro e o poder e a voltar seu pensamento para outras coisas que não o dinheiro e o que ele poderá fazer por você.\n";
        }
        if (valor18 ==9 || valor19 ==9 || valor20 ==9 ){
            numero +="\n\n\n\n\n\n DESAFIO 9 - SEM TEXTO;\n\n\n\n\n";
        }
        if (valor18 ==0 || valor19 ==0 || valor20 ==0 ){
            numero += "\nDesafio 0 (zero) - É o desafio da escolha. Caso tenha um desafio 0, poderá ser altamente evoluído e  terá de tomar suas próprias decisões. Deve atentar para todos os desafios sem uma ênfase especial em qualquer deles. Espera-se que o consulente decida por si mesmo quais as  armadilhas que a vida lhe reserva.\n";
        }


        edtdesafio.setText(""+ler+numero);



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
