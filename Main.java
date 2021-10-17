import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game(4);
        game1.startGame();

        while (true) {
            System.out.println(game1.toString());
            game1.makeMove(new Scanner(System.in));
        }
        

    }

}


