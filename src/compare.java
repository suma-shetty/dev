import java.util.*;
public class compare {
    public static void main(String[] args) {
      Student s1 = new Student(6, "raj", 8.5f);
        Student s2 = new Student(3, "amit", 9.5f);
        Student s3 = new Student(1, "bittu", 6.5f);
        Student s4 = new Student(2, "sam", 7.5f);
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(s1);
        stList.add(s2);
        stList.add(s3);
        stList.add(s4);
        System.out.println(stList);
        Collections.sort(stList);
        System.out.println(stList);
    }
}
class Student implements Comparable<Student> {
    int roll;
    String name;
    float cgpa;
    public Student(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", cgpa=" + cgpa + "]";
    }
        public int compareTo(Student o) {
            if(this.cgpa > o.cgpa)
                return 1;
            if(this.cgpa < o.cgpa)
                return -1;
            else
                return 0;
        }
    }

