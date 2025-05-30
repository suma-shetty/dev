import java.util.*;
public class demo12 {
    public static void main(String[] args) {
        PizzaHouse ph = new PizzaHouse();
        ChefThread chef = new ChefThread(ph);
        CustomerThread customer = new CustomerThread(ph);
        chef.start();
        customer.start();
    }
}
class ChefThread extends Thread {
    PizzaHouse ph;
    public ChefThread(PizzaHouse ph) {
        this.ph = ph;
    }
    public void run() {
       ph.bake();
    }
}
class CustomerThread extends Thread {
    PizzaHouse ph;
    public CustomerThread(PizzaHouse ph) {
        super();
        this.ph = ph;
    }
    public void run() {
       ph.eat();
    }
}
class PizzaHouse {
    int tocken = 1;
    public void bake() {
        System.out.println("Chef is calling bake");
    }
        public void eat() {
            System.out.println("Customer is calling eat");
        }
    }

