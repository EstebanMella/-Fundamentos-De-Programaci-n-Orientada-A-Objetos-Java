package modelo;



public class Encomienda extends Correo 
{
    private int pesoGramo;
     public Encomienda(String remitente, String destino,int pesoGramo)
     {
       super(remitente,destino);
       this.pesoGramo=pesoGramo;
       valor=50*pesoGramo;
    }
    
   public int  getPesoGramo()
   {
       return pesoGramo;
    }
   public void setPesoGramo(int pesoGramo)
   {
        this.pesoGramo=pesoGramo;
       
    }
    public int calculoImpuesto()
    {
        int impuesto =costo()*(19/100);
        return impuesto;
    }  
    public int costo()
    {
        int costo=pesoGramo*50;
        return costo;
    }
    public int calculoCosto()
    {
        int costoDeEmcomienda=(costo()-calculoImpuesto())*(25/100);
        return costoDeEmcomienda;
    }
    
}
