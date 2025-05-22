import java.util.*;
public class bankException {
    public static void main(String[] args) {
        banking();
    }

    public static void banking() {
        System.out.println("Banking Started");
        try {
            useAtm();
        } catch (Exception e) {
            System.out.println("Exception info received");
        }
        System.out.println("Banking ended");
    }

    public static void useAtm() throws Exception {
        System.out.println("atm use started");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter pin: ");
            int pin = sc.nextInt();
            System.out.println("Transaction successfully");
        } catch (Exception ex) {
            System.out.println("Exception handled by Atm");
            throw ex;
        } finally {
            System.out.println("atm use ended");
        }
    }
}

