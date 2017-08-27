package controlador;
import java.util.*;
import modelo.*;

public class ManejadoraHashMap
{
    private HashMap<String,Trabajador>mane;
    public ManejadoraHashMap()
    {
        mane=new HashMap<String,Trabajador>();
    }
    public HashMap<String,Trabajador> getMane()
    {
        return mane;
    }
    public void ingresarTrabajador(Trabajador trabajador)
    {
        if (mane.containsKey(trabajador.getRut())==false)
        {
            mane.put(trabajador.getRut(), trabajador);
        }
    }
    public Trabajador buscarTrabajador(String rut)
    {
        if (mane.containsKey(rut)==true)
        {
            return mane.get(rut);
        }
        else
        {
            return null;
        }
    }
    public void eliminarTrabajador(String rut)
    {
        if (mane.containsKey(rut)==true)
        {
            mane.remove(rut);
        }
    }
    public HashMap<String,Indefinido> trabajadoresConHorasExtra()
    {  //Ejemplo profe tenia Dependiente en vez de Indefinido
        HashMap<String,Indefinido>extras=new HashMap<String,Indefinido>();
        Collection cole=mane.values();
        //Iterator<Trabajador> ite=cole.iterator();
        for (Iterator ite=cole.iterator();ite.hasNext();)
        {
            Trabajador tra=(Trabajador)(ite.next());
            if (tra instanceof Indefinido)
            {
                if (((Indefinido)(tra)).getHorasx()>0)
                {
                    extras.put(tra.getRut(),((Indefinido)(tra)));
                }
            }
        }
        return extras;
    }
    public int totalLucasParaTodo()
    {
        int total=0;
        Collection cole=mane.values();
        for (Iterator ite=cole.iterator();ite.hasNext();)
        {
            total=total+((Trabajador)(ite.next())).sueldoBruto();
        }
        return total;
    }
    public int totalLucasParaAFP()
    {
        int total=0;
        Collection cole=mane.values();
        for (Iterator ite=cole.iterator();ite.hasNext();)
        {
            Trabajador tra=((Trabajador)(ite.next()));
            if (tra instanceof Dependiente)
            {
                total=total+((Dependiente)(tra)).afp();
            }
        }
        return total;
    }
    public void modificarValorHora(String rut, int nuevoValorHora)
    {
        Trabajador tra=buscarTrabajador(rut);
        if (tra instanceof Dependiente)
            {
                ((Dependiente)(tra)).setValorh(nuevoValorHora);
            }
    }
}
