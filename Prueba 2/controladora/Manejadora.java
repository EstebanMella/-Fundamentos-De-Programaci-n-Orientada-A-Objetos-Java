package controladora;
import modelo.*;


public class Manejadora
{
    private UsuarioBibliotecaSantoTomas[]mane;
    public Manejadora(int cantidad)
    {
        mane=new UsuarioBibliotecaSantoTomas[cantidad];
    }
    
    public UsuarioBibliotecaSantoTomas[] getMane()
    {
        return mane;
    }
    
     public void ingresarUsuarioBibliotecaSantoTomas(UsuarioBibliotecaSantoTomas usuario)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]==null)
            {
                mane[i]=usuario;
                break;
            }
        }
    }
    
     public UsuarioBibliotecaSantoTomas buscarUsuario(String rut)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)//quiere decir que el producto esta por lo tanto entra en el if
            {
                //se compara si el numero de serie que estaba almacenado es igual al numero serie ingresado por parametros
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {
                    return mane[i];
                }
            } 
        }
        return null;
    }
    
    public void eliminarUsuario(String rut)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)//el producto esta por lo tanto entra
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {
                     mane[i]=null;
                }
            } 
        }
    }
     public void modificarNombre(String rut,String nombre)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {
                     mane[i].setNombre(nombre);
                }
            } 
        }
    }
     public void modificarInstitucionExterno(String rut,String institucion)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((UsuarioExterno) (mane[i])).setInstitucion(institucion);
                    
                }
            } 
        }
    }
     public void modificarEdadAlumno(String rut,int edad)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Alumno) (mane[i])).setEdad(edad);
                    
                }
            } 
        }
    }
     public void modificarCarreraAlumno(String rut,String carrera)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Alumno) (mane[i])).setCarrera(carrera);
                    
                }
            } 
        }
    }
     public void modificarSexoAlumno(String rut,char sexo)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Alumno) (mane[i])).setSexo(sexo);
                    
                }
            } 
        }
    }
     public void modificarEscuelaProfesor(String rut,String escuela)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Profesor) (mane[i])).setEscuela(escuela);
                    
                }
            } 
        }
    }
     public void modificarFonoProfesor(String rut,String fono)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Profesor) (mane[i])).setFono(fono);
                    
                }
            } 
        }
    }
     public void modificarCargoFuncionario(String rut,String cargo)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Funcionario) (mane[i])).setCargo(cargo);
                    
                }
            } 
        }
    }
     public void modificarTurnoAseo(String rut,String turno)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Aseo) (mane[i])).setTurno(turno);
                    
                }
            } 
        }
    }
    public void modificarEmpresaGuardia(String rut,String empresa)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {   
                    ((Guardia) (mane[i])).setEmpresa(empresa);
                    
                }
            } 
        }
    }
    
   
    public String cuentaTodosExterno()
    {
        int externo=0;
        
         for(int i=0;i<mane.length;i++)
      {
        if(mane[i]!=null)
        {
             if (mane[i] instanceof UsuarioExterno)
           {   
               
               externo++;
               //System.out.println("Usuario Externo N° "+externo);
           } 
        }
      }
      String total=" Externos son: "+externo;
      return total;
    }
    
    public Guardia[] mostarTodosGuardiaACME()
    {
        String empresa;
        int cont=0;
        Guardia[]guar;
         for(int i=0;i<mane.length;i++)
      {
        if(mane[i]!=null)
        {   
            
             if (mane[i] instanceof Guardia ) 
             {
                 empresa=((Guardia) (mane[i])).getEmpresa();
                 if(empresa.compareToIgnoreCase("ACME")==0)
                 {   
                     cont++; 
               
                 } 
                }
         }
      }
      guar=new Guardia[cont];
      int k=0;
          for(int i=0;i<mane.length;i++)
      {
        if(mane[i]!=null)
        {   
            
             if (mane[i] instanceof Guardia ) 
             {
                 empresa=((Guardia) (mane[i])).getEmpresa();
                 if(empresa.compareToIgnoreCase("ACME")==0)
                 {   
                     guar[k]=((Guardia) (mane[i]));
                     k++;
               
                 } 
                }
         }
      }
      return guar;
    }
     public String mostarNomProfAntesDespues(String rut)
    {
        int indice=-1;
        String nombreAntiguo="";
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]!=null)//el producto esta por lo tanto entra
            {
                if(mane[i].getRut().compareToIgnoreCase(rut)==0)
                {
                     if(mane[i] instanceof Profesor ) 
                     {
                        nombreAntiguo=((Profesor) (mane[i])).getNombre();
                        ((Profesor) (mane[i])).cambiaPrimerNombre();
                        indice=i;
                        
                     }
                }
            } 
        }
        return "Nombre es: "+nombreAntiguo+" y Nombre Cambiado: "+((Profesor) (mane[indice])).getNombre();
    }
    public Alumno mostarAlumnoMasViejo()
    {
        int edad,indice=-1;
        edad=((Alumno) (mane[0])).getEdad();
      for(int i=0;i<mane.length;i++)
      {
        if(mane[i]!=null)
        {   
            
             if (mane[i] instanceof Alumno ) 
             {
                 
                 if(edad<((Alumno) (mane[i])).getEdad())
                 {   
                     
                     indice=i;
                     edad=((Alumno) (mane[i])).getEdad();
                 } 
                }
         }
      }
      if(indice!=-1)
      {
          return ((Alumno)(mane[indice]));
      }
     
      return null;
    }
}
