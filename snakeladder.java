import java.util.*;
public class snakeladder{
	public static final int no_chance = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static void main(String[] args){
		double position = 0.0;
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
				position = position + dice_value;
				break;
			case ladder:
				System.out.println("YOU GOT A LADDER...GO AHEAD...");
				position = dice_value + 5;
				break;
			case snake:
				System.out.println("YOU GET IN TO SNAKE...YOU GO BEHIND");
				position = dice_value - 5;
				if (position < 0)
					System.out.println("Your have to restart from -- 0 --");
				else
					System.out.println("after snake you left in : " + position);
				break;
			default:
}
		System.out.println("Current position is : " + position);
}
}
