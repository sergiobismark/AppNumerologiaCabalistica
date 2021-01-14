package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class AnoPessoal extends AppCompatActivity {
    private MultiAutoCompleteTextView edtano;
    private FloatingActionButton x1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(AnoPessoal.this, CiclosdeVida.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ano_pessoal);

        edtano = (MultiAutoCompleteTextView) findViewById(R.id.edtano);

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


        String ler = "A vida de todos os seres humanos transcorre em ciclos sucessivos de nove anos. Cada um desses anos de 1 a 9 tem suas vibrações próprias que não podem ser evitadas nem alteradas. Cada ano tem o seu conjunto de influências, oportunidades e obstáculos. Quando se sabe antecipadamente o que nos pode acontecer, podemos nos preparar adequadamente para tirar o máximo proveito dessas oportunidades e evitar os contratempos tão comuns aos menos avisados.\n\n";
        String numero = "";
        if (valor26 == 1){
            numero = "ANO PESSOAL 1 - (plantando as sementes) = \nEste é o ano para começar coisas novas, o ano que estabelece o estilo de todo o ciclo de nove anos. É o momento de tomar iniciativa e mostrar coragem e determinação. Para ter sucesso  e conquistar a felicidade, a pessoa precisa ser independente, criativa, segura, seletiva e seguir sua própria intuição. A armadilha a ser evitada é a falta de iniciativa, a qual poderá muito bem resultar numa apatia que se estenderá por todo o ciclo.\n\nObjetivos: Ano para começar coisas novas.  \nO que  se deve fazer:Ser independente, criativo, seguro, seletivo e seguir a própria intuição. \nPerigos expostos: Falta de iniciativa que poderá influenciar em todo ciclo de 9 anos.";
        }
        else if (valor26 == 2){
            numero = "ANO PESSOAL 2  - (as sementes criam raízes) = \nEste é o ano de agir com discrição e ser paciente, mantendo-se receptivo às idéias dos outros e permanecendo em segundo plano. É uma fase muito boa para amizades e relacionamentos. Para ter sucesso e conquistar a felicidade, a pessoa precisa ser delicada, diplomática e cooperativa no trato com as  outras pessoas. As armadilhas a serem evitadas são a hipersensibilidade e a propensão para envolver-se em discussões e/ou ser excessivamente atrevido. \n\nObjetivos: Ano para agir com discrição e ser paciente e receptivo\nO que  se deve fazer: Ser diplomata, delicado e cooperativo no trato com as outras pessoas. \nPerigos expostos: Propensão para discussões ou ser excessivamente atrevido.";
        }

        else if (valor26 == 3){
            numero = "ANO PESSOAL 3  - (surgem os primeiros brotos) = \nEste é um ano de boa saúde e de intensa vida social que, no entanto, poderá trazer tensão emocional. É uma fase boa para divertimentos, viagens, crescimento pessoal e para cultivar novas amizades. O sucesso e a felicidade resultam do fato de se dar vazão à própria criatividade e de expressar-se construtivamente através das palavras escrevendo, lecionando, representando ou cantando. As armadilhas a serem  evitadas são a extravagância (que pode acarretar dificuldades financeiras no ano “4” ) e a perda de oportunidades em decorrência da dispersão das energias. O “3” é também um ano propenso a romances, sendo que as pessoas casadas que sucumbirem a relacionamentos extraconjugais nesse ano, é quase certo que estarão preparando o caminho para o divórcio ou separação no ano “4”.\n\nObjetivos: Ano de crescimento pessoal e cultivo de novas amizades.\nO que  se deve fazer: Dar vazão à criatividade, evitar extravagâncias e dispersão de energia. \nPerigos expostos: Perda de grandes oportunidades em razão da dispersão das energias.";
        }
        else if (valor26 == 4){
            numero = "ANO PESSOAL 4 - (cavando e capinando) = \nEste é um ano de restrições, de trabalho duro e de grandes despesas. É o momento de se construir para o futuro. O sucesso e a felicidade resultam da autodisciplina, de ser metódico e de dar forma concreta às suas idéias. Esta é uma boa fase para lidar com propriedades e imóveis. A armadilha a ser evitada é a da negligência com a saúde poderá haver algum problema com os ossos e/ou dentes.\n\nObjetivos: Ano de restrições, trabalho duro e autodisciplina. \nO que  se deve fazer: Ser autodisciplinado, metódico e dar forma concreta às idéias. \nPerigos expostos: Negligência com a saúde e acomodamento profissional.";
        }
        else if (valor26 == 5){
            numero = "ANO PESSOAL 5 - ( formam-se os botões) = \nEste é um ano para  deixar - se levar por condições em constante mudança, para viver o presente sem fazer muitos planos para o futuro, para abandonar-se aos seus impulsos! É um ano em ritmo acelerado, propenso a acidentes e cheio de  mudanças inesperadas do bom para o ruim, do ruim para o bom. É um ano para divertimentos,  sem  se  pensar  no  futuro. O  sucesso  e  a  felicidade resultam da pessoa ser adaptável, de procurar desenvolver a própria personalidade e de aproveitar as oportunidades antes que sejam perdidas. As armadilhas a serem evitadas são a dispersão de energias, o excesso de atividades sexuais e o mau uso da liberdade  pessoal em prejuízo dos outros.\n\nObjetivos: Ano para abandonarse aos impulsos da vida e viver o presente. \nO que  se deve fazer: Desenvolver a própria personalidade, tornarse adaptável e aproveitar as oportunidades. \nPerigos expostos: Dispersão de energias, excesso de atividades sexuais e não acompanhar o ritmo normal da vida.";
        }
        else if (valor26 == 6){
            numero = "ANO PESSOAL 6 - (floração) = \nEste é um ano para o casamento e as responsabilidades domésticas. É uma fase em que alguma doença crônica talvez se manifeste para que possa ser tratada. Pode também ser um ano de problemas relativos a viagens, tais como defeitos no carro, bagagem perdida e assim por diante. O sucesso e a felicidade resultam de uma dedicação altruísta à família e à comunidade. As armadilhas a serem evitadas consistem em ser excessivamente idealista ou propenso a discussões e em esperar demasiado dos outros.\n\nObjetivos: Ano  para dedicação altruísta à família e à comunidade. \nO que  se deve fazer: Amar e dedicar-se mais à família em todos os seus aspectos.\nPerigos expostos: Ser excessivamente idealista e esperar demasiado dos outros.";
        }
        else if (valor26 == 7){
            numero = "ANO PESSOAL  7 - (as plantas dão fruto) = \nEste é um ano para o isolamento e o descanso, um ano para o estudo e o aperfeiçoamento interior. Esta é uma fase de introspecção. O sucesso e a felicidade resultam do estudo dos significados últimos da vida. As atividades materialistas devem ser evitadas. O dinheiro só aparecerá se não se  correr atrás dele. Quanto menor for a ambição melhor serão os resultados e vice-versa. As armadilhas a serem evitadas são as de negligenciar a saúde, forçar decisões, ser excessivamente crítico e permitir que temores e complexos submersos venham à tona.\n\nObjetivos: Ano para isolamento, descanso e aperfeiçoamento interior. \nO que  se deve fazer: Estudar os significados últimos da vida e evitar  atividades materialistas. \nPerigos expostos: Negligenciar a saúde, forçar decisões, ser crítico e permitir que complexos aflorem.";
        }
        else if (valor26 == 8){
            numero = "ANO PESSOAL  8 - (época da colheita) =  \nEste é um ano dinâmico e  materialista. Os negócios provavelmente deverão prosperar. Poderá haver grandes perdas ou grandes ganhos, dependendo de como se lidou com os outros anos do ciclo. É uma excelente fase para se comprar e vender imóveis. É a hora de pagar e de cobrar as dívidas. O dinheiro pode  surgir de fontes inesperadas. O sucesso e a felicidade resultam da coragem de ousar grandes feitos, de utilizar o bom-senso, de preocupar-se com o dinheiro, de ser organizado, prático e eficiente. As armadilhas a serem evitadas são as de ser emotivo e sentimental.\n\nObjetivos: Ano dinâmico e materialista. Hora de pagar e cobrar dívidas.\nO que  se deve fazer: Ter coragem de ousar grandes feitos, usar o bom senso, preocuparse com o dinheiro e ser organizado. \nPerigos expostos: Ser emotivo, sentimental e gastar mais do que ganha.";
        }
        else if (valor26 == 9){
            numero = "ANO PESSOAL 9 - (época de limpar a terra após a colheita e prepará-la para um novo plantio) = \nEste é um ano de faxina entre o fim de um ciclo e o começo do próximo. É o momento de livrar-se de tudo o que  for desnecessário ou estiver gasto pelo uso especialmente pessoas para as quais não existe mais lugar em sua vida. É uma boa  fase para escrever, representar, viajar e para dedicar-se a estudos metafísicos. Haverá alguma espécie de perda um relacionamento poderá terminar.  O sucesso e a felicidade resultam da compaixão, das atividades humanitárias, do desapego emocional e de deixar que se vá o  que quer que comece a sair da sua vida. As armadilhas a serem  evitadas são as de ser ciumento e/ou possessivo.\n\nObjetivos: Ano de faxina entre o fim de um ciclo e o começo do próximo. \nO que  se deve fazer: Excelente fase para escrever, representar, viajar e para dedicar-se a estudos metafísicos. \nPerigos expostos: Ser ciumento e possessivo.";
        }

        edtano.setText(""+ler+numero);

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
