import java.util.Scanner;

public class Game {
    
    private Node[][] gameBoard;
    private int size;

    public Game(int size) {
        gameBoard = new Node[size][size];
        this.size = size;
        
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                gameBoard[i][j] = new Node();
    }

    public void startGame() {
        // Set xPos and yPos from 0 to (size - 1)
        int xPos1 = (int) (Math.random() * size);
        int yPos1 = (int) (Math.random() * size);

        int xPos2 = (int) (Math.random() * size);
        int yPos2 = (int) (Math.random() * size);

        System.out.println("xPos1 is: " + xPos1 + " and xPos2 is: " + xPos2);

        while (xPos1 == xPos2 && yPos1 == yPos2) {
            //System.out.println("Looping");

            // Add node at that position, get another position to add second node
            xPos2 = (int) (Math.random() * size);
            yPos2 = (int) (Math.random() * size);
        }

        gameBoard[xPos1][yPos1] = new Node(2);
        gameBoard[xPos2][yPos2] = new Node(2);

    }

    public void makeMove(Scanner kbd) {
        String s = kbd.next();

        if (s.equals("w")) { // up

            for (int j = 0; j < size; j++) {
                int ceiling = 0;
                for (int i = 0; i < size; i++) {
                    if (!gameBoard[i][j].isEmpty()) {
                        if (i != ceiling) {
                            gameBoard[ceiling][j] = gameBoard[i][j];
                            gameBoard[i][j] = new Node();
                        }
                        ceiling++;
                    }
                }

            }

        } else if (s.equals("s")) { // down
            
            for (int j = 0; j < size; j++) {
                int ceiling = size-1;
                // int spaces = 0;
                for (int i = size-1; i >= 0; i--) {
                    if (!gameBoard[i][j].isEmpty()) {
                        if (i != ceiling) {
                            gameBoard[ceiling][j] = gameBoard[i][j];
                            gameBoard[i][j] = new Node();
                        }
                        ceiling--;
                    }
                }

            }

        } else if (s.equals("a")) { // left
            
            for (int i = 0; i < size; i++) {
                int ceiling = 0;
                for (int j = 0; j < size; j++) {
                    if (!gameBoard[i][j].isEmpty()) {
                        if (j != ceiling) {
                            gameBoard[i][ceiling] = gameBoard[i][j];
                            gameBoard[i][j] = new Node();
                        }
                        ceiling++;
                    }
                }

            }
            
        } else if (s.equals("d")) {
            
            for (int i = 0; i < size; i++) {
                int ceiling = size-1;
                for (int j = size-1; j >= 0; j--) {
                    if (!gameBoard[i][j].isEmpty()) {
                        if (j != ceiling) {
                            gameBoard[i][ceiling] = gameBoard[i][j];
                            gameBoard[i][j] = new Node();
                        }
                        ceiling--;
                    }
                }

            }

        } else if (s.equals("e")) {
            System.exit(0);
        }
    }

    public String toString() {
        String s = "";
        for(int i = 0; i < size; i++) {
            s += "Row " + i + ": ";
            for(int j = 0; j < size; j++) {
                s += gameBoard[i][j].toString() + " ";
            }
            s += "\n";
        }
         
        return s;
    }


}
