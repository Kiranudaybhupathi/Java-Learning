import java.util.Scanner;
public class MiniGame {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int secretKey=42;

        int guesser =0;
        int count=0;
        System.out.println("====Secret Number Guessing Game===");
        System.out.println("Try to Guess the Secret Number");
        while(guesser != secretKey){
            System.out.print("Enter Your Guess:");
            guesser=sc.nextInt();
            count++;
            if(guesser>secretKey){
                System.out.println("Too High");
            } else if (guesser<secretKey) {
                System.out.println("Too Low");

            }
            else{
                System.out.print("Correct! You got this in " + count + "Guesses");
            }

        }



    }

}
