package modelo;



public class Triangulo extends Rectangulo
{
  public double lado3;
  public Triangulo(double lado1,double lado2, double lado3)
  {
      super(lado1,lado2);
      this.lado3=lado3;
  }  
  
  public double getLado3()
   {
       return lado3;
    }   
    
   public void setlado3(double lado3)
   {
       this.lado3=lado3;
   }
   
   public double perimetro()
   {
       return (getLado()+getLado2()+lado3);
    }
    
    public double area()
    {
        double p=perimetro()/2;
        return Math.sqrt(p*(p-getLado())*(p-getLado2())*(p-lado3));
    }
}
