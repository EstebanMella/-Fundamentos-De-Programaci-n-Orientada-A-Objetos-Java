package vista;
import modelo.*;
import controlador.*;
import java.util.ArrayList;


public class AppTrabajador
{
    public static void main(String[]arg)
    {
        String nombre,rut;
        int edad,valorh,horasn,horasx,op1,op2,op3,monto;
        double porcentajeBono;
        do
        {
            sop("Empresas Acme");
            Manejadora mane=new Manejadora();
            do
            {
                sop("Que desea hacer?");
                sop("1.- Ingresar y crear trabajadores");
                sop("2.- Ver todos los trabajadores");
                sop("3.- Ver un trabajador");
                sop("4.- Eliminar un trabajador");
                sop("5.- Modificar el valor hora de un trabajador");
                sop("6.- Ver todos los trabajadores con horas extra");
                sop("7.- Ver dinero que necesita el dueño");
                sop("8.- Ver dinero necesario para AFP");
                sop("10.- Salir");
                op1=Leer.datoInt();
                switch(op1)
                {
                    case 1:
                    sop("Ingrese rut del trabajador");
                    rut=Leer.dato();
                    if(mane.buscarTrabajadorConIndice(rut)==-1)
                    {
                        sop("Ingrese nombre del trabajador");
                        nombre=Leer.dato();
                        sop("Ingrese edad del trabajador");
                        edad=Leer.datoInt();
                        sop("Que tipo de trabajador desea ingresar?");
                        sop("1: Indefinido");
                        sop("2: Contrata");
                        sop("3: Plazo Fijo");
                        sop("4: Honorarios");
                        op3=Leer.datoInt();
                        switch (op3)
                        {
                            case 1:
                            sop("Ingrese numero de horas normales trabajadas");
                            horasn=Leer.datoInt();
                            sop("Ingrese numero de horas extra trabajadas");
                            horasx=Leer.datoInt();
                            sop("Ingrese valor de horas trabajadas");
                            valorh=Leer.datoInt();
                            Indefinido inde=new Indefinido(nombre,rut,edad,horasn,horasx,valorh);
                            mane.ingresarTrabajador(inde);
                            sop("Trabajador Indefinido Ingresado");
                            break;
                            case 2:
                            sop("Ingrese numero de horas normales trabajadas");
                            horasn=Leer.datoInt();
                            sop("Ingrese valor de horas trabajadas");
                            valorh=Leer.datoInt();
                            Contrata con=new Contrata(nombre,rut,edad,horasn,valorh);
                            mane.ingresarTrabajador(con);
                            sop("Trabajador Contrata Ingresado");
                            break;
                            case 3:
                            sop("Ingrese numero de horas normales trabajadas");
                            horasn=Leer.datoInt();
                            sop("Ingrese valor de horas trabajadas");
                            valorh=Leer.datoInt();
                            sop("Ingrese porcentaje bono");
                            porcentajeBono=Leer.datoDouble();
                            PlazoFijo plaz=new PlazoFijo(nombre,rut,edad,horasn,valorh,porcentajeBono);
                            mane.ingresarTrabajador(plaz);
                            sop("Trabajador a Plazo Fijo Ingresado");
                            break;
                            case 4:
                            sop("Ingrese monto pactado");
                            monto=Leer.datoInt();
                            Honorarios hon=new Honorarios(nombre,rut,edad,monto);
                            mane.ingresarTrabajador(hon);
                            sop("Trabajador de Honorarios Ingresado");
                            break;
                        }
                    }
                    break;
                    case 2:
                    ArrayList<Trabajador>tra=mane.getMane();
                    sop("Los trabajadores son");
                    for (int i=0;i<tra.size();i++)
                    {
                        sop((tra.get(i)).toString());
                    }
                    break;
                    case 3:
                    sop("Ingrese rut del trabajador a buscar");
                    rut=Leer.dato();
                    sop("El trabajador es: "+mane.buscarTrabajador(rut));
                    break;
                    case 4:
                    sop("Ingrese rut del trabajador a eliminar");
                    rut=Leer.dato();
                    mane.eliminarTrabajador(rut);
                    sop("Trabajador eliminado");
                    break;
                    case 5:
                    sop("Ingrese rut del trabajador");
                    rut=Leer.dato();
                    if (mane.buscarTrabajador(rut)instanceof Indefinido)
                    {
                        sop("El valor hora es: "+((Indefinido)(mane.buscarTrabajador(rut))).getValorh());
                        sop("Ingrese nuevo valor hora");
                        valorh=Leer.datoInt();
                        mane.modificarValorHora(rut, valorh);
                        sop("Valor hora modificado");
                    }
                    if (mane.buscarTrabajador(rut)instanceof Indefinido)
                    {
                        sop("El nuevo valor hora es: "+((Indefinido)(mane.buscarTrabajador(rut))).getValorh());
                    }
                    break;
                    case 6:
                    ArrayList<Indefinido>ver=mane.trabajadoresConHorasExtra();
                    sop("Los trabajadores con horas extra son");
                    for (int i=0;i<ver.size();i++)
                    {
                        sop((ver.get(i)).toString());
                    }
                    break;
                    case 7:
                    sop("El total necesario es: "+mane.totalLucasParaTodo());
                    break;
                    case 8:
                    sop("El total necesario para AFP es: "+mane.totalLucasParaAFP());
                    break;
                    case 9:
                    sop("");
                    sop("Game over\nTry again");
                    sop("");
                    break;
                    case 10:
                    break;
                    default:
                    sop("Solo entre 1 y 10");
                }
            }while (op1!=10);
            sop("Si desea ingresar otra empresa digite 1");
            op2=Leer.datoInt();
        }while (op2==1);
        sop("Fin");
    }
    public static void sop(String algo)
    {
        System.out.println(algo);
    }
}
