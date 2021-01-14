package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class Impressao extends AppCompatActivity {
    private MultiAutoCompleteTextView edtimpressão;
    private FloatingActionButton x1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(Impressao.this, Expressao.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impressao);

        edtimpressão = (MultiAutoCompleteTextView) findViewById(R.id.edtimpressão);

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

        Log.v("Script", "Xioooo " + valor2);
        String ler = "É o número que descreve o que está oculto no ser humano e a imagem que uma pessoa tem de si mesma (geralmente sem perceber). Revela, ainda, a primeira impressão que os outros têm de nós, antes de nos conhecerem na realidade, ou seja, a condenação ou a absolvição antes do julgamento.\n\n";
        String numero = "";
        if (valor2 == 1){
            numero = "1 - A impressão deste ser, é exatamente isto: um ser superior que se destaca dos demais, fazendo com que todos, invariavelmente, se virem para ele.  É líder por natureza e vive patrocinando novas idéias, sejam elas suas ou de outrem. Nessa busca, sonha em ser corajoso, ousado, justo, leal e original, tanto nas qualidades profissionais, quanto no seu modo de se vestir e no falar. É persistente e dificilmente se deixa dominar pelo desânimo, por isso, para conseguir o que deseja, pode mostrar-se teimoso, egoísta, obstinado e por vezes opressor. Sabe mandar, dirigir e tem aparência sólida e autoconfiante. Entre os amigos (que são muitos) é sempre escolhido para liderar, pois as suas idéias e posturas sólidas, lhe conferem as prerrogativas inerentes aos vencedores. Mostra grande potencial e habilidade executiva e de liderança, que pode se manifestar em trabalhos de especialização na sua área de atuação ou em postos de gerenciamento e administração, na carreira militar ou política.\n ORIENTAÇÃO: Precisa aprender que o mundo não gira ao seu redor, e evitar a inclinação a ser autocentrado e ditatorial. Deve também policiar seus desejos gastronômicos, pois sendo o centro das atenções em festas e reuniões, pode-se deixar levar pela gula e sofrer de obesidade após os 50 anos.";
        }
       else if (valor2 == 2){
            numero = "2 - O 2 quer amor, amizade, carinho, harmonia e paz.  Tem feições que o destacam de todos os outros números: é ardoroso, idealista, calado, pacífico, diplomata, sendo muito hábil em conciliações de interesses seus e alheios. Na tentativa de agradar as pessoas de quem gosta, corre o risco de se tornar excessivamente dependente. Contudo, desenvolver a autoconfiança, pode superar essa tendência e vir a ser uma pessoa bem sucedida, sem grandes problemas. É também responsável, justo, gosta de calma, de legitimidade, esclarecimento e também inspiração. Gosta também de se sentir compreendido e confortado. Quando só, parece sonhador, trazendo a cabeça nas “nuvens”. Pelos modos calmos, gentis e agradáveis, desperta em todos a segurança e a confiança. Normalmente age com naturalidade e simplicidade, não gostando de se exibir, seja em família ou numa roda social. A discrição é seu lema.\n ORIENTAÇÃO: Infelizmente, em nossa sociedade, a simplicidade é vista como sinônimo de fraqueza. Por isso, deve aprender a ser mais dinâmico, arrojado, criativo e sempre procurando inovar, sem medo de errar ou ser diferente. Evite a estagnação ou a monotonia.";
        }
       else if (valor2 == 3){
            numero = "3 -  É do tipo social, amistoso, alegre e jovial. O 3 é popular, atraente, criativo, gostando de ser aplaudido,  notado, admirado, ou seja, que o vejam como um verdadeiro artista. Normalmente cultiva a criatividade, os contatos sociais e a expressão de suas próprias idéias e sentimentos, especialmente através de alguma forma de arte. Demonstra personalidade e um espírito de grande profundidade, justiça, esperança, filantropia, alegria e felicidade. Abençoado e com charme, sensibilidade e imaginação fértil, o três precisa equilibrar essas qualidades com alguma forma de fundação sólida na vida.  Embora seja, em geral, artístico, charmoso e elegante, com excelentes relacionamentos, e tenha um bom-senso de humor, talvez precise desenvolver a auto-estima e evitar tendências à preocupação ou insegurança emocional.\n ORIENTAÇÃO: deve evitar constrangimentos e aborrecimentos, além da preocupação excessiva em relação aos projetos futuros, pois esses sentimentos perniciosos podem lhe prejudicar sobremaneira o fígado e o coração. ";
        }
       else if (valor2 == 4){
            numero = "4 - O 4 é o número da consumação e da manifestação da luz. É o número do entendimento e da ordem; é a chave que abrirá muitas portas mágicas fechadas ao homem comum. É o número dos seres rígidos, fortes, seguros, objetivos, trabalhadores, conservadores e dignos de confiança; o sustentáculo da família, da empresa e dos amigos.  É naturalmente preciso, simples, comedido, sendo apreciador de boa música, teatro e gastronomia. É elegante no vestir, preferindo o clássico ao moderno. A sólida estrutura e capacidade de organização mostra que o quatro precisa de estabilidade e ordem. Como a natureza o dotou de grande energia, habilidades práticas e forte determinação, com certeza conseguirá, com estes predicados, atingir seus objetivos.  É detalhista, ordeiro, natural no andar, de gestos simples e graciosos.  Bom ouvinte está sempre interessado nas conversas alheias quando estas lhe parecem sinceras e concretas.\n  ORIENTAÇÃO: Como é o esteio da família, deve ser empreendedor (colocar as idéias em ação), mesmo que a princípio pareçam “loucas”. Cuidado com a obesidade, excesso de autoridade e de controlar em demasia a vida dos outros.";
        }
        else if (valor2 == 5){
            numero = "5 - É um número mágico e peculiar, que era usado pelos gregos e romanos como amuleto para proteger o portador dos espíritos malignos. O dono deste número é normalmente intuitivo, fazendo-o normalmente conhecer o âmago, o caráter e sentimentos alheios. É um ser cativante, interessante, agradável e por que não dizer, magnético. Sonha em viajar por todos os recantos do planeta levando uma vida de aventuras, sem vínculos ou até mesmo sem muita responsabilidade (não que não a tenha). Sabe se defender dos inimigos é esperto e dificilmente consegue ser enganado. É também muito leal e sabe fazer amizades e também inimizades com muita facilidade.  Está sempre à procura do que está além da superfície dos seres e das coisas, gostando de se mostrar antecipado, ora criando, descobrindo ou ditando modas. Uma das suas maiores virtudes é o entusiasmo com que encara qualquer inovação ou novidade, além de estar sempre bem informado sobre todas as coisas, sendo muito difícil surpreendê-lo. Mesmo quando a idade chegar, terá sempre uma aparência alegre e juvenil. O desejo de explorar ou experimentar qualquer novidade e a abordagem entusiástica, sugerem que a vida tem muito a lhe oferecer. O charme é dos seus atributos naturais e, por isso, não tem problemas em atrair admiradores e amantes.\n ORIENTAÇÃO: Como tem grande senso de humor e é atrativo fisicamente, precisa ser seletivo na escolha de amizades e parceiros  para  seus projetos.";
        }
        else if (valor2 == 6){
            numero = "6 - O seis é visto como a perfeição dos números pelos cabalistas e o filósofo grego Nicomachus o chama de Vênus, deusa a quem era consagrado e razão pela qual é tido como o número do amor. O portador deste número é elegante, atraente, do tipo paternal e em certas ocasiões, encantador. Sonha com uma família maravilhosa, uma bela casa, com varandas, flores e sempre pronta para receber os amigos. É de certa maneira contraditório, pois enquanto tem o dom da harmonia, também atrai confusão; é o número da sedução, do vício e da virtude, das incertezas no casamento e também do amor puro e simples; gosta de segurança, tem senso de responsabilidade, ama o social (tem tendência à extravagância) e não suporta viver só. O seis possui uma nobreza interior que se mostra especialmente quando ocupa posição de liderança ou de responsabilidade. Encara o trabalho com seriedade e dá o melhor de si quando tem liberdade de ação. Quando aprende a examinar todos os fatos de qualquer situação difícil ou a ceder em vez de se lançar em jogos de poder, tem resultados mais positivos.\n ORIENTAÇÃO: Como é naturalmente generoso e por vezes ingênuo, dando valor a pessoas que não merecem, inclusive sendo explorado por eles, deve aprender a dizer “não”, a ouvir, meditar e só depois de muito pensar, tomar resoluções, ou seja, não agir precipitadamente. Como é digno de caráter, pensa que todos o são, mas não é verdade.";
        }
        else if (valor2 == 7){
            numero = "7 - É um número classificado como próspero e geralmente é visto assim. É um número inteiramente religioso e como tal foi estimado pelos antigos; representa o triunfo do espírito sobre a matéria. Tem facilidade de adquirir numerosas simpatias no mundo social. Seu grande desejo é se ver cercado de livros numa atmosfera de paz, beleza e tranqüilidade, e isso o leva a imaginar-se sábio e também o refúgio aonde todos venham consultar. É tremendamente místico, de natureza meditativa e também solitária, apesar de gostar da companhia dos amigos e também de elogios, vivendo à procura do entendimento e também do esclarecimento de suas dúvidas e conflitos. Dispõe de natureza expressiva, única e imponente, pois a sua personalidade sete, não pode ser imitada pelos que não pertencem à mesma vibração. Possui personalidade exigente, sinceridade e honestidade com todos, exigindo, é claro, reciprocidade. Tem natureza distinta, delicada, sóbria, não gostando muito de aparecer. Como é uma pessoa sensível, com sentimentos intensos e profundos, aprende a relaxar procurando ser alegre e evitando sobrecarregar sua mente quando enfrenta situações estressantes. A tendência a ser enigmático ou dissimulado, muitas vezes o leva a desenvolver a arte de fazer perguntas sutis sem deixar que ninguém saiba o que realmente está pensando.\n ORIENTAÇÃO: Por ser detalhista, aparentemente descrente e de certa forma excêntrico, deve aprender a compreender os outros e aceitar como eles são, evitando a crítica, a calúnia ou dando conselhos a quem não lhe pediu.";
        }
        else if (valor2 == 8){
            numero = "8 - Este número é peculiar e visto como de grande poder pelos antigos gregos e cabalistas, que diziam: “Todas as coisas são oito”. O oito aparenta imponência e influência, mesmo que esteja com problemas pessoais ou financeiros. Tem raciocínio vivo e perspicaz, e seus modos são calmos e equilibrados. Sonha em ser o comandante de grande empreendimento comercial, um poderoso executivo, sempre cercado de tudo e de todos e chefiando numerosos empregados. É ordeiro, prático e está sempre procurando fazer do seu local de trabalho um lugar agradável e eficiente, onde existam todas as coisas necessárias ao bom desenvolvimento profissional. Quando é atingido em seu amor próprio, é passível de impulsos de mau humor e até certas repulsas a brincadeiras. Altamente criativo, o oito tem uma força vigorosa que o impele a sempre buscar novas formas de realização. Naturalmente dramático, mas com aversão a obedecer aos outros, não gosta de receber críticas. Tem uma incrível habilidade para lidar com as pessoas e fazer contatos, mas pode alterar entre ser caloroso e atencioso e ser frio e indiferente.  Gosta de ser notado e de dar impressão de estar bem  financeiramente. Tem senso natural para os negócios e se beneficiará muito se desenvolver suas habilidades executivas e de organização.\n ORIENTAÇÃO: Como a maioria das pessoas o vê como “superior”, tal superioridade não deve ser “arrogante” nem servir para menosprezar quem quer que seja. É imperioso que estude as Ciências Ocultas, a espiritualidade e desenvolva qualquer atividade humanitária.";
        }
        else {
            numero = "9 - É o ser que atrai sempre simpatias e antipatias na mesma proporção. Sonha em ser um humanitarista, ávido por servir, compreensivo em relação aos sofrimentos alheios e uma fonte de conforto e aconselhamento. Realiza-se pelo esforço que emprega em resolver os problemas alheios, dando-lhes amizade e carinho. É um visionário, sempre em busca de harmonia, esclarecimento e analisando tudo e todos, procurando desvendar os problemas mais obscuros e incompreendidos da Natureza. Possui rara inteligência e também profundos conhecimentos sobre os mais diversos assuntos, mesmo que tenha tido uma educação insuficiente. Pela sua aparência (imponente), personalidade marcante, sabedoria, bondade, compreensão e ponderação, normalmente inspira confiança em todos que o conhecem, podendo produzir admiráveis resultados, pois normalmente atinge o fim a que se propõe. Quando vê as coisas correrem como quer, normalmente se sente leve e sabe julgar o caráter das pessoas. Isso lhe permite ser sociável e voltado para as coisas públicas, características que, quando combinadas, o levam a ajudar muitas pessoas.\n ORIENTAÇÃO: Se tiver os seus desejos reprimidos ou limitados, tende a se comportar de forma rebelde ou a se tornar temperamental. Precisa ser mais flexível e menos orgulhoso. Adapte-se a situações novas e aprenda a esquecer o passado. Evite a cor preta, principalmente durante o dia.";
        }
        edtimpressão.setText(""+ler+numero);

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
