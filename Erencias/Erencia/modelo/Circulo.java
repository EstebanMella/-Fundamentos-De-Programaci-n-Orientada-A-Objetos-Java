package modelo;



public class Circulo extends FiguraGeometrica
{
    public Circulo(double lado)
    {
        super(lado);
    }
    
    public double perimetro()
   {
       return 2*Math.PI*getLado();
    }
    
   public double area()
   {
       return Math.PI*Math.pow(getLado(),2);
    }
}
