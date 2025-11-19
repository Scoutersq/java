package basicProgram;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether it is Even or not:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println("The given number is Even");
        }
        else {
            System.out.println("The given number is not Even");
        }
    }
}

