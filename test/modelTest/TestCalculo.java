package modelTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculo {
    Quadrado quadrado = new Quadrado();
    Triangulo triangulo = new Triangulo();
    Calcular cal = new Calcular();

    @Before
    public void setUp(){
        quadrado.setLado(2);

        triangulo.setB(3);
        triangulo.setAltura(5);
    }

    @Test
    public void calcularAreaTest(){
       int area = cal.area(quadrado);
        Assert.assertTrue("Errado", area == 4);
    }

    @Test
    public void calcularPerimetroTest(){
        int perimetro = cal.perimetro(quadrado);
        Assert.assertTrue("Errado", perimetro == 8);
    }

    @Test
    public void calcularAreaTestNok(){
        int area = cal.area(quadrado);
        Assert.assertFalse("Errado", area != 4);
    }

    @Test
    public void calcularPerimetroTestNok(){
        int perimetro = cal.perimetro(quadrado);
        Assert.assertFalse("Errado", perimetro != 8);
    }

    @Test
    public void areaTriangulo() {
        float area = cal.areaTriangulo(triangulo);
        Assert.assertTrue("Errado", area == 7.5f);
    }

    @Test
    public void areaTrianguloNok() {
        float area = cal.areaTriangulo(triangulo);
        Assert.assertFalse("Errado", area != 7.5f);
    }
}
