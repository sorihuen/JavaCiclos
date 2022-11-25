import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        boolean respuesta= true;
        int opcion;
        clearScreen();

        do{
            menu();
            opcion = capturaopcion();
            clearScreen();
             respuesta = evaluaropcion(opcion);
          
        } while(respuesta == true);


    }
    private static int capturaopcion(){
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
     


    }
    private static void menu(){
        System.out.println("Seleccione un tema del Taller");
        System.out.println("1. Tema [1]: ***** Figuras de Asteriscos *****");
        System.out.println("2. Tema [2]: ***** Figura de Piramide Invertida *****");
        System.out.println("3. Tema [3]: ***** Figura del Arbol *****");
        System.out.println("4. Tema [4]: ***** Tabla de Multiplicar *****");
        System.out.println("5. Tema [5]: ***** Menu Ejemplo *****");
        System.out.println("6. Tema [6]: ***** Contacto Telefonico *****");
        System.out.println("7.  Tema[7]: ***** Parqueadero el Guardian ***");
        System.out.println("8.  Tema[8]: ***** Escuela Automovilista El Maestro ***");
        System.out.println("0.   ***** Salir del Sistema ***");
        System.out.println("-----------------------------------------------");
      


    }
    private static boolean evaluaropcion(int opcion){

        switch(opcion){
            case 1:
                Tema1 t1 = new Tema1();
                t1.piramideAsterisco();
                return true;
            case 2:
               Tema2 t2 = new Tema2();
               t2.PiramideInvertida();
               return true;

                
            case 3:
                Tema3 t3 = new Tema3();
                 t3. Arbol();
                
                 return true;

            case 4:
                Tema4 t4 = new Tema4();
                t4.Tabla();
                return true;



            case 5:
                Tema5 t5 = new Tema5();
                t5.MenuEjemplo();
                return true;

            case 6:
                Tema6 t6 = new Tema6();
                t6.Contacto();
                return true;

            case 7:
                Tema7 t7 = new Tema7();
                t7.Parqueadero();
                return true;
            case 8 :
                Tema8 t8 = new Tema8();
                t8.escuelaAutomovilistica();
    
                return true;
 
            case 0:
                 System.out.println(" ========== Saliendo del Sistema ===========");
                  
            return false;

            default:
            System.out.println("---------- Opcion Invalida --------");
            
        }
        return true;
    }

       








}