import java.util.Scanner;
import java.util.InputMismatchException;
public class NumberGuessing {
    public static void main (String[] args){
       System.out.println("Welcome to our number guessing game!");  
       System.out.println("Would you like to have: 1)One shot (5 trials, win or lose)\n OR \n2)10 rounds and keep score?");
       Scanner sc = new Scanner (System.in); 
       int rounds = getIntInput(sc);
       switch (rounds){
       case 1:
       oneShot(sc);
       break;
       case 2:
       tenRounds(sc);
       break;
       default: 
       System.out.println("Invalid choice");
       break;
}
      }

public static int numberBetweenRangeGenerator(int ceil,int floor){
    int target = (int) (Math.random()*(ceil-floor+1)) + floor;
    return target;
}

public static void oneShot(Scanner sc){
  System.out.println("Please enter the range: ");
       System.out.println("From: ");
       int floor = getIntInput(sc);
       System.out.println("To: ");
       int ceil = getIntInput(sc);
       int target =numberBetweenRangeGenerator(ceil, floor);
       //System.out.println(target); ^^can be used to check the validity of code
        int i=0;
        boolean hitTarget = false;
        while(i<5){
          System.out.println("Please enter your guess: ");
        System.out.println("Trial number: "+(i+1));
        int guess = getIntInput(sc);
        if (guess==target){
        System.out.println("WINNER WINNER CHICKEN DINNER!");
        hitTarget = true;
        break;
        }
        if (guess<=ceil&&guess>=floor){
        if (guess>target && i!=4){
          System.out.println("Try again, go a little lower");
        }
        else if (guess<target && i!=4){
          System.out.println("Try again, go a little higher");
        }
      }
        else if (guess>ceil||guess<floor){
        System.out.println("The number you entered is out of bounds.\nTry another number from: "+floor+" to: "+ceil+"\nYou have been given another chance");
        i--;
      }
        i++;
    }
    if (!hitTarget){
      System.out.println("Hard luck.\n Your trials are over.\n The number was: "+target);
   }
  }
public static void tenRounds(Scanner sc){
  int score = 0;
  final int rounds = 10;
  final int Trials = 5;
  System.out.println("You have " + Trials + " trials.\n Each time, try to guess a number between 1 and 10.\n The number is different each time.");
 for (int i=0;i<rounds;i++){
 int target2 =(int)(Math.random()*10) + 1;
 // System.out.println(target2) ^^can be used to check the validity of code
 System.out.println("Round "+(i+1));
 System.out.println("Please enter your guess: ");
 int guess2 = getIntInput(sc);
 if (guess2==target2){
  score++;
  System.out.println("Correct guess. Your score is incremented by 1.");
 }
 else{
  System.out.println("Incorrect guess. The correct guess was "+target2);
 }
 }
 System.out.println("Your score is: "+score);
}
public static int getIntInput(Scanner sc){
  int input = 0;
  boolean valid = false;
  while(!valid){
      try{
          input = sc.nextInt();
          valid = true;
      }
      catch(InputMismatchException ime){
          System.out.println("Invalid input. Please enter a valid number:\nonly integers are allowed,\nno fractional numbers, letters\nor special characters ");
          sc.nextLine();
      }
  }
  sc.nextLine();
  return input;
}
}

