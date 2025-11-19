package basicProgram;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the Factorial");

        int n = sc.nextInt();
        int i = 1;
        int ans = 1;

        while (i<=n){
            ans = ans * i;
            System.out.println(ans);
            i = i + 1;
        }
    }
}
