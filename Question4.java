import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);

    //Get Input
    System.out.print("Enter the integer base of triangle: ");
    int number = in.nextInt();

    for (int row = 0; row < number; row++)  //Print number of lines based on integer received
    {
      for (int ast = 0; ast < (number - row) ; ast++) //Print astericks, -1 going to next row.
      {
        System.out.print("*");
      }
      System.out.println(); //Go to next line
    }
    
    in.close();
  }
}
