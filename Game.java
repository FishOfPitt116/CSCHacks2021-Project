public class Game {
    // 
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

    public void makeMove(int xDir, int yDir) {

    }

    public String toString() {
        String s = "";
        for(int i = 0; i < size; i++) {
            s += "Row " + i + ": ";
            for(int j = 0; j < size; j++) {
                s += gameBoard[i][j];
            }
            s += "\n";
        }
         
        return s;
    }


}
