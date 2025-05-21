import java.util.InputMismatchException;
import java.util.Scanner;
public class practice31 {
    public static void main(String[] args) {
        System.out.println("programming is Starting normally");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first element: ");
            int a = sc.nextInt();
            System.out.println("Enter second element: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("The result is : " + res);
        } catch (ArithmeticException ae) {
            System.out.println("Please do not enter denominator as 0");
        } catch (InputMismatchException ime) {
            System.out.println("Please enter integer only");
        } catch (Exception ex) {
            System.out.println("some problem occured");
        } finally {
            System.out.println("Extremely important code");
        }
    }
}
