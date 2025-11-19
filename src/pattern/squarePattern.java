package pattern;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print N number of Star");

        int n = sc.nextInt();
        int i; //for rows
        int j; // for columns

        for (i = 1; i <= n; i++){
            for (j = 1; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
