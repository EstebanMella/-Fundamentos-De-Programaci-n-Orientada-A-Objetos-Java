package vista;
import controladora.Manejadora;
import modelo.*;
public class AppUsuarioBibliotecaSantoTomas
{
   public static void main(String[]arg)
   {
      int largo,op,op1, edad, numeroPrestamo;
      int opPri, opModi=0;
       String nombre, rut, cargo, turno, escuela, instituto, carrera,empresa,fono,telefono;
       char sexo;
       
    
       do{
                System.out.println("Ingrese cantidad de Usuarios De La Biblioteca Santo Tomas");
                largo=Leer.datoInt();
         } while (largo<1);
       Manejadora mane=new Manejadora(largo);
       do{
           System.out.println("    ");
           System.out.println("Elija Opcion");
           System.out.println("1.-Crear Usuarios de la Blibioteca Santo Tomas");
           System.out.println("2.-Buscar Usuario por Rut");
           System.out.println("3.-Eliminar Usuario por Rut");
           System.out.println("4.-Modificar Datos De Usuarios");
           System.out.println("5.-Mostrar nombre y nick de todos");
           System.out.println("6.-Cuenta Usuarios Externos");
           System.out.println("7.-Mostrar Guardias Empresa ACME");
           System.out.println("8.-Mostar Nombre Profesor y cambiar primer nombre por el seg");
           System.out.println("9.-Mostar Alumno mas viejo");
           System.out.println("10.-Palabra mas larga del Alumno");
           System.out.println("11.-Palabra mas larga del Funcionario de Aseo");
           System.out.println("12.-Salir");
           op=Leer.datoInt();
           
           switch(op)
           {
               case 1:
                    do{
                        System.out.println("    ");
                        System.out.println("Elija Opcion");
                        System.out.println("1.-Crear Profesor");
                        System.out.println("2.-Crear Alumno");
                        System.out.println("3.-Crear Usuario Externo");
                        System.out.println("4.-Crear Funcionario");
                        System.out.println("5.-Crear Funcionario de Aseo");
                        System.out.println("6.-Crear Funcionario Guardia");
                        System.out.println("7.-Volver al menu principal");
                        op=Leer.datoInt();
                     switch(op)
                   {
                        case 1:
                            System.out.println("Ingrese Rut Profesor");
                            rut=Leer.dato();
                            while(mane.buscarUsuario(rut)!=null)
                            {
                                System.out.println("Ingrese Rut Profesor Denuevo el Rut ya existe");                           
                                rut=Leer.dato();
                            };
                            System.out.println("    ");
                            System.out.println("Ingrese Nombre del Profesor");
                            nombre=Leer.dato();
                            System.out.println("Ingrese Telefono Profesor");
                            fono=Leer.dato();
                            System.out.println("Ingrese Escuela Profesor");
                            escuela=Leer.dato();
                            Profesor profesor=new Profesor(nombre, rut, fono,escuela);
                            mane.ingresarUsuarioBibliotecaSantoTomas(profesor);
                  
                         break;
                         case 2:
                            System.out.println("Ingrese Rut Alumno");
                            rut=Leer.dato();
                            while(mane.buscarUsuario(rut)!=null)
                            {
                                System.out.println("Ingrese Rut Alumno Denuevo el Rut ya existe");                           
                                rut=Leer.dato();
                            };
                            System.out.println("    ");
                            System.out.println("Ingrese Nombre del Alumno");
                            nombre=Leer.dato();
                            
                            System.out.println("Ingrese Edad Alumno");
                            edad=Leer.datoInt();
                            System.out.println("Ingrese Carrera Alumno");
                            carrera=Leer.dato();
                            do{
                                System.out.println("Ingrese sexo Alumno 1)Femenino 2)Masculino");
                                op1=Leer.datoInt();
                            }while(op1<0||op1>2);
                            if(op1==1)
                            {
                                sexo='F';
                            }
                            else
                            {
                                sexo='M';
                            }
                            Alumno alumno=new Alumno(nombre, rut, carrera, edad, sexo);
                            mane.ingresarUsuarioBibliotecaSantoTomas(alumno);
                 
                          break;
                          case 3:
                          System.out.println("Ingrese Rut Usuario Externo");
                          rut=Leer.dato();
                          while(mane.buscarUsuario(rut)!=null)
                          {
                            System.out.println("Ingrese Rut Usuario Externo Denuevo el Rut ya existe");                           
                            rut=Leer.dato();
                          };
                            System.out.println("    ");
                            System.out.println("Ingrese Nombre del Usuario Externo");
                            nombre=Leer.dato();                            
                            System.out.println("Ingrese Institucion Usuario Externo");
                            instituto=Leer.dato();
                            System.out.println("Ingrese Numero de Prestamo");
                            numeroPrestamo=Leer.datoInt();
                            UsuarioExterno usuarioExterno=new UsuarioExterno(nombre, rut, instituto,numeroPrestamo);
                            mane.ingresarUsuarioBibliotecaSantoTomas(usuarioExterno);
                        
                          break;
                          case 4:
                            System.out.println("Ingrese Rut Funcionario");
                            rut=Leer.dato();
                            while(mane.buscarUsuario(rut)!=null)
                            {
                                System.out.println("Ingrese Rut Funcionario Denuevo el Rut ya existe");                           
                                rut=Leer.dato();
                            };
                            System.out.println("    ");
                            System.out.println("Ingrese Nombre del Funcionario");
                            nombre=Leer.dato();                            
                            System.out.println("Ingrese Cargo");
                            cargo=Leer.dato();
                            Funcionario funcionario=new Funcionario(nombre, rut, cargo);
                            mane.ingresarUsuarioBibliotecaSantoTomas(funcionario);
                          break;
                          case 5:
                            System.out.println("Ingrese Rut Funcionario Aseo");
                            rut=Leer.dato();
                            while(mane.buscarUsuario(rut)!=null)
                            {
                                System.out.println("Ingrese Rut Funcionario Aseo Denuevo el Rut ya existe");                           
                                rut=Leer.dato();
                            };
                            System.out.println("    ");
                            System.out.println("Ingrese Nombre del Funcionario de Aseo");
                            nombre=Leer.dato();
                            System.out.println("Ingrese  Cargo");
                            cargo=Leer.dato();
                            do{
                                System.out.println("Ingrese sexo Alumno 1)Diurno 2)Masculino");
                                op1=Leer.datoInt();
                            }while(op1 < 0 || op1 > 2);
                            if(op1==1)
                            {
                                turno="Diurno";
                            }
                            else
                            {
                                turno="Vespertino";
                            }
                            Aseo aseo=new Aseo(nombre, rut, cargo,turno);
                            mane.ingresarUsuarioBibliotecaSantoTomas(aseo);
                          break;
                          case 6:
                            System.out.println("Ingrese Rut Funcionario Guardia");
                            rut=Leer.dato();
                            while(mane.buscarUsuario(rut)!=null)
                            {
                                System.out.println("Ingrese Rut Funcionario Guardia Denuevo el Rut ya existe");                           
                                rut=Leer.dato();
                            };
                            System.out.println("    ");
                            System.out.println("Ingrese Nombre del Funcionario de Guradia");
                            nombre=Leer.dato();
                            
                            System.out.println("Ingrese  Cargo");
                            cargo=Leer.dato();
                            System.out.println("Ingrese  Empresa");
                            empresa=Leer.dato();
                            Guardia guardia=new Guardia(nombre, rut, cargo,empresa);
                            mane.ingresarUsuarioBibliotecaSantoTomas(guardia);
                          break;
                          default:
                          if(op>7)
                          {
                              System.out.println("    ");
                              System.out.println("Opcion entre 1 y 7");
                            } 
                   }
                }while(op!=7);
                break;
               case 2:
                    System.out.println("    ");
                    System.out.println("Ingrese Rut Usuario Biblioteca Santo Tomas");
                    rut=Leer.dato();
                     if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                           {
                              System.out.println("El Usuario es : "+mane.buscarUsuario(rut));
                           }
                           else
                           {
                               System.out.println("El Rut no tiene Usuario");
                           }
               break;
               case 3:
                    System.out.println("    ");
                    System.out.println("Ingrese numero de serie del producto");
                    rut=Leer.dato();
                     if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                     {
                         mane.eliminarUsuario(rut);
                         System.out.println("El Usuario fue eliminado");
                     }
                     else
                     {
                          System.out.println("El rut no tiene Usuario ");
                     }
               break;
               case 4:
                          do{
                        System.out.println("    ");
                        System.out.println("-------Modificar Usuario Externo-------");
                        System.out.println("1.-Modificar Nombre");
                        System.out.println("2.-Modificar Institucion");
                        System.out.println("-------Modificar Alumnos-------");
                        System.out.println("3.-Modificar Nombre");
                        System.out.println("4.-Modificar Edad");
                        System.out.println("5.-Modificar Carrera");
                        System.out.println("6.-Modificar Sexo");
                        System.out.println("-------Modificar Profesor-------");
                        System.out.println("7.-Modificar Nombre");
                        System.out.println("8.-Modificar Escuela");
                        System.out.println("9.-Modificar Fono");
                        System.out.println("-------Modificar Funcionario-------");
                        System.out.println("10.-Modificar Nombre");
                        System.out.println("11.-Modificar Cargo");
                        System.out.println("-------Modificar Funcionario de Aseo-------");
                        System.out.println("12.-Modificar Nombre");
                        System.out.println("13.-Modificar Turno");
                        System.out.println("14.-Modificar Cargo");
                        System.out.println("-------Modificar Funcionario de Guardia-------");
                        System.out.println("15.-Modificar Nombre");
                        System.out.println("16.-Modificar Empresa");
                        System.out.println("17.-Modificar Cargo");
                        System.out.println("18-------Volver al Menu-------");
                        
                        opModi=Leer.datoInt();
                        switch(opModi)
                        {
                            case 1: 
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuario");
                                rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                System.out.println("Ingrese Nombre del Usuario Externo");
                                nombre=Leer.dato();
                                mane.modificarNombre(rut,nombre);
                                System.out.println("Nombre modificado");
                               }
                               else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 2:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuario");
                                rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                   System.out.println("Ingrese Institucion");
                                   instituto=Leer.dato();
                                   mane.modificarInstitucionExterno(rut,instituto);
                                   System.out.println("Institucion modificado");
                                }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 3:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuario");
                                rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                System.out.println("Ingrese Nombre nuevo del Alumno");
                                nombre=Leer.dato();
                                mane.modificarNombre(rut,nombre);
                                System.out.println("Nombre modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 4:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuario");
                                rut=Leer.dato();
                                if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                                {
                                   System.out.println("Ingrese nueva Edad del Alumno");
                                   edad=Leer.datoInt();
                                   mane.modificarEdadAlumno(rut,edad);
                                   System.out.println("Edad modificada");
                                }
                                 else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 5:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuarioo");
                                rut=Leer.dato();
                                if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                                {
                                    System.out.println("Ingrese nueva Carrera del Alumno");
                                    carrera=Leer.dato();
                                    mane.modificarCarreraAlumno(rut,carrera);
                                    System.out.println("Carrera modificada");
                                }
                                 else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 6:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuarioo");
                                rut=Leer.dato();
                                if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                                {
                                    do{
                                        System.out.println("Ingrese sexo Alumno a cambiar 1)Femenino 2)Masculino");
                                        op1=Leer.datoInt();
                                    }while(op1<0||op1>2);
                                    if(op1==1)
                                    {
                                        sexo='F';
                                    }
                                    else
                                    {
                                        sexo='M';
                                    }
                                    mane.modificarSexoAlumno(rut,sexo);
                                    System.out.println("Sexo modificado");
                                }
                                 else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 7:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuario");
                                rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                   System.out.println("Ingrese nuevo Nombre del Profesor");
                                   nombre=Leer.dato();
                                   mane.modificarNombre(rut,nombre);
                                   System.out.println("Nombre modificado");
                               }
                               else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 8:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuario");
                                rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                   System.out.println("Ingrese nueva escuela del Profesor");
                                   escuela=Leer.dato();
                                   mane.modificarEscuelaProfesor(rut,escuela);
                                    System.out.println("Escuela modificado");
                               }
                               else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 9:
                                System.out.println("    ");
                                System.out.println("Ingrese rut del usuario");
                                rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                   System.out.println("Ingrese nuevo Telefono del Profesor");
                                   fono=Leer.dato();
                                   mane.modificarFonoProfesor(rut,fono);
                                   System.out.println("Telefono modificado");
                               }
                               else
                               {
                                   System.out.println("Usuario no ingresado");
                                }
                            break;
                            case 10:
                                System.out.println("    ");
                               System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                System.out.println("Ingrese Nombre nuevo del Funcionario");
                                nombre=Leer.dato();
                                mane.modificarNombre(rut,nombre);
                                System.out.println("Nombre modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 11:
                                System.out.println("    ");
                               System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)
                               {
                                System.out.println("Ingrese Cargo nuevo del Funcionario");
                                cargo=Leer.dato();
                                mane.modificarCargoFuncionario(rut,cargo);
                                System.out.println("Cargo modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 12:
                                System.out.println("    ");
                               System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                System.out.println("Ingrese Nombre nuevo del Funcionario de Aseo");
                                nombre=Leer.dato();
                                mane.modificarNombre(rut,nombre);
                                System.out.println("Nombre modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 13:
                                System.out.println("    ");
                               System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)
                               {
                                   do{
                                       System.out.println("Ingrese sexo Alumno 1)Diurno 2)Masculino");
                                       op1=Leer.datoInt();
                                    }while(op1 < 0 || op1 > 2);
                                    if(op1==1)
                                    {
                                        turno="Diurno";
                                    }
                                    else
                                    {
                                        turno="Vespertino";
                                    }
                                   mane.modificarTurnoAseo(rut,turno);
                                   System.out.println("Turno modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 14:
                                System.out.println("    ");
                               System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)
                               {
                                System.out.println("Ingrese Cargo nuevo del Funcionario de Aseo");
                                cargo=Leer.dato();
                                mane.modificarCargoFuncionario(rut,cargo);
                                System.out.println("Cargo modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 15:
                                System.out.println("    ");                            
                                System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)//me devuelve el objeto por que lo encontro
                               {
                                System.out.println("Ingrese Nombre nuevo del Funcionario Guardia");
                                nombre=Leer.dato();
                                mane.modificarNombre(rut,nombre);
                                System.out.println("Nombre modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 16:
                                System.out.println("    ");
                               System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)
                               {
                                   System.out.println("Ingrese nueva Empresa del Funcionario Guardia");
                                   empresa=Leer.dato();
                                   mane.modificarEmpresaGuardia(rut,empresa);
                                   System.out.println("Empresa modificada");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                            case 17:
                                System.out.println("    ");
                               System.out.println("Ingrese rut del usuario");
                               rut=Leer.dato();
                               if(mane.buscarUsuario(rut)!=null)
                               {
                                System.out.println("Ingrese Cargo nuevo del Funcionario de Aseo");
                                cargo=Leer.dato();
                                mane.modificarCargoFuncionario(rut,cargo);
                                System.out.println("Cargo modificado");
                               }
                                else
                               {
                                   System.out.println("Usuario no ingresado");
                               }
                            break;
                        }
                    }while(opModi!=18);

               break;
               case 5:
                    System.out.println("Los Nombre y nick son: ");
                    UsuarioBibliotecaSantoTomas []verNomNck=mane.getMane();
                    for(int i=0;i<verNomNck.length;i++)
                      {
                        if(verNomNck[i]!=null)
                        {
                            System.out.println("Su nombre es: "+verNomNck[i].getNombre()+" y Su nick es:"+verNomNck[i].nickDeUsuario()+"\n");
                      
                        }
                    }
               break;
               case 6:
                   System.out.println(mane.cuentaTodosExterno());
               break;
               case 7:
                    System.out.println("Los guardia de la empresa ACME son: ");
                    Guardia []ver=mane.mostarTodosGuardiaACME();
                     for(int i=0;i<ver.length;i++)
                      {
                          System.out.println(ver[i]+"\n");
                      }
               break;
               case 8:
                   System.out.println("Ingrese Rut Profesor");
                   rut=Leer.dato();
                    while(mane.buscarUsuario(rut)==null)
                    {
                        System.out.println("Ingrese Rut Profesor, el rut no existe");                           
                        rut=Leer.dato();
                    };
                    System.out.println(mane.mostarNomProfAntesDespues(rut));
               break;
               case 9:
                    System.out.println("El alumnos mas viejo es y sus datos son: ");
                    System.out.println(mane.mostarAlumnoMasViejo());
                    
               break;
               case 10:
                    System.out.println("Ingrese Rut del alumno");
                    rut=Leer.dato();
                    while(mane.buscarUsuario(rut)==null)
                    {
                        System.out.println("Ingrese Rut Alumno, el rut no existe");                           
                        rut=Leer.dato();
                    };
                    Alumno alum=((Alumno)(mane.buscarUsuario(rut)));
                   System.out.println(alum.palabraMasLarga());
               break;
               case 11:
                    System.out.println("Ingrese Rut del Funcionario de Aseo");
                    rut=Leer.dato();
                    while(mane.buscarUsuario(rut)==null)
                    {
                        System.out.println("Ingrese Rut Funcionario de Aseo, el rut no existe");                           
                        rut=Leer.dato();
                    };
                    Aseo aseo=((Aseo)(mane.buscarUsuario(rut)));
                   System.out.println(aseo.palabraMasLarga());    
               break;
               default:
               if(op>12)
               {
                     System.out.println("Opcion entre 1 y 12");
               }
            }
        }while(op!=12);
  }
  }
