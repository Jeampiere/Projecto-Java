package Proyecto;

import java.util.*;

public class ProyectoPoo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
       //email, nombre, fecha de nacimiento y contraseña.
       //Creo un arreglo para guardar listas
       ArrayList<String []> usuarios = new ArrayList<String []>();
//////////////////////////////////////////////////////////////////////////
////MENU PRINCIPAL
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
           System.out.println("*************************");
           System.out.println("|BIENVENIDO A TINDER-POL|");
           System.out.println("*************************");
           System.out.println("");
           System.out.println("1. Crear cuenta usuario");
           System.out.println("2. Iniciar sesión");
           System.out.println("3. Salir");
            
           System.out.print("Escoge una de las opciones: ");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   String nada = sn.nextLine();
                   //System.out.println("");
                   //int continuar_3=0;
                   //while (continuar_3==0){
                   System.out.println("Ingrese el tipo de usuario premium o standard: ");
                   String usuario = sn.nextLine();
                   /*if (usuario.equals("standard")|| usuario.equals("premium")){
                        continuar_3=1;
                    }
                    else
                        continuar_3=0;
                   }*/
                   ////////////////////////////////////////////////////////////////
                   int continuar_1=0;
                   String email_1="";
                   while(continuar_1==0){
                   System.out.println("Ingrese email: ");
                   String email = sn.nextLine().toLowerCase();
                   //////EN ESTA PARTE COMPUEBO EL @//////
                   int indice=email.indexOf("@");
                   //System.out.println(email.charAt(indice));
                   char Caracter=(email.charAt(indice));
                   String arroba=String.valueOf(Caracter);
                   ///////////////////////////////////////
                   if(arroba.equals("@")&& (email.endsWith(".com")|| email.endsWith(".ec"))){
                    continuar_1=1;
                    email_1=email;
                   }
                   else
                    continuar_1=0;
                   }
                   
                   ///////////////////////////////////////////////////////////////
                   System.out.println("Ingrse su nombre: ");
                   String nombre = sn.nextLine();
                   ///////////////////////////////////////////////////////////////
                   int continuar_2=0;
                   String fecha_nacimiento_1="";
                   while(continuar_2==0){
                   System.out.println("Ingrese su fecha de nacimiento(separado por DD/MM/AA): ");
                   String fechaNacimiento = sn.nextLine();
                   String[] parts_fecha_nacimiento = fechaNacimiento.split("/");
                   //System.out.println(parts_fecha_nacimiento[2]);
                   //valido el anio////
                   String part_anio = parts_fecha_nacimiento[2];
                   int anio = Integer.parseInt(part_anio);
                   //valido el dia////
                   String part_dia = parts_fecha_nacimiento[0];
                   int dia = Integer.parseInt(part_dia);
                   //valido el mes///
                   String part_mes = parts_fecha_nacimiento[1];
                   int mes = Integer.parseInt(part_mes);
                   //System.out.println(anio);
                   if ((anio>1900 && anio<2001)&&(dia>0 && dia<=31)&& (mes>0 && mes<13)){
                        continuar_2=1;
                        fecha_nacimiento_1=fechaNacimiento;
                    }
                    else 
                        continuar_2=0;
                    }
                    /////////////////////////////////////////////////////////////
                   System.out.println("Ingrese la contraseña: ");
                   String contraseña = sn.nextLine();
                   //String [] usuarioPremiun = new String[6];
                   //String [] usuarioStandar = new String[4];
                   if (usuario.equals("premium")){
                       String [] usuarioPremiun = new String[6];
                       System.out.println("Ingrese el numero de su tarjeta de credito: ");
                       String tarjetaCredito = sn.nextLine();
                       System.out.println("Ingrese la fecha de caducidad: ");
                       String fDeCaducidad = sn.nextLine();
                       //email, nombre, fecha de nacimiento y contraseña.
                       //AGREGAMOS CADA CAMPO EL VECTOR Y LUEGO A EL ARREGLO (LISTA DENTRO DE ARREGLO)
                       usuarioPremiun[0]=email_1;
                       usuarioPremiun[1]=nombre;
                       usuarioPremiun[2]=fecha_nacimiento_1;
                       usuarioPremiun[3]=contraseña;
                       usuarioPremiun[4]=tarjetaCredito;
                       usuarioPremiun[5]=fDeCaducidad;
                       usuarios.add(usuarioPremiun);
                   
                   }
                   //AGREGAMOS CADA CAMPO EL VECTOR Y LUEGO A EL ARREGLO (LISTA DENTRO DE ARREGLO)
                   else if(usuario.equals("standard")){
                       String [] usuarioStandar = new String[4];
                       usuarioStandar[0]=email_1;
                       usuarioStandar[1]=nombre;
                       usuarioStandar[2]=fecha_nacimiento_1;
                       usuarioStandar[3]=contraseña;
                       usuarios.add(usuarioStandar);
                       
                   }

                   break;

                case 2:
                //CREAMOS UN SUBMENU
                   int opcionC2;
                   boolean salida = false;
                   while(!salida){
                       System.out.println("");
                       System.out.println("**Bienvenido**");
                       System.out.println("\n1. Completar perfil");
                       System.out.println("2. Buscar pareja");
                       System.out.println("3. Buzón");
                       System.out.println("4. Salir");
                       System.out.print("Escoge una de las opciones: ");
                       opcionC2 = sn.nextInt();
                       System.out.println("");
                       switch(opcionC2){
                           case 1:
                               int edad, genero, estatura, intereses, profesion, color;
                               //Ingreo del numero de opcion que indica la edad
                               System.out.println("Intervalos de edades");
                               System.out.println("\n1. 18-22");
                               System.out.println("2. 22-26");
                               System.out.println("3. 27-31");
                               System.out.print("Ingrese el intervalo en el que se encuentra su edad: ");
                               edad = sn.nextInt();
                               
                               ////Ingreo del numero de opcion que indica el genero
                               System.out.println("*********************************************************************************");
                               System.out.println("Genero");
                               System.out.println("\n1. Masculino");
                               System.out.println("2. Femenino");
                               System.out.print("Ingrse la opcion que corresponde a su genero: ");
                               genero = sn.nextInt();
                               
                               
                               ////Ingreo del numero de opcion que indica el 
                               System.out.println("*********************************************************************************");
                               System.out.println("Intervalos de estatura.");
                               System.out.println("\n1. 1.50-1.70");
                               System.out.println("2. 1.71-1.90");
                               System.out.println("3. 1.91-2.10");
                               System.out.print("Ingrese el intervalo en el que se encuentra su estatura: ");
                               estatura = sn.nextInt();
                               
                               ////Ingreo del numero de opcion de interes que mas le llame la atencion
                               System.out.println("*********************************************************************************");
                               System.out.println("Intereses");
                               System.out.println("\n1. Muúica");
                               System.out.println("2. Deportes");
                               System.out.println("3. Animales");
                               System.out.println("4. Moda");
                               System.out.println("5. Viajar");
                               System.out.print("Ingree del numero de opcion de interes que mas le llame la atencion: ");
                               intereses = sn.nextInt();
                               
                               ////Ingreo del numero de opcion de profesion que mas le llame la atencion
                               System.out.println("*********************************************************************************");
                               System.out.println("Profesión");
                               System.out.println("\n1. Ingeniero");
                               System.out.println("2. Abogado");
                               System.out.println("3. Economista");
                               System.out.println("4. Arquitecto");
                               System.out.println("5. Porfesor");
                               System.out.print("Ingree del numero de opcion de profesión que mas le llame la atencion: ");
                               profesion = sn.nextInt();
                               
                               ////Ingreo del numero de opcion de Color que mas le llame la atencion
                               System.out.println("*********************************************************************************");
                               System.out.println("Color que mas te llama la atención");
                               System.out.println("\n1. Negro");
                               System.out.println("2. Rojo");
                               System.out.println("3. Azul");
                               System.out.println("4. Verde");
                               System.out.println("5. Amarillo");
                               System.out.print("Ingrese el intervalo en el que se encuentra su estatura: ");
                               color = sn.nextInt();
                               System.out.println("*********************************************************************************");
                               
                               System.out.println("LISTO COMPLETASTE TU PERFIL");
                               break;
                           case 2:
                           case 3:
                           
                           case 4:
                               salida=true;
                           default:
                               System.out.println("Solo números entre 1 y 4");
                       }
                    }
                    break;
                   
                case 3:
                    salir=true;
                   break;
                   
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
            
       }
        
        
    }
}
