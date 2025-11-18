import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        System.out.println("Enter the unit of electric bill:");
        Scanner sc = new Scanner(System.in);

        int unit = sc.nextInt();
        int bill;
        
        if (unit <= 100){
            bill = unit * 5;
            System.out.println("Bill of" +  " unit "  +  unit +  " is "  + bill);
        }
        else if (unit <= 200){
            bill = (100 * 5) + (unit - 100) * 7;
            System.out.println("Bill of" +  " unit "  +  unit +  " is "  +  bill);
        }
        else if (unit <= 300) {
            bill = (100 * 5) + (100 * 7) + (unit - 200) * 10;
            System.out.println("Bill of" +  "  unit "  +  unit +  " is "  + bill);
        }
        else if (unit > 300) {
            bill = (100 * 5) + (100 * 7) + (100 * 10) + (unit - 300) * 12;
            System.out.println("Bill of" +  " unit "  +  unit +  " is "  +  bill);
        }
        else {
            System.out.println("Invalid unit");
        }
    }
}
