import java.util.TreeSet;
import java.util.*;
public class code15 {
        public static void main(String[] args) {
            TreeSet set = new TreeSet();

            set.add(44);
            set.add(22);
            set.add(11);
            set.add(55);
            set.add(33);
            set.add(22);
            set.add(66);
            set.add(11);
            System.out.println(set);
            System.out.println(set.first());
            System.out.println(set.last());
        }
    }


