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
    }
}
