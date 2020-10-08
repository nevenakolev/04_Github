import java.util.Scanner;

/**
 * @author Nevena Kolev
 * @version 1.0, 08.10.2020
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.print("Enter the first number:");
            int firstValue=sc.nextInt();
            System.out.print("Enter the second number:");
            int secondValue=sc.nextInt();
            int result=firstValue+secondValue;

            System.out.println("The result is: " + result);
        } catch (Exception ex) {
            System.out.println("Error while entering numeric value.");
        }
    }
}
