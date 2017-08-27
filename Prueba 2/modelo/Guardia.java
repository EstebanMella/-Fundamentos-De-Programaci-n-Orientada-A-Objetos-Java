package modelo;

public class Guardia extends Funcionario
{
   private String empresa;
   
   public String nickDeUsuario()
   {
       return super.nickDeUsuario()+(empresa.substring(0,1)).toUpperCase();
   }
    
   public Guardia(String nombre,String rut,String cargo,String empresa)
   {
       super(nombre,rut,cargo);
       this.empresa=empresa;
   }
    public String toString()
    {
        return super.toString()+" Empresa: "+empresa;
    }
   
   public String getEmpresa()
    {
        return empresa;
    }
    public void setEmpresa(String empresa)
    {
        this.empresa=empresa;
    }
       
}
