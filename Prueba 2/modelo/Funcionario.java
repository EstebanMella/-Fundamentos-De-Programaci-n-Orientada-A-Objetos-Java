package modelo;

public class Funcionario extends UsuarioBibliotecaSantoTomas
{
    protected String cargo;
    
   public  String nickDeUsuario()
   {
       String nom=nombre.trim();
       String ni="";
      
       ni=ni+nom.substring(0,3)+(cargo.substring(0,1)).toUpperCase();
       return ni;
    }
    
    public Funcionario(String nombre,String rut,String cargo)
    {
        super(nombre,rut);
        this.cargo=cargo;
    }
     public String toString()
    {
        return super.toString()+" Cargo: "+cargo;
    }
    
    public String getCargo()
    {
        return cargo;
    }
    public void setCargo(String cargo)
    {
        this.cargo=cargo;
    }
}
