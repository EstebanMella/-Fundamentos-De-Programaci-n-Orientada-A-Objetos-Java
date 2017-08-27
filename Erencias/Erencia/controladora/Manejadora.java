package controladora;
import modelo.*;


public class Manejadora
{
    private FiguraGeometrica[]mane;
    public Manejadora(int cantidad)
    {
        mane=new FiguraGeometrica[cantidad];
    }
    
    public FiguraGeometrica[] getMane()
    {
        return mane;
    }
    
    public void ingresarFiguraGeometrica(FiguraGeometrica figura)
    {
        for(int i=0;i<mane.length;i++)
        {
            if(mane[i]==null)
            {
                mane[i]=figura;
                break;
            }
        }
    }
}
