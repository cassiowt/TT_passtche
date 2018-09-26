package modelTest;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculo {
    Quadrado quadrado = new Quadrado();
    Triangulo triangulo, equilatero, isoceles, retangulo;
    Calcular cal = new Calcular();

    @Before
    public void setUp(){
        triangulo  = new Triangulo();
        triangulo.setB(3);
        triangulo.setAltura(5);
        equilatero = new Triangulo(2,2,2);
        isoceles   = new Triangulo(5, 8,3);
        retangulo  = new Triangulo(2,2,5);
        quadrado.setLado(2);

    }

    @Test
    public void calcularAreaTest(){
       int area = cal.area(quadrado);
        assertTrue("Errado", area == 4);
    }

    @Test
    public void calcularPerimetroTest(){
        int perimetro = cal.perimetro(quadrado);
        assertTrue("Errado", perimetro == 8);
    }

    @Test
    public void calcularAreaTestNok(){
        int area = cal.area(quadrado);
        assertFalse("Errado", area != 4);
    }

    @Test
    public void calcularPerimetroTestNok(){
        int perimetro = cal.perimetro(quadrado);
        assertFalse("Errado", perimetro != 8);
    }

    @Test
    public void areaTriangulo() {
        float area = cal.areaTriangulo(triangulo);
        assertTrue("Errado", area == 7.5f);
    }

    @Test
    public void areaTrianguloNok() {
        float area = cal.areaTriangulo(triangulo);
      assertFalse("Errado", area != 7.5f);
    }

    @Test
    public void validaTrinaguloEquilatero(){
       assertTrue("Triangulo errado", TipoTriangulo.EQUILATERO.equals(cal.verificaTipoTriangulo(equilatero)));
    }

    @Test
    public void validaTrinaguloIsoceles(){
        assertTrue("Triangulo errado", TipoTriangulo.ISOCELES.equals(cal.verificaTipoTriangulo(isoceles)));
    }
    @Test
    public void validaTrinaguloRetangulo(){
        assertTrue("Triangulo errado", TipoTriangulo.RETANGULO.equals(cal.verificaTipoTriangulo(retangulo)));
    }
}
