package app;


import modelTest.Baskara;
import modelTest.Funcao;

public class Teste {


    public static void main(String[] args) {
        Funcao polinomioSegundoGrau = new Funcao(1,2,1);
        System.out.println(polinomioSegundoGrau);

        Baskara baskara = new Baskara();
        baskara.setFuncao(polinomioSegundoGrau);


    }



}
