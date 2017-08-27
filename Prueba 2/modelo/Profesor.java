package modelo;

public class Profesor extends UsuarioBibliotecaSantoTomas
{
    private String fono,escuela;
   
    public void cambiaPrimerNombre()
    {
       String[]nom=(nombre.trim()).split(" ");
       String aux=nom[0];
       nom[0]=nom[1];
       nom[1]=aux;
       String n="";
       for(int i=0;i<nom.length;i++)
       {
           n=n+nom[i]+" ";
       }
       nombre=n;
    }

   public  String nickDeUsuario()
   {
       String[]nom=(nombre.trim()).split(" ");
       String ni="";
       for(int i=0;i<nom.length;i++)
       {
           ni=ni+nom[i].substring(0,2);
       }
       ni=ni+escuela.substring(escuela.length()-2);
       return ni;
    }
    public Profesor(String nombre,String rut,String fono,String escuela)
    {
        super(nombre,rut);
        this.fono=fono;
        this.escuela=escuela;
    }
    
    public String getFono()
    {
        return fono;
    }
    public void setFono(String fono)
    {
        this.fono=fono;
    }
    public String getEscuela()
    {
        return escuela;
    }
    public void setEscuela(String escuela)
    {
        this.escuela=escuela;
    }
    public String toString()
    {
        return super.toString()+" Telefono: "+fono+" Escuela: " + escuela;
    }
}
