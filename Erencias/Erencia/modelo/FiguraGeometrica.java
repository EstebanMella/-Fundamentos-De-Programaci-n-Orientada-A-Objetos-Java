package modelo;



public class FiguraGeometrica
{
   private double lado;
   
   public FiguraGeometrica(double lado)
   {
       this.lado=lado;
   }
   
   public double getLado()
   {
       return lado;
    }   
    
   public void setlado(double lado)
   {
       this.lado=lado;
   }
   
   public double perimetro()
   {
       return -1;
    }
    
   public double area()
   {
       return -1;
    }
}
