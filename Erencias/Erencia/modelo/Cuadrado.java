package modelo;



public class Cuadrado extends FiguraGeometrica
{
   public Cuadrado(double lado)
   {
       super(lado);
       
    }
    
      public double perimetro()
   {
       
       return getLado()*4;
    }
    
   public double area()
   {
       return getLado()*getLado();
    }
}
