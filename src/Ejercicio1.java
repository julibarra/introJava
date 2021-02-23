import java.util.Scanner;

public class Ejercicio1 {
//ejercicio 1
    public static void main(String[] args) {
        Scanner in= new Scanner( System.in);
        System.out.println("Ingrese un numero");
        int numbre=in.nextInt();
        for(int i=1; i<= numbre ;i++){
            if (esPar(i)){
                System.out.println(i);

            }

        }

        //ejercicio 4
        Scanner in2= new Scanner( System.in);
        System.out.println("Ingrese un numero");
        int numbre2=in2.nextInt();
        for(int i=1; i<= numbre2 ;i++){
            if (esPrimo(i)){
                System.out.println(i);

            }

        }


    }
    static boolean esPar(int n){
        return n%2==0;
    }
    //ejercicio 3
static boolean esPrimo(int n){
        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
    return  true;
}


//ejercicio 5
    static  int cantidadDeDigitos(int n){
        return  (int)(Math.log10(n)+1);
    }//no se si esta bien
}
