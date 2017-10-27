
import java.util.*;

public class Board{
    public static final String WHITE = "white";
    public static final String BLACK = "black";

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

    public static void print(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[j][i].color.charAt(0) + " ");
            }
            System.out.println();
        }
    }

}