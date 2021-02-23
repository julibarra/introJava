import java.util.Scanner;

public class Ejercicio5 {
    public static int getDigitsAppearences(int number, int digit) {
        int timesAppearing = 0;
        while(number > 0) {
            timesAppearing += (number % 10 == digit) ? 1 : 0;
            number /= 10;
        }
        return timesAppearing;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();

        int i = 0;
        int j = 1;

        if(m == 1 && d == 0) {
            System.out.println(0);
            i++;
        }

        while(i < n) {
            if(getDigitsAppearences(j, d) >= m){
                i++;
                System.out.println(j);
            }
            j++;
        }

    }
}
