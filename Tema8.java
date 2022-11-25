import java.util.Scanner;

public class Tema8 {
    private static Scanner sc = new Scanner(System.in);
    String nombreAlumno[] = new String[8]; 
    int Notas[] = new int[8];
   

    public void escuelaAutomovilistica(){
        int limite = 0;
        System.out.println("============== Escuela el Maestro =======");
        System.out.println(" ");
       


        while (limite == 0) {
            menu();
            System.out.println("Ingrese una opcion:");
            int opcion =  Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                   pedirDatos();

                break;

                 case 2:
                  Aprobado_Reprobado();

                break;
                case 3:
                    
                   System.out.println("---------- Saliendo del Sistema --------");
                  System.out.println(" ");
                  limite = 1;

                break;

                default:
                System.out.println("---------- Opcion Invalida --------");
            }

        
        }
      
    

    }
    private static void menu(){
        System.out.println("[1]. Registrar Usuarios del Curso ");
        System.out.println("[2]. Consultar Aprobados");
        System.out.println("[3]. Salir del Sistema ");
        System.out.println("--------------------------------");

    }
    public void pedirDatos(){
        for (int i = 0; i < nombreAlumno.length;i++){
            System.out.println(" Ingrese su nombre Completo en la posicion " + (i+1) +":");
            nombreAlumno[i] = sc.nextLine();
            System.out.println(" Ingrese su Calificacion(entre 0 y 10) en la posicion " + (i+1) +":");
            Notas[i] = Integer.parseInt(sc.nextLine());

        }
        System.out.println("Los Estudiantes y sus Notas son: ");
        System.out.println(" ");
        for (int i = 0; i < nombreAlumno.length;i++){
            System.out.println( nombreAlumno[i] + " " + "["+ Notas[i] +"]" + " puntos");

        }
        System.out.println(" ");
    }
    public void Aprobado_Reprobado(){

        for (int i = 0; i < nombreAlumno.length;i++){
            System.out.println( nombreAlumno[i] + " " + "["+ Notas[i] +"]" + " puntos");
        }
        System.out.println(" ");
        System.out.println("Ingrese su calificacion : ");
        int calificacion = Integer.parseInt(sc.nextLine());

        if (calificacion>=5 ){
            System.out.println("El Alumno Aprobo");
        }else{
            System.out.println("El Alumno NO aprobo");
            System.out.println("Debe repetir la prueba......!");
        }
        System.out.println(" ");





    }
    



}
