package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class MomentosDecisivos extends AppCompatActivity {
    private MultiAutoCompleteTextView edtmomentos;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(MomentosDecisivos.this, RelacoesIntervalores.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momentos_decisivos);

        edtmomentos = (MultiAutoCompleteTextView) findViewById(R.id.edtmomentos);

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

        String ler = "Descrevem certos eventos que podem ocorrer num dado Ciclo de Vida. Existem 4 Momentos Decisivos e só é possível tirar proveito dos mesmos, quando o respectivo Ciclo de Vida estiver vibrando. Eles indicam qual será a atitude de um indivíduo em relação à sua vida num determinado momento. \n1º Desafio: "+valor12 +" - Início de vida até "+valor8+"\n2º Desafio: "+valor13+" - "+valor8+" até "+valor16+"\n3º Desafio: "+valor14+" - "+valor16+" até "+valor17+"\n4º Desafio: "+valor15+" - "+valor17+" até o resto da vida.\n\n";
        String numero = "";

        if (valor12 ==1 || valor13 ==1 || valor14 ==1 || valor15 ==1 ){
            numero += "\n MOMENTO DECISIVO 1 - Não é um período fácil; exige coragem, determinação e muita força de vontade. É o  momento propício para se “cultivar” a individualidade, a independência e a engenhosidade. Inúmeros acasos e situações inesperadas forçarão a pessoa a enfrentar a vida pensando e agindo por si mesma. Um Momento Decisivo 1 no primeiro  Ciclo de Vida, indica uma criança agitada, voluntariosa e por vezes complicada, que será difícil controlar e compreender.\n";
        }
        if (valor12 ==2 || valor13 ==2 || valor14 ==2 || valor15 ==2 ){
            numero += "\n MOMENTO DECISIVO 2 - Traz consigo a oportunidade para “cultivar” o tato e a compreensão. Se for amigo, companheiro e atencioso com seus semelhantes, este será um período de amizades sinceras e de relacionamentos duradouros. Excelente fase para se contrair matrimônio. Se for impaciente e  desatencioso, poderá ser uma fase de relacionamentos difíceis,  de grandes incompreensões, brigas, discussões, em que você poderá causar graves prejuízos às pessoas que o cercam. Um Momento Decisivo 2 no primeiro Ciclo de Vida,  é indício de uma “mãe” forte e dominadora, ou pai ausente (por motivo de trabalho, morte ou separação). A criança, nesse caso, pode se tornar excessivamente sensível e ter reflexos dessa sensibilidade na juventude e adolescência, obstruindo dessa maneira, as possibilidades de progresso.\n";
        }
        if (valor12 ==3 || valor13 ==3 || valor14 ==3 || valor15 ==3 ){
            numero += "\n MOMENTO DECISIVO 3 - É o momento de expandir a vida social e “cultivar” os próprios talentos. Trata-se de uma fase apropriada para a auto-expressão, novas amizades, romance e fertilidade. A manifestação descuidada das emoções poderá ter consequências desagradáveis, pois existe, nesse estado, tendência ao desmando: vícios, brigas, discórdias. Cuidado com os  “amigos”,  pois  apesar  de  serem  necessários, por vezes são  más companhias. Um Momento Decisivo 3 no primeiro Ciclo de Vida, geralmente indica uma criança com dificuldade de se adaptar aos estudos. Indica, também, oportunidades artísticas que se não alimentadas e direcionadas  condizentemente, poderão ser desperdiçadas, fazendo com que a pessoa já adulta venha a se lamentar dessa negligência dos pais ou educadores.\n";
        }
        if (valor12 ==4 || valor13 ==4 || valor14 ==4 || valor15 ==4 ){
            numero += "\n MOMENTO DECISIVO 4 - Este Momento Decisivo traz a oportunidade de se construir um sólido alicerce  para o futuro. É um período de trabalho duro e até de algumas restrições e é necessário “cultivar” a paciência e os bons hábitos de trabalho. Neste período, poderá haver alguns problemas econômicos, que serão superados com inteligência, trabalho e dedicação ao projeto final. A família e os parentes por afinidade podem se transformar num peso e a pessoa terá de ajudá-los, tanto financeiramente, como prestando ajuda humanitária, em uma doença, por exemplo. As recompensas sempre aparecem a partir da aplicação dos preceitos corretos de vida e do esforço para se obter os resultados positivos. Um Momento Decisivo 4  no primeiro Ciclo de Vida, frequentemente indica que a pessoa poderá começar a trabalhar muito nova e a assumir grandes responsabilidades ainda na juventude.\n";
        }
        if (valor12 ==5 || valor13 ==5 || valor14 ==5 || valor15 ==5 ){
            numero += "\n MOMENTO DECISIVO 5 - Traz oportunidades para viagens, para experimentar novas sensações, novos empreendimentos e para se livrar de tudo que está obsoleto ou que já não nos faz falta. É uma fase de liberdade, de mudanças e de desenvolvimento pessoal, principalmente se vier após um Momento decisivo 4 ou 6. Um Momento Decisivo 5 no primeiro Ciclo de Vida, indica uma criança ousada, inquieta, esperta e pouco constante. Geralmente empreende mudanças súbitas, ora gostando disto, ora daquilo, sem esperar as recompensas resultantes de um esforço ou trabalho empreendido.\n";
        }
        if (valor12 ==6 || valor13 ==6 || valor14 ==6 || valor15 ==6 ){
            numero += "\n MOMENTO DECISIVO 6 - É o momento dos ajustes e das responsabilidades familiares. Caso tenha consciência disso, este é o Momento de grande afetividade, de amor e de felicidade doméstica, além de sucesso e segurança material. Do contrário, ou seja, caso seja dispersivo ou inconstante, poderá ser um período de desgostos, discussões, brigas e graves problemas domésticos e até indício de separação. Um Momento Decisivo 6 no primeiro Ciclo de Vida, geralmente indica casamento precoce ou a responsabilidade de tomar conta dos pais ou de algum familiar. Quando o 6 for o último Momento Decisivo, ele poderá trazer o reconhecimento do trabalho já feito. Caso a pessoa esteja solteira, este Momento trará a oportunidade para um novo amor e para o materialismo.\n";
        }
        if (valor12 ==7 || valor13 ==7 || valor14 ==7 || valor15 ==7 ){
            numero += "\n MOMENTO DECISIVO 7 - É uma fase de introspecção, de meditação e estudo do significado último da vida. Caso não esteja casado, desaconselhamos o matrimônio nesta fase. Velhos relacionamentos que não produzem mais frutos, podem e devem ser deixados para trás. A pessoa normalmente sente vontade de se retirar para dentro de si mesma, o que de certa forma poderá causar problemas de relacionamento, tanto a nível pessoal como familiar. Um  Momento Decisivo 7 no primeiro Ciclo de Vida, nos indica uma criança retraída, solitária, pensativa e muito estudiosa. Quando os pais são excessivamente rígidos e severos, a criança poderá, pela regressão de suas idéias e projetos, contrair algum tipo de doença psicossomática ou mesmo depressão, ser temperamental e desenvolver algum tipo de  complexo\n";
        }
        if (valor12 ==8 || valor13 ==8 || valor14 ==8 || valor15 ==8 ){
            numero += "\n MOMENTO DECISIVO 8 - É um período  de grandes realizações no mundo dos negócios. As despesas são altas, não obstante, é uma excelente fase para se correr atrás dos objetivos, de conquistar poder, fama e sucesso material. Com dedicação, estudo e trabalho sistemático, com objetivo definido e com colaboradores aptos e interessados, a pessoa dificilmente deixa de conseguir tudo o que deseja. Um Momento Decisivo 8 no primeiro Ciclo de Vida, indica que a pessoa começará ainda jovem a se dedicar aos negócios, a trabalhar para se sustentar e também sustentar algum membro da família.\n";
        }
        if (valor12 ==9 || valor13 ==9 || valor14 ==9 || valor15 ==9 ){
            numero += "\n MOMENTO DECISIVO 9 - Traz a oportunidade para se “cultivar” o amor, a solidariedade, o altruísmo e para se viajar para o exterior. Poderá haver algum tipo de perda e até desapontamentos, principalmente entre amigos. Um bom investimento para o consulente é fazer obras humanitárias durante este período, pois os frutos dessa plantação são certos, e o sucesso e a fama se farão presentes. Um Momento Decisivo 9 no primeiro Ciclo de Vida, normalmente não é dos mais afortunados, pois quase sempre a criança é incompreendida por colegas,  amigos e até familiares, que por causa dessa incompreensão exigem muito e retribuem pouco, o que faz com que o jovem se retraia e fique tímido e introspectivo.\n";
        }
        if (valor12 ==11 || valor13 ==11 || valor14 ==11 || valor15 ==11 ){
            numero += "\n MOMENTO DECISIVO 11 - Por ser um número altamente espiritual e elevado, a pessoa nesse período sente-se tensa e muito nervosa. É uma excelente fase para estudar esoterismo, espiritualismo e expandir seus horizontes. Este momento traz inspiração, iluminação e, quase sempre, fama e prestígio nacional e até internacional. Não faça nada nem diga por trás o que não teria coragem de dizer ou fazer na frente das pessoas. \n";
        }
        if (valor12 ==22 || valor13 ==22 || valor14 ==22 || valor15 ==22 ){
            numero += "\n MOMENTO DECISIVO 22 - É, sem dúvida alguma, o número e o Momento mais pode-roso. A pessoa fica altamente criativa e neste estado tornam-se possíveis todas as realizações. É uma fase de interesses pelos problemas mundiais e de grande expansão da consciência.\n";
        }


        edtmomentos.setText(""+ler+numero);



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
