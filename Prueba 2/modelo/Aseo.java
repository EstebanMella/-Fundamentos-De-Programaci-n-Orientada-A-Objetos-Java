package modelo;

public class Aseo extends Funcionario
{
    private String turno;
    
   public String palabraMasLarga()
    {
       String[]nom=(nombre.trim()).split(" ");
       String mayor="";
       int largoM=nom[0].length();
       for(int i=0;i<nom.length;i++)
       {
           if(nom[i].length()>largoM)
           {
               largoM=nom[i].length();
               mayor=nom[i];
           }
       }
       return mayor;
    }
    
   public String nickDeUsuario()
   {
       return super.nickDeUsuario()+(turno.substring(0,1)).toUpperCase();
   }
    
    public Aseo(String nombre,String rut,String cargo,String turno)
   {
       super(nombre,rut,cargo);
       this.turno=turno;
   }
    public String toString()
    {
        return super.toString()+" Turno: "+turno;
    }
   
   public String getTurno()
    {
        return turno;
    }
    public void setTurno(String turno)
    {
        this.turno=turno;
    }
}
