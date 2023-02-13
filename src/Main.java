import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Player> p = new PriorityQueue<Player>();
        p.add(new Player("A", 8));
        p.add(new Player("D", 0));
        p.add(new Player("B", 30));

        while (!p.isEmpty()) {
            System.out.println(p.remove());
        }
    }
}
