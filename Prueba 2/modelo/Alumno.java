package modelo;

public class Alumno extends UsuarioBibliotecaSantoTomas
{
    private String carrera;
    private int edad;
    private char sexo;
    
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
    public  String nickDeUsuario()
   {
       String nom=nombre.trim();
       String ni="";
      
       ni=ni+nom.substring(0,3)+nom.substring(nom.length()-2)+carrera.substring(0,5);
       return ni;
    }
    public Alumno(String nombre,String rut,String carrera,int edad,char sexo)
    {
        super(nombre,rut);
        this.edad=edad;
        this.sexo=sexo;
        this.carrera=carrera;
    }
    public String toString()
    {
        return super.toString()+" Edad: "+edad+" Sexo: "+sexo+" Carrera: "+carrera;
    }
    public String getCarrera()
    {
        return carrera;
    }
    public void setCarrera(String carrera)
    {
        this.carrera=carrera;
    }
   public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public char getSexo()
    {
        return sexo;
    }
    public void setSexo(char sexo)
    {
        this.sexo=sexo;
    } 
}
