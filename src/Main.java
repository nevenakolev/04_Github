import java.util.Scanner;

/**
 * @author Nevena Kolev
 * @version 1.0, 08.10.2020
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //choosing operation
        System.out.print("If you want to add, then enter '0', if you want to subtract then enter '1': ");
        int chosenOperation = sc.nextInt();

        //calculator header
        System.out.println(printHeader());

        boolean errorInput=true;
        while (errorInput) {
            try {
                System.out.print("1. number: ");
                int firstValue = sc.nextInt();
                System.out.print("2. number: ");
                int secondValue = sc.nextInt();
                System.out.print("3. number: ");
                int thirdValue = sc.nextInt();

                if(chosenOperation == 0) {
                    int result = firstValue + secondValue + thirdValue;

                    System.out.println("   Result: " + result);
                    errorInput = false;
                    System.out.println("***************************************");
                } else if(chosenOperation == 1){
                    int result = firstValue - secondValue - thirdValue;

                    System.out.println("   Result: " + result);
                    errorInput = false;
                    System.out.println("***************************************");
                } else {
                    System.out.println("An error occured while choosing an operator.");
                    errorInput = false;
                }
            } catch (Exception ex) {
                sc.next();
                System.out.println("Error while entering numeric value.");
            }
        }
    }

    public static String printHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append("***************************************\n");
        sb.append("          c a l c u l a t o r          \n");
        sb.append("***************************************");

        return sb.toString();
    }
}
