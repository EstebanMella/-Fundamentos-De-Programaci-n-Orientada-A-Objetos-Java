package modelo;


public class Carta extends Correo
{
    int costo;
    char tipoEnvioCarta;
   public Carta(String remitente, String destino, char tipoEnvioCarta)
   {
       super(remitente,destino);
       this.tipoEnvioCarta=tipoEnvioCarta;
      valor=costo();
    }
   public int costo()
   {
        if (tipoEnvioCarta=='N')
       {
           costo=250;
        }
        else
        {
            costo=500;
        }
        return costo;
    }
    
   public int getTipoEnvioCarta()
   {
       return tipoEnvioCarta;
    }
   public void tipoEnvioCarta(char tipoEnvioCarta)
   {
       this.tipoEnvioCarta=tipoEnvioCarta;
    }
    public int calculoImpuesto()
    {
        int impuesto =costo()*(19/100);
        return impuesto;
    }  
     public int calculoCosto()
    {
        int costoDeCarta=(costo()-calculoImpuesto())*(35/100);
        return costoDeCarta;
    }
  
}
