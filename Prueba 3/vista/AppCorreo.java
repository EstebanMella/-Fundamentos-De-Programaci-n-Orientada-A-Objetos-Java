package vista;
import modelo.*;
import control.*;
import java.util.ArrayList;


public class AppCorreo
{
  public static void main(String[]arg)
    {
        String destino,remitente;
        int pesoGramo;
        int op,opTipoCarta,pesoGramoInt;
        char tipoEnvioCarta;
        Manejadora mane=new Manejadora();
        do
        {
            sop("Correo");
             sop("Que desea hacer?");
             sop("1.- Ingresar y crear Carta");
             sop("2.- Ingresar y crear Encomienda");
             sop("3.- Ver Utilidades Ganadas");
             sop("4.- Cuantos Gramos de encomienda se ha entregado");
             sop("5.-Salir");
             op=Leer.datoInt();
             switch (op)
             {
               case 1:
                  sop("Ingrese Destino de la carta");
                  destino=Leer.dato();
                  sop("Ingrese Remitente de la carta");
                  remitente=Leer.dato();
                  do
                  {
                      sop("Ingrese Tipo de la carta");
                      sop("1-Normal 2.-Expresa");
                     opTipoCarta=Leer.datoInt();
                     if (opTipoCarta<1 || opTipoCarta>2)
                     {
                         sop("Ingrese Una Opcion Valida");
                        }
                      if(opTipoCarta==1)
                      {
                          tipoEnvioCarta='N';
                          
                        }
                      else
                      {
                          tipoEnvioCarta='E';
                        }
                   }while(opTipoCarta<1 || opTipoCarta>2);
                 Carta carta= new Carta(remitente,destino,tipoEnvioCarta);
               break;
               case 2:
                  sop("Ingrese Destino de la Encomienda");
                  destino=Leer.dato();
                  sop("Ingrese Remitente de la Encomienda");
                  remitente=Leer.dato();
                  sop("Ingrese Gramos de la Encomienda");
                  pesoGramo=Leer.datoInt();
                  
                  Encomienda enco=new Encomienda(remitente,destino,pesoGramo);
               break;
               case 3:
                   sop("Las Utilidades Ganas Son: "+mane.totalDineroGanado());
               break;
               case 4:
                sop("Los Gramos Entregados son: " +mane.gramosEntregados());
               break;
               case 5:
                    sop("Hasta luego");
               break;
               default:
                if (op<1 ||op>5)
                {
                    sop("Ingrese una opcion valida");
                }
                }
        }while (op!=5);
    }
     public static void sop(String algo)
    {
        System.out.println(algo);
    }
}
