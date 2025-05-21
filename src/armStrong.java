import java.util.Scanner;
public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n  = sc.nextInt();
        int copyN = n;
       int res = (n + "").length();
       int sum = 0;
       int ldig = 0;

        while(n > 0) {
             ldig = n % 10;
            n = n / 10;
            sum = sum + (int)(Math.pow(ldig, res));
        }
        if (sum == copyN) {
            System.out.println(copyN + " is an Armstrong");
        }
        else {
            System.out.println(copyN + " is n ot an Armstrong");
        }
    }
}
