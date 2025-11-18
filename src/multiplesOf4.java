import java.util.Scanner;

public class multiplesOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 4 == 0){
                System.out.println(i);
            }
        }

    }
}
