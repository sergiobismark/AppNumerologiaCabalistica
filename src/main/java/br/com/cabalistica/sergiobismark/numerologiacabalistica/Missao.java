package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class Missao extends AppCompatActivity {
    private MultiAutoCompleteTextView edtmissao;
    private FloatingActionButton x1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(Missao.this, DiadoNascimento.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missao);



        edtmissao = (MultiAutoCompleteTextView) findViewById(R.id.edtmissao);

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


        String ler = "A Numerologia Cabalística dá grande importância a este número, sendo considerado mesmo de “alta importância”, pois reflete, na essência, o que a pessoa veio fazer neste planeta, nesta existência.\n É fundamental e muito importante esclarecer que toda e qualquer pessoa tem “livre arbítrio” e pode fazer o que bem entender com a sua vida, porém, também é importante se saber que os números obedecem a uma ordem rigorosa de harmonia, compatibilidade, neutralidade e incompatibilidade que, se não respeitada, pode causar ao seu portador inúmeros aborrecimentos ou mesmo derrocadas na vida.\n Lembre-se de que a Numerologia Cabalística existe para facilitar a vida das pessoas e não para complicá-la. Todos nós temos uma “Missão” sobre a Terra, nesta e em outras existências (Deus jamais desejou que qualquer dos seus filhos viesse a sofrer; e se tal fato acontece a culpa é exclusiva do ser humano); logo, este item é de grande utilidade, pois a sua essência mostra como podemos tirar o melhor proveito da vida, sem que com isso prejudiquemos qualquer outro ser humano.\n";
        String numero = "";

        if (valor22 == 1){
            numero = "\n        MISSÃO — 1  (LIDERANÇA) \nPontos positivos: liderança, criatividade, caráter progressista, vigor, otimismo, convicções fortes, competitividade, independência e espírito de união. \nPontos negativos: arrogância, ciúme, excesso de orgulho, antagonismo, falta de controle, egoísmo, instabilidade e impaciência.  \nAs atribulações, contratempos, obstáculos e vitórias que obteve ou obterá na primeira metade da vida (até os 45 anos), servem ou serviram para desenvolver a força moral necessária na segunda metade, quando necessitará se estabilizar materialmente e cumprir seus deveres sociais e espirituais. Com desejo de ser o primeiro e independente, o possuidor desta Missão tem inclinação a ser individualista, inovador e corajoso, com muita energia, predicados que deve cultivar ao longo da sua vida. O espírito pioneiro o encoraja a se aventurar sozinho nos seus empreendimentos. Esta força também pode estimulá-lo a desenvolver habilidades executivas, de organização, criatividade e originalidade. A Missão 1, é a do ser inteligente, mas também o é do ambicioso e do agressivo. É confiante em seus propósitos, independente e, se quiser, poderá aspirar aos maiores cargos na sua profissão ou atividade. Tem tendência a ser autoritário, dominador e inflexível em seus propósitos, o que lhe causará alguns problemas, principalmente com respeito aos subordinados e pessoas mais chegadas, como parentes e amigos. Será sempre invejado e deve se proteger espiritualmente contra essa inveja e contra inúmeras maledicências que dirão sobre sua pessoa. Será também admirado, respeitado e terá a consideração dos outros. Se agir com prudência e sabedoria, poderá ser muito bem sucedido na política, na administração de grandes empresas, como líder de povos ou excelente místico. Idealista e sociável busca estabilidade emocional e segurança. Tem uma personalidade carismática e atrai sempre amigos e admiradores respeitáveis.";
        }
        else if (valor22 == 2){
            numero = "\n        MISSÃO  — 2   (HARMONIA) \nPontos positivos: gentileza, tato, receptividade, intuição, consideração, harmonia, solidez, inteligência, conservadorismo, economia e honestidade. \nPontos negativos: falta de confiança, subserviência, excesso de sensibilidade, mau humor e se ofende com facilidade. \nPaz e disposição ordenada como um todo, é seu principal lema. A Missão 2 representa a solidificação do ser humano, a capacidade de trabalhar em grupo, a disposição em servir e também em querer que tudo esteja em perfeita ordem e em perfeito estado de funcionamento. Harmonia entre pesquisar e executar, coerência entre os propósitos e os objetivos são, com certeza, suas maiores virtudes. Aparenta ser frio, calculista, obstinado, incrédulo, mas na realidade é muito afetuoso, bom amante e sempre pronto a ajudar aqueles que o procuram e também aqueles que necessitam sem o procurarem, ou seja, gosta de ajudar a todos indistintamente.  Em virtude desse seu procedimento, por vezes é enganado por aqueles em quem confia, pois como é íntegro e honesto em tudo e com todos, acha que os outros também o são. Tal procedimento o deprime e o chateia, mas como não sabe guardar rancor nem ódio, rapidamente se recupera desses inconvenientes, perdoando os elementos que lhe fizeram mal. É o melhor mediador que existe e, em sua longa existência, será  excelente juiz, advogado, médico, professor ou trabalhando como elemento de retaguarda em uma grande organização, além, é claro, de ser o melhor diplomata que se conhece. Bebida alcoólica, cigarro e drogas de qualquer espécie, são venenos ao seu organismo.";
        }

        else if (valor22 == 3){
            numero = "\n        MISSÃO — 3 (CRIATIVIDADE) \nPontos positivos: amigável, criativo, artístico, amante da liberdade, engraçado, com excelente senso de humor, talento com as palavras e com grande poder de desejar. \nPontos negativos: entendia-se com facilidade, vaidoso, excessivamente imaginativo, exagerado, convencido, extravagante, comodista, preguiçoso e hipócrita. \nÉ sociável, popular, criativo, artístico e imaginativo. A palavra que exprime seu número é a auto-expressão, seja na oratória, escrevendo ou mesmo representando. De excelente senso de humor, o 3 nasceu para brilhar, pois é dotado de grande imaginação e criatividade. Mesmo quando a idade chegar, parecerá sempre jovial e sonhador, procurando novas aventuras e criando novos projetos. Se interpretar estas palavras corretamente, poderá ser ou conseguir tudo o que desejar. Durante sua longa vida, muitas oportunidades de sucesso surgirão; cabe a você interpretá-las e seguir a sua própria intuição, não se deixando seduzir ou levar pela conversa dos outros. Como não se deixa jamais dominar pela depressão ou desânimo, quase sempre é bem sucedido no que pretende realizar. Porém, de acordo com a sua personalidade extrovertida, que por vezes é interpretada como sendo irresponsável, estará exposto a críticas, do tipo: “Você é irresponsável, só pensa em farra...” Deve evitar os trabalhos rotineiros e enfadonhos, como escriturário, caixa de banco, ou qualquer outro que não seja brilhar. Deve estimular a arte na sua plenitude, a oratória, a comunicação, a música, a literatura, o paisagismo, etc. Mesmo quando muito tenso ou preocupado, jamais demonstra seus sentimentos, mostrando aos outros somente o que é belo e agradável em seu ser, o que na realidade é muito bom, dando vida à antiga máxima: “Demonstre sempre alegria; desse modo, deixarás os amigos sempre alegres e os inimigos perplexos e intrigados”. O convívio familiar, os compromissos sociais e o trabalho, normalmente serão tratados com espírito elevado e qualquer problema que surja, será resolvido com sabedoria e criatividade. ";
        }
        else if (valor22 == 4){
            numero = "\n        MISSÃO — 4  (VONTADE ) \nPontos positivos: organizado, disciplinado, estável, trabalhador, habilidoso, perseverante, sincero, íntegro, paciente, conservador, esperançoso, confiável, pragmático e autodisciplinado. \nPontos negativos: pouco comunicativo, autoritário, muito econômico, rígido e guarda ressentimentos. \nSua Missão não é a de um visionário e sim de alguém com os pés no chão, alguém que persegue e consegue seus objetivos por métodos já consagrados e não por iniciativa própria, usando projetos inéditos. É um lutador; coragem e determinação não lhe faltam e enfrenta qualquer obstáculo com valentia e determinação. A sua Missão é construir coisas; porém, a sua realização pessoal será de âmbito mais coletivo e não em prazer próprio. O amor, a tolerância, a paciência, a harmonia, fazem parte desta Missão, pois todos estes predicados lhe serão exigidos durante toda a vida. Na maturidade, ou seja, após os 45 anos, tais virtudes deverão ficar muito mais latentes, pois será comparado a um pai ou a uma mãe, aonde todos virão se aconselhar. Como é empreendedor, ambicioso e trabalhador, tem força de vontade e habilidade para perceber as oportunidades que podem ajudá-lo na sua escalada para o sucesso. A construção civil, a química, a metalurgia, a odontologia, a segurança pública, política, e as finanças de um modo geral, devem ou deveriam ser os seus principais objetivos.  As parcerias serão sempre preferíveis à iniciativa individual. Se compreender bem estas palavras e possuir tempo e discernimento compatíveis, conseguirá reconhecimento tanto no âmbito nacional como internacional, pois é carismático, amigo e interessado no bem estar do seu semelhante, e o planeta necessita muito desse tipo de indivíduo.";
        }
        else if (valor22 == 5){
            numero = "\n        MISSÃO — 5  (VERSATILIDADE) \nPontos positivos: versátil, adaptável, progressista, magnético, ousado, rápido, curioso, místico e sociável. \nPontos negativos: instável, procrastinador, inconsistente e excessivamente confiante. \nAlém dos predicados acima expostos, esta Missão mostra um ser ousado, enérgico e amante da liberdade. Normalmente é atraente ao sexo oposto e está fadado a trocar várias vezes de parceiro durante a vida, pois também é bastante volúvel. Amante do novo gosta de viajar pelo mundo sempre em busca de novidades, estudando e tentando compreender seus semelhantes. Tem mente investigadora, grande versatilidade mental, excelente memória e extraordinária capacidade para fazer várias coisas ou mesmo ler vários livros ao mesmo tempo. Tem, também, a tendência para começar várias coisas e não terminálas, ou seja, tem muitos começos e poucos fins. Tal tendência deve-se principalmente ao desejo quase obstinado de conhecer, o que o torna por vezes dispersivo, instável e inquieto, mudando de atividade tão logo encontre outra que lhe proporcione mais prazer e interesse. Como é adaptável e ousado, deve assumir responsabilidades, pois pode naturalmente ser levado a posições de autoridade. Sua inteligência aguçada e suas idéias originais podem levá-lo a seguir carreiras nas áreas de educação, filosofia ou pesquisa científica. Magnânimo e gentil,é excelente para lidar com as pessoas e normalmente sabe perceber as oportunidades. como não gosta de obedecer a ordens de outros, prefere ocupar posições gerenciais ou trabalhar por conta própria, pois quer ter liberdade para agir do seu jeito. Seu humanitarismo e suas aspirações espirituais podem levá-lo a ter atividades ligadas a reformas sociais ou à religião. Mas o seu senso dramático natural pode fazer com que seja atraído pelo mundo do entretenimento. Por ser muito popular, por vezes se deixa levar por palavras elogiosas e comete erros infantis de julgamento de seus semelhantes, sendo muitas vezes vítima de intrigas e ciúmes. É inteligente e deve aprender a desligar-se das opiniões alheias e a seguir sua própria intuição, mesmo que a princípio lhe pareça tarefa das mais difíceis. Novos ambientes, novos amigos, novas paisagens, novos horizontes, farão parte ativa de sua vida.";
        }
        else if (valor22 == 6){
            numero = "\n        MISSÃO — 6 (AMOR) \nPontos positivos: fraternidade universal, compaixão, confiabilidade, solidariedade, idealismo, vida doméstica, humanitarismo, firmeza e temperamento artístico. \nPontos negativos: ansiedade, timidez, teimosia, perfeccionismo, egocentrismo e desconfiança. \nA família é a sua principal fonte de preocupação. É extremamente prático, equilibrado, sentimental, leal, compreensivo e sempre pronto a ajudar aqueles que solicitam sua ajuda. É honesto, digno de confiança, bondoso, alegre e muito amoroso. Sente-se muito feliz em cargos que requeiram alta responsabilidade, na qual possa contribuir para regularizar, ajustar e harmonizar as coisas — ocupações relacionadas com instituições de caridade, ensino de modo geral, treinamento, ocupações esotéricas, tanto em consultas como didáticas, ou trabalhos em comunidades que requeiram uma liderança justa e íntegra. O Amor é a sua palavra mágica; amor pelas crianças, velhos, familiares, principalmente os filhos (se os tiver), pelos amigos e, em alguns casos, pelos inimigos. Às vezes pode ser explosivo, principalmente quando duvidam de sua capacidade profissional ou põem à prova sua honestidade. Porém, logo esquece as ofensas e os desafetos e perdoa todos, indistintamente. A sua Missão é, invariavelmente, o Amor Universal. Caso se desvie dela, sofrerá na maturidade o peso dessa negligência, culpando tudo e a todos pelos fracassos e decepções que por certo aparecerão, mesmo que, materialmente seja bem sucedido. Se atentar para estas palavras, terá êxito social e será muito popular, principalmente se se dedicar a algum tipo de Ciência Oculta ou à religião, pois é muito convincente e consegue facilmente fazer com que as pessoas o sigam. Cuidado com o fanatismo, pois ele poderá levá-lo a sofrer do mal que anunciar. Amigável e perceptivo, prefere a companhia de pessoas inteligentes e enérgicas, com quem possa dialogar e ter estímulo mental. A sua natureza amigável e solidária sugere que os outros o procuram para pedir conselhos e apoio. Nos seus relacionamentos aparenta ser forte e enérgico, mas o lado sensível da sua natureza implica que pode, ocasionalmente, ficar inquieto e entediado. Embora tenha interesse por outros países e pessoas estrangeiras, prefere ter uma vida doméstica estável. ";
        }
        else if (valor22 == 7){
            numero = "\n        MISSÃO — 7  (SABEDORIA) \nA Sabedoria é a sua palavra de ordem. É um número por vezes enigmático, pois tanto pode ser profundo, calado e introspectivo, como estranho, sociável, falante e cativante. À primeira impressão, as pessoas sentem até um certo receio de se  aproximar  dele, pois seu ar superior e até assustador, leva-as a se afastar em principio. Porém após algumas horas ou somente minutos de convivência, todos lhe são simpáticos e anseiam por permanecer em sua companhia, e se alguns não o fazem, é por pura inveja ou despeito. O 7  a vibração da perfeição e da sabedoria, tanto na vida material como no mundo espiritual. É o número das qualidades psíquicas e também da sensibilidade. Como não gosta de ser mandado, deve evitar qualquer trabalho subalterno, saindo-se melhor como educador, guia espiritual, orador, pregador, pesquisador, explorador, historiador, ou em atividades ligadas ao saber, na mais pura expressão da verdade. É autoritário e gosta por demais que os outros o venham consultar. Poderá também ser excelente escritor metafísico, de esoterismo, religião ou de assuntos relacionados à auto-ajuda. Existe tendência a tornar-se introvertido e meditativo, na maturidade. É fundamental que se cerque de pessoas inteligentes e, de preferência, que comunguem de seus ideais. O sucesso mundano, ou seja, material, é importante para a sua realização espiritual, por isso, não deve ser negligenciado qualquer projeto que possa trazer benefícios financeiros, pois sua Missão depende, em muito, desse poder material para se desenvolver e obter o êxito que almeja. Carismático e ambicioso, tem charme e calor humano. Como é sociável e generoso, se sai especialmente bem em atividades que envolvam o trato com as outras pessoas. Independente e voltado para o sucesso, gosta de se manter em atividade e pensa em termos grandiosos. Com as suas poderosas convicções e seu desejo de servir, pode se dedicar a um ideal ou liderar um movimento que seja de utilidade prática para as outras pessoas. Ainda que consiga demonstrar uma profunda compaixão, as suas emoções fortes podem indicar que precisa evitar extremos ou agir muito impulsivamente.";
        }
        else if (valor22 == 8){
            numero = "\n        MISSÃO — 8  (JUSTIÇA) \nPontos positivos: liderança, meticulosidade, autoritário, protetor, bons princípios, trabalhador, com grande poder de cura e justiça. \nPontos negativos: impaciente, dominador e intolerante. \nÉ organizado, muito dedicado aos seus negócios, excelente para lidar com situações concretas, dominador, prático, direto, seguro de si e generoso. A sua meta principal é o progresso material; progresso sólido, feito com justiça e elevado senso moral. É persistente, tem grande força de vontade e está sempre à espreita de oportunidades, dificilmente deixando que se lhe escapem. Tais características ficam, com o passar dos anos, cada vez mais acentuadas. O grande problema que deve encontrar na primeira metade da vida (até aos 45 anos), é a disciplina. Caso não seja disciplinado nessa fase, sofrerá muito na segunda, onde as oportunidades já não serão tantas, e a vitalidade já não será tão grande. Se disciplinado, sempre encontrará meios de se locupletar, seja trabalhando com afinco e esperteza, seja fazendo os outros trabalharem em seu proveito. Não é dado a discussões e a teimosias, preferindo contornar qualquer obstáculo que se entreponha entre si e o objetivo desejado. Quanto aos amigos, poderá ter tantos quanto os que lhe querem bem, pois sabe fazer amizades e também sabe desfazê-las, tão logo perceba que são interesseiras. Como dá grande importância à riqueza material, terá mais sucesso como alto executivo de uma grande empresa, proprietário de um complexo industrial, comércio em geral, advogado, político ou dedicar-se às Leis. Para que isso se concretize, deverá ter vontade firme, muita energia e autoridade. Através da sua inspirada conscientização e autodisciplina, poderá ser muito feliz trabalhando em prol da humanidade. É necessário aprender a se desapegar em um nível profundo e pode ser que só compreenda isso numa idade avançada. Quando reconhece esta necessidade adquire liberdade interior e passa a ter ideais mais profundos e humanitários. Altamente intuitivo, tem necessidade de transcender o lado mundano da vida que pode estimulá-lo a produzir um trabalho original ou fazê-lo entrar em contato com outros países. ";
        }
        else if (valor22 == 9){
            numero = "\n        MISSÃO — 9  (CONHECIMENTO) \nPontos positivos: idealismo, criatividade, sensibilidade, generosidade, magnetismo, caridade, desapego e popularidade. \nPontos negativos: nervosismo, falta de praticidade, preocupação exagerada, egoísmo e frustração. \nÉ aquele que ao longo da vida deve obter o máximo de conhecimentos possíveis, a fim de adquirir a Sabedoria. É universalista, generoso, sente compaixão por todos, quer melhorar a espécie humana e busca sempre a verdade. Por ser universalista, tanto o passado, o presente e o futuro fazem parte do seu dia-a-dia, vivendo nessa eterna busca, sem nada encontrar, pois já sabe de antemão todas as respostas. Como tem ampla visão do mundo e das coisas que o cercam, principalmente os seus semelhantes, sofre por demais quando percebe  injustiças ou mesmo quando alguém é maltratado, mesmo que todos digam que merece, sejam eles quem forem. Normalmente é impessoal, porque os interesses pessoais geralmente levam-no a desapontamentos. Por seu caráter, não deve ser egoísta e jamais esperar qualquer coisa dos outros, principalmente agradecimentos. Como é incompreendido, por ser universal, tem alguma dificuldade de relacionamento afetivo, dificilmente se dando bem no amor. Por vezes será chamado “irmão(ã) mais velho(a) da humanidade”, pois sua responsabilidade é quase sempre com os outros e muito pouco  faz em prol  de si mesmo. Pelo seu caráter justo e humanitário, encontrará muitas pessoas boas e prosperará e terá sucesso e felicidade. O amor que dedicará ao seu semelhante voltará duplicado e encontrará paz e harmonia. Na maturidade, caso tenha destinado a primeira parte da vida ao  altruísmo, deve se dedicar ao ensino religioso, esotérico, a escrever ou a falar em público. Nessa fase, muitas pessoas dependerão de sua sabedoria e o (a) procurarão, esperando encontrar uma palavra de apoio, solidariedade e sabedoria. Deve, enfim, viver tão altruisticamente quanto possível e sempre buscar a harmonia entre seus irmãos.";
        }
        else if (valor22 == 11){
            numero = "\n        MISSÃO – 11 (FÉ) \nPontos positivos: equilibrado, concentrado, objetivo, entusiástico, espiritualizado, idealista, intuitivo, habilidade para cura, humanitário e grande capacidade psíquica. \nPontos negativos: complexo de superioridade, excessivamente emotivo, egoísta, dominador e magoa-se facilmente. \nA grande virtude do 11 é a Fé. Esta Fé, em si mesmo, não representa propriamente religiosidade, mas também a Fé nos seus ideais, propósitos, pressentimentos, “sorte” ou em projetos que elabora. Consciente ou inconscientemente, a Fé em alguma coisa é a sua “mola mestra” que lhe empurra para o destino. Agindo corretamente, tem o potencial para inspirar as pessoas com seus ideais e imaginação; assim, evite investir suas energias mentais em coisas de pouca importância para não se desviar das suas metas positivas. Quando se concentra em suas energias positivas, é capaz de obter resultados produtivos. Cuide da sua dieta e da sua saúde e aprenda a relaxar de vez em quando. Tem a habilidade para encantar as pessoas, mas elas talvez não vejam que atrás da sua aparência ousada, sofre de confusão interior. Em idade avançada, terá uma sabedoria acumulada através do desenvolvimento espiritual, da compreensão universal e da potencial místico. Evite ser impulsivo, agir de forma extravagante ou se deixar levar por esquemas de enriquecimento rápido, investindo em planos de longo prazo. É um diplomata por excelência e possui a rara capacidade da harmonia e compreensão. É justo e está sempre pronto a “arbitrar” qualquer divergência entre colegas de profissão, amigos ou discórdias familiares. É incapaz de ferir propositadamente um seu semelhante e, quando isso acontece, prontamente pede desculpas e não repete mais o erro. Com o passar dos anos, as suas capacidades de liderança ficarão mais latentes e sólidas e as oportunidades de sucesso, prosperidade e fama aparecerão e com certeza as aproveitará. Estas características poderão levá-lo a ser um famoso orador, um renomado político ou mesmo um diplomata, incumbido de uma grande missão, principalmente de Paz, que lhe será imposta e que terá de usar de toda a sua perspicácia e habilidade para saber concretizá-la a bom termo. A parte final da vida (após os 60 anos) será repleta de paz, harmonia e felicidade.  ";
        }
        else if (valor22 == 22){
            numero = "\n        MISSÃO – 22  (ESPERANÇA) \nPontos positivos: universalidade, intuição elevada, pragmatismo, praticidade, capacidade de organização e capacidade de resolução de problemas. \nPontos negativos: nervosismo, complexo de inferioridade, autoritarismo, preguiça e egoísmo. \nA Missão 22 é muito parecida com o “Destino 22”, pois é um número altruísta e voltado quase exclusivamente para a humanidade, para o todo, para a sabedoria. Vê tudo em larga escala e é altamente capaz de levar a bom termo qualquer projeto que vise o bem do Planeta. Mentalmente arguto e intuitivo, gosta de tomar as próprias decisões. É uma pessoa humanitária, que tem uma visão realista da vida e, com sua força, pode dar apoio a quem precisa. Com grande habilidade social, normalmente tem muitos amigos e admiradores. Para ter paz e harmonia, muitas vezes está disposto a fazer concessões ou sacrifícios. Considera a amizade e gosta de se dar com as pessoas que o inspirem a ser aventureiro e o divirtam. Se sente bem quando está na companhia dos que ama. A sua existência se pautará por testes: financeiros, amorosos ou existenciais. Porém, como é um ser superior, uma vez ciente deste fato, conseguirá se sair bem em qualquer atividade ou profissão e terá grandes satisfações no decurso de sua longa existência. Pode-se dedicar à política, ciências, filosofia, relações públicas, filantropia, esoterismo ou religiosidade. Deverá aprender a ser prático e idealista, a ter os “pés no chão”, a estudar os princípios fundamentais do ser humano e a trabalhar para construir um mundo melhor. Quaisquer tipos de vício (bebida, cigarro, drogas) são verdadeiros venenos para o seu organismo.   ";
        }
        else {
            numero = "\n\n\n\n\n\n\n\n DEU RUIM, FALAR COM O SÈRGIO";
        }


        edtmissao.setText(""+ler+numero);

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
