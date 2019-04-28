package TechMaven.TechMaven;

import TechMaven.TechMaven.controller.PlayGameController;
import TechMaven.TechMaven.entities.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Player player1,player2;
    	player1 = new Player('o');
    	player2 = new Player('x');

       new PlayGameController(player1, player2).StartGame();
    }
}
