package modelo;



public class Honorarios extends Trabajador
{
    private int monto;
    public Honorarios(String nombre,String rut,int edad,int monto)
    {
        super(nombre,rut,edad);
        this.monto=monto;
    }
    public int getMonto()
    {
        return monto;
    }
    public void setMonto(int monto)
    {
        this.monto=monto;
    }
    public int sueldoBruto()
    {
        return monto;
    }
    public int sueldoLiquido()
    {
        return sueldoBruto()-impuesto();
    }
    public int impuesto()
    {
        return monto*10/100;
    }
}
