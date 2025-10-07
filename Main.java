import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    // Problem 1
    System.out.println("Enter in a number");
    double target = 12.345;
    double user_input = scan.nextDouble();
    

    if (user_input == target)
    {
      System.out.println("YES!");  
    }
    else
    {
      System.out.println("NO!");
    }

    System.out.println("Please eneter an interger:");
    int score = 48;
    int user_input2 = scan.nextInt();

    if (user_input2 == score)
    {
      System.out.println("YEAH");
    }
    else
    {
      System.out.println("NAH");
    }
    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
