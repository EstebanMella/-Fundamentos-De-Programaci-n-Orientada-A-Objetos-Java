package controlador;
import modelo.*;
import java.util.ArrayList;
public class Manejadora
{
    private ArrayList<Trabajador>mane=new ArrayList<Trabajador>();
    public Manejadora()
    {
       //mane=new ArrayList<Trabajador>();
    }
    public ArrayList<Trabajador> getMane()
    {
        return mane;
    }
    public void ingresarTrabajador(Trabajador trabajador)
    {
        mane.add(trabajador);
    }
    public Trabajador buscarTrabajador(String rut)
    {
        for(Trabajador tra: mane)
        {
            if (tra.getRut().compareToIgnoreCase(rut)==0)
            {
                return tra;
            }
        }
        return null;
    }
    public void eliminarTrabajador(String rut)
    {
        Trabajador tra=buscarTrabajador(rut);
        mane.remove(tra);
    }
    public ArrayList<Trabajador> todosTrabajadores()
    {
        ArrayList<Trabajador>tra=new ArrayList<Trabajador>();
        for (int i=0;i<mane.size();i++)
        {
            if (mane.get(i)instanceof Trabajador)
            {
                    tra.add((Trabajador)(mane.get(i)));
            }
        }
        return tra;
    }
    public int totalLucasParaTodo()
    {
        int total=0;
        for (int i=0;i<mane.size();i++)
        {
            total=total+mane.get(i).sueldoBruto();
        }
        return total;
    }
    public int totalLucasParaAFP()
    {
        int total=0;
        for (int i=0;i<mane.size();i++)
        {
            if (mane.get(i)instanceof Dependiente)
            {
                total=total+((Dependiente)(mane.get(i))).afp();
            }
        }
        return total;
    }
    public ArrayList<Indefinido> trabajadoresConHorasExtra()
    {
        ArrayList<Indefinido>inde=new ArrayList<Indefinido>();
        for (int i=0;i<mane.size();i++)
        {
            if (mane.get(i)instanceof Indefinido)
            {
                if(((Indefinido)(mane.get(i))).getHorasx()>0)
                {
                    inde.add((Indefinido)(mane.get(i)));
                }
            }
        }
        return inde;
    }
    public void modificarValorHora(String rut,int nuevoValorHora)
    {
        Trabajador x=buscarTrabajador(rut);
        int indice=buscarTrabajadorConIndice(rut);
        if(x instanceof Dependiente)
        {
            ((Dependiente)(x)).setValorh(nuevoValorHora);//hasta aqui modifica valor hora
            //mane.set(indice,x);//para modificar el objeto completo
        }
    }
    public int buscarTrabajadorConIndice(String rut)
    {
        for (int i=0;i<mane.size();i++)
        {
            if (mane.get(i).getRut()==rut)
            {
                return i;
            }
        }
        return -1;
    }
}
