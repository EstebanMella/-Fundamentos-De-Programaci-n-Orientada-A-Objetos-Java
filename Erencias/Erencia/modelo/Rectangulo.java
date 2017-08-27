package modelo;



public class Rectangulo extends Cuadrado
{
    private double lado2;
    public Rectangulo(double lado1, double lado2)
    {
        super(lado1);
        this.lado2=lado2;
    }
    
    public double getLado2()
    {
        return lado2;
    }
    
    public void setLado2(double lado2)
    {
        this.lado2=lado2;
    }
    
    public double perimetro()
   {
       return lado2*2+getLado()*2;
    }
    
   public double area()
   {
       return getLado()*lado2;
    }
}
