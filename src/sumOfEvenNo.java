import java.util.Scanner;

public class sumOfEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <=n; i = i + 2 ){
            sum = sum + i;
        }
        System.out.println(sum);

    //first N terms of 3i + 2
        for (int i = 1; i <= n; i++){
            int sum2 = 3 * i + 2;
            System.out.println(sum2);
        }
    //first N terms of 3i + 2 which are not the multiple of 5
        for (int i = 1; i <= n; i++){
            int term = 3 * i + 2;
            if (term % 5 != 0){
                System.out.println(term);
            }
        }
    }
}