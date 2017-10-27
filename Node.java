import java.util.*;

// each instance of node represent a chessman
public class Node{
	
	public int x;
	
	public int y;

	public string color;

	public boolean chess;

	public final string WHITE = "white";

	public final string BLACK = "black";

	public Node left;
	public Node right;
	public Node up;
	public Node down;

	public Node(){
		//default constructor
	}

	public Node(int x, int y, string color, boolean hasChess){
		this.x = x;
		this.y = y;
		this.color = color;
		chess = hasChess;
	}

	// chess moving
	public void moveUp(){
		x -= 1;
		chess = false;
		Node.up.chess = true;
	}	
	public void moveDown(){
		x += 1;
		chess = false;
		Node.down.chess = true;
	}
	public void moveLeft(){
		y -=1;
		chess = false;
		Node.left.chess = true;
	}
	public void moveRight(){
		y += 1;
		chess = false;
		Node.right.chess = true; 
	}

	


	
}