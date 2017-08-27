package modelo;



public class Indefinido extends Dependiente
{
    private int horasx;
    public Indefinido(String nombre,String rut, int edad, int horasn,int horasx,int valorh)
    {
        super(nombre,rut,edad,horasn,valorh);
        this.horasx=horasx;
    }
    public int getHorasx()
    {
        return horasx;
    }
    public void setHorasx(int horasx)
    {
        this.horasx=horasx;
    }
    public int sueldoBruto()
    {
        return (int)(valorh*horasn+valorh*1.5*horasx);
    }
    public int sueldoLiquido()
    {
        return sueldoBruto()-afp()-isapre()-impuesto();
    }
    public int impuesto()
    {
        return (sueldoBruto()-afp()-isapre())*5/100;
    }
    public int afp()
    {
        return sueldoBruto()*13/100;
    }
    public int isapre()
    {
        return sueldoBruto()*7/100;
    }
}
