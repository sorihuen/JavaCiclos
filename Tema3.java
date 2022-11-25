public class Tema3 {



    public void Arbol(){
        System.out.println("--------- Arbol  --------");
        System.out.println(" ");
        int num =10;



        for(int i=0; i<num+(num/2); i ++){
            for(int j=num +(num/2);j > i ; j--){
                System.out.print(" ");

            }
            for (int k=1; k<=2*i-1; k++){
                System.out.print("*");

            }
            System.out.println("");



        }
        for(int i=1; i<num-(num/2);i++){
            for(int j = num+(num/2); j>1; j--){
                System.out.print(" ");

            }
            System.out.println("**");


        }











    }










}

    






