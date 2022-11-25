import java.util.Scanner;
public class Tema2 {
    private static Scanner sc = new Scanner(System.in);

    public void PiramideInvertida(){
        int ancho;
    
        System.out.println("--------- Figura Piramide Invertida --------");
        System.out.println(" ");
        System.out.print("Ingrese el numero 10:"+" ");
        ancho=sc.nextInt();
        dibujarTriangulo(ancho);


    }
    public static void dibujarTriangulo(int anchura){
        int asteriscos=1;
        int espacios= anchura - 1;
        for(int fila= 0; fila<anchura; fila++){
            for(int colEspacio = 0; colEspacio < espacios; colEspacio++){
                System.out.print(" ");
            }
            for(int colAsterisco = 0; colAsterisco < asteriscos; colAsterisco++){
                System.out.print("*");
            }
           System.out.println("");

           asteriscos ++;
           espacios --;
        }
      
    }

}



