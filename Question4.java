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

    System.out.print("Enter an integer for the base of triangle: ");
    int num = in.nextInt();
    in.close();

    for(int r = 0; r < num; r++)
    {
      for(int unit = num; unit > r; unit--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
