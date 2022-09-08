package snakeLadder.com;
import java.util.*;
class player 
{
	int position= 0;
}
public class game 
{
	
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO SNAKE AND LADDER GAME" );
        player Player_1= new player();
 	    System.out.println("Player Position: "+Player_1.position);
 	    Random r=new Random();
	    int result = r.nextInt(6);
        System.out.println("You Rolled Die: "+result);
        switch (result) {
		case 0:
			System.out.println("No play");
			break;
		case 1:
			System.out.println("The player moves 1 position");
			break;
		case 2:
			System.out.println("The player moves 2 position");
			break;
		case 3:
			System.out.println("The player moves 3 position");
			break;
		case 4:
			System.out.println("The player moves 4 position");
			break;
		case 5:
			System.out.println("The player moves 5 position");
			break;
		case 6:
			System.out.println("The player moves 6 position");
			break;
    }
}
}