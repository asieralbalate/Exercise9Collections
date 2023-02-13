public class Player implements Comparable<Player> {
    public int strength;
    public String name;

    public Player(String s, int n) {
        name = s;
        strength = n;
    }

    @Override
    public String toString() {
        return name + " (" + strength + ")";
    }

    @Override
    public int compareTo(Player o) {
        return Integer.compare(strength, o.strength);
    }
}
