Problem 1:

In Computer Java:

This would be the “stupid” computer play mode 
choice = rn.nextInt(marblesLeft/2)+1;

This would be the “smart” computer play mode

int n=1,power=0;
            while(n<marblesLeft)
            {
                n=2*n;
            }
            if(marblesLeft+1==n) choice = rn.nextInt(marblesLeft/2)+1;
            else choice=marblesLeft-n/2+1;


In Game.java:

This is the computer randomly selecting the pile count
 marbles = rn.nextInt(91)+10;
        System.out.println("# of Marbles in the pile are :: " +marbles+"");


Randomly selects the player mode
difficulty = rn.nextInt(10)%2 + 1;
        System.out.println("The Difficulty that is selected at random ::" +difficulty);
Created the player objects
computerPlayer = new Computer(difficulty);
        humanPlayer = new Human();

Made the computer get the first turn and when the computer got the first turnthe computer player moves the marbles. Then its the human players move
Back and forth

Problem 2:

I instantiated intZip and the string barCode

I called this.barCode = barCode
And processZipCode()
A accessor method to return barCode
Another method to return zip
A for loop that contains if statements that will convert zipcodes to barcodes
A mutator method that provides every case possible so that the conversion is successful
Finally print out line for the finally barCode based on the initial zipcode entered and the barcode entered





