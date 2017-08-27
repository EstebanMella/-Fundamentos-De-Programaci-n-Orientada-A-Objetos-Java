package modelo;



public abstract class Correo implements Impuestos
{
    protected String destino, remitente;
    protected String codigo;
    public static int generador=1;
    protected int valor;
    
    public Correo (String destino, String remitente)
    {
        this.destino = destino;
        this.remitente=remitente;
        codigo=destino.substring(0,5)+generador;
        generador++;
        
    }
    
    public String getDestino()
    {
        return destino;
    }
    
    public void setDestino(String destino)
    {
        this.destino = destino;
    }
    
     public String getRemitente()
    {
        return remitente;
    }
    
    public void setRemitente(String remitente)
    {
        this.remitente = remitente;
    }
    
     public String getCodigo()
    {
        return codigo;
    }
    public String toString()
    {
        return "Destino es: "+destino+" Su remitente es: "+remitente+ " Codigo: "+codigo;
    }
    
      public int calculoUtilidad()
    {
        int utilidad;
        utilidad=valor-(calculoImpuesto()+calculoCosto());
        return utilidad;
    }
    
}
