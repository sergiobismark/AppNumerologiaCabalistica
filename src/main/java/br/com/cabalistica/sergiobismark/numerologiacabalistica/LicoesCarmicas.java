package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class LicoesCarmicas extends AppCompatActivity {
    private MultiAutoCompleteTextView edtcarmicas;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(LicoesCarmicas.this, TendenciasOcultas.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licoes_carmicas);

        edtcarmicas = (MultiAutoCompleteTextView) findViewById(R.id.edtcarmicas);
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


        String ler = "Diferentemente das Dívidas Cármicas que são transgressões às Leis Naturais, as Lições Cármicas mostram obrigações que nos foram impostas na vida passada, mas que foram negligenciadas. Por isso, nesta existência, devemos “aprender” essas lições (eliminando o Carma), pois incidindo nos mesmos erros, com certeza teremos de passar pelos mesmos problemas nesta ou em outras encarnações. \n";
        String numero = "";
        if (valor4.contains("1")) {
            numero += "\nLIÇÃO CÁRMICA 1 - Esta Lição mostra claramente que em vidas passadas você foi um ser preguiçoso, sem qualquer iniciativa, ambição ou originalidade, e muito menos competência para cuidar de seus próprios negócios. Em outras palavras, você não estava “nem aí” para o que ocorria à sua volta. Provavelmente foi rico, gastador, esbanjador e sem qualquer criatividade ou objetivo concreto na vida, além de carecer de confiança em sua própria personalidade.  Em virtude dessas cruciais faltas, nesta existência precisa aprender a ser pioneiro, criativo, a tomar decisões e não esperar por ninguém, além de aprender a ter amor próprio, a confiar na própria capacidade, a decidir e a concluir seus projetos e seus objetivos.\n";
        }
        if (valor4.contains("2")){
            numero += "\nLIÇÃO CÁRMICA 2 - Em vidas passadas você foi um ser totalmente indisciplinado, negligente e nada colaborador. O dinheiro tinha pouca importância, gastando-o a torto e a direito, sem se importar com o dia de amanhã. Nesta existência, em virtude dessas faltas no “passado”, poderá se tornar subserviente, introspectivo, com medo de tudo e de todos, evitando contatos com amigos e colegas. A Lição a aprender nesta existência é trabalhar em parcerias, grupos; deve, também, adquirir paciência e levar a bom termo os seus projetos e ambições. Deve ser econômico, poupador, pois caso contrário, terá graves problemas financeiros na velhice.\n";
        }
        if (valor4.contains("3")){
            numero += "\nLIÇÃO CÁRMICA 3 - Provavelmente “pobre” e sem muito estudo na vida passada, você foi um ser sem qualquer ambição, expressão, imaginação, criatividade, além da falta de vontade de progredir, limitando-se à “vidinha” insignificante, não tendo qualquer talento e confiança em si próprio, mostrando-se, isto sim, nervoso, irritadiço e até violento.  A Lição a aprender nesta existência é eliminar a timidez, seja ela no falar, representar, escrever ou mesmo tratando com estranhos. Deve cultivar também a imaginação, agir com segurança, criatividade, paciência e sempre positivamente.\n";
        }
        if (valor4.contains("4")){
            numero += "\nLIÇÃO CÁRMICA 4 - Provavelmente “preguiçoso” na vida passada deixava tudo a meio caminho; não gostava de receber ordens, de trabalho metódico ou pesado. Tinha também certa dificuldade em terminar o que começava, ou seja, era dispersivo, imprudente e desajeitado. A Lição a aprender nesta existência é trabalhar metodicamente, ser constante (levar até o fim os seus objetivos), a ser concentrado, paciente e compenetrado no trabalho. Deve ainda aceitar qualquer tipo de trabalho, mesmo que em princípio não goste dele; ou seja, se não puder fazer o que gosta, deve gostar do que faz. Será bem sucedido na vida se seguir rigorosamente esta Lição.\n";
        }
        if (valor4.contains("5")){
            numero += "\nLIÇÃO CÁRMICA 5 - Na vida passada as mudanças e as novidades o assustavam, preferindo agir com cautela exagerada e em situações já consagradas pelo uso. Agora, em virtude dessas fraquezas poderá se tornar incompreendido pelos que ama e convive, além de ter de enfrentar certas mudanças não desejadas, como mudança de casa, de trabalho, de parceiro, etc. A principal Lição a aprender nesta existência é enfrentar com naturalidade essas mudanças, a não ter medo de novidades e estar sempre por dentro da moda, da política, da moderna tecnologia, enfim, por dentro de tudo. \n";
        }
        if (valor4.contains("6")){
            numero += "\nLIÇÃO CÁRMICA 6 - Na vida passada você foi em ser completamente alheio e, digamos,  até irresponsável para com obrigações familiares. Não estava nem aí para ajudar familiares doentes e necessitados. Nesta atual existência, até que aprenda esta Lição, que é a de ser bom pai (ou mãe), irmão, parente, amigo ou cônjuge, poderá ser forçado a assumir responsabilidades domésticas (cuidar de doentes) ou mesmo prestar serviços a terceiros.  Deverá ser compreensivo nessas ocasiões, pois os “parentes” e amigos pouco ou nada farão para ajudá-lo; muito pelo contrário, deverão sobrecarregá-lo com muitas exigências, até que aprenda definitivamente esta crucial Lição.\n";
        }
        if (valor4.contains("7")){
            numero += "\nLIÇÃO CÁRMICA 7 - Em outra existência você foi um ser indeciso; buscava o lado espiritual, mas queria ser rico a qualquer custo. Também pouco ou nada fez em matéria educacional, sendo um ser de pouca cultura, sem conhecimento de si próprio e das Leis que regem o Universo. Até que aprenda a Lição que outra não é senão a de ser culto, espiritualizado, analítico e principalmente decidido na tomada de atitudes, a vida o tornará indeciso, sempre ponderando e adiando indefinidamente os projetos. Deve, também, treinar a sua mente em vista do futuro que rapidamente se aproxima, ou seja, estudar modernas técnicas e agir sem medo. \n";
        }
        if (valor4.contains("8")){
            numero += "\nLIÇÃO CÁRMICA 8 - Provavelmente você foi “rico” na vida passada (herdeiro), sem qualquer capacidade ou vontade de ganhar dinheiro. Na verdade, era gastador, esbanjador, pouco se importando quem ganhava o dinheiro; só queria gastá-lo! Agora, nesta existência, até que aprenda esta Lição, a vida o levará a ter problemas financeiros, negócios fracassados e também longos períodos de paralisação. Deve dar valor ao dinheiro, gastá-lo com critério, sabedoria, sem esbanjá-lo, poupando-o, pois provavelmente terá de tratar de negócios e finanças próprias e também de outras pessoas, além de ter sérios problemas na velhice.\n";
        }
        if (valor4.contains("9")){
            numero += "\nLIÇÃO CÁRMICA 9 - Você foi na vida passada um ser frio, sem amor e compreensão para com seus semelhantes. Não aparentava qualquer sentimento de afeto; era desumano, indiferente, pouco se importando com os outros.  Em virtude dessa “apatia” emocional, nesta existência poderá sofrer alguns reveses na vida, como perda de propriedades, longos períodos desempregado, doenças diversas e também desapontamentos com amigos, parentes, sócios, cônjuge ou simplesmente companheiros. A Lição a aprender nesta vida é a de ser bondoso, amoroso, generoso, compreensivo e interessado em tudo e com todos.\n";
        }
        edtcarmicas.setText(""+ler+numero);


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
