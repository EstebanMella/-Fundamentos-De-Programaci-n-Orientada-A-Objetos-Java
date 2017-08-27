package modelo;



public abstract class Trabajador implements Pagable,Imponible
{
    protected String nombre,rut;
    protected int edad,numero;//numero autogenerado incremental de a uno
    public static int generador=100;
    
    public String toString()
    {
        return "Nombre: "+nombre+" Rut:"+rut+" Numero: "+numero;
    }
    public Trabajador(String nombre,String rut,int edad)
    {
        this.nombre=nombre;
        this.rut=rut;
        this.edad=edad;
        numero=generador;
        generador++;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getRut()
    {
        return rut;
    }
    public void setRut(String rut)
    {
        this.rut=rut;
    }
    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
}
