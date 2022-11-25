import java.util.Scanner;
public class Tema1 {
    private static Scanner sc = new Scanner(System.in);
    
    public void piramideAsterisco(){
        int pisos;
        System.out.println("--------- Figura Piramide --------");
        System.out.println(" ");
       
        System.out.print("Ingrese el numero 10:"+" ");
        pisos=sc.nextInt();
        dibujarPiramide(pisos);

      

    }
    public static void dibujarPiramide(int altura){
       for (int i = 1; i <=altura; i++){
         System.out.println("");
          for(int j = 1; j <= i; j++){
             System.out.print("*");

            }
        }
        System.out.println("");

    }

  
      



}




