package basicProgram;

import java.util.Scanner;

public class evenNoFrm1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number");

        int n = sc.nextInt();

        for (int i = 2; i <= n; i = i + 2){
            System.out.println(i);
        }
    }
}
