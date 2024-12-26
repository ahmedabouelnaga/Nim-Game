/*****************************************
 * A template for a Nim game
 ****************************************/ 
import java.util.Random;
public class Game{


    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private Random rn;
    public Game(int difficulty)
    {
        rn = new Random();
        marbles = rn.nextInt(91)+10;
        System.out.println("# of Marbles in the pile are :: " +marbles+" ");
        difficulty = rn.nextInt(10)%2 + 1;
        System.out.println("The Difficulty that is selected at random ::" +difficulty);
        computerPlayer = new Computer(difficulty);
        humanPlayer = new Human();
        // your code here
        
    }
     
    public void play()
    {
        // your code here
        int firstTurn = rn.nextInt(2);
        int winner=0;
        System.out.println("First Turn ::"+firstTurn);
        
        if(firstTurn==0)
        {
            computerPlayer.move(marbles);
            marbles=marbles-computerPlayer.getChoice();
        }
        show_current_status();
        while(marbles!=0)
        {
            humanPlayer.move();
            marbles=marbles-humanPlayer.getChoice();
            show_current_status();
        if(marbles==0) winner=1;
        else
        {
            computerPlayer.move(marbles);
            marbles=marbles-computerPlayer.getChoice();
        }
        show_current_status();
        }
           if(winner==1) System.out.println("Sorry! YOU LOST!!!");
           else System.out.println("YOU WON!!");
    }
    public void show_current_status()
    {
        System.out.println("# of Marbles Left::"+marbles);
    }
}
    // you may wish to add more methods here