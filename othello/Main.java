package othello;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Othello othello = new Othello();
        othello.reset();
        
        while (!othello.isFinished()) {
            System.out.println(othello.toString());
            System.out.println("Next move, type \"EXIT\" to exit: ");

            // TODO: 取得下一步可以走的顏色

            String command = scanner.next();
            System.out.println(command);
            if (command.equals("EXIT")) {
                break;
            }
        }

        System.out.println(othello.toString());
        System.out.println(othello.result());
    }
}