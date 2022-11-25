import java.util.ArrayList;
import java.util.Scanner;


public class Tema6 {
    private static Scanner sc = new Scanner(System.in);
    static ArrayList <Agenda> contactos = new ArrayList<Agenda>();
    static int telefono[] = new int [3];
    static int []telefono1 = new int [telefono.length];
       
    boolean respuesta = true;
    int opcion;

    public void Contacto() {
        do {
            menu();
            opcion = Integer.parseInt(sc.nextLine());
            respuesta = evaluaropcion(opcion);

        } while (respuesta == true);

    }

    private static void menu() {
        System.out.println("Seleccione una opcion");
        System.out.println(" [1]:  Añadir Contacto");
        System.out.println(" [2]:  Mostrar la lista de contactos");
        System.out.println(" [3]:  Eliminar Contacto ");
        System.out.println(" [0]:  Salir del Sistema");
        System.out.println(" ");
        System.out.println(" ====================================================");

    }
    private static boolean evaluaropcion(int opcion){
        int top =0;
        boolean repetido;
        


        switch(opcion){
            case 1:
                 System.out.println(" ----------- Registrar Contacto ----------");
                 System.out.println(" ");
                 System.out.println(" Ingrese su nombre");
                 String nombre = sc.nextLine();
                 System.out.println(" Ingrese su apellido");
                 String apellido = sc.nextLine();

                for( int i=0; i < telefono.length; i++){
                    System.out.println(" Ingresa un numero de telefono:" + (i+1) );
                    telefono[i]= Integer.parseInt(sc.nextLine());
        
                }
                for (int i = 0; i < telefono.length; i ++){
                    repetido = false;
                    int j=0;
                    while(!repetido && (j<top)){
                        if (telefono[i] == telefono1[j]){
                            repetido = true;

                        }
                        j++;

                    }
                    if(!repetido){
                        telefono1[top] = telefono[i];
                        top++;
                    }

                }
                System.out.println("Numeros de telefono guardados(No puede repetir los numeros telefonicos):");
    
                for(int i= 0; i < top; i ++){
                    System.out.println (telefono1[i]);
                   
                }
                System.out.println(" ");
                System.out.println(" Ingrese el Nombre de la empresa");
                String empresa = sc.nextLine();

                System.out.println(" ");
                Agenda a1 = new Agenda(nombre, apellido, top, empresa);
                System.out.println(" ------ Contacto Guardado ------");
                System.out.println(" ");
                contactos.add(a1);


            return true;

            case 2:
              System.out.println(" ----------- Mostrar Contactos ----------");
              mostrarLista();
              System.out.println(" -------------------------------------");

            return true;

            case 3:
             System.out.println(" ----------- Eliminar Contactos ----------");
             eliminarContacto();
             System.out.println(" -------------------------------------");
            return true;
            case 0:

               System.out.println(" ========== Saliendo del Sistema ===========");
               System.out.println(" ");
            return false;

             default:
            System.out.println("---------- Opcion Invalida --------");
        }
        return true;
    }  
    public static void mostrarLista(){
        for(int i = 0; i< contactos.size(); i++){
            System.out.println(" Contactos: " + contactos.get(i).nombre + " "+ contactos.get(i).getApellido());
    
            System.out.println(" ");

        
        }
            
    }
    public static void eliminarContacto(){
    
        mostrarLista();
        System.out.println(" Estan guardados " + contactos.size() + " Contactos");
        System.out.println(" ");
        System.out.print(" Ingrese el lugar del Contacto a Eliminar comenzando en (0):" + " ");
        int posicion = Integer.parseInt(sc.nextLine());

        contactos.remove(posicion);
        System.out.println(" == Contactos disponibles:===");
        System.out.println(" ");
        mostrarLista();

        
        
    }

   






}


        

        
    

        

                 

