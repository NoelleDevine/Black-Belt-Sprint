import java.util.Scanner;


public class FizzBuzz{
    public static void main (String [] args){
        Scanner myScanner = new Scanner (System.in);
        

        int myFizz;
        boolean keepPlaying = true;

         //for loop make it loop 5 times no matter what the user says
        for( int i = 0; i < 5; i++) {
            System.out.println("Enter your number:");
            int myNum = myScanner.nextInt();
            myFizz = myNum;

        //fizz buzz for both
        if(myFizz % 3==0 && myFizz %5==0){
            System.out.println("FIZZ-BUZZ");
        }
        else if (myFizz % 3 == 0){
            System.out.println("FIZZ");
        }
         else if (myFizz % 5 == 0){
            System.out.println("FIZZ");
        }
        else{
              System.out.println("Bad luck");
        }
        System.out.println("Do you want to keep playing");
        // USER HAS TO ENTER TRE OR FALSE
        keepPlaying = myScanner.nextBoolean();
        if(!keepPlaying){
            System.out.print(keepPlaying);
            break;

        }

        }




        }




}
    
    
    