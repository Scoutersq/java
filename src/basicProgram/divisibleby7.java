package basicProgram;

import java.util.Scanner;

public class divisibleby7 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check whether the number is divisible by 7 or not");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 7 == 0){
            System.out.println("Number is divisible by 7");
        }
        else {
            System.out.println("Number is not divisible by 7");
        }
    }
}
