import java.io.*;
import java.io.IOException;
public class code25 {
    public static void main(String[] args)  throws java.io.IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Please enter name: ");
        String name = br.readLine();
        System.out.println("Please enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Name: " + name);
        System.out.println("Age " + age);
    }
}
