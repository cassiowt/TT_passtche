package modelTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaskaraTest {
    Funcao polinomioSegundoGrau;
    Baskara baskara;


    @Before
    public void setUp() throws Exception {
        polinomioSegundoGrau = new Funcao(1,2,1);
        System.out.println("Testando a função: " + polinomioSegundoGrau);
        baskara = new Baskara(polinomioSegundoGrau);
    }

    @Test
    public void testVerificaDeltaZero(){
       float delta = baskara.caculaDelta();
       assertTrue("Erro", delta == 0);
    } @Test


    public void testVerificaDeltaDiferenteZero(){
       float delta = baskara.caculaDelta();
       assertFalse("Erro", delta != 0);
    }

    @Test
    public void testCalculoRaizUm(){

    }
}