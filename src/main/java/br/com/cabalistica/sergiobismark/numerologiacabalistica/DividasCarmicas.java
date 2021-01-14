package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class DividasCarmicas extends AppCompatActivity {
    private MultiAutoCompleteTextView edtcarmicas;
    private FloatingActionButton x1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(DividasCarmicas.this, Missao.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividas_carmicas);


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

        String ler = "Quando o ser humano transgride certas Leis Naturais, está sujeito à penalidade que a Natureza lhe aplicará, seja nesta ou em outra existência. São transgressões, normalmente conscientes contra a vida de outras pessoas, ou contra a própria vida, que ferem o preceito da Lei da causa e do efeito.\n";
        String numero = "";

        if (valor23.contains("13")){
            numero += "\n\nDÍVIDA CÁRMICA – 13 = Esta Dívida representa a morte em todas as suas concepções. Com absoluta certeza, em vidas passadas cometeu transgressões às Leis Naturais, tais como:\n a- foi suicida, ou \nb- foi assassino(a), ou \nc- foi passivo(a) e negligente com a própria vida, ou ,\nd- com a vida alheia, ou \ne- por vícios apressou a própria morte. \nUma coisa é certa: qualquer que tenha sido o caso ou os casos, os mesmos foram cometidos conscientemente, não sofrendo, em absoluto, qualquer influência externa. Nesta existência, em virtude dessas transgressões, pode se tornar preguiçoso, indiferente ao que acontece à sua volta e tender para a crítica, seja ela de cunho pessoal, político ou existencial. Elimina-se esta crucial Dívida Cármica “trabalhando”; trabalhando duro em qualquer atividade profissional. Durante sua existência muito lhe será exigido e terá de lutar contra as adversidades da vida, administrar bens (seus e alheios), as más atitudes (suas e alheias) e contra o descontentamento e, desta maneira, além de “pagar a Dívida”, terá menos problemas financeiros ao longo da vida.";
        }
        if (valor23.contains("14")){
            numero += "\n\nDÍVIDA CÁRMICA – 14 = É a Dívida que trata dos bens materiais. O ser humano com esta Dívida Cármica terá ao longo da sua existência ou até que aprenda a “lição”, inúmeras atribulações: troca constante de emprego, de residência, perda de bens: móveis ou imóveis e negócios fracassados.  Em vidas passadas, locupletou-se financeiramente em detrimento de outras pessoas, ou seja, para subir na vida, agiu fraudulentamente, prejudicando sócios, amigos e companheiros de jornada, arruinando-os e levando-os à miséria, à desgraça e à destruição moral. Nesta existência, terá de arcar com o peso de todos esses crimes hediondos, causados pela ambição desmedida e total inconseqüência dos fatos. Tais crimes, até serem completamente “pagos”, lhe trarão sérios aborrecimentos nesta existência e certas perturbações, tais como, desapontamentos com amigos, sócios, familiares e também muitos obstáculos que se interporão aos seus objetivos. Tais desacertos na vida passada deve-se à sua total falta de compreensão e ambição desmedida. Ainda agora, ou seja, nesta vida atual, caso não seja espiritualmente desenvolvido, pode cometer os mesmos delitos e, assim, ter de passar pelos mesmos sacrifícios. A principal “lição” a aprender nesta vida é o desapego. Não se apegue a nada nem a ninguém e cultive a compreensão até às últimas consequências. Somente desta maneira, compreendendo o seu semelhante e desapegando-se de tudo e de todos, conseguirá desenvolver a humildade suficiente, o amor e a compaixão para resgatar essa tão triste e cruel Dívida Cármica.";
        }
        if (valor23.contains("16")) {
            numero += "\n\nDÍVIDA CÁRMICA – 16 = Esta Dívida Cármica é a manifestação do orgulho, do autoritarismo, da traição e da vaidade. Com absoluta certeza em vidas passadas você viveu exclusivamente para seu deleite (bem estar), pouco se importando com o direito ou sentimento do próximo, subjugando todos e agindo com desmedido autoritarismo, frieza e até violência. Nesta existência, em virtude dessas “faltas”, deverá sofrer vários contratempos ou até algumas calamidades, tais como: acidentes os mais diversos, decepções com amigos, colegas de trabalho, parentes, cônjuge (namorado ou companheiro), fracasso nos negócios e também problemas com a justiça. Este Carma ainda carrega o peso de traições conjugais, crimes passionais e uniões ilegítimas. Além dos contratempos acima citados, poderá passar por momentos muito angustiantes nesta existência, como trabalhar e não conseguir atingir os objetivos, perder a fortuna ou o poder, além de ser traído pelos que ama e confia.  Para eliminar este Carma, deve ser compreensivo, justo e solidário com seu semelhante. Deve andar na mais perfeita retidão e não se desviar deste caminho, sob pena de continuar indefinidamente sofrendo dos mesmos males.";
        }
        if (valor23.contains("19")) {
            numero += "\n\nDÍVIDA CÁRMICA – 19 = É o número do “equilíbrio”. Como sabemos, a lei da Causa e Efeito é perfeita e aqueles que a transgridem com absoluta certeza pagarão caro por essa transgressão. Em vidas passadas você agiu contrário a essa Lei e, agora, deve pagar o preço da iniquidade ou então repor aquilo que tirou aos outros.  Mais claramente, você se locupletou financeiramente e socialmente, usando de artifícios fraudulentos, prejudicando pessoas e até fazendo que sofressem por sua causa, ou seja, levando culpas que deveriam ser imputadas a você, como serem aprisionados, terem seus bens confiscados e se verem desonrados por sua causa. Mais ainda, ganhou notoriedade e premiações que em absoluto lhe eram de direito, e sim de outrem. Nesta existência, poderá ter segredos desvendados, ser traído por sócios e companheiros e, principalmente, ter de conviver com o sucesso e fracasso contínuos, até que aprenda a lição que é a que só colhemos aquilo que semearmos. Basicamente, é o aviso para que não seja dominador, orgulhoso, egoísta, autoritário e exerça a tolerância em tudo e com todos. Elimina-se esta Dívida Cármica levando uma vida reta e elevada, altruísta, carregada de amor, afeto, bondade e voltada para o bem estar de toda a humanidade. Agindo desta maneira, ou seja, plantando bem e cuidando da horta, a colheita será farta de sucesso e prosperidade. ";
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
