import java.util.*;
public class peek {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(9);
        pq.add(3);
        pq.add(4);
        pq.add(6);
        pq.add(2);
        pq.add(6);
        int n = pq.size();
        for(int i = 1; i <= n; i++)
            System.out.println(pq.poll());
    }
}
