package vista;
import modelo.*;
import controladora.*;


public class AppFigurasGeometrica
{
    public static void main(String[]arg)
    {
    int largo,op,op1;
    double lado,lado2,lado3;
    
       do{
                System.out.println("Ingrese cantidad de Figuras Geometricas");
                largo=Leer.datoInt();
         } while (largo<1);
    Manejadora mane=new Manejadora(largo);
    do{
        System.out.println("Elija Opcion");
        System.out.println("1.-Crear circulo");
        System.out.println("2.-Crear cuadrado");
        System.out.println("3.-Crear restangulo");
        System.out.println("4.-Crear triangulo");
        System.out.println("5.-Crear figura geometrica");
        System.out.println("6.-Ver areas de todos");
        System.out.println("7.-Ver perimetros de todos");
        System.out.println("8.-Salir");
        op=Leer.datoInt();
        switch(op)
        {
            case 1:
                System.out.println("Ingrese radio del circulo");
                lado=Leer.datoDouble();
                Circulo circulo=new Circulo(lado);//crar objeto circulo
                mane.ingresarFiguraGeometrica(circulo);
            break;
            case 2:
                 System.out.println("Ingrese Lado del cuadrado");
                 lado=Leer.datoDouble();
                 Cuadrado cuadrado=new Cuadrado(lado);
                 mane.ingresarFiguraGeometrica(cuadrado);
            break;
            case 3:
                 System.out.println("Ingrese Lado  1 del rectangulo");
                 lado=Leer.datoDouble();   
                 System.out.println("Ingrese Lado 2 del rectangulo");
                 lado2=Leer.datoDouble();
                 Rectangulo rectangulo=new Rectangulo(lado,lado2);
                 mane.ingresarFiguraGeometrica(rectangulo);
            break;
            case 4:
                System.out.println("Ingrese Lado  1 del Triangulo");
                 lado=Leer.datoDouble();   
                 System.out.println("Ingrese Lado 2 del Triangulo");
                 lado2=Leer.datoDouble();
                 System.out.println("Ingrese Lado 3 del Triangulo");
                 lado3=Leer.datoDouble();
                 Triangulo triangulo=new Triangulo(lado,lado2,lado3);
                 mane.ingresarFiguraGeometrica(triangulo);
            break;
            case 5:
                
            break;
            case 6:
            break;
            case 7:
            break;
            default:
              System.out.println("Opcion entre 1 y 7");
           
        }
    }while(op!=7);
    }
}
