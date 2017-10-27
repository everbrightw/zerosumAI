import java.util.*;

class Board{
	pubic static List<Node> board = new ArrayList<Node>;
	
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
	
}