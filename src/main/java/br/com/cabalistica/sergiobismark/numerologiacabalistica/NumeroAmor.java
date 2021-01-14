package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class NumeroAmor extends AppCompatActivity {
    private MultiAutoCompleteTextView edtamor;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(NumeroAmor.this, NumeroRelacionamento.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_amor);

        edtamor = (MultiAutoCompleteTextView) findViewById(R.id.edtamor);
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

        String ler = "O povo hebreu sempre deu grande importância aos relacionamentos. Como se sabe, o divórcio não é bem visto entre os judeus e o convívio a dois, sagrado, é um dos princípios fundamentais e também a base da Cabala. \nEm vista disso, a moderna Numerologia Cabalística criou uma “tabela” indicativa de vibração energética (alguém especial) no relacionamento entre duas pessoas de sexos opostos. São analisados: amor e amizade; relacionamentos benéficos; atrações fatais; relacionamentos desafiantes e alma gêmea. \nÉ importante observar que a “tabela” é apenas um indicativo que serve como orientação, pois é totalmente impossível determinar com exatidão se este ou aquele elemento é harmônico e se será bem sucedido com esta ou aquela criatura. \n\n";
        String numero = "";

        if (valor22 == 1){
            numero = "         NÚMERO UM  \nEste número é o do idílio (amor poético), mas a atração deve ter uma base intelectual. Como este número também estimula a variedade, não será muito fácil chegar-se a uma união  duradoura, pois haverá a tentação de se tratar de duas coisas ao mesmo tempo. Além disso, a tendência intelectual prejudicará o fogo da paixão, que você procura em vão. Os casamentos podem ocorrer de repente, e também podem  ocorrer encontros quando você estiver fazendo uma viagem bem longe de casa ou em um centro de estudos. O possuidor deste número deve ser sempre cauteloso na vida matrimonial, pois pode haver o perigo de aventuras extraconjugais provocadas pelo tédio ou pela falta de liberdade mental.";
        }
        else if (valor22 ==11 || valor22 ==2 ){
            numero ="         NÚMERO DOIS \nEste número é discriminador na  escolha de um cônjuge, principalmente por causa do seu acentuado interesse pelo conforto e pela estabilidade. A sugestão pode desempenhar um papel importante na sua vida e deve ter cuidado para impedir críticas indevidas por parte de parentes ou amigos, ou seja, interferência na sua vida amorosa. Pode haver também amizades secretas, de natureza puramente platônica, que devem ser encaradas com cautela, a fim de serem evitadas desavenças conjugais. Você há de querer uma pessoa inteligente, mas que seja acima de tudo prática e capaz de garantir a segurança financeira que você deseja.";
        }
        else if (valor22 ==3 ){
            numero ="         NÚMERO TRÊS  \nÀs vezes você tem a infelicidade de conhecer seus parceiros ideais demasiadamente tarde, quando normalmente já estão casados e, se não tiver cuidado, pode tornar-se um lado de um triângulo, em vez de esperar outro parceiro que esteja livre. Você é muito idealista para compartilhar seu casamento, mas o seu espírito de sacrifício pode ser explorado maldosamente  por aqueles em quem  confia. Possivelmente, haverá um ou mais de um  quase erro, porém você tem a proteção que impede de se prender a uma pessoa de gênio insuportável ou de mau caráter. Se deixar agir a sua intuição, a sua escolha será correta, pois você compreende muito bem as motivações das pessoas e, em via de regra, escolherá alguém cujos interesses combinem com os seus, encontrando então o companheiro ideal para toda a vida.";
        }
        else if (valor22 ==22 || valor22 ==4 ){
            numero ="         NÚMERO QUATRO \nVocê sentirá uma forte atração pelo casamento, devido à sua natureza emocional e afetiva, mas nem sempre terá a necessária discrição, e a sua escolha lhe poderá acarretar dificuldades. Seu caminho será ainda mais dificultado pela inveja e despeito de outras pessoas, e também por sua tendência de julgar excessivamente os outros pela aparência. No casamento, embora procure um parceiro ativo e dominador, poderá haver atritos conjugais, com certa freqüência, se houver muitas exigências de sua parte. Seu parceiro terá interesse pelo ocultismo, e poderá fazer com que você se interesse por sua superioridade  intelectual.";
        }
        else if (valor22 == 5){
            numero ="         NÚMERO CINCO  \nEste número acarreta viagens, mudanças e variedades. É quase certo que a pessoa se casará e se separará mais de uma vez, devido à inquietação e gosto pela mudança. Por outro lado, os dois cônjuges, mesmo separados, podem  e normalmente mantêm negócios juntos, pois existe uma tendência à amizade. Não costuma ser muito seletivo em seus relacionamentos, principalmente até os 25 anos e com isso vive trocando de parceiro constantemente, sempre à procura do “ideal”. Obstáculos e atrasos serão comuns na juventude, e o aconselhável é o casamento depois de trinta anos, e com uma pessoa da mesma idade ou até um pouco mais velha.";
        }
        else if (valor22 == 6){
            numero ="         NÚMERO SEIS \nNão sendo muito precoces, as pessoas possuidoras deste número, embora ardentes no íntimo, são tímidas e pouco expressivas. No entanto, experimentam, provocados pelo ardor interior, períodos de exaltação, e  se não houver cuidado, tais ardores poderão acarretar a formação de alianças de natureza não muito satisfatória que, se terminarem em casamento, podem provocar  infelicidade. É um número não muito forte, apresentando certa vacilação e variedade,  e as pessoas regidas por ele devem ter muito cuidado para não desejarem novas companhias capazes de prejudicarem o estado conjugal, em particular quando elas se encontram afastadas do outro cônjuge. Se o casamento ocorrer depois de 33  anos de idade, haverá mais esperança de seu sucesso e estabilidade.";
        }
        else if (valor22 == 7){
            numero ="         NÚMERO SETE \nAs pessoas regidas por este número são muitas vezes consideradas  namoradeiras e até volúveis.  Não é verdade.  Embora  não devam se casar muito jovens, ou seja, antes que o seu caráter e os seus gostos estejam bem pronunciados, quase sempre isso acontece e, em consequência, normalmente esses relacionamentos duram pouco. São tão ativas, quer mental, quer fisicamente, que a sua existência é muito variada e costumam conhecer um número muito maior de pessoas do que aqueles regidos pelos outros números, com exceção do cinco. Frequentemente se casa mais de uma vez, e têm muitos casos amorosos, sem que procure aventuras, principalmente durante a vigência do casamento. Haverá muitas separações de pessoas amadas, amigas, e até mesmo mortes prematuras de pessoas queridas. Em via de regra têm muita responsabilidade desde a juventude.";
        }
        else if (valor22 == 8){
            numero ="         NÚMERO OITO \nAs pessoas governadas por este número se casam para toda a vida, pois são sinceras e honradas, mas curiosamente, costumam ocorrer muitas vezes idílios desfeitos antes do casamento, por falta de sinceridade da outra parte. Se sofrer tal coisa, a pessoa pode custar a se recuperar e, se enviuvar depois de um casamento feliz, a pessoa regida por este número raramente se casa de novo. A religião e a filosofia desempenham um papel importante em sua vida e embora o impulso sexual seja forte, há um sentimento de escrúpulo que evita a indulgência com o sexo antes do casamento. O companheirismo  é uma questão de importância vital para essas pessoas e, como o namoro, geralmente conduzido com muito critério e bom senso, o desempenho de atividades conjuntas, fará feliz e duradouro o casamento.";
        }
        else if (valor22 == 9){
            numero ="         NÚMERO NOVE \nO casamento será a aspiração suprema e constante, e você a ele sacrificará todos os seus pensamentos, esperanças e aspirações, desde muito jovem. Na juventude, a tendência é de gostar e até namorar com pessoas bem mais velhas do que você, o que poderá lhe acarretar alguns problemas, particularmente quando, com o correr dos tempos, você passe a se interessar por pessoas mais jovens. Deve  tomar cuidado para que os seus objetivos e atividades profissionais sejam compatíveis com os do seu cônjuge, pois, do contrário, terá muitas decepções e aborrecimentos.";
        }

        edtamor.setText(""+ler+numero);


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
