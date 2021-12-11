import java.util.*;
public class snakeladder{
	public static void main(String[] args){
		System.out.println("Welcome to the game SNAKE_LADDER......");
		char input;
		System.out.println("Press 'S' to Start the game");
		Scanner s =new Scanner(System.in);
		input=s.next().charAt(0);
		System.out.println("Hello Player you are at position -- 0 --");
		System.out.println("Your turn dice is rolling....");
		double random = Math.floor(Math.random() * 10) % 6;
		double dice_value = random+1;
		System.out.println("You got :" + dice_value);
}
}
