package othello;

public class Main {
    public static void main(String[] args) {
        Othello othello = new Othello();
        othello.initBoard();
        System.out.println(othello.toString());
    }
}