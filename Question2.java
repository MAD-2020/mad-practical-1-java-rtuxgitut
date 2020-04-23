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
    
    //Print question and accept input
    System.out.print("Enter your height: ");
    double height = in.nextDouble();
    System.out.print("Enter your weight: ");
    double weight = in.nextDouble();
    
    //Process
    double bmi = weight / (height * height);
    
    //Output
    System.out.println("Height: " + height);
    System.out.println("Weight: " + weight);
    System.out.print1n("BMI: " + bmi);
  }
}
