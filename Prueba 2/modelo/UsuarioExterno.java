package modelo;

public class UsuarioExterno extends UsuarioBibliotecaSantoTomas
{
   private String institucion;
   private int numeroPrestamo;
   
   public UsuarioExterno(String nombre,String rut,String institucion,int numeroPrestamo)
   {
       super(nombre,rut);
       this.institucion=institucion;
       this.numeroPrestamo=numeroPrestamo;
   }
    public String toString()
    {
        return super.toString()+" Institucion: "+institucion+" Numero Prestamo: " + numeroPrestamo;
    }
   
   public  String nickDeUsuario()
   {
       String[]nom=(nombre.trim()).split(" ");
       String ni="";
       for(int i=0;i<nom.length;i++)
       {
           ni=ni+nom[i].substring(0,1);
       }
       ni=ni+institucion.substring(institucion.length()-2);
       return ni;
    }
   
   public String getInstitucion()
    {
        return institucion;
    }
    public void setInstitucion(String institucion)
    {
        this.institucion=institucion;
    }
   public int getNumeroPrestamo()
    {
        return numeroPrestamo;
    }
    public void setNumeroPrestamo(int numeroPrestamo)
    {
        this.numeroPrestamo=numeroPrestamo;
    } 
    
}
