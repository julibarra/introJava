import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in= new Scanner( System.in);
        System.out.println("Ingrese un numero");
        int numbre=in.nextInt();
        for(int i=1; i<= numbre ;i++){
            if (sonMultiplos(i,numbre)){
                System.out.println(i);

            }

        }
    }
    //ejercicio 2
    static boolean sonMultiplos(int m, int n){
        boolean ret=false;
        if(m>n){
            ret=m%n==0;
        }
        else if(n>m){
            ret=n%m==0;
        }
        return ret;
    }
}
