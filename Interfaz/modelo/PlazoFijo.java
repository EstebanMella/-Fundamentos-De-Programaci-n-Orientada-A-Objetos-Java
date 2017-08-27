package modelo;


public class PlazoFijo extends Dependiente
{
    private double porcentajeBono;
    public PlazoFijo(String nombre,String rut,int edad,int horasn,int valorh,double porcentajeBono)
    {
        super(nombre,rut,edad,horasn,valorh);
        this.porcentajeBono=porcentajeBono;
    }
    public double getPorcentajeBono()
    {
        return porcentajeBono;
    }
    public void setPorcentajeBono(double porcentajeBono)
    {
        this.porcentajeBono=porcentajeBono;
    }
    public int sueldoBruto()
    {
        return (int)(super.sueldoBruto()+super.sueldoBruto()*porcentajeBono/100);
    }
    public int sueldoLiquido()
    {
        return sueldoBruto()-afp()-isapre()-impuesto();
    }
    public int impuesto()
    {
        return sueldoBruto()*5/100;
    }
}
