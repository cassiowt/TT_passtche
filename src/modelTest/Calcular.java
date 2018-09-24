package modelTest;

public class Calcular {

    public int area(Quadrado quadrado) {
        return quadrado.getLado() * quadrado.getLado();
    }

    public int perimetro(Quadrado quadrado){
        return quadrado.getLado() * 4;
    }

    public float areaTriangulo(Triangulo triangulo){

        return (triangulo.getB() * triangulo.getAltura())/2;
    }

    public TipoTriangulo verificaTipoTriangulo(Triangulo triangulo){

        if( triangulo.getA() == triangulo.getB() &&
            triangulo.getA() == triangulo.getH() &&
            triangulo.getB() == triangulo.getH())
        {
            return TipoTriangulo.EQUILATERO;
        }
         else if ( triangulo.getA() != triangulo.getB() &&
                triangulo.getA() != triangulo.getH() &&
                triangulo.getB() != triangulo.getH())
        {
            return TipoTriangulo.ISOCELES;
        }
            return TipoTriangulo.RETANGULO;
    }
}
