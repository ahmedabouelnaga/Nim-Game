/*****************************************
 * A template for a computer Nim player
 ****************************************/ 
import java.util.Random;
public class Computer{
    
    private int mode;
    private int choice;
    private Random rn;
    
    public Computer(int m) 
    {
        mode = m;
        choice = -1;
        rn = new Random();
    }
    
    public void move(int marblesLeft){
        if(marblesLeft==1)
        choice = 1;
        else if(mode == 1)
        {
            choice = rn.nextInt(marblesLeft/2)+1;
        }
        else
        {
            int n=1,power=0;
            while(n<=marblesLeft)
            {
                n=2*n;
            }
            if(marblesLeft+1==n)choice = rn.nextInt(marblesLeft/2)+1;
            else choice=marblesLeft-n/2+1;
        }
        System.out.println("Computer Choice ::" + choice +"\n");
        // your code here
        
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
