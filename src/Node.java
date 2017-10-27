
// each instance of node represent a chessman
public class Node {
    public static Node[][] board = new Node[8][8];

    public static void setBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = null;
            }
        }

        for (int i = 0; i < 7 ; i++) {
            for (int j = 0; j <2 ; j++) {
                board[i][j] = new Node(i, j, BLACK);
            }
        }

        for (int i = 0; i < 7 ; i++) {
            for (int j = 6; j < 8 ; j++) {
                board[i][j] = new Node(i, j, WHITE);
            }
        }
    }
    public int x;

    public int y;

    public static String color;

    public boolean hasChess(int i,int j){
        return !(board[i][j] == null);
    }

    public static final String WHITE = "white";
    public static final String BLACK = "black";

    public Node() {
        //default constructor
    }

    public Node(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // chess moving
    public void moveUp() {
        int newY = y -1;
        Node newNode = new Node(x, newY, color);
        board[x][y] = null;
        board[x][newY] = newNode;
    }

    public void moveDown() {
        int newY = y + 1;
        Node newNode = new Node(x, newY, color);
        board[x][y] = null;
        board[x][newY] = newNode;
    }
    public void moveUpRight() {
        int newY = y -1;
        int newX = x+1;
        Node newNode = new Node(newX, newY, color);
        board[x][y] = null;
        board[newX][newY] = newNode;
    }

    public void moveUpLeft() {
        int newY = y - 1;
        int newX = x - 1;
        Node newNode = new Node(newX, newY, color);
        board[x][y] = null;
        board[newX][newY] = newNode;
    }

    public void moveDownRight() {
        int newY = y + 1;
        int newX = x + 1;
        Node newNode = new Node(newX, newY, color);
        board[x][y] = null;
        board[newX][newY] = newNode;

    }
}