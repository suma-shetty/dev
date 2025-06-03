import java.io.*;
public class code26 {
    public static void main(String[] args)  throws Exception {
     Stud st = new Stud(11, "deep", 7.5f);
     FileOutputStream fos = new FileOutputStream("output.txt");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(st);
     oos.close();
    }
}
class Stud implements Serializable {
    int roll;
    String name;
    float cgpa;
    public Stud(int roll, String name, float cgpa) {
       this.roll = roll;
       this.name = name;
       this.cgpa = cgpa;
    }
    public String toString() {
        return "Stud [roll=" + roll + ", name=" + name +  ", cgpa=" + cgpa + "]";

    }
}