import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("B is greater than A");
        }
    }
}
