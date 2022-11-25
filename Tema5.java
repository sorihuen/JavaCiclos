import java.util.Scanner;

public class Tema5 {
    private static Scanner sc = new Scanner(System.in);

    public void MenuEjemplo(){
        
        boolean respuesta = true;
        int opcion;
        


        do{
            System.out.println("--------- Menu Ejemplo --------");
            System.out.println(" ");
            menu();
           opcion = sc.nextInt();
           respuesta = opciones(opcion);
           
            
    
        } while(respuesta == true);

        System.out.println("-------------------------------");
        System.out.println(" ");




    }
    private static void menu(){
        System.out.println(" [1].Captura nombre");
        System.out.println(" [2].Saludar Persona");
        System.out.println(" [0]Salir del Sistema");


    }
    private static boolean opciones(int opcion){
    

        switch(opcion){
            case 1:
             System.out.println(" [1].Captura nombre");
           
            return true;

            case 2:
             System.out.println(" [2].Saludar Persona");
        

            return true;


            case 0:
             System.out.println(" [0]Salir del Sistema");
            return false;

            default:
            System.out.println("---------- Opcion Invalida --------");
        }
        return true;



    }

        








    
}
