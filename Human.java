/*****************************************
 * A template for a Human Nim player
 ****************************************/ 
import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    
    public Human()
    {
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move()
    {
    
        System.out.println("\nEnter the choice you want ::");
        choice = input.nextInt();
        
    }
    
    
    public int getChoice()
    {
        return choice;
    }
    
    
}
