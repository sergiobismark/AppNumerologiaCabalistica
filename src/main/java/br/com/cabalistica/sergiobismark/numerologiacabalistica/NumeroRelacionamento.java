package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MultiAutoCompleteTextView;

public class NumeroRelacionamento extends AppCompatActivity {
    private MultiAutoCompleteTextView edtamor;
    private FloatingActionButton x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_relacionamento);


        edtamor = (MultiAutoCompleteTextView) findViewById(R.id.edtamor);


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

        String ler = "Números que “vibram” com o outro: é sinal de forte atração sexual (paixão) que pode, caso não se transforme em amor, levar à separação em  virtude de ciúmes exagerados, inconstância sexual, arrogância de um  ou  ambos os parceiros, etc. Orientação nesse sentido deve ser dada pelo numerólogo. \n\nNúmeros que se “atraem”: são totalmente compatíveis entre si e o amor e sexo se mesclam ardentemente. Tendem para a amabilidade, cordialidade,  delicadeza e compreensão mútuas. O relacionamento com esta característica tem tudo para ser bem sucedido, e se não o for, ou será por interferência de terceiros ou alteração sem análise do nome (assinatura) de um dos parceiros ou mesmo de ambos. \n\nNúmeros “passivos”: como o próprio nome sugere, não sofrem influências, sejam elas negativas ou positivas. Este tipo de relacionamento transforma os parceiros em “amigos”, em vez de “amantes”. Por vezes, em virtude de uma forte vibração de um dos parceiros, o relacionamento tende a dar certo por longo tempo, ou seja, quando um ama demasiadamente e o outro se mostra um tanto indiferente.  O mais normal é que nesta configuração o relacionamento  tem  tendência a se “arrastar” por toda a  vida, ou então até que apareça a um dos envolvidos “alguém” mais interessante. \n\nNúmeros “opostos” a outro: por incrível que possa parecer, este não é o pior dos relacionamentos, quando os envolvidos tem consciência do  fato e são  intelectualmente desenvolvidos. Para que dure “eternamente”,  ambos os parceiros devem usar a diplomacia constantemente e ceder (os dois) em muitos pontos, afim de impedir o fracasso dessa união. Jamais, em hipótese alguma, um deve querer adaptar o outro aos seus ideais ou desejos. Neste caso, a separação será inevitável e traumática para ambos. \n\n";
        String numero = "";


        if (valor22 == 1){
            numero = "NÚMERO 1:  \nVibra com: 9\nAtrai: 4 e 8\nÉ oposto: 6 e 7\nÉ passivo em relação a : 2, 3 e 5 ";
        }
        else if (valor22 ==11 || valor22 ==2 ){
            numero = "NÚMERO 2:   \nVibra com : 8\nAtrai: 7 e 9\nÉ oposto a: 5\nÉ passivo em relação a: 1, 3, 4 e 6 ";
        }
        else if (valor22 ==3 ){
            numero ="NÚMERO 3:    \nVibra com: 7\nAtrai: 5, 6 e 9\nÉ oposto a: 4 e 8\nÉ passivo em relação a : 1 e 2 ";
        }
        else if (valor22 ==22 || valor22 ==4 ){
            numero ="NÚMERO 4:    \nVibra com: 6\nAtrai: 1 e 8\nÉ oposto a: 3 e 5\nÉ passivo em relação a: 2, 7 e 9 ";
        }
        else if (valor22 == 5){
            numero ="NÚMERO 5:    \nVibra com: 5\nAtrai: 3 e 9\nÉ oposto a: 2 e 4; profundamente oposto a 6\nÉ passivo em relação a: 1, 7 e 8 ";
        }
        else if (valor22 == 6){
            numero ="NÚMERO 6:     \nVibra com: 4\nAtrai: 3, 7 e 9\nÉ oposto a:  1 e 8;  profundamente  oposto a 5\nÉ passivo em relação a: 2  ";
        }
        else if (valor22 == 7){
            numero ="NÚMERO 7:      \nVibra com: 3\nAtrai: 2 e 6\nÉ oposto a: 1 e 9\nÉ passivo em relação a: 4,5 e 8 ";
        }
        else if (valor22 == 8){
            numero ="NÚMERO 8:      \nVibra com: 2\nAtrai: 1 e 4\nÉ oposto a: 3 e 6\nÉ passivo em relação a : 5,7 e 9 .";
        }
        else if (valor22 == 9){
            numero ="NÚMERO 9:      \nVibra com: 1\nAtrai: 2, 3, 5 e 6\nÉ oposto a: 7\nÉ passivo em relação a: 4 e 8";
        }

        edtamor.setText(""+ler+numero);



    }
}
