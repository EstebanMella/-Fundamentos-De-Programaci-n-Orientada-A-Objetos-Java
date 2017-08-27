package modelo;

public class Contrata extends Dependiente
{
    //private String turno;
    public Contrata(String nombre,String rut,int edad,int horasn,int valorh)
    {
        super(nombre,rut,edad,horasn,valorh);
        //this.turno=turno;
    }
    //public String getTurno()
    //{
    //    return turno;
    //}
    //public void setTurno(String turno)
    //{
    //    this.turno=turno;
    //}
    public int sueldoLiquido()
    {
        return sueldoBruto()-afp()-isapre()-impuesto();
    }
    public int impuesto()
    {
        return sueldoBruto()*6/100;
    }
}
