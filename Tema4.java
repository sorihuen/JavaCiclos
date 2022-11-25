import java.util.Scanner;

public class Tema4 {
    private static Scanner sc = new Scanner(System.in);

    public void Tabla(){
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
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
     
    }
    private static void menu(){
        System.out.println("1. Multiplicar");
        System.out.println("0. Salir del sistema ");
       
    }
    private static int capturaopcion(){
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }
    private static boolean evaluaropcion(int opcion){

        switch(opcion){
            case 1:
                System.out.println("--------- Tabla Multiplicar  --------");
                System.out.println(" ");
                System.out.println("Ingrese el numero Multiplicador: ");
                int numero = sc.nextInt();
                for (int i= 1; i<= 10; i++) {
                
                    int resultado = i * numero;
                    System.out.println(i + " X " + numero + " = " + resultado) ;
                
                }
                System.out.println("-------------------------------");
                System.out.println(" ");
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
