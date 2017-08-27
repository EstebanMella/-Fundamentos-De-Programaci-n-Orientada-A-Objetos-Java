package modelo;


public abstract class Dependiente extends Trabajador implements Previsionable
{
    protected int horasn,valorh;
    public Dependiente(String nombre,String rut,int edad,int horasn,int valorh)
    {
        super(nombre, rut,edad);
        this.horasn=horasn;
        //this.horasx=horasx;
        this.valorh=valorh;
    }
    public int getHorasn()
    {
        return horasn;
    }
    public void setHorasn(int horasn)
    {
        this.horasn=horasn;
    }
    
    public int getValorh()
    {
        return valorh;
    }
    public void setValorh(int valorh)
    {
        this.valorh=valorh;
    }
    public int sueldoBruto()
    {
        return valorh*horasn;
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
