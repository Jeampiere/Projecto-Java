package Proyecto;

import java.util.*;

public class ProyectoPoo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
       //email, nombre, fecha de nacimiento y contraseña. 
        ArrayList<String> usuarios = new ArrayList<>(); 
//////////////////////////////////////////////////////////////////////////
        String [] usuarioStandar = new String[4];
        String [] usuarioPremiun = new String[6];
       
       
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Crear cuenta usuario");
           System.out.println("2. Iniciar sesión");
           System.out.println("3. Salir");
            
           System.out.print("Escribe una de las opciones: ");
           opcion = sn.nextInt();
            
           switch(opcion){
               case 1:
                   String nada = sn.nextLine();
                   //System.out.println("");
                   //int continuar_3=0;
                   //while (continuar_3==0){
                   System.out.println("Ingrese el tipo de usuario premium o standard: ");
                   String usuario = sn.nextLine();
                   
                   
                   
                case 2:
                   int opcionC2;
                   boolean salida = false;
                   //Validar que el usuario exista 
                
                   
                   
                   
                   while(!salida){
                       System.out.println("Escribe una de las opciones");
                       System.out.println("1. Completar perfil");
                       System.out.println("2. Buscar pareja");
                       System.out.println("3. Buzón");
                       System.out.println("4. Salir");
                       opcionC2 = sn.nextInt();
                       
                       switch(opcionC2){
                           case 1:
                               /*En la opción de Completar Perfil, el usuario creara su perfil con preguntas
                               de información básica: género, profesión. También debe incluir preguntas que 
                               ayuden a averiguar la compatibilidad entre dos personas, por ejemplo edad de 
                               interés, pasatiempos, etc. Deben incluir al menos 6 preguntas que permitan 
                               averiguar la compatibilidad. Para facilitar su trabajo se sugiere que se usen 
                               preguntas de múltiple opción.(Se incluyen archivos de profesiones e intereses,
                               por si desea utilizarlos)*/
                               
                               String edad, interes, genero, profesion, estatura, colorFav, hobbie, lugarFav; 
                               System.out.println("Genero");
                               System.out.println("1. Masculino");
                               System.out.println("2.Femenino");
                               genero = sn.nextLine();
                               /////////////////////////////////////////////
                               System.out.println("Profesion");
                               System.out.println("1. Masculino");
                               System.out.println("2.Femenino");
                               

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