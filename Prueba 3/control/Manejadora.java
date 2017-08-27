package control;
import modelo.*;
import java.util.ArrayList;


public class Manejadora
{
    private ArrayList<Correo>mane=new ArrayList<Correo>();
    public Manejadora()
    {
      
    }
    public ArrayList<Correo> getMane()
    {
        return mane;
    }
    public void ingresarCorreo(Correo correo)
    {
        mane.add(correo);
    }
     public int totalDineroGanado()
    {
        int total=0;
        for (int i=0;i<mane.size();i++)
        {
            total=total+mane.get(i).calculoUtilidad();
        }
        return total;
    }
     public int gramosEntregados()
    {
        int total=0;
        Encomienda enco;
        for (int i=0;i<mane.size();i++)
        {
            if (mane.get(i)instanceof Encomienda)
            {
                enco=((Encomienda)(mane.get(i)));
                total=total+enco.getPesoGramo();
            }
        }
        return total;            
    }
    
}
