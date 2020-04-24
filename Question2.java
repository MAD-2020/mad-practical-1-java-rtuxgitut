import java.util.Scanner;
import java.text.DecimalFormat;

public class Question2
{
  private static DecimalFormat df2 = new DecimalFormat("#.##");
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    //Scan input
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your height(in cm): ");
    double height = in.nextDouble();

    System.out.print("Enter your weight(in kg): ");
    double weight = in.nextDouble();
    in.close();

    double bmi = weight / ((height / 100) * (height / 100));

    System.out.println("Height: " + height);

    System.out.println("Weight: " + weight);

    System.out.println("BMI: " + df2.format(bmi));
  }
}
