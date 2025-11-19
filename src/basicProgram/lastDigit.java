package basicProgram;

import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a % 10 == 4){
            System.out.println("The last digit of the number is 4");
        }
        else {
            System.out.println("The last digit of the number is not 4");
        }
    }
}
