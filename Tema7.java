
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tema7 {
    public static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
    static Calendar Hora = Calendar.getInstance();
    private static Scanner sc = new Scanner(System.in);
    static ArrayList<vehiculo> auto = new ArrayList<vehiculo>();
    int hora, minutos, segundos;
    String horaActual;
    Date fechaActual = new Date();
    
    public void Parqueadero() {
        int limite = 0;

        while (limite == 0) {
            System.out.println("============== Parqueadero El Guardian =======");
            System.out.println(" ");
            System.out.println("[1]. Registrar e Ingresar auto");
            System.out.println("[2]. Consultar autos en el parqueadero");
            System.out.println("[3]. Retirar auto");
            System.out.println("[4]. Salir del Sistema");
            System.out.println(" ");
            System.out.println("Ingrese la opcion");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                   hora = Hora.get(Calendar.HOUR_OF_DAY);
                   minutos = Hora.get(Calendar.MINUTE);
                   segundos= Hora.get(Calendar.SECOND);
                   horaActual = hora + ": " + minutos + " . " + segundos + " segundos"; 
            

                    System.out.println("Fecha Ingreso: "+ DateAString(fechaActual) + " " + "Hora de Ingreso " + horaActual);
                    System.out.println(" ");
                    registro();

                    break;

                case 2:
                    consultarAutos();

                    break;

                case 3:
                   
                    hora = Hora.get(Calendar.HOUR_OF_DAY);
                    minutos = Hora.get(Calendar.MINUTE);
                    segundos= Hora.get(Calendar.SECOND);
                    horaActual = hora + ": " + minutos + " . " + segundos + "segundos"; 

                    consultarAutos() ;
                
                    System.out.println("Fecha salida: "+ DateAString(fechaActual) + "  " + "Hora de salida " + horaActual);
                    System.out.println(" ");
                    System.out.println(" ===== Buen Viaje ========");
                    System.out.println(" ");

    
                    break;

                case 4:
                    
                    System.out.println("---------- Saliendo del Sistema --------");
                    System.out.println(" ");
                    limite = 1;

                    break;

                default:
                    System.out.println("---------- Opcion Invalida --------");

            }
        }

    }

    private static void registro() {

        System.out.println("Ingrese su nombre Completo");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su telefono");
        String telefono = sc.nextLine();
        System.out.println("Ingrese el numero de la placa");
        String placa = sc.nextLine();
        System.out.println("Ingrese la Marca del Auto");
        String marca = sc.nextLine();
        System.out.println("Ingrese el color del auto");
        String color = sc.nextLine();
        System.out.println("Ingrese el año");
        String año = sc.nextLine();

        vehiculo v1 = new vehiculo(placa, marca, color, año);
        System.out.println("--------- Vehiculo Ingresado ---------");
        auto.add(v1);
        System.out.println("----------------------------");

    }

    private static void consultarAutos() {
        int encontrado = 0;
        System.out.println("Ingrese el numero de la placa");
        String p = sc.nextLine();

        for (int i = 0; i < auto.size(); i++) {
            if (p.equals(auto.get(i).getPlaca())) {
                System.out.println(" Vehiculo Encontrado........!");
                System.out.println(" ");
                System.out.println(" Marca " + auto.get(i).getMarca());
                System.out.println(" Color " + auto.get(i).getColor());
                System.out.println(" Año " + auto.get(i).getAño());
                encontrado = 1;

            }

        }

        System.out.println(" ");
        if (encontrado == 0) {
            System.out.println(" Vehiculo no Encontrado...!");
        }
        System.out.println("----------------------------");
        System.out.println(" ");

    }
    public static String DateAString(Date fecha){

        String fechaCadena= sdf.format(fecha);
        return fechaCadena;
        
    }


}
