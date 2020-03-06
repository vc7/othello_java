package othello;

public class Main {
    public static void main(String[] args) {
        Othello othello = new Othello();
        othello.reset();
        System.out.println(othello.toString());
    }
}