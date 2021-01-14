package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

public class Motivacao extends AppCompatActivity {
    private MultiAutoCompleteTextView edtmotivacao;
    private FloatingActionButton x1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(Motivacao.this, Impressao.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivacao);
        edtmotivacao = (MultiAutoCompleteTextView) findViewById(R.id.edtmotivacao);

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


        Log.v("Script", "Xioooo " + valor1);
        String numero = "";
        String ler = "Descreve os motivos que estão por trás das decisões que uma pessoa toma e do seu modo de proceder. É o número que corresponde à ação e a maneira que essa ação é desenvolvida.\n\n" ;
        if (valor1 == 1){
            numero = "1 - É normalmente ambicioso, criativo, intelectual, original, inventivo, que não gosta de detalhes; quer liderar, dirigir, dominar, ser elogiado e, por vezes, é obstinado e autoritário. O número um tem espírito pioneiro, gostando de explorar, não se importando com os riscos que possa ter na busca da sua realização. É movido pela iniciativa e pela criatividade. Não gosta muito de receber ordens de quem quer que seja e trabalha melhor só ou em cargo de chefia. Ação, honestidade e lealdade, fazem parte desta excelente energia. Às vezes é incompreensível e se recusa a aceitar conselhos, fatos esses que com certeza causarão transtornos à sua carreira e aos seus planos profissionais. Quando não desenvolvido espiritualmente, pode inclinar-se para o egoísmo, vaidade e arrogância excessivas. Torna-se impaciente e dotado de pouca diplomacia e tato para tratar com as pessoas. Por esse motivo, o possuidor deste número enfrenta mais dificuldades do que os outros, principalmente no seu meio profissional, pois o seu jeito exigente, arrogante e ditatorial, vai fazendo inimizades por onde passa. Em alguns casos (não raros), essa dificuldade de convívio se estende aos familiares, amigos e companheiros afetivos.\n ORIENTAÇÃO: Cultura, educação e refinamento pessoal são características indispensáveis que devem ser adquiridas para o seu triunfo pessoal, profissional e principalmente afetivo.";
        }
        else if (valor1 == 2){
            numero = "2 - O dois anseia por amor e compreensão e profissionalmente sente-se mais à vontade em trabalhos cooperativos, na retaguarda, sem muito aparecer. Ele quer casamento, companheirismo, paz, harmonia e conforto. Manifesta a sua natureza sensível através da suavidade, cordialidade e prestatividade, sendo a sua principal característica a cooperação. Pela sua “aparente” passividade, carência, vulnerabilidade e calma natural, normalmente as pessoas que com ele convivem, quase sempre se aproveitam dessa sua natureza gentil e o usam para proveito próprio.  Normalmente não procura impor suas idéias (por ser conservador) preferindo escutar as dos outros antes de expor as próprias.  Está sempre procurando reunir conhecimentos sobre todos os assuntos, e relaciona-se com todas as pessoas sem discriminar raça, credo, classe ou fortuna, numa só amizade e dedicação.\n ORIENTAÇÃO: É muito importante para o seu desenvolvimento profissional e pessoal, que aprenda a conviver com o público (ser mais comunicativo) e espalhar conhecimentos para todos, levando-lhes sua mensagem de harmonia, paz e verdade.";
        }
        else if (valor1 == 3){
            numero = "3 - Adora uma plateia; quer ser popular, ter muitos amigos e viver rodeado de beleza. Tem natureza impetuosa entusiástica e sonhadora. É um ser de alta capacidade artística, espírito humano elevado e está sempre procurando levar alegria e prazer aos que o rodeiam. É por demais sincero e tem espírito de liberdade e sociabilidade. O número três sugere uma pessoa entusiástica, que gosta de se divertir, é sociável e amigável. Contudo, fazer escolhas e amizades é um dos seus grandes desafios, pois como gosta interagir com os outros através de diversões, reuniões sociais e conversas íntimas, às vezes esses não estão ou não são receptivos aos seus interesses e, assim, se afastam desse tipo “aparecido”.  O 3 tem poderes psíquicos sobre os demais, principalmente no plano espiritual e, em vista desse poder, deve tomar o máximo cuidado com o uso que faz com os mesmos, pois pode comprometer sua paz e seu viver harmônico, quase sempre inadvertidamente, pois mesmo sendo espirituoso e sabendo lidar com as palavras, se  sente tímido e inseguro, podendo se isolar ou ficar inibido, achando difícil expressar seus sentimentos. A realização e a satisfação emocional normalmente derivam da alegria de compartilhar e aprender sobre o amor e a compaixão.\n ORIENTAÇÃO: Pelo seu lado altruísta que não sabe dizer não, assumindo mais compromissos do que consegue cumprir, deve evitar os afazeres corriqueiros, estudar filosofia humana e fazer uma coisa de cada vez, indo até o fim, ou seja, terminar o que começa.";
        }
        else if (valor1 == 4 ){
            numero = "4 - Precisa de ordem e de normas tanto em casa como no trabalho. O 4 quer trabalhar metodicamente e com afinco em favor dos outros e não gosta muito de inovações. É um conservador nato. É realista e equilibrado e sempre podemos contar com ele. Profissional de alto gabarito é tremendamente dedicado à profissão, sendo de certa maneira perfeccionista nos detalhes e na conclusão de um trabalho bem feito. O ser número quatro gosta de praticidade, de coisas que pode ver, tocar e, principalmente, que se desenvolvem e que protegem. Num nível mais elevado, ele é o ser maduro, sério, firme como uma rocha, gostando de estar protegido contra os embates da vida, ou seja, não gosta de ser pego de surpresa em coisa alguma. É tremendamente autodisciplinado, trabalhador incansável, obediente, perseverante, sincero, honesto, paciente, obstinado, conservador e deseja a todo custo estabilidade. Normalmente o quatro é astuto, preocupado com a própria segurança e de certa forma atraído para o mundo financeiro, industrial ou negócios em geral. Embora sejam indivíduos um tanto severos e que dificilmente demonstram  emoções, são tremendamente leais, honestos e confiáveis.\n ORIENTAÇÃO: A ambição material deve vir através dos seus talentos profissionais e esforços continuados. Através desse método pode conseguir tudo o que desejar, mas também deve ter planos que visem beneficiar toda a humanidade. Um outro fator de grande importância é que tendo tendência à teimosia e à rigidez (de idéias e ações), deve aprender a ser mais flexível e adaptável.";
        }
        else if (valor1 == 5){
            numero = "5 - É um ser “mutável”, que gosta de variedade, de experiências incomuns e está sempre à procura de novas oportunidades. Tem percepção arguta, perspicaz e natural curiosidade, o que o leva a querer investigar e elucidar seja que problema for. Amante de novidades, está sempre entusiasmado com o que é novo, moderno, atrativo e incomum. Poucos o acompanham o ser número cinco em matéria de raciocínio rápido e perspicácia, pois ele se adapta a qualquer meio ou situação. No que tange à sociabilidade, o cinco é versátil, bom falador, amigo, festeiro, fazendo amizades com grande facilidade e, desta maneira, sendo sempre bem vindo em qualquer roda ou ocasião. Como possui grande talento e versatilidade, sai-se sempre bem em qualquer função ou atividade, trabalhando somente naquilo que gosta e, assim, jamais se cansando ou mesmo se aborrecendo em suas atividades “corriqueiras”. Liberal e de mente aberta, pode facilmente se adaptar a novas situações ou ter uma atitude progressista. Como é muito habilidoso e eficiente, pode aprender rapidamente e captar as situações com a sua abordagem realista. As viagens e mudanças são partes inerentes do seu estilo de vida.\n ORIENTAÇÃO: Como tem fortes inclinações psicológicas e filosóficas, deve adquirir conhecimentos nessas áreas través da dedicação aos estudos experimentais, ser perseverante em seus projetos e objetivos, terminando o que começa.";
        }
        else if (valor1 == 6){
            numero = "6 - É, entre todos os números, o que procura sempre a harmonia pessoal e social. Os atributos principais deste número são o idealismo, a criatividade, o humanitarismo, a compaixão e a visão. Como é idealista, tem como princípio orientar e consertar tudo o que está errado no mundo. Quer criar raízes e fazer com que sua vida gire em torno do seu lar e das pessoas queridas. É conciliador, aprecia a fertilidade (adora família grande), tudo que cresce, produz e se expande, entusiasma-se com o milagre da vida, sentindo em tudo a presença do amor. Em vista desse predicado, age como conselheiro confiável e prático e tem amigos que sempre o procuram em épocas difíceis. Por índole, é simpático, intuitivo e persistente. Possui temperamento equilibrado, é muito responsável e inclinado aos problemas domésticos (adora uma casa bonita com muitas plantas, animais, bons móveis e tudo na mais perfeita ordem). Tem gostos refinados e se sente bem no conforto e na elegância. Conquista facilmente a popularidade e o êxito social.\n ORIENTAÇÃO: Como tem tendência à vaidade e ao egoísmo, deve trabalhar esses atributos negativos através de estudos holísticos e metafísicos. Se aceitar suas limitações e conscientizar-se delas, equilibrará seus sentimentos e pensamentos e poderá ter a harmonia, a paz e a prosperidade tão desejadas.";
        }
        else if (valor1 == 7 ){
            numero = "7 - Detesta ser mandado, de desconforto físico, barulho e confusão. É observador e pesquisador, gostando de descobrir o porquê de tudo. Não gosta de ter a liberdade tolhida, quer paz e tranqüilidade para viver consigo mesmo, para poder sonhar e meditar. O sete possui intuição, capacidade mental e racional. É considerado o número da espiritualidade e, por isso, normalmente os seus possuidores são introspectivos, silenciosos, perfeccionistas, arredios, estudiosos, possuindo uma sabedoria além do normal. É por demais íntegro e tem o senso de justiça e clemência muito elevado. Está sempre querendo aprender e, principalmente, entender o que quer que seja. Resumindo, está sempre em busca de sabedoria. Quanto a relacionamentos conjugais ou somente uniões (não oficiais), o número sete deve ter prudência e se unir somente após ponderar os prós e contras, pois se o parceiro não for totalmente compatível com ele, com certeza a união não durará muito, e isso o faz sofrer em demasia. Tem tendência ao ciúme infundado e exigir demais dos parceiros. Como é muito íntegro, não tolera injustiças e está sempre pronto a defender os fracos e oprimidos.\n ORIENTAÇÃO: As bebidas alcoólicas, cigarros e drogas, em geral, são venenos para o seu organismo; evite-os. Será muito mais feliz se viver próximo à água, seja ela de rio, lagoa ou mar. Quanto as relações conjugais, o sete deve buscar autoconhecimento nesse campo, pois como está sempre em busca de sabedoria e compreensão, esquece-se de que o parceiro também anseia pelos mesmos predicados.";
        }
        else if (valor1 == 8){
            numero = "8 - Nasceu para o mundo dos grandes negócios e adora lutar contra seus opositores. Normalmente é ambicioso, quer poder, riqueza e sucesso. Em virtude dessa ambição, está sempre motivados e determinados a seguir em frente, em busca dos seus objetivos. O oito é arguto, inteligente, observador, conservador e sabe por instinto enfrentar os embates da vida sem muitos alardes ou desesperos. Não é chegado a ter muitos amigos, mas os que tem, lhe são tremendamente caros, defendendo-os e orientando-os em ocasiões de crises e perturbações A sua normal ambição material o torna autoritário e com desejo de dominação. Quando culturalmente desenvolvido, naturalmente adquire espírito intelectual, analítico, bem equilibrado e se torna muito eficiente naquilo que se propõe a fazer. Como tem grande senso natural para os negócios, deve procurar desenvolver suas habilidades inatas de organização e execução.\n  ORIENTAÇÃO: Deve cultivar a persistência, o senso analítico e agir com diplomacia, paciência e tolerância para conseguir tudo o que deseja. Deve, ainda, aprender a perdoar, compreender e considerar as fraquezas das pessoas quando fizer um julgamento.";
        }
        else if (valor1 == 9){
            numero = "9 - É o ápice da realização intelectual e espiritual. Busca sempre o conhecimento, quer ensinar, aconselhar e servir à humanidade. Tem um saber subconsciente que, se for desenvolvido, pode-se revelar genial. É magnético e carismático, mente perceptiva e habilidades psíquicas que apontam para uma receptividade universal. O nove é impessoal, revestido de desinteresse material mas, quando não ciente desses predicados, ou seja, quando não desenvolvido espiritualmente, torna-se vaidoso, gostando de ser elogiado pelas pessoas que o rodeiam. Embora seja um ser generoso e compassivo, com grande imaginação, pode se iludir ou ficar emocionalmente frustrado quando percebe que as outras pessoas não compreendem as suas perspectivas elevadas. Isso também se dá no âmbito profissional, pois deseja que os colegas ou superiores o compreendam (o que não é muito fácil!) e, assim, frustrando-se, acabando por desistir de suas excelentes idéias. Não tem medo de nada nem de ninguém, e quando aparecem obstáculos em sua vida, sabe muito bem se desvencilhar deles com maestria e energia. A combinação da inspiração e do idealismo com uma vida interior intensa e sonhos vividos, sugerem que o número nove é um ser universalista, desprovido de egoísmo e cheio de amor para dar.\n ORIENTAÇÃO: Deve desenvolver suas qualidades inatas, viajar pelo mundo, conhecer novas pessoas, novos ambientes e novos meios sociais. Caso negligencie a estes “conselhos”, pode-se tornar um ser solitário, introspectivo, tendendo para o isolamento, depressão e desânimo.";
        }
        else if (valor1 == 11){
            numero = "11 - O 11 tem uma postura visionária, pois gostaria de se ver rodeado de pessoas que o admiram, fazendo prevalecer seus pontos de vista, pois pouco valor dá às idéias alheias. Normalmente é atrativo, tanto na parte pessoal como em sociedade. É um ser idealista, e a inspiração e a inovação estão sempre presentes. De certa maneira contraditório, pois gosta que suas idéias prevaleçam, por vezes se torna “conciliador” e árbitro das mais diversas contendas, se saindo bem nessa função. Uma combinação de humildade e confiança o desafia a trabalhar para ter autodomínio material e espiritual. Através da experiência, pode aprender a lidar com os dois lados da sua natureza e desenvolver uma atitude menos extremista, confiando nos seus sentimentos. É adepto da harmonia das formas, dos métodos persuasivos, da elevação moral das coisas e pessoas e de tudo que tem sentido superior. Apesar de não concordar, é muito vulnerável na sua sensibilidade, magoando-se profundamente com fatos que a outros nem sequer os preocupariam.\n  ORIENTAÇÃO: Como tem rara intuição e capacidade psíquica que deve desenvolver, é aconselhável seguir seus pressentimentos, sem se ater a conselhos alheios ou idéias preconcebidas. Como o medo sempre se relaciona à insegurança em relação ao dinheiro, precisa aprender a superar a tendência a ser arrogante ou calculista. Aprenda a expressar o seu talento único para liberar o seu verdadeiro potencial.";
        }
        else {
            numero = "22 - Apesar de ser reservado, muitas vezes é carinhoso e se preocupa com o bem-estar e a segurança de toda a humanidade, mas nunca perde de vista a sua posição pragmática ou realista.. É prático, habilidoso, honesto, cordial, idealista, inspirado e um eficiente organizador com um grande potencial de realização. O 22 , que é um número-mestre, quer dar a sua contribuição para o gênero humano. Tem necessidade de afeto, carinho e amor. É trabalhador honesto, com capacidade de liderança inata, carismático e com profunda compreensão das pessoas e de suas motivações. Geralmente culto e mundano, tem muitos amigos e admiradores. Quando determinado, pode atingir o sucesso e a fortuna com a ajuda e o encorajamento dos companheiros de jornada. A profundidade de seus sentimentos e necessidade de expressão indicam que é um ser dinâmico e motivado quando se sente inspirado. A sua capacidade de resistência e perseverança sugere que você mostre a sua verdadeira personalidade em momentos difíceis e estressantes. Embora seja generoso e entusiasmado, às vezes pode ser egoísta e arrogante.\n  ORIENTAÇÃO: Se tiver padrões muito elevados, pode sentir-se insatisfeito e se tornar crítico ou antipático. Por isso, deve cultivar a compreensão, a determinação e a persistência. Deve trabalhar sempre em benefício da humanidade, sem se esquecer de si próprio.";
        }
        edtmotivacao.setText(""+ler+numero);


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

