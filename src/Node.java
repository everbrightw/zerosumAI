
// each instance of node represent a chessman
public class Node {
 
    public int x;

    public int y;

    public String color;

    public boolean hasChess(int i,int j){
        return !(Board.board[i][j] == null);
    }

    public static final String WHITE = "white";
    public static final String BLACK = "black";

    public Node() {
        //default constructor
    }

    public Node(int x, int y, String c) {
        this.x = x;
        this.y = y;
        this.color = c;
    }

    // chess moving
    public void moveUp() {
        int newY = y -1;
        Node newNode = new Node(x, newY, color);
        Board.board[x][y] = null;
        Board.board[x][newY] = newNode;
    }

    public void moveDown() {
        int newY = y + 1;
        Node newNode = new Node(x, newY, color);
        Board.board[x][y] = null;
        Board.board[x][newY] = newNode;
    }
    public void moveUpRight() {
        int newY = y -1;
        int newX = x+1;
        Node newNode = new Node(newX, newY, color);
        Board.board[x][y] = null;
        Board.board[newX][newY] = newNode;
    }

    public void moveUpLeft() {
        int newY = y - 1;
        int newX = x - 1;
        Node newNode = new Node(newX, newY, color);
        Board.board[x][y] = null;
        Board.board[newX][newY] = newNode;
    }

    public void moveDownRight() {
        int newY = y + 1;
        int newX = x + 1;
        Node newNode = new Node(newX, newY, color);
        Board.board[x][y] = null;
        Board.board[newX][newY] = newNode;

    }
    
}