import java.util.Scanner;

public class gcdOf2No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int i;
        int gcd = 1;

        for (i = 1; i < Math.min(a,b); i++){
            if (a % i == 0 && b % i == 0){
               gcd = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);

    }
}
