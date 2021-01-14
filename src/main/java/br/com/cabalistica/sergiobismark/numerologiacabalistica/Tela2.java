package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    private TextView txtnome;
    private TextView txtmotivacao;
    private TextView txtimpressao;
    private TextView txtexpressao;
    private TextView txtlicoescarmicas;
    private TextView txttedencisocultas;
    private TextView txtsubconsciente;
    private TextView txtciclosum;
    private TextView txttempocicloum;
    private TextView txtciclosdois;
    private TextView txttempociclodois;
    private TextView txtciclostres;
    private TextView txttempociclotres;
    private TextView txtmomentoum;
    private TextView txtdecisivosum;
    private TextView txtmomentodois;
    private TextView txtdecisivosdois;
    private TextView txtmomentotres;
    private TextView txtdecisivostres;
    private TextView txtmomentoquatro;
    private TextView txtdecisivosquatro;
    private TextView txtdesafioum;
    private TextView txtdesafiodois;
    private TextView txtdesafiopincipal;
    private TextView txtdestino;
    private TextView txtmissao;
    private TextView txtdividascar;
    private TextView txtrelacaointe;
    private TextView txtdiasmesfavo;
    private TextView txtcores;
    private TextView txtvibraum;
    private TextView txtvibradois;
    private TextView txtvibratres;
    private TextView txtvibraquatro;
    private TextView txtnumeroamor;
    private TextView txtnumeroharmonico1;
    private TextView txtnumeroharmonico2;
    private TextView txtnumeroharmonico3;
    private TextView txtnumeroharmonico4;
    private TextView txtanopessoal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(Tela2.this, InicioNumerologia.class);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);

            }
        });


        txtnome = (TextView) findViewById(R.id.txtnome);
        txtmotivacao = (TextView) findViewById(R.id.txtmotivacao);
        txtimpressao = (TextView) findViewById(R.id.txtimpressao);
        txtexpressao = (TextView) findViewById(R.id.txtexpressao);
        txtlicoescarmicas = (TextView) findViewById(R.id.txtlicoescarmicas);
        txttedencisocultas = (TextView) findViewById(R.id.txttedencisocultas);
        txtsubconsciente = (TextView) findViewById(R.id.txtsubconsciente);
        txtciclosum = (TextView) findViewById(R.id.txtciclosum);
        txttempocicloum = (TextView) findViewById(R.id.txttempocicloum);
        txtciclosdois = (TextView) findViewById(R.id.txtciclosdois);
        txttempociclodois = (TextView) findViewById(R.id.txttempociclodois);
        txtciclostres = (TextView) findViewById(R.id.txtciclostres);
        txttempociclotres = (TextView) findViewById(R.id.txttempociclotres);
        txtmomentoum = (TextView) findViewById(R.id.txtmomentoum);
        txtdecisivosum = (TextView) findViewById(R.id.txtdecisivosum);
        txtmomentodois = (TextView) findViewById(R.id.txtmomentodois);
        txtdecisivosdois = (TextView) findViewById(R.id.txtdecisivosdois);
        txtmomentotres = (TextView) findViewById(R.id.txtmomentotres);
        txtdecisivostres = (TextView) findViewById(R.id.txtdecisivostres);
        txtmomentoquatro = (TextView) findViewById(R.id.txtmomentoquatro);
        txtdecisivosquatro = (TextView) findViewById(R.id.txtdecisivosquatro);
        txtdesafioum = (TextView) findViewById(R.id.txtdesafioum);
        txtdesafiodois = (TextView) findViewById(R.id.txtdesafiodois);
        txtdesafiopincipal = (TextView) findViewById(R.id.txtdesafiopincipal);
        txtdestino = (TextView) findViewById(R.id.txtdestino);
        txtmissao = (TextView) findViewById(R.id.txtmissao);
        txtdividascar = (TextView) findViewById(R.id.txtdividascar);
        txtrelacaointe = (TextView) findViewById(R.id.txtrelacaointe);
        txtdiasmesfavo = (TextView) findViewById(R.id.txtdiasmesfavo);
        txtcores = (TextView) findViewById(R.id.txtcores);
        txtvibraum = (TextView) findViewById(R.id.txtvibraum);
        txtvibradois = (TextView) findViewById(R.id.txtvibradois);
        txtvibratres = (TextView) findViewById(R.id.txtvibratres);
        txtvibraquatro = (TextView) findViewById(R.id.txtvibraquatro);
        txtnumeroamor = (TextView) findViewById(R.id.txtnumeroamor);
        txtnumeroharmonico1 = (TextView) findViewById(R.id.txtnumeroharmonico1);
        txtnumeroharmonico2 = (TextView) findViewById(R.id.txtnumeroharmonico2);
        txtnumeroharmonico3 = (TextView) findViewById(R.id.txtnumeroharmonico3);
        txtnumeroharmonico4 = (TextView) findViewById(R.id.txtnumeroharmonico4);
        txtanopessoal = (TextView) findViewById(R.id.txtanopessoal);

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

        String cores = "";
        if (valor3 == 1){
            cores = "todos os tons de amarelo e laranja, castanho, dourado, verde, creme e branco.";
        }
        else if (valor3 == 2){
            cores = " todos os tons de verde, creme, branco e cinza. ";
        }
        else if (valor3 == 3){
            cores = "violeta, vinho, púrpura e vermelha.";
        }
        else if (valor3 == 4){
            cores = "azul, cinza, púrpura e ouro. ";
        }
        else if (valor3 == 5 ){
            cores = "todas as cores claras, cinza e prateado.";
        }
        else if (valor3 == 6){
            cores = "rosa, azul e verde. ";
        }
        else if (valor3 == 7){
            cores = "verde, amarelo, branco, cinza e azul-claro. ";
        }
        else if (valor3 == 8){
            cores = "púrpura, cinza, azul, preto e castanho.";
        }
        else if (valor3 == 9){
            cores = "vermelho, rosa, coral e vinho. ";
        }
        else if (valor3 == 11){
            cores = "branco, violeta e cores claras. ";
        }
        else if (valor3 == 22){
            cores = "violeta, branco e cores claras";
        }
        else {
            cores = "sem cores, caio na crise";
        }

        int vibracom = 0;
        String atrai = "";
        String oposto = "";
        String passivo = "";
        int numeroamor = 0;

        if(valor22 == 1){
            numeroamor = 1;
            vibracom = 9;
            atrai = "4 e 8";
            oposto = "6 e 7";
            passivo = "2,3 e 5";

        }
        else if (valor22 == 11|| valor22 == 2){
            numeroamor = 2;
            vibracom = 8;
            atrai = "7 e 9";
            oposto = "5";
            passivo = "1,3,4 e 6";
        }
        else if (valor22 == 3){
            numeroamor = 3;
                    vibracom = 7;
            atrai = "5,6 e 9";
            oposto = "4 e 8";
            passivo = "1 e 2";
        }
        else if (valor22 == 22|| valor22 == 4){
            numeroamor = 4;
                    vibracom = 6;
            atrai = "1 e 8";
            oposto = "3 e 5";
            passivo = "2,7 e 9";
        }
        else if (valor22 == 5){
            numeroamor = 5;
                    vibracom = 5;
            atrai = "3 e 9";
            oposto = "2 e 4; profundamente oposto a: 6";
            passivo = "1,7 e 8";
        }
        else if (valor22 == 6){
            numeroamor = 6;
                    vibracom = 4;
            atrai = "3,7 e 9";
            oposto = "1 e 8; profundamente oposto a: 5";
            passivo = "2";
        }
        else if (valor22 == 7){
            numeroamor = 7;
                    vibracom = 3;
            atrai = "2 e 6";
            oposto = "1 e 9";
            passivo = "4,5 e 8";
        }
        else if (valor22 == 8){
            numeroamor = 8;
                    vibracom = 2;
            atrai = "1 e 4";
            oposto = "3 e 6";
            passivo = "5,7 e 9";
        }
        else if (valor22 == 9){
            numeroamor = 9;
                    vibracom = 1;
            atrai = "2,3,5 e 6";
            oposto = "7";
            passivo = "4 e 8";
        }
        else {
            oposto = "deu ruim;";
        }
        int nharmonico = 0;
        String harmonizam = "";
        String neutro = "";
        String incompativel = "";

        if (valor25 == 1){
            nharmonico =1;
             harmonizam = "2, 4 e 9";
             neutro = "1, 5, 6 e 8";
             incompativel = "3 e 7";
        }
        else if (valor25 == 2){
            nharmonico = 2;
            harmonizam = "1,2,3,4,5,6,7,8 e 9";
            neutro = "xxxxxxxxx";
            incompativel = "xxxxxxxxx";
        }
        else if (valor25 == 3){
            nharmonico = 3;
            harmonizam = " 2,3,6,8 e 9";
            neutro = "7 e 4";
            incompativel = "1 e 5";
        }
        else if (valor25 == 4){
            nharmonico = 4;
            harmonizam = "1,2,6 e 7";
            neutro = "3,5 e 9";
            incompativel = "4 e 8";
        }
        else if (valor25 == 5){
            nharmonico = 5;
            harmonizam = "2,5,6,7 e 9 ";
            neutro = "1 e 4";
            incompativel = "3 e 8";
        }
        else if (valor25 == 6){
            nharmonico = 6;
            harmonizam = "1";
            neutro = "2,3,4,5,6 e 9";
            incompativel = "7 e 8";
        }
        else if (valor25 == 7){
            nharmonico = 7;
            harmonizam = "2,4,5, e 7";
            neutro = "3 e 9";
            incompativel = "1,6 e 8";
        }
        else if (valor25 == 8){
            nharmonico = 8;
            harmonizam = "2,3 e 9 ";
            neutro = "1 e 6";
            incompativel = "4,5,7 e 8";
        }
        else if (valor25 == 9){
            nharmonico = 9;
            harmonizam = "1,2,3,5,6,8 e 9";
            neutro = "4 e 7";
            incompativel = "xxxxxxxxx";
        }



        txtnome.setText(""+nomecompleto);
        txtmotivacao.setText(""+valor1);
        txtimpressao.setText(""+valor2);
        txtexpressao.setText(""+valor3);
        txtlicoescarmicas.setText(""+valor4);
        txttedencisocultas.setText(""+valor5);
        txtsubconsciente.setText(""+valor6);
        txtciclosum.setText(""+valor7);
        txttempocicloum.setText("Até:"+valor8);
        txtciclosdois.setText(""+valor9);
        txttempociclodois.setText("Até:"+valor10);
        txtciclostres.setText(""+valor11);
        txtmomentoum.setText(""+valor12);
        txtmomentodois.setText(""+valor13);
        txtmomentotres.setText(""+valor14);
        txtmomentoquatro.setText(""+valor15);
        txtdecisivosdois.setText("Até:"+valor16);
        txtdecisivostres.setText("Até:"+valor17);
        txtdesafioum.setText(""+valor18);
        txtdesafiodois.setText(""+valor19);
        txtdesafiopincipal.setText(""+valor20);
        txtdestino.setText(""+valor21);
        txtmissao.setText(""+valor22);
        txtdividascar.setText(""+valor23);
        txtdecisivosum.setText("Até:"+valor8);
        txtdiasmesfavo.setText(""+valor24);
        txtcores.setText(""+cores);
        txtvibraum.setText(""+vibracom);
        txtvibradois.setText(""+atrai);
        txtvibratres.setText(""+oposto);
        txtvibraquatro.setText(""+passivo);
        txtnumeroamor.setText(""+numeroamor);
        txtnumeroharmonico1.setText(""+nharmonico);
        txtnumeroharmonico2.setText(""+harmonizam);
        txtnumeroharmonico3.setText(""+neutro);
        txtnumeroharmonico4.setText(""+incompativel);
        txtanopessoal.setText(""+valor26);
        txtrelacaointe.setText(""+valor27);

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