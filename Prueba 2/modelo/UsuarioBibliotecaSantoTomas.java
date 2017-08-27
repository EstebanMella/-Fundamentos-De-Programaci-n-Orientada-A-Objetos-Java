package modelo;


public abstract class UsuarioBibliotecaSantoTomas
{
    protected String nombre,rut;
    
    public abstract String nickDeUsuario();
    
        
    public UsuarioBibliotecaSantoTomas(String nombre,String rut)
    {
        this.nombre=nombre;
        this.rut=rut;
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
    
    public String toString()
    {
        return "El Usuario: "+nombre+" rut: "+rut;
    }
}
