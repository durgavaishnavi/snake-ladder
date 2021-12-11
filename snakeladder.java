import java.util.*;
public class snakeladder{
	public static final int no_chance = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
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
		int dicecheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (dicecheck) {
			case no_chance:
				System.out.println("YOU DON'T GET A CHANCE...ROLL DIE NEXT TIME");
				break;
			case ladder:
				System.out.println("YOU GOT A LADDER...GO AHEAD...");
				break;
			case snake:
				System.out.println("YOU GET IN TO SNAKE...YOU GO BEHIND");
				break;
			default:
}
}
}
