package br.com.cabalistica.sergiobismark.numerologiacabalistica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText edtum;
    private EditText edtdois;
    private EditText edttreis;
    private EditText edtquatro;
    private EditText edtcinco;
    private EditText edtseis;
    private EditText edtsete;
    private EditText edtdia;
    private EditText edtmes;
    private EditText edtano;
    private EditText txtanopessoal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Tela2.class);


                String valor1 = edtum.getText().toString();
                String valor2 = edtdois.getText().toString();
                String valor3 = edttreis.getText().toString();
                String valor4 = edtquatro.getText().toString();
                String valor5 = edtcinco.getText().toString();
                String valor6 = edtseis.getText().toString();
                String valor7 = edtsete.getText().toString();
                String datadia = edtdia.getText().toString();
                String datames = edtmes.getText().toString();
                String datano = edtano.getText().toString();
                String anopessoal = txtanopessoal.getText().toString();

                String datadestino = "";
                String letras = "";
                String cons = "";
                String vogal = "";

                if (!valor1.equals("") && !datadia.equals("") && !datames.equals("") && !datano.equals("") && !anopessoal.equals("")) {
                    char[] nome1 = valor1.toCharArray();
                    char[] nome2 = valor2.toCharArray();
                    char[] nome3 = valor3.toCharArray();
                    char[] nome4 = valor4.toCharArray();
                    char[] nome5 = valor5.toCharArray();
                    char[] nome6 = valor6.toCharArray();
                    char[] nome7 = valor7.toCharArray();
                    char[] datad = datadia.toCharArray();
                    char[] datam = datames.toCharArray();
                    char[] dataa = datano.toCharArray();

                    String intervalores = "";
                    /* Nome 1*/
                    for (int i = 0; i < nome1.length; i++) {

                        String s2 = Character.toString(nome1[i]);
                        s2 = s2.toLowerCase();
                        if (s2.equals("q") || s2.equals("j")) {
                            cons += "1";
                            letras += "1";
                        } else if (s2.equals("a") || s2.equals("à") || s2.equals("i") || s2.equals("õ") || s2.equals("è") || s2.equals("ì") || s2.equals("y")) {
                            vogal += "1";
                            letras += "1";
                        } else if (s2.equals("b") || s2.equals("k") || s2.equals("r")) {
                            cons += "2";
                            letras += "2";
                        } else if (s2.equals("á") || s2.equals("í") || s2.equals("ù") || s2.equals("ê")) {
                            vogal += "3";
                            letras += "3";
                        } else if (s2.equals("c") || s2.equals("g") || s2.equals("l") || s2.equals("s")) {
                            cons += "3";
                            letras += "3";
                        } else if (s2.equals("d") || s2.equals("m") || s2.equals("t")) {
                            cons += "4";
                            letras += "4";
                        } else if (s2.equals("û") || s2.equals("ã")) {
                            vogal += "4";
                            letras += "4";
                        } else if (s2.equals("h") || s2.equals("n")) {
                            cons += "5";
                            letras += "5";
                        } else if (s2.equals("ô") || s2.equals("e") || s2.equals("ò")) {
                            vogal += "5";
                            letras += "5";
                        } else if (s2.equals("v") || s2.equals("w") || s2.equals("x") || s2.equals("ç")) {
                            cons += "6";
                            letras += "6";
                        } else if (s2.equals("u")) {
                            vogal += "6";
                            letras += "6";
                        } else if (s2.equals("z")) {
                            cons += "7";
                            letras += "7";
                        } else if (s2.equals("o") || s2.equals("é")) {
                            vogal += "7";
                            letras += "7";
                        } else if (s2.equals("f") || s2.equals("p")) {
                            cons += "8";
                            letras += "8";
                        } else if (s2.equals("î") || s2.equals("â") || s2.equals("ú")) {
                            vogal += "8";
                            letras += "8";
                        } else if (s2.equals("ó")) {
                            vogal += "9";
                            letras += "9";
                        } else {
                            Log.v("Script", "Caio no final do IF's 1");
                        }
                    }
                    intervalores = letras;
                    Log.v("Script", "Pimeiro Teste: " + intervalores);


                /* Nome 2*/

                    for (int i = 0; i < nome2.length; i++) {

                        String s2 = Character.toString(nome2[i]);
                        s2 = s2.toLowerCase();
                        if (s2.equals("q") || s2.equals("j")) {
                            cons += "1";
                            letras += "1";
                        } else if (s2.equals("a") || s2.equals("à") || s2.equals("i") || s2.equals("õ") || s2.equals("è") || s2.equals("ì") || s2.equals("y")) {
                            vogal += "1";
                            letras += "1";
                        } else if (s2.equals("b") || s2.equals("k") || s2.equals("r")) {
                            cons += "2";
                            letras += "2";
                        } else if (s2.equals("á") || s2.equals("í") || s2.equals("ù") || s2.equals("ê")) {
                            vogal += "3";
                            letras += "3";
                        } else if (s2.equals("c") || s2.equals("g") || s2.equals("l") || s2.equals("s")) {
                            cons += "3";
                            letras += "3";
                        } else if (s2.equals("d") || s2.equals("m") || s2.equals("t")) {
                            cons += "4";
                            letras += "4";
                        } else if (s2.equals("û") || s2.equals("ã")) {
                            vogal += "4";
                            letras += "4";
                        } else if (s2.equals("h") || s2.equals("n")) {
                            cons += "5";
                            letras += "5";
                        } else if (s2.equals("ô") || s2.equals("e") || s2.equals("ò")) {
                            vogal += "5";
                            letras += "5";
                        } else if (s2.equals("v") || s2.equals("w") || s2.equals("x") || s2.equals("ç")) {
                            cons += "6";
                            letras += "6";
                        } else if (s2.equals("u")) {
                            vogal += "6";
                            letras += "6";
                        } else if (s2.equals("z")) {
                            cons += "7";
                            letras += "7";
                        } else if (s2.equals("o") || s2.equals("é")) {
                            vogal += "7";
                            letras += "7";
                        } else if (s2.equals("f") || s2.equals("p")) {
                            cons += "8";
                            letras += "8";
                        } else if (s2.equals("î") || s2.equals("â") || s2.equals("ú")) {
                            vogal += "8";
                            letras += "8";
                        } else if (s2.equals("ó")) {
                            vogal += "9";
                            letras += "9";
                        } else {
                            Log.v("Script", "Caio no final do IF's 1");
                        }
                    }

                    /* Nome 3*/

                    for (int i = 0; i < nome3.length; i++) {

                        String s2 = Character.toString(nome3[i]);
                        s2 = s2.toLowerCase();
                        if (s2.equals("q") || s2.equals("j")) {
                            cons += "1";
                            letras += "1";
                        } else if (s2.equals("a") || s2.equals("à") || s2.equals("i") || s2.equals("õ") || s2.equals("è") || s2.equals("ì") || s2.equals("y")) {
                            vogal += "1";
                            letras += "1";
                        } else if (s2.equals("b") || s2.equals("k") || s2.equals("r")) {
                            cons += "2";
                            letras += "2";
                        } else if (s2.equals("á") || s2.equals("í") || s2.equals("ù") || s2.equals("ê")) {
                            vogal += "3";
                            letras += "3";
                        } else if (s2.equals("c") || s2.equals("g") || s2.equals("l") || s2.equals("s")) {
                            cons += "3";
                            letras += "3";
                        } else if (s2.equals("d") || s2.equals("m") || s2.equals("t")) {
                            cons += "4";
                            letras += "4";
                        } else if (s2.equals("û") || s2.equals("ã")) {
                            vogal += "4";
                            letras += "4";
                        } else if (s2.equals("h") || s2.equals("n")) {
                            cons += "5";
                            letras += "5";
                        } else if (s2.equals("ô") || s2.equals("e") || s2.equals("ò")) {
                            vogal += "5";
                            letras += "5";
                        } else if (s2.equals("v") || s2.equals("w") || s2.equals("x") || s2.equals("ç")) {
                            cons += "6";
                            letras += "6";
                        } else if (s2.equals("u")) {
                            vogal += "6";
                            letras += "6";
                        } else if (s2.equals("z")) {
                            cons += "7";
                            letras += "7";
                        } else if (s2.equals("o") || s2.equals("é")) {
                            vogal += "7";
                            letras += "7";
                        } else if (s2.equals("f") || s2.equals("p")) {
                            cons += "8";
                            letras += "8";
                        } else if (s2.equals("î") || s2.equals("â") || s2.equals("ú")) {
                            vogal += "8";
                            letras += "8";
                        } else if (s2.equals("ó")) {
                            vogal += "9";
                            letras += "9";
                        } else {
                            Log.v("Script", "Caio no final do IF's 1");
                        }
                    }
                    /* Nome 4 */

                    for (int i = 0; i < nome4.length; i++) {

                        String s2 = Character.toString(nome4[i]);
                        s2 = s2.toLowerCase();
                        if (s2.equals("q") || s2.equals("j")) {
                            cons += "1";
                            letras += "1";
                        } else if (s2.equals("a") || s2.equals("à") || s2.equals("i") || s2.equals("õ") || s2.equals("è") || s2.equals("ì") || s2.equals("y")) {
                            vogal += "1";
                            letras += "1";
                        } else if (s2.equals("b") || s2.equals("k") || s2.equals("r")) {
                            cons += "2";
                            letras += "2";
                        } else if (s2.equals("á") || s2.equals("í") || s2.equals("ù") || s2.equals("ê")) {
                            vogal += "3";
                            letras += "3";
                        } else if (s2.equals("c") || s2.equals("g") || s2.equals("l") || s2.equals("s")) {
                            cons += "3";
                            letras += "3";
                        } else if (s2.equals("d") || s2.equals("m") || s2.equals("t")) {
                            cons += "4";
                            letras += "4";
                        } else if (s2.equals("û") || s2.equals("ã")) {
                            vogal += "4";
                            letras += "4";
                        } else if (s2.equals("h") || s2.equals("n")) {
                            cons += "5";
                            letras += "5";
                        } else if (s2.equals("ô") || s2.equals("e") || s2.equals("ò")) {
                            vogal += "5";
                            letras += "5";
                        } else if (s2.equals("v") || s2.equals("w") || s2.equals("x") || s2.equals("ç")) {
                            cons += "6";
                            letras += "6";
                        } else if (s2.equals("u")) {
                            vogal += "6";
                            letras += "6";
                        } else if (s2.equals("z")) {
                            cons += "7";
                            letras += "7";
                        } else if (s2.equals("o") || s2.equals("é")) {
                            vogal += "7";
                            letras += "7";
                        } else if (s2.equals("f") || s2.equals("p")) {
                            cons += "8";
                            letras += "8";
                        } else if (s2.equals("î") || s2.equals("â") || s2.equals("ú")) {
                            vogal += "8";
                            letras += "8";
                        } else if (s2.equals("ó")) {
                            vogal += "9";
                            letras += "9";
                        } else {
                            Log.v("Script", "Caio no final do IF's 1");
                        }
                    }
                    /* Nome 5*/


                    for (int i = 0; i < nome5.length; i++) {

                        String s2 = Character.toString(nome5[i]);
                        s2 = s2.toLowerCase();
                        if (s2.equals("q") || s2.equals("j")) {
                            cons += "1";
                            letras += "1";
                        } else if (s2.equals("a") || s2.equals("à") || s2.equals("i") || s2.equals("õ") || s2.equals("è") || s2.equals("ì") || s2.equals("y")) {
                            vogal += "1";
                            letras += "1";
                        } else if (s2.equals("b") || s2.equals("k") || s2.equals("r")) {
                            cons += "2";
                            letras += "2";
                        } else if (s2.equals("á") || s2.equals("í") || s2.equals("ù") || s2.equals("ê")) {
                            vogal += "3";
                            letras += "3";
                        } else if (s2.equals("c") || s2.equals("g") || s2.equals("l") || s2.equals("s")) {
                            cons += "3";
                            letras += "3";
                        } else if (s2.equals("d") || s2.equals("m") || s2.equals("t")) {
                            cons += "4";
                            letras += "4";
                        } else if (s2.equals("û") || s2.equals("ã")) {
                            vogal += "4";
                            letras += "4";
                        } else if (s2.equals("h") || s2.equals("n")) {
                            cons += "5";
                            letras += "5";
                        } else if (s2.equals("ô") || s2.equals("e") || s2.equals("ò")) {
                            vogal += "5";
                            letras += "5";
                        } else if (s2.equals("v") || s2.equals("w") || s2.equals("x") || s2.equals("ç")) {
                            cons += "6";
                            letras += "6";
                        } else if (s2.equals("u")) {
                            vogal += "6";
                            letras += "6";
                        } else if (s2.equals("z")) {
                            cons += "7";
                            letras += "7";
                        } else if (s2.equals("o") || s2.equals("é")) {
                            vogal += "7";
                            letras += "7";
                        } else if (s2.equals("f") || s2.equals("p")) {
                            cons += "8";
                            letras += "8";
                        } else if (s2.equals("î") || s2.equals("â") || s2.equals("ú")) {
                            vogal += "8";
                            letras += "8";
                        } else if (s2.equals("ó")) {
                            vogal += "9";
                            letras += "9";
                        } else {
                            Log.v("Script", "Caio no final do IF's 1");
                        }
                    }
                     /* Nome 6 */


                    for (int i = 0; i < nome6.length; i++) {

                        String s2 = Character.toString(nome6[i]);
                        s2 = s2.toLowerCase();
                        if (s2.equals("q") || s2.equals("j")) {
                            cons += "1";
                            letras += "1";
                        } else if (s2.equals("a") || s2.equals("à") || s2.equals("i") || s2.equals("õ") || s2.equals("è") || s2.equals("ì") || s2.equals("y")) {
                            vogal += "1";
                            letras += "1";
                        } else if (s2.equals("b") || s2.equals("k") || s2.equals("r")) {
                            cons += "2";
                            letras += "2";
                        } else if (s2.equals("á") || s2.equals("í") || s2.equals("ù") || s2.equals("ê")) {
                            vogal += "3";
                            letras += "3";
                        } else if (s2.equals("c") || s2.equals("g") || s2.equals("l") || s2.equals("s")) {
                            cons += "3";
                            letras += "3";
                        } else if (s2.equals("d") || s2.equals("m") || s2.equals("t")) {
                            cons += "4";
                            letras += "4";
                        } else if (s2.equals("û") || s2.equals("ã")) {
                            vogal += "4";
                            letras += "4";
                        } else if (s2.equals("h") || s2.equals("n")) {
                            cons += "5";
                            letras += "5";
                        } else if (s2.equals("ô") || s2.equals("e") || s2.equals("ò")) {
                            vogal += "5";
                            letras += "5";
                        } else if (s2.equals("v") || s2.equals("w") || s2.equals("x") || s2.equals("ç")) {
                            cons += "6";
                            letras += "6";
                        } else if (s2.equals("u")) {
                            vogal += "6";
                            letras += "6";
                        } else if (s2.equals("z")) {
                            cons += "7";
                            letras += "7";
                        } else if (s2.equals("o") || s2.equals("é")) {
                            vogal += "7";
                            letras += "7";
                        } else if (s2.equals("f") || s2.equals("p")) {
                            cons += "8";
                            letras += "8";
                        } else if (s2.equals("î") || s2.equals("â") || s2.equals("ú")) {
                            vogal += "8";
                            letras += "8";
                        } else if (s2.equals("ó")) {
                            vogal += "9";
                            letras += "9";
                        } else {
                            Log.v("Script", "Caio no final do IF's 1");
                        }
                    }
                    /* Nome 7 */

                    for (int i = 0; i < nome7.length; i++) {

                        String s2 = Character.toString(nome7[i]);
                        s2 = s2.toLowerCase();
                        if (s2.equals("q") || s2.equals("j")) {
                            cons += "1";
                            letras += "1";
                        } else if (s2.equals("a") || s2.equals("à") || s2.equals("i") || s2.equals("õ") || s2.equals("è") || s2.equals("ì") || s2.equals("y")) {
                            vogal += "1";
                            letras += "1";
                        } else if (s2.equals("b") || s2.equals("k") || s2.equals("r")) {
                            cons += "2";
                            letras += "2";
                        } else if (s2.equals("á") || s2.equals("í") || s2.equals("ù") || s2.equals("ê")) {
                            vogal += "3";
                            letras += "3";
                        } else if (s2.equals("c") || s2.equals("g") || s2.equals("l") || s2.equals("s")) {
                            cons += "3";
                            letras += "3";
                        } else if (s2.equals("d") || s2.equals("m") || s2.equals("t")) {
                            cons += "4";
                            letras += "4";
                        } else if (s2.equals("û") || s2.equals("ã")) {
                            vogal += "4";
                            letras += "4";
                        } else if (s2.equals("h") || s2.equals("n")) {
                            cons += "5";
                            letras += "5";
                        } else if (s2.equals("ô") || s2.equals("e") || s2.equals("ò")) {
                            vogal += "5";
                            letras += "5";
                        } else if (s2.equals("v") || s2.equals("w") || s2.equals("x") || s2.equals("ç")) {
                            cons += "6";
                            letras += "6";
                        } else if (s2.equals("u")) {
                            vogal += "6";
                            letras += "6";
                        } else if (s2.equals("z")) {
                            cons += "7";
                            letras += "7";
                        } else if (s2.equals("o") || s2.equals("é")) {
                            vogal += "7";
                            letras += "7";
                        } else if (s2.equals("f") || s2.equals("p")) {
                            cons += "8";
                            letras += "8";
                        } else if (s2.equals("î") || s2.equals("â") || s2.equals("ú")) {
                            vogal += "8";
                            letras += "8";
                        } else if (s2.equals("ó")) {
                            vogal += "9";
                            letras += "9";
                        } else {
                            Log.v("Script", "Caio no final do IF's 1");
                        }
                    }

                    Log.v("Script", "TESTE1 Consoante: " + cons + " Vogais: " + vogal + "Letras: " + letras);

                    /* Numero de Motivação*/

                    int motivacao = 0, impressao = 0, expressao = 0;
                    char[] Motiv = vogal.toCharArray();

                    for (int i = 0; i < Motiv.length; i++) {
                        String s3 = Character.toString(Motiv[i]);
                        int s1 = Integer.parseInt(s3);
                        motivacao += s1;

                    }
                    while (motivacao != 22 && motivacao != 11 && motivacao > 9) {
                        int t2 = 0;
                        String nk = Integer.toString(motivacao);
                        char[] Motiv2 = nk.toCharArray();
                        for (int j = 0; j < Motiv2.length; j++) {

                            String r1 = Character.toString(Motiv2[j]);
                            int r2 = Integer.parseInt(r1);
                            t2 += r2;

                        }
                        motivacao = t2;
                    }
                    Log.v("Script", "Seu numero de Motivação é: " + motivacao);

                    /* Numero de Impressão */

                    char[] Impr = cons.toCharArray();

                    for (int i = 0; i < Impr.length; i++) {
                        String impress = Character.toString(Impr[i]);
                        int nimpr = Integer.parseInt(impress);
                        impressao += nimpr;

                    }
                    while (impressao > 9) {
                        int numeroimp = 0;
                        String impress2 = Integer.toString(impressao);
                        char[] Impr2 = impress2.toCharArray();
                        for (int j = 0; j < Impr2.length; j++) {

                            String impress3 = Character.toString(Impr2[j]);
                            int nimpr2 = Integer.parseInt(impress3);
                            numeroimp += nimpr2;

                        }
                        impressao = numeroimp;
                    }

                    Log.v("Script", "Seu numero de Impressão é 2 : " + impressao);

                    /* Numero de Expressao */

                    char[] Expre = letras.toCharArray();

                    for (int i = 0; i < Expre.length; i++) {
                        String express = Character.toString(Expre[i]);
                        int nexpress = Integer.parseInt(express);
                        expressao += nexpress;

                    }
                    while (expressao != 22 && expressao != 11 && expressao > 9) {
                        int numeroexpr = 0;
                        String express2 = Integer.toString(expressao);
                        char[] Expre2 = express2.toCharArray();
                        for (int j = 0; j < Expre2.length; j++) {

                            String express3 = Character.toString(Expre2[j]);
                            int nexpress2 = Integer.parseInt(express3);
                            numeroexpr += nexpress2;

                        }
                        expressao = numeroexpr;
                    }

                    Log.v("Script", "Seu numero de Expressao é 2 : " + expressao);

                                        /* numero de Destino */

                    datadestino = datadia + datames + datano;
                    int destino = 0;
                    char[] Dest = datadestino.toCharArray();

                    for (int i = 0; i < Dest.length; i++) {
                        String destin = Character.toString(Dest[i]);
                        int ndesti = Integer.parseInt(destin);
                        destino += ndesti;

                    }
                    while (destino != 22 && destino != 11 && destino > 9) {
                        int numerodesti = 0;
                        String destin2 = Integer.toString(destino);
                        char[] Dest2 = destin2.toCharArray();
                        for (int j = 0; j < Dest2.length; j++) {

                            String destin3 = Character.toString(Dest2[j]);
                            int ndesti2 = Integer.parseInt(destin3);
                            numerodesti += ndesti2;

                        }
                        destino = numerodesti;
                    }

                    if (destino == 4 || destino == 2) {

                        int d = 0, m = 0, a = 0;

                        for (int i = 0; i < datad.length; i++) {

                            String s2 = Character.toString(datad[i]);
                            int dia = Integer.parseInt(s2);
                            d += dia;
                        }
                        while (d != 22 && d != 11 && d > 9) {
                            int numerodia = 0;
                            String Dia2 = Integer.toString(d);
                            char[] Da2 = Dia2.toCharArray();
                            for (int j = 0; j < Da2.length; j++) {
                                String Dia3 = Character.toString(Da2[j]);
                                int ndia2 = Integer.parseInt(Dia3);
                                numerodia += ndia2;
                            }
                            d = numerodia;
                        }

                        Log.v("Script", "Sua Data: " + d);

                        for (int i = 0; i < datam.length; i++) {

                            String s2 = Character.toString(datam[i]);
                            int mes = Integer.parseInt(s2);
                            m += mes;
                        }
                        while (m != 11 && m > 9) {
                            int numeromes = 0;
                            String Mes2 = Integer.toString(m);
                            char[] Ms2 = Mes2.toCharArray();
                            for (int j = 0; j < Ms2.length; j++) {
                                String Mes3 = Character.toString(Ms2[j]);
                                int nmes2 = Integer.parseInt(Mes3);
                                numeromes += nmes2;

                            }
                            m = numeromes;
                        }

                        Log.v("Script", "Seu Mes: " + m);

                        for (int i = 0; i < dataa.length; i++) {

                            String s2 = Character.toString(dataa[i]);
                            int ano = Integer.parseInt(s2);
                            a += ano;
                        }

                        while (a != 22 && a != 11 && a > 9) {
                            int numeroano = 0;
                            String Ano2 = Integer.toString(a);
                            char[] An2 = Ano2.toCharArray();
                            for (int j = 0; j < An2.length; j++) {
                                String Ano3 = Character.toString(An2[j]);
                                int nano2 = Integer.parseInt(Ano3);
                                numeroano += nano2;

                            }
                            a = numeroano;
                        }

                        Log.v("Script", "Seu Ano: " + a);

                        int numerofinald = 0;
                        destino = d + m + a;
                        while (destino != 22 && destino != 11 && destino > 9) {
                            int numerodesti = 0;
                            String destin2 = Integer.toString(destino);
                            char[] Dest2 = destin2.toCharArray();
                            for (int j = 0; j < Dest2.length; j++) {

                                String destin3 = Character.toString(Dest2[j]);
                                int ndesti2 = Integer.parseInt(destin3);
                                numerodesti += ndesti2;

                            }
                            destino = numerodesti;
                        }
                    }
                    Log.v("Script", "Destino Final: " + destino);

                    /* Lições Cármicas */

                    String carmicas = "";
                    if (!letras.contains("1")) {
                        carmicas += "1";
                    }
                    if (!letras.contains("2")) {
                        carmicas += "2";
                    }
                    if (!letras.contains("3")) {
                        carmicas += "3";
                    }
                    if (!letras.contains("4")) {
                        carmicas += "4";
                    }
                    if (!letras.contains("5")) {
                        carmicas += "5";
                    }
                    if (!letras.contains("6")) {
                        carmicas += "6";
                    }
                    if (!letras.contains("7")) {
                        carmicas += "7";
                    }
                    if (!letras.contains("8")) {
                        carmicas += "8";
                    }
                    if (!letras.contains("9")) {
                        carmicas += "9";
                    }
                    Log.v("Script", "Lições Carmicas: " + carmicas);

                    /* Tendencias Ocultas */

                    char[] nomeletras = letras.toCharArray();
                    String tendenciaocultas = "";

                    int tendoc1 = 0;
                    int tendoc2 = 0;
                    int tendoc3 = 0;
                    int tendoc4 = 0;
                    int tendoc5 = 0;
                    int tendoc6 = 0;
                    int tendoc7 = 0;
                    int tendoc8 = 0;
                    int tendoc9 = 0;
                    for (int i = 0; i < nomeletras.length; i++) {
                        String lt = Character.toString(nomeletras[i]);
                        if (lt.equals("1")) {
                            tendoc1++;
                        } else if (lt.equals("2")) {
                            tendoc2++;
                        } else if (lt.equals("3")) {
                            tendoc3++;
                        } else if (lt.equals("4")) {
                            tendoc4++;
                        } else if (lt.equals("5")) {
                            tendoc5++;
                        } else if (lt.equals("6")) {
                            tendoc6++;
                        } else if (lt.equals("7")) {
                            tendoc7++;
                        } else if (lt.equals("8")) {
                            tendoc8++;
                        } else if (lt.equals("9")) {
                            tendoc9++;
                        }
                    }
                    if (tendoc1 > 3) {
                        tendenciaocultas += "1";
                    }
                    if (tendoc2 > 3) {
                        tendenciaocultas += "2";
                    }
                    if (tendoc3 > 3) {
                        tendenciaocultas += "3";
                    }
                    if (tendoc4 > 3) {
                        tendenciaocultas += "4";
                    }
                    if (tendoc5 > 3) {
                        tendenciaocultas += "5";
                    }
                    if (tendoc6 > 3) {
                        tendenciaocultas += "6";
                    }
                    if (tendoc7 > 3) {
                        tendenciaocultas += "7";
                    }
                    if (tendoc8 > 3) {
                        tendenciaocultas += "8";
                    }
                    if (tendoc9 > 3) {
                        tendenciaocultas += "9";
                    }

                    Log.v("Script", "Tendencias Ocultas: " + tendenciaocultas);

                        /* Resposta Subconsciente */

                    char[] RespostaSub = carmicas.toCharArray();
                    int qtdsub = RespostaSub.length;
                    int respsubecon = 9 - qtdsub;

                    Log.v("Script", "Resposta Subconsciente: " + respsubecon);

                        /* Dividas Carmicas */

                    String DividasCarmicas = "";

                    if (datadia.equals("13")) {
                        DividasCarmicas += "13";
                    } else if (datadia.equals("14")) {
                        DividasCarmicas += "14";
                    } else if (datadia.equals("16")) {
                        DividasCarmicas += "16";
                    } else if (datadia.equals("19")) {
                        DividasCarmicas += "19";
                    }
                    if (destino == 4 || motivacao == 4 || expressao == 4) {
                        if (!DividasCarmicas.contains("13")) {
                            DividasCarmicas += "13";
                        }
                    }
                    if (destino == 5 || motivacao == 5 || expressao == 5) {
                        if (!DividasCarmicas.contains("14")) {
                            DividasCarmicas += "14";
                        }

                    }
                    if (destino == 7 || motivacao == 7 || expressao == 7) {
                        if (!DividasCarmicas.contains("16")) {
                            DividasCarmicas += "16";
                        }
                    }
                    if (destino == 1 || motivacao == 1 || expressao == 1) {
                        if (!DividasCarmicas.contains("19")) {
                            DividasCarmicas += "19";
                        }
                    }

                    Log.v("Script", "Dividas Carmcas: " + DividasCarmicas);

                                    /* Missão */
                    int missao = 0;
                    missao = destino + expressao;
                    while (missao != 22 && missao != 11 && missao > 9) {
                        int numeromissao = 0;
                        String Missao2 = Integer.toString(missao);
                        char[] Mis2 = Missao2.toCharArray();
                        for (int j = 0; j < Mis2.length; j++) {

                            String Missao3 = Character.toString(Mis2[j]);
                            int nmissao2 = Integer.parseInt(Missao3);
                            numeromissao += nmissao2;

                        }
                        missao = numeromissao;
                    }
                    Log.v("Script", "Missão: " + missao);

                    /* Ciclos de Vida */
                    int ciclo1 = 0;
                    int ciclo2 = 0;
                    int ciclo3 = 0;
                    for (int i = 0; i < datam.length; i++) {
                        String s2 = Character.toString(datam[i]);
                        int mes = Integer.parseInt(s2);
                        ciclo1 += mes;
                    }
                    while (ciclo1 != 11 && ciclo1 > 9) {
                        int numeromes = 0;
                        String Mes2 = Integer.toString(ciclo1);
                        char[] Ms2 = Mes2.toCharArray();
                        for (int j = 0; j < Ms2.length; j++) {
                            String Mes3 = Character.toString(Ms2[j]);
                            int nmes2 = Integer.parseInt(Mes3);
                            numeromes += nmes2;

                        }
                        ciclo1 = numeromes;
                    }
                    int anociclo1 = Integer.parseInt(datano);
                    int numeroanociclo1 = 37 - destino;
                    anociclo1 += numeroanociclo1;
                    String numerofinalciclo1 = datadia + "-" + datames + "-" + anociclo1;

                    Log.v("Script", "1º Ciclo de vida: " + ciclo1 + "Ano de ciclo: " + numerofinalciclo1);

                    int numerodia7 = Integer.parseInt(datadia);
                    if (datadia.equals("22") || datadia.equals("11")) {
                        ciclo2 = Integer.parseInt(datadia);
                    } else {
                        for (int i = 0; i < datad.length; i++) {
                            String s2 = Character.toString(datad[i]);
                            int dia = Integer.parseInt(s2);
                            ciclo2 += dia;
                        }
                        while (ciclo2 != 22 && ciclo2 != 11 && ciclo2 > 9) {
                            int numerodia = 0;
                            String Dia2 = Integer.toString(ciclo2);
                            char[] Da2 = Dia2.toCharArray();
                            for (int j = 0; j < Da2.length; j++) {
                                String Dia3 = Character.toString(Da2[j]);
                                int ndia2 = Integer.parseInt(Dia3);
                                numerodia += ndia2;
                            }
                            ciclo2 = numerodia;
                        }
                    }

                    int numeroanociclo2 = anociclo1 + 27;
                    String numerofinalciclo2 = datadia + "-" + datames + "-" + numeroanociclo2;
                    Log.v("Script", "2º Ciclo de vida: " + ciclo2 + "Ano de ciclo: " + numerofinalciclo2);

                    for (int i = 0; i < dataa.length; i++) {
                        String s2 = Character.toString(dataa[i]);
                        int ano = Integer.parseInt(s2);
                        ciclo3 += ano;
                    }

                    while (ciclo3 != 22 && ciclo3 != 11 && ciclo3 > 9) {
                        int numeroano = 0;
                        String Ano2 = Integer.toString(ciclo3);
                        char[] An2 = Ano2.toCharArray();
                        for (int j = 0; j < An2.length; j++) {
                            String Ano3 = Character.toString(An2[j]);
                            int nano2 = Integer.parseInt(Ano3);
                            numeroano += nano2;

                        }
                        ciclo3 = numeroano;
                    }

                    Log.v("Script", "3º Ciclo de vida: " + ciclo3 + "Ano de ciclo: " + numerofinalciclo2);

                    /* Desafio */
                    int desafio1 = 0;
                    int desafio2 = 0;
                    int desafio3 = 0;
                    int diale = 0;
                    for (int i = 0; i < datad.length; i++) {
                        String s2 = Character.toString(datad[i]);
                        int dia = Integer.parseInt(s2);
                        diale += dia;
                    }
                    while (diale > 9) {
                        int numerodia = 0;
                        String Dia2 = Integer.toString(ciclo2);
                        char[] Da2 = Dia2.toCharArray();
                        for (int j = 0; j < Da2.length; j++) {
                            String Dia3 = Character.toString(Da2[j]);
                            int ndia2 = Integer.parseInt(Dia3);
                            numerodia += ndia2;
                        }
                        diale = numerodia;
                    }
                    if (ciclo1 == 11){
                        int sei = 2;
                        if (sei >= diale) {
                            desafio1 = sei - diale;
                        } else {
                            desafio1 = diale - sei;
                        }
                    }
                    else {
                        if (ciclo1 >= diale) {
                            desafio1 = ciclo1 - diale;
                        } else {
                            desafio1 = diale - ciclo1;
                        }
                    }
                    if (ciclo3 == 22){
                        int sei2 = 4;
                        if (sei2 >= diale) {
                            desafio2 = sei2 - diale;
                        } else {
                            desafio2 = diale - sei2;
                        }
                    }
                    else if (ciclo3 == 11){
                        int sei2 = 2;
                        if (sei2 >= diale) {
                            desafio2 = ciclo3 - diale;
                        } else {
                            desafio2 = diale - ciclo3;
                        }
                    }
                    else {
                        if (ciclo3 >= diale) {
                            desafio2 = ciclo3 - diale;
                        } else {
                            desafio2 = diale - ciclo3;
                        }
                    }

                    if (desafio1 >= desafio2) {
                        desafio3 = desafio1 - desafio2;
                    } else {
                        desafio3 = desafio2 - desafio1;
                    }

                    Log.v("Script", "1º Desafio: " + desafio1 + "2º Desafio: " + desafio2 + "Desafio Principal: " + desafio3);

                /* Momentos Decisivos */

                    int decisivos1 = 0;
                    int decisivos2 = 0;
                    int decisivos3 = 0;
                    int decisivos4 = 0;
                    String diaemes = datadia + datames;
                    String diaeano = datadia + datano;
                    String meseano = datames + datano;

                    char[] diaemes1 = diaemes.toCharArray();
                    for (int i = 0; i < diaemes1.length; i++) {
                        String mdia2 = Character.toString(diaemes1[i]);
                        int ndesti = Integer.parseInt(mdia2);
                        decisivos1 += ndesti;
                    }


                    while (decisivos1 != 22 && decisivos1 != 11 && decisivos1 > 9) {
                        int numerodesi = 0;
                        String destin2 = Integer.toString(decisivos1);
                        char[] diaemes2 = destin2.toCharArray();
                        for (int j = 0; j < diaemes2.length; j++) {

                            String destin3 = Character.toString(diaemes2[j]);
                            int ndesti2 = Integer.parseInt(destin3);
                            numerodesi += ndesti2;

                        }
                        decisivos1 = numerodesi;
                    }
                    Log.v("Script", "1º Momento decisivo: " + decisivos1 + "Perido: " + numerofinalciclo1);

                    char[] diaeano1 = diaeano.toCharArray();
                    for (int i = 0; i < diaeano1.length; i++) {
                        String mdia2 = Character.toString(diaeano1[i]);
                        int ndesti = Integer.parseInt(mdia2);
                        decisivos2 += ndesti;
                    }


                    while (decisivos2 != 22 && decisivos2 != 11 && decisivos2 > 9) {
                        int numerodesi = 0;
                        String destin2 = Integer.toString(decisivos2);
                        char[] diaemes2 = destin2.toCharArray();
                        for (int j = 0; j < diaemes2.length; j++) {

                            String destin3 = Character.toString(diaemes2[j]);
                            int ndesti2 = Integer.parseInt(destin3);
                            numerodesi += ndesti2;

                        }
                        decisivos2 = numerodesi;
                    }

                    int anomomento2 = anociclo1 + 9;
                    String numerofinaldecisivo2 = datadia + "-" + datames + "-" + anomomento2;

                    Log.v("Script", "2º Momento decisivo: " + decisivos2 + "Perido: " + numerofinaldecisivo2);
                    decisivos3 = decisivos1 + decisivos2;
                    while (decisivos3 != 22 && decisivos3 != 11 && decisivos3 > 9) {
                        int numerodesi = 0;
                        String destin2 = Integer.toString(decisivos3);
                        char[] diaemes2 = destin2.toCharArray();
                        for (int j = 0; j < diaemes2.length; j++) {

                            String destin3 = Character.toString(diaemes2[j]);
                            int ndesti2 = Integer.parseInt(destin3);
                            numerodesi += ndesti2;

                        }
                        decisivos3 = numerodesi;
                    }

                    int anomomento3 = anomomento2 + 9;
                    String numerofinaldecisivo3 = datadia + "-" + datames + "-" + anomomento3;

                    Log.v("Script", "3º Momento decisivo: " + decisivos3 + "Perido: " + numerofinaldecisivo3);

                    char[] meseano1 = meseano.toCharArray();
                    for (int i = 0; i < meseano1.length; i++) {
                        String mdia2 = Character.toString(meseano1[i]);
                        int ndesti = Integer.parseInt(mdia2);
                        decisivos4 += ndesti;
                    }


                    while (decisivos4 != 22 && decisivos4 != 11 && decisivos4 > 9) {
                        int numerodesi = 0;
                        String destin2 = Integer.toString(decisivos4);
                        char[] meseano2 = destin2.toCharArray();
                        for (int j = 0; j < meseano2.length; j++) {

                            String destin3 = Character.toString(meseano2[j]);
                            int ndesti2 = Integer.parseInt(destin3);
                            numerodesi += ndesti2;

                        }
                        decisivos4 = numerodesi;
                    }

                    Log.v("Script", "4º Momento decisivo: " + decisivos4);
            /* Numeros Favoraveis */
                    int mesfavoravel = 0;
                    if (datames.equals("12") || datames.equals("11") || datames.equals("10")) {
                        mesfavoravel = Integer.parseInt(datames);

                    } else {
                        for (int i = 0; i < datam.length; i++) {
                            String s2 = Character.toString(datam[i]);
                            int mes = Integer.parseInt(s2);
                            mesfavoravel += mes;
                        }

                    }
                    int diafavoravel = 0;
                    int diadatafa = Integer.parseInt(datadia);

                    if (diadatafa > 9) {
                        diafavoravel = Integer.parseInt(datadia);

                    } else {
                        for (int i = 0; i < datad.length; i++) {
                            String s2 = Character.toString(datad[i]);
                            int mes = Integer.parseInt(s2);
                            diafavoravel += mes;
                        }

                    }

                    String numerosfavoraveis1 = diafavoravel + "-" + mesfavoravel;
                    int numerofavoravel1 = 0;
                    int numerofavoravel2 = 0;
                    if (numerosfavoraveis1.equals("1-1") || numerosfavoraveis1.equals("4-1") || numerosfavoraveis1.equals("10-1") || numerosfavoraveis1.equals("13-1") ||
                            numerosfavoraveis1.equals("16-1") || numerosfavoraveis1.equals("19-1") || numerosfavoraveis1.equals("22-1") || numerosfavoraveis1.equals("25-1") ||
                            numerosfavoraveis1.equals("13-3") || numerosfavoraveis1.equals("10-5") || numerosfavoraveis1.equals("31-5") ||
                            numerosfavoraveis1.equals("1-6") || numerosfavoraveis1.equals("4-6") || numerosfavoraveis1.equals("10-6") || numerosfavoraveis1.equals("13-6") ||
                            numerosfavoraveis1.equals("19-6") || numerosfavoraveis1.equals("22-6") || numerosfavoraveis1.equals("2-8") || numerosfavoraveis1.equals("5-8") ||
                            numerosfavoraveis1.equals("14-8") || numerosfavoraveis1.equals("23-8") || numerosfavoraveis1.equals("29-8") || numerosfavoraveis1.equals("31-8") ||
                            numerosfavoraveis1.equals("1-9") || numerosfavoraveis1.equals("4-9") || numerosfavoraveis1.equals("11-9") || numerosfavoraveis1.equals("13-9") ||
                            numerosfavoraveis1.equals("19-9") || numerosfavoraveis1.equals("10-10") || numerosfavoraveis1.equals("16-11")) {
                        numerofavoravel1 = 1;
                        numerofavoravel2 = 5;
                    } else if (numerosfavoraveis1.equals("2-1") || numerosfavoraveis1.equals("11-1") || numerosfavoraveis1.equals("20-1") || numerosfavoraveis1.equals("12-8") ||
                            numerosfavoraveis1.equals("15-8") || numerosfavoraveis1.equals("11-10") || numerosfavoraveis1.equals("29-12")) {
                        numerofavoravel1 = 1;
                        numerofavoravel2 = 6;
                    } else if (numerosfavoraveis1.equals("3-1") || numerosfavoraveis1.equals("21-1") || numerosfavoraveis1.equals("3-2") || numerosfavoraveis1.equals("6-2") ||
                            numerosfavoraveis1.equals("9-2") || numerosfavoraveis1.equals("15-2") || numerosfavoraveis1.equals("18-2") ||
                            numerosfavoraveis1.equals("21-2") || numerosfavoraveis1.equals("3-3") || numerosfavoraveis1.equals("6-3") || numerosfavoraveis1.equals("8-3") ||
                            numerosfavoraveis1.equals("15-3") || numerosfavoraveis1.equals("17-3") || numerosfavoraveis1.equals("18-3") || numerosfavoraveis1.equals("21-3") ||
                            numerosfavoraveis1.equals("24-3") || numerosfavoraveis1.equals("6-4") || numerosfavoraveis1.equals("30-4") ||
                            numerosfavoraveis1.equals("15-4") || numerosfavoraveis1.equals("27-4") || numerosfavoraveis1.equals("3-5") ||
                            numerosfavoraveis1.equals("21-5") || numerosfavoraveis1.equals("21-7") || numerosfavoraveis1.equals("30-7") ||
                            numerosfavoraveis1.equals("3-8") || numerosfavoraveis1.equals("6-8") || numerosfavoraveis1.equals("9-8") ||
                            numerosfavoraveis1.equals("21-8") || numerosfavoraveis1.equals("24-8") || numerosfavoraveis1.equals("27-8") || numerosfavoraveis1.equals("30-8") ||
                            numerosfavoraveis1.equals("3-9") || numerosfavoraveis1.equals("9-9") || numerosfavoraveis1.equals("12-9") || numerosfavoraveis1.equals("18-9") ||
                            numerosfavoraveis1.equals("21-9") || numerosfavoraveis1.equals("24-9") || numerosfavoraveis1.equals("26-9") || numerosfavoraveis1.equals("30-9") ||
                            numerosfavoraveis1.equals("3-10") || numerosfavoraveis1.equals("6-10") || numerosfavoraveis1.equals("8-10") || numerosfavoraveis1.equals("9-10") ||
                            numerosfavoraveis1.equals("15-10") || numerosfavoraveis1.equals("17-10") || numerosfavoraveis1.equals("18-10") || numerosfavoraveis1.equals("21-10") ||
                            numerosfavoraveis1.equals("24-10") || numerosfavoraveis1.equals("26-10") || numerosfavoraveis1.equals("30-10") || numerosfavoraveis1.equals("30-11") ||
                            numerosfavoraveis1.equals("3-12") || numerosfavoraveis1.equals("5-12") || numerosfavoraveis1.equals("6-12") || numerosfavoraveis1.equals("15-12") ||
                            numerosfavoraveis1.equals("18-12") || numerosfavoraveis1.equals("21-12") || numerosfavoraveis1.equals("24-12") || numerosfavoraveis1.equals("26-12") ||
                            numerosfavoraveis1.equals("30-12")) {
                        numerofavoravel1 = 3;
                        numerofavoravel2 = 6;
                    } else if (numerosfavoraveis1.equals("5-1") || numerosfavoraveis1.equals("6-1") || numerosfavoraveis1.equals("14-1") || numerosfavoraveis1.equals("15-1") ||
                            numerosfavoraveis1.equals("18-1") || numerosfavoraveis1.equals("23-1") || numerosfavoraveis1.equals("24-1") || numerosfavoraveis1.equals("5-2") ||
                            numerosfavoraveis1.equals("12-2") || numerosfavoraveis1.equals("14-2") || numerosfavoraveis1.equals("23-2") || numerosfavoraveis1.equals("24-2") ||
                            numerosfavoraveis1.equals("5-5") || numerosfavoraveis1.equals("6-5") || numerosfavoraveis1.equals("14-5") || numerosfavoraveis1.equals("15-5") ||
                            numerosfavoraveis1.equals("18-5") || numerosfavoraveis1.equals("23-5") || numerosfavoraveis1.equals("24-5") || numerosfavoraveis1.equals("30-5") ||
                            numerosfavoraveis1.equals("3-6") || numerosfavoraveis1.equals("5-6") || numerosfavoraveis1.equals("6-6") || numerosfavoraveis1.equals("12-6") ||
                            numerosfavoraveis1.equals("14-6") || numerosfavoraveis1.equals("15-6") || numerosfavoraveis1.equals("18-6") || numerosfavoraveis1.equals("21-6") ||
                            numerosfavoraveis1.equals("23-6") || numerosfavoraveis1.equals("24-6") || numerosfavoraveis1.equals("27-6") || numerosfavoraveis1.equals("5-9") ||
                            numerosfavoraveis1.equals("6-9") || numerosfavoraveis1.equals("14-9") || numerosfavoraveis1.equals("15-9") || numerosfavoraveis1.equals("23-9") ||
                            numerosfavoraveis1.equals("5-10") || numerosfavoraveis1.equals("14-10") || numerosfavoraveis1.equals("23-10") || numerosfavoraveis1.equals("14-12") ||
                            numerosfavoraveis1.equals("23-12") || numerosfavoraveis1.equals("28-12")) {
                        numerofavoravel1 = 5;
                        numerofavoravel2 = 6;
                    } else if (numerosfavoraveis1.equals("7-1") || numerosfavoraveis1.equals("1-3") || numerosfavoraveis1.equals("4-3") || numerosfavoraveis1.equals("10-3") ||
                            numerosfavoraveis1.equals("11-3") || numerosfavoraveis1.equals("19-3") || numerosfavoraveis1.equals("22-3") || numerosfavoraveis1.equals("29-3") ||
                            numerosfavoraveis1.equals("31-3") || numerosfavoraveis1.equals("1-4") || numerosfavoraveis1.equals("2-4") || numerosfavoraveis1.equals("4-4") ||
                            numerosfavoraveis1.equals("10-4") || numerosfavoraveis1.equals("11-4") || numerosfavoraveis1.equals("13-4") || numerosfavoraveis1.equals("19-4") ||
                            numerosfavoraveis1.equals("22-4") || numerosfavoraveis1.equals("29-4") || numerosfavoraveis1.equals("4-5") || numerosfavoraveis1.equals("11-5") ||
                            numerosfavoraveis1.equals("13-5") || numerosfavoraveis1.equals("22-5") || numerosfavoraveis1.equals("29-6") || numerosfavoraveis1.equals("4-7") ||
                            numerosfavoraveis1.equals("11-7") || numerosfavoraveis1.equals("29-7") || numerosfavoraveis1.equals("31-7") || numerosfavoraveis1.equals("11-8") ||
                            numerosfavoraveis1.equals("22-9") || numerosfavoraveis1.equals("29-9") || numerosfavoraveis1.equals("31-10") || numerosfavoraveis1.equals("4-10") ||
                            numerosfavoraveis1.equals("13-10") || numerosfavoraveis1.equals("22-10") || numerosfavoraveis1.equals("29-10") || numerosfavoraveis1.equals("1-11") ||
                            numerosfavoraveis1.equals("2-11") || numerosfavoraveis1.equals("4-11") || numerosfavoraveis1.equals("7-11") || numerosfavoraveis1.equals("11-11") ||
                            numerosfavoraveis1.equals("13-11") || numerosfavoraveis1.equals("19-11") || numerosfavoraveis1.equals("22-11") || numerosfavoraveis1.equals("25-11") ||
                            numerosfavoraveis1.equals("29-11") || numerosfavoraveis1.equals("1-12") || numerosfavoraveis1.equals("4-12") || numerosfavoraveis1.equals("10-12") ||
                            numerosfavoraveis1.equals("11-12") || numerosfavoraveis1.equals("19-12") || numerosfavoraveis1.equals("22-12")) {
                        numerofavoravel1 = 1;
                        numerofavoravel2 = 7;
                    } else if (numerosfavoraveis1.equals("8-1") || numerosfavoraveis1.equals("17-1") || numerosfavoraveis1.equals("26-3") || numerosfavoraveis1.equals("8-4") ||
                            numerosfavoraveis1.equals("17-4") || numerosfavoraveis1.equals("18-4") || numerosfavoraveis1.equals("21-4") || numerosfavoraveis1.equals("17-8") ||
                            numerosfavoraveis1.equals("18-8") || numerosfavoraveis1.equals("13-12") || numerosfavoraveis1.equals("31-12")) {
                        numerofavoravel1 = 1;
                        numerofavoravel2 = 3;
                    } else if (numerosfavoraveis1.equals("9-1") || numerosfavoraveis1.equals("12-1") || numerosfavoraveis1.equals("27-1") || numerosfavoraveis1.equals("27-2") ||
                            numerosfavoraveis1.equals("9-3") || numerosfavoraveis1.equals("27-9") || numerosfavoraveis1.equals("27-10") || numerosfavoraveis1.equals("12-12") ||
                            numerosfavoraveis1.equals("27-12")) {
                        numerofavoravel1 = 6;
                        numerofavoravel2 = 9;
                    } else if (numerosfavoraveis1.equals("28-1") || numerosfavoraveis1.equals("31-1") || numerosfavoraveis1.equals("1-2") || numerosfavoraveis1.equals("2-2") ||
                            numerosfavoraveis1.equals("4-2") || numerosfavoraveis1.equals("7-2") || numerosfavoraveis1.equals("10-2") || numerosfavoraveis1.equals("13-2") ||
                            numerosfavoraveis1.equals("19-2") || numerosfavoraveis1.equals("20-2") || numerosfavoraveis1.equals("22-2") || numerosfavoraveis1.equals("25-2") ||
                            numerosfavoraveis1.equals("28-2") || numerosfavoraveis1.equals("2-3") || numerosfavoraveis1.equals("7-3") || numerosfavoraveis1.equals("20-3") ||
                            numerosfavoraveis1.equals("25-3") || numerosfavoraveis1.equals("20-4") || numerosfavoraveis1.equals("28-4") || numerosfavoraveis1.equals("2-5") ||
                            numerosfavoraveis1.equals("7-5") || numerosfavoraveis1.equals("20-5") || numerosfavoraveis1.equals("25-5") || numerosfavoraveis1.equals("28-5") ||
                            numerosfavoraveis1.equals("2-6") || numerosfavoraveis1.equals("7-6") || numerosfavoraveis1.equals("20-6") || numerosfavoraveis1.equals("25-6") ||
                            numerosfavoraveis1.equals("28-6") || numerosfavoraveis1.equals("2-7") || numerosfavoraveis1.equals("7-7") || numerosfavoraveis1.equals("20-7") ||
                            numerosfavoraveis1.equals("25-7") || numerosfavoraveis1.equals("28-7") || numerosfavoraveis1.equals("7-8") || numerosfavoraveis1.equals("20-8") ||
                            numerosfavoraveis1.equals("25-8") || numerosfavoraveis1.equals("20-9") || numerosfavoraveis1.equals("25-9") || numerosfavoraveis1.equals("28-9") ||
                            numerosfavoraveis1.equals("1-10") || numerosfavoraveis1.equals("2-10") || numerosfavoraveis1.equals("7-10") || numerosfavoraveis1.equals("19-10") ||
                            numerosfavoraveis1.equals("20-10") || numerosfavoraveis1.equals("25-10") || numerosfavoraveis1.equals("28-10") || numerosfavoraveis1.equals("10-11") ||
                            numerosfavoraveis1.equals("20-11") || numerosfavoraveis1.equals("28-11") || numerosfavoraveis1.equals("2-12") || numerosfavoraveis1.equals("7-12") ||
                            numerosfavoraveis1.equals("20-12")) {
                        numerofavoravel1 = 2;
                        numerofavoravel2 = 7;
                    } else if (numerosfavoraveis1.equals("26-1") || numerosfavoraveis1.equals("30-1") || numerosfavoraveis1.equals("8-2") || numerosfavoraveis1.equals("17-2") ||
                            numerosfavoraveis1.equals("26-2") || numerosfavoraveis1.equals("26-4") || numerosfavoraveis1.equals("17-5") || numerosfavoraveis1.equals("30-6") ||
                            numerosfavoraveis1.equals("3-7") || numerosfavoraveis1.equals("8-7") || numerosfavoraveis1.equals("9-7") || numerosfavoraveis1.equals("17-7") ||
                            numerosfavoraveis1.equals("18-7") || numerosfavoraveis1.equals("26-7") || numerosfavoraveis1.equals("8-8") || numerosfavoraveis1.equals("26-8") ||
                            numerosfavoraveis1.equals("8-9") || numerosfavoraveis1.equals("17-9") || numerosfavoraveis1.equals("8-12") || numerosfavoraveis1.equals("17-12")) {
                        numerofavoravel1 = 2;
                        numerofavoravel2 = 3;
                    } else if (numerosfavoraveis1.equals("29-1") || numerosfavoraveis1.equals("11-2") || numerosfavoraveis1.equals("5-3") || numerosfavoraveis1.equals("14-3") ||
                            numerosfavoraveis1.equals("5-4") || numerosfavoraveis1.equals("7-4") || numerosfavoraveis1.equals("14-4") || numerosfavoraveis1.equals("23-4") ||
                            numerosfavoraveis1.equals("25-4") || numerosfavoraveis1.equals("29-5") || numerosfavoraveis1.equals("5-7") ||
                            numerosfavoraveis1.equals("14-7") || numerosfavoraveis1.equals("23-7") || numerosfavoraveis1.equals("5-11") || numerosfavoraveis1.equals("14-11") ||
                            numerosfavoraveis1.equals("23-11") || numerosfavoraveis1.equals("11-6")) {
                        numerofavoravel1 = 5;
                        numerofavoravel2 = 7;
                    } else if (numerosfavoraveis1.equals("16-2") || numerosfavoraveis1.equals("8-5") || numerosfavoraveis1.equals("16-5") ||
                            numerosfavoraveis1.equals("26-5") || numerosfavoraveis1.equals("16-6") || numerosfavoraveis1.equals("17-6") || numerosfavoraveis1.equals("26-6") ||
                            numerosfavoraveis1.equals("2-9") || numerosfavoraveis1.equals("7-9") || numerosfavoraveis1.equals("16-9") || numerosfavoraveis1.equals("28-8")) {
                        numerofavoravel1 = 2;
                        numerofavoravel2 = 5;
                    } else if (numerosfavoraveis1.equals("27-3") || numerosfavoraveis1.equals("12-4") || numerosfavoraveis1.equals("12-11") || numerosfavoraveis1.equals("27-7")) {
                        numerofavoravel1 = 1;
                        numerofavoravel2 = 9;
                    } else if (numerosfavoraveis1.equals("30-3") || numerosfavoraveis1.equals("3-4") || numerosfavoraveis1.equals("9-4") || numerosfavoraveis1.equals("3-11") ||
                            numerosfavoraveis1.equals("8-11") || numerosfavoraveis1.equals("9-11") || numerosfavoraveis1.equals("17-11") || numerosfavoraveis1.equals("18-11") ||
                            numerosfavoraveis1.equals("21-11") || numerosfavoraveis1.equals("26-11") || numerosfavoraveis1.equals("27-11") || numerosfavoraveis1.equals("9-12")) {
                        numerofavoravel1 = 3;
                        numerofavoravel2 = 9;
                    } else if (numerosfavoraveis1.equals("29-2") || numerosfavoraveis1.equals("12-3") || numerosfavoraveis1.equals("23-3") || numerosfavoraveis1.equals("15-7") ||
                            numerosfavoraveis1.equals("24-7")) {
                        numerofavoravel1 = 6;
                        numerofavoravel2 = 7;
                    } else if (numerosfavoraveis1.equals("16-3") || numerosfavoraveis1.equals("16-4") || numerosfavoraveis1.equals("1-5") || numerosfavoraveis1.equals("19-5") ||
                            numerosfavoraveis1.equals("1-7") || numerosfavoraveis1.equals("10-7") || numerosfavoraveis1.equals("13-7") || numerosfavoraveis1.equals("16-7") ||
                            numerosfavoraveis1.equals("19-7") || numerosfavoraveis1.equals("22-7") || numerosfavoraveis1.equals("1-8") || numerosfavoraveis1.equals("4-8") ||
                            numerosfavoraveis1.equals("10-8") || numerosfavoraveis1.equals("13-8") || numerosfavoraveis1.equals("16-8") || numerosfavoraveis1.equals("19-8") ||
                            numerosfavoraveis1.equals("22-8") || numerosfavoraveis1.equals("10-9") || numerosfavoraveis1.equals("16-10") || numerosfavoraveis1.equals("16-12")) {
                        numerofavoravel1 = 1;
                        numerofavoravel2 = 2;
                    } else if (numerosfavoraveis1.equals("28-3") || numerosfavoraveis1.equals("9-5") || numerosfavoraveis1.equals("27-5") || numerosfavoraveis1.equals("9-6")) {
                        numerofavoravel1 = 5;
                        numerofavoravel2 = 9;
                    } else if (numerosfavoraveis1.equals("12-5") || numerosfavoraveis1.equals("6-7") || numerosfavoraveis1.equals("12-7") || numerosfavoraveis1.equals("12-10")) {
                        numerofavoravel1 = 2;
                        numerofavoravel2 = 6;
                    } else if (numerosfavoraveis1.equals("24-4") || numerosfavoraveis1.equals("8-6") || numerosfavoraveis1.equals("6-11") || numerosfavoraveis1.equals("15-11") ||
                            numerosfavoraveis1.equals("24-11")) {
                        numerofavoravel1 = 3;
                        numerofavoravel2 = 5;
                    } else if (numerosfavoraveis1.equals("25-12")) {
                        numerofavoravel1 = 3;
                        numerofavoravel2 = 7;
                    } else {
                        Log.v("Script", "Else numero favoravel");
                    }

                    String numerosfavor = "";
                    numerosfavor = numerofavoravel1 + "," + numerofavoravel2;
                    int numfavorido = 0;
                    numfavorido = numerofavoravel2 * 2;
                    numerosfavor += "," + numfavorido;
                    while (numfavorido <=31) {
                        numfavorido = numfavorido + numerofavoravel1;
                        if (numfavorido<=31) {
                            numerosfavor += "," + numfavorido;
                        }
                        if (numfavorido <31) {
                            numfavorido = numfavorido + numerofavoravel2;
                            if (numfavorido<=31) {
                                numerosfavor += "," + numfavorido;
                            }
                            }
                            else {
                                break;
                            }


                  }
/*                    */


                    Log.v("Script", "Numeros Favoraveis: " + numerosfavor);

                    /* Ano Pessoal */

                    String anopessoal2 = "";

                    anopessoal2 = datadia + datames + anopessoal;

                    int numeroanopessoal = 0;
                    char[] anopessoal3 = anopessoal2.toCharArray();
                    for (int i = 0; i < anopessoal3.length; i++) {
                        String mdia2 = Character.toString(anopessoal3[i]);
                        int ndesti = Integer.parseInt(mdia2);
                        numeroanopessoal += ndesti;
                    }


                    while (numeroanopessoal > 9) {
                        int numerodesi = 0;
                        String destin2 = Integer.toString(numeroanopessoal);
                        char[] meseano2 = destin2.toCharArray();
                        for (int j = 0; j < meseano2.length; j++) {
                            String destin3 = Character.toString(meseano2[j]);
                            int ndesti2 = Integer.parseInt(destin3);
                            numerodesi += ndesti2;

                        }
                        numeroanopessoal = numerodesi;
                    }

                    Log.v("Script", "Teste da Data: " + numeroanopessoal);

                    /* Relações Intervalores */


                    char[] rlintev = intervalores.toCharArray();
                    int relacaoint1 = 0;
                    int relacaoint2 = 0;
                    int relacaoint3 = 0;
                    int relacaoint4 = 0;
                    int relacaoint5 = 0;
                    int relacaoint6 = 0;
                    int relacaoint7 = 0;
                    int relacaoint8 = 0;
                    int relacaoint9 = 0;

                    for (int i = 0; i < rlintev.length; i++) {
                        String lt = Character.toString(rlintev[i]);
                        if (lt.equals("1")) {
                            relacaoint1++;
                        } else if (lt.equals("2")) {
                            relacaoint2++;
                        } else if (lt.equals("3")) {
                            relacaoint3++;
                        } else if (lt.equals("4")) {
                            relacaoint4++;
                        } else if (lt.equals("5")) {
                            relacaoint5++;
                        } else if (lt.equals("6")) {
                            relacaoint6++;
                        } else if (lt.equals("7")) {
                            relacaoint7++;
                        } else if (lt.equals("8")) {
                            relacaoint8++;
                        } else if (lt.equals("9")) {
                            relacaoint9++;
                        }
                    }
                    Log.v("Script", "Segundo Teste: " + relacaoint1 + relacaoint2 + relacaoint3 + relacaoint4 + relacaoint5 + relacaoint6 + relacaoint7 + relacaoint8 + relacaoint9);


                    String[] teste = {relacaoint1 + "primeiro",
                            relacaoint2 + "segundo", relacaoint3 + "terceiro", relacaoint4 + "quarto",
                            relacaoint5 + "quinto", relacaoint6 + "sesto", +relacaoint7 + "setimo", relacaoint8 + "oitavo", relacaoint9 + "nono"};

                    Arrays.sort(teste);
                    String numerointev1 = teste[8];
                    String numerointev2 = teste[7];
                    int numerointev3 = 0;
                    int numerointev4 = 0;
                    int valoresinte = 0;
                    if (numerointev1.contains("primeiro")) {
                        numerointev3 = relacaoint1;
                        valoresinte = 1;
                    } else if (numerointev1.contains("segundo")) {
                        numerointev3 = relacaoint2;
                        valoresinte = 2;
                    } else if (numerointev1.contains("terceiro")) {
                        numerointev3 = relacaoint3;
                        valoresinte = 3;
                    } else if (numerointev1.contains("quarto")) {
                        numerointev3 = relacaoint4;
                        valoresinte = 4;
                    } else if (numerointev1.contains("quinto")) {
                        numerointev3 = relacaoint5;
                        valoresinte = 5;
                    } else if (numerointev1.contains("sesto")) {
                        numerointev3 = relacaoint6;
                        valoresinte = 6;
                    } else if (numerointev1.contains("setimo")) {
                        numerointev3 = relacaoint7;
                        valoresinte = 7;
                    } else if (numerointev1.contains("oitavo")) {
                        numerointev3 = relacaoint8;
                        valoresinte = 8;
                    } else if (numerointev1.contains("nono")) {
                        numerointev3 = relacaoint9;
                        valoresinte = 9;
                    }
                /* Numero 2*/

                    if (numerointev2.contains("primeiro")) {
                        numerointev4 = relacaoint1;
                    } else if (numerointev2.contains("segundo")) {
                        numerointev4 = relacaoint2;
                    } else if (numerointev2.contains("terceiro")) {
                        numerointev4 = relacaoint3;
                    } else if (numerointev2.contains("quarto")) {
                        numerointev4 = relacaoint4;
                    } else if (numerointev2.contains("quinto")) {
                        numerointev4 = relacaoint5;
                    } else if (numerointev2.contains("sesto")) {
                        numerointev4 = relacaoint6;
                    } else if (numerointev2.contains("setimo")) {
                        numerointev4 = relacaoint7;
                    } else if (numerointev2.contains("oitavo")) {
                        numerointev4 = relacaoint8;
                    } else if (numerointev2.contains("nono")) {
                        numerointev4 = relacaoint9;
                    }

                    int resultadointev = numerointev4 * 2;
                    if (numerointev3 >= resultadointev) {
                        Log.v("Script", "Xioo: " + valoresinte);
                            }
                    else{
                        valoresinte = 0;
                    }


                    String nomecompleto = valor1 + " " + valor2 + " " + valor3 + " " + valor4 + " " + valor5 + " " + valor6 + " " + valor7;

                    intent.putExtra("NOME", nomecompleto);
                    intent.putExtra("VALORES1", motivacao);
                    intent.putExtra("VALORES2", impressao);
                    intent.putExtra("VALORES3", expressao);
                    intent.putExtra("VALORES4", carmicas);
                    intent.putExtra("VALORES5", tendenciaocultas);
                    intent.putExtra("VALORES6", respsubecon);
                    intent.putExtra("VALORES7", ciclo1);
                    intent.putExtra("VALORES8", numerofinalciclo1);
                    intent.putExtra("VALORES9", ciclo2);
                    intent.putExtra("VALORES10", numerofinalciclo2);
                    intent.putExtra("VALORES11", ciclo3);
                    intent.putExtra("VALORES12", decisivos1);
                    intent.putExtra("VALORES13", decisivos2);
                    intent.putExtra("VALORES14", decisivos3);
                    intent.putExtra("VALORES15", decisivos4);
                    intent.putExtra("VALORES16", numerofinaldecisivo2);
                    intent.putExtra("VALORES17", numerofinaldecisivo3);
                    intent.putExtra("VALORES18", desafio1);
                    intent.putExtra("VALORES19", desafio2);
                    intent.putExtra("VALORES20", desafio3);
                    intent.putExtra("VALORES21", destino);
                    intent.putExtra("VALORES22", missao);
                    intent.putExtra("VALORES23", DividasCarmicas);
                    intent.putExtra("VALORES24", numerosfavor);
                    intent.putExtra("VALORES25", diale);
                    intent.putExtra("VALORES26", numeroanopessoal);
                    intent.putExtra("VALORES27",valoresinte);
                    intent.putExtra("VALORES28",datadia);

                    startActivity(intent);


                } else {
                    Toast.makeText(MainActivity.this, "Campos Obrigatórios", Toast.LENGTH_SHORT).show();
                }
            }
        });


        edtum = (EditText) findViewById(R.id.edtum);
        edtdois = (EditText) findViewById(R.id.edtdois);
        edttreis = (EditText) findViewById(R.id.edttres);
        edtquatro = (EditText) findViewById(R.id.edtquatro);
        edtcinco = (EditText) findViewById(R.id.edtcinco);
        edtseis = (EditText) findViewById(R.id.edtseis);
        edtsete = (EditText) findViewById(R.id.edtsete);
        edtdia = (EditText) findViewById(R.id.edtdia2);
        edtmes = (EditText) findViewById(R.id.edtmes);
        edtano = (EditText) findViewById(R.id.edtano);
        txtanopessoal = (EditText) findViewById(R.id.txtanopessoal);

    }


         @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
