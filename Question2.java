import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    //Scan input
    Scanner in = new Scanner(System.in);
    //Print question out
    System.out.println("Enter your height and weight: ");
    //Accept and convert input to double
    double height = in.nextDouble();
    double weight = in.nextDouble();
    
    //Process
    double bmi = weight / (height * height);
    
    //Output
    System.out.println("Height: " + height);
    System.out.println("Weight: " + weight);
    System.out.print1n("BMI: " + bmi);
  }
}
