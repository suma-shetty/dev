import java.util.*;
public class wild {
    public static void main(String[] args) {
        Apple a1 = new Apple("red", 180);
        Apple a2 = new Apple("green", 210);
        Apple a3 = new Apple("mix", 150);

        ArrayList<Apple> appleList = new ArrayList<>();
        appleList.add(a1);
        appleList.add(a2);
        appleList.add(a3);
        display(appleList);

        Orange o1 = new Orange("red", 180);
        Orange o2 = new Orange("green", 210);
        Orange o3 = new Orange("mix", 150);

        ArrayList<Orange> orangeList = new ArrayList<>();
        orangeList.add(o1);
        orangeList.add(o2);
        orangeList.add(o3);
        display(orangeList);
    }

    public static void display(List<?> fruitList) {
        System.out.println("Fruits list: " + fruitList);
        System.out.println("Number of fruits: " + fruitList.size());
    }
}
class Apple {
        String color;
        int price;

        public Apple(String color, int price) {
            this.color = color;
            this.price = price;
        }
        @Override
        public String toString() {
            return "Apple [color= " + color + ", price=" + price + "]";
        }
    }
    class Orange {
    String color;
    int price;

    public Orange(String color, int price)
    {
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Orange [color= " + color + ", price=" + price + "]";
    }
}




