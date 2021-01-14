package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class CiclosdeVida extends AppCompatActivity {
    private MultiAutoCompleteTextView edtciclos;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(CiclosdeVida.this, Desafio.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclosde_vida);

        edtciclos = (MultiAutoCompleteTextView) findViewById(R.id.edtciclos);

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


        String ler = "São as características próprias que os dias, meses e anos (data natalícia) influenciam a vida de todos os seres humanos. Os Ciclos se dividem em três: \n1ºCiclo: "+valor7 +" - Início de vida até "+valor8+"\n2º Ciclo:"+valor9+" - "+valor8+" até "+valor10+"\n3º Ciclos:"+valor11+" - "+valor10+" até o resto da vida\n\n";
        String numero = "PRIMEIRO CICLO DE VIDA\n";

        if (valor7 == 1){
            numero +="O 1 (um) no primeiro Ciclo de Vida indica um período difícil. Quando criança, a pessoa necessita aprender a desenvolver sua individualidade, pois caso contrário, na juventude e adolescência ou mesmo até à entrada do 2º Ciclo, terá problemas emocionais e grande dificuldade de se estabilizar profissionalmente. O ideal é que a criança nesse Ciclo tenha liberdade acima do normal e não frear os seus instintos em hipótese alguma. No caso de pessoa maior de 18 anos e que ainda  esteja no primeiro Ciclo e tenha sido reprimida, ou seja, não tenha tido educação condizente, que absorva estes ensinamentos e os coloque em prática imediatamente.";
        }
        else if (valor7 == 2){
            numero +="O 2 (dois) no primeiro Ciclo de Vida, indica uma criança extremamente mimada, que possivelmente sofreu grande influência da mãe ou dos avós. É natural que na adolescência, em vista da possessividade familiar, pense em casar-se o mais cedo possível e isso é muito comum, principalmente entre os homens. ";
        }
        else if (valor7 == 3){
            numero +="O 3 (três) indica uma infância e adolescência feliz, despreocupada e com muitos amigos. Não é um período particularmente favorável ao aprendizado, que deverá ocorrer a partir do segundo Ciclo, mas haverá provavelmente muitas oportunidades para a expressão de idéias e emoções, após os 18 anos (alguns com menos idade), através das artes em geral, da música, do teatro e escrita. Não é um bom período para contrair matrimônio.";
        }
        else if (valor7 == 4){
            numero +="O 4 (quatro) é uma indicação de restrições familiares e de trabalho duro na escola. Normalmente tem pais e parentes severos que impõem seu comando não admitindo qualquer contestação. Na juventude e mesmo após os 18 anos, em vista dessa restrição, o jovem é pouco criativo, limitando-se a obedecer, pouco ou nada criando, levando-o a um relacionamento por vezes desastroso, onde normalmente o cônjuge é que manda e dita normas e leis.";
        }
        else if (valor7 == 5){
            numero +="O 5 (cinco) no primeiro Ciclo de Vida indica muitas mudanças e uma liberdade que às vezes é demasiado grande para que se possa lidar com ela de maneira construtiva.  Sem orientação adequada, o jovem nesse período pode ter problemas causados por envolvimentos precoces com sexo, álcool e drogas. É um péssimo período para o casamento e normalmente quando isso acontece, dura pouco. Também no lado profissional a pessoa tem dificuldade de se assentar, mudando continuamente de emprego ou atividade,  que só terá término quando da entrada no segundo Ciclo.";
        }
        else if (valor7 == 6){
            numero +="O  6 (seis) indica infância e juventude restritiva, cheia de deveres e responsabilidades e, para fugir dessa restrição, normalmente casa-se cedo e muitas vezes esse casamento é um completo fracasso, pois não é escorado em bases sólidas do amor e sim como uma fuga. Tem, também, dificuldades em se ajustar à sociedade, pois é incompreendido nos seus planos e objetivos.";
        }
        else if (valor7 == 7){
            numero +="O 7 (sete) no primeiro Ciclo de Vida indica um período muito difícil. A criança e o jovem conservam-se retraídos e podem sofrer com a falta de compreensão dos pais, professores e amigos. Tal incompreensão leva, invariavelmente, ao isolamento, retraimento e até medo de encarar a vida nessa fase. Na faixa dos 20 anos, em virtude dessa retração, pode desenvolver complexos de culpa e falta de autoconfiança, restringindo o seu progresso pessoal e profissional.";
        }
        else if (valor7 == 8){
            numero +="O 8 (oito) no primeiro Ciclo de Vida indica um período de realizações. É extraordinário para o aprendizado acerca  dos aspectos materiais da vida. É nesse período que se forjam os homens de negócios, comércio, políticos, advogados e todos aqueles que pensam mais no material do que no espiritual.";
        }
        else if (valor7 == 9){
            numero +="O 9 (nove) é o mais difícil dentre todos os Primeiros  Ciclos. Quando criança existe boas oportunidades educacionais, mas também muita tensão. Quando adolescente, a mesma se sente confusa, assustada, nervosa e tem grandes dificuldades de concentração. O 9 é muito sensível, espiritualizado (por natureza) e normalmente incompreendido por todos que o cercam. Não deve se casar cedo, e caso o faça, normalmente esse enlace dura pouco. Profissionalmente tem grandes problemas de relacionamento e por isso permanece inativo longos períodos, até adentrar ao segundo Ciclo, quando então , poderá por em prática toda a sua potencialidade.";
        }
        else if (valor7 == 11){
            numero +="O 11(onze) no primeiro Ciclo de Vida  é um número demasiadamente enérgico e complicado para qualquer criança ou mesmo adolescente e aconselhamos a que seja reduzido a 2, onde poderá lidar melhor com ele.";
        }
        else {
            numero +="\n\n\n\n\n DEU RUIM FALA COM O SÉRGIO";
        }

        numero +="\n\nSEGUNDO CICLO DE VIDA \n";

        if (valor9 ==1){
            numero +=" O 1 (um) no segundo Ciclo de Vida mostra um período de ambições, um grande desejo de realizações e também de sucesso relativo. A pessoa necessita desenvolver seus próprios recursos, estudando e se dedicando o máximo possível, além de lutar para tornar-se independente e chegar ao terceiro Ciclo já com definição profissional, social e financeira";
        }
        else if (valor9 == 2){
            numero +="O 2 (dois) neste período é indicador de sociabilidade e receptividade. É necessário cultivar a paciência, o tato, a diplomacia e a capacidade de perceber os sentimentos alheios. Pode indicar ainda, uma carreira diplomática, ser juiz, médico, professor ou consultor. ";
        }
        else if (valor9 == 3){
            numero += "O 3 (três) nos mostra uma fase agradável na vida, com certa despreocupação. É a fase da sociabilidade, na qual a criatividade e a originalidade podem exteriorizar suas idéias e sentimentos através de algum tipo de arte: pintura, música, teatro, escrita, etc. É um magnífico período para se desenvolver a criatividade, porém, não deve despender demasiada energia, principalmente em coisas fúteis.";
        }
        else if (valor9 == 4){
            numero +="O 4 (quatro) é sinônimo de trabalho duro, de produtividade e de construção do alicerce que deverá se apoiar no futuro. É um período em que  a pessoa necessita aprender a aceitar a rotina e a trabalhar em algo produtivo, sólido e a fazer grande economia. ";
        }
        else if (valor9 == 5){
            numero +="O 5 (cinco) é indicativo de um período de expansão de horizontes, época propícia a viagens, mudanças, romances, liberdade, de novas atividades e também novos amigos. Quase sempre, neste período, a pessoa terá de encontrar as suas oportunidades, longe do domicílio. Precisa aprender a se adaptar, a procurar novas maneiras de ver as coisas e a evitar a tendência para fixar-se num determinado lugar. Em resumo, é um período de grande movimentação, de grandes mudanças e de novos horizontes.";
        }
        else if (valor9 == 6){
            numero +="O 6 (seis) neste Ciclo  nos mostra um período de ajustes e de responsabilidades nos assuntos domésticos em geral. É um bom momento para se contrair matrimônio, ter filhos e solidificar a família. Em suma, é um período familiar, de colocar a casa em ordem, de viver mais para a família, e deixar de ser tanto individualista.";
        }
        else if (valor9 == 7){
            numero +="O 7 (sete) indica um período de crescimento tranquilo, de estudos e de meditação. A menos que esteja casado, este não é um bom Ciclo para se contrair matrimônio, pois a pessoa necessita desenvolver seus recursos interiores e a incompreensão quase sempre aparece nesse período. ";
        }
        else if (valor9 == 8){
            numero +="O 8 (oito) neste Ciclo mostra um período de preocupação com os aspectos materiais da vida. Normalmente a pessoa tem tendência a adquirir riqueza e poder material. Existe, ainda, a  grande possibilidade de realizações no mundo dos negócios, a ganhar muito dinheiro com o trabalho e também através de especulações. ";
        }
        else if (valor9 == 9){
            numero +="O 9 (nove) neste Ciclo  traz a possibilidade de sucesso na vida pública. É um período altamente espiritual e a pessoa  necessita aprender a cultivar a tolerância, o amor à humanidade, o altruísmo e o controle emocional. Dificilmente um romance é bem sucedido e os casamentos tendem a pouca duração caso sejam realizados neste período e também é indício de alguma perda, seja ela material, afetiva ou social.";
        }
        else if (valor9 == 11){
            numero +="O 11 (onze) nos mostra um período de ideais, de revelações, de grandeza e, possivelmente, de fama. Aconselhase que a pessoa se mantenha longe de empreendimentos comerciais ou de especulações, sejam elas financeiras ou imobiliárias. É o momento de desenvolver a mente, de especializar-se em alguma coisa, de estudar, ensinar e também de inspirar as outras pessoas através do seu próprio exemplo. ";
        }
        else if (valor9 == 22){
            numero +="NUMERO 22 SEM TEXT0 .... ";
        }
        else{
            numero += "\n\n\n\n\nDEU RUIM, FALA COM O SÉRGIO !! ";
        }

        numero +="\n\nTerceiro CICLO DE VIDA \n";

        if (valor11 ==1){
            numero +="O  1 (um) nos indica um final de vida solitário. A pessoa precisa permanecer ativa e independente e contar com seus próprios recursos.";
        }
        else if (valor11 == 2){
            numero += "O 2 (dois) mostra um período de amor sincero e de amigos íntimos. A pessoa se sentirá impelida a colecionar coisas, tais como selos, moedas, antiguidades ou qualquer coisa extravagante. ";
        }
        else if (valor11 == 3){
            numero += "O 3 (três) no terceiro Ciclo de Vida indica um período de expressão de idéias e sentimentos através de diversas formas de arte, música, teatro e literatura. A criatividade vai se desenvolver. Haverá muitos amigos e grande atividade social. ";
        }else if (valor11 == 4){
            numero += "O 4 (quatro)  neste Ciclo  nos mostra que a pessoa, mesmo aposentada, deverá continuar  trabalhando, seja por necessidade, seja por escolha, pois o 4 não o deixará levar uma vida monótona e rotineira. ";
        }else if (valor11 == 5){
            numero += "O 5 (cinco)  é o período da liberdade pessoal, de viagens, mudanças, de novas atividades e  variedade, seja de amigos, de atividades ou de residência.";
        }else if (valor11 == 6){
            numero += "O 6 (seis) poderá ser o mais agradável de todos os terceiros ciclos de vida - uma fase de  felicidade e harmonia no lar - se a pessoa tiver aprendido a adaptar-se e assumir responsabilidades. Caso não tenha aprendido estas coisas, ela poderá ser sobrecarregada com muitos problemas domésticos. ";
        }else if (valor11 == 7){
            numero += "O 7 (sete) indica um período de isolamento ou de semi - isolamento. Trata-se de uma fase tranquila, apropriada para se estudar em casa e adquirir sabedoria e conhecimento.";
        }else if (valor11 == 8){
            numero += "O 8 (oito) neste Ciclo mostra que  a pessoa precisa  agir com sabedoria, trabalhar e estudar duramente nos dois primeiros, quando terá grande possibilidade de ficar rico neste e ter poder e sucesso ilimitados no mundo dos negócios.";
        }else if (valor11 == 9){
            numero += "O 9 (nove) mostra um período de retiro para o estudo e o aprendizado. A pessoa precisa cultivar a tolerância e o amor pela humanidade. Neste Ciclo geralmente há alguma espécie de perda.";
        }else if (valor11 == 11){
            numero += "O 11 (onze) é o período de isolamento, de inspiração, de leitura, de alguma incursão na arte de escrever e, possivelmente, de fama .";
        }else if (valor11 == 22){
            numero += "O 22 (vinte e dois) no terceiro ciclo de vida talvez torne a pessoa tensa e nervosa. Ela deve procurar manter-se ativa durante esse período e dedicar-se a um hobby, tal como a escultura, a pintura, as artes divinatórias, etc.";
        }
        else {
            numero += "\n\n\n\n\nDEU RUIM, FALA COM O SÈRGIO";
        }

        edtciclos.setText(""+ler+numero);



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
