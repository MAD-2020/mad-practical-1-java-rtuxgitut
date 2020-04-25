import java.util.ArrayList;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of integers to input: "); //Ask user for a list of numbers
    int num = in.nextInt();

    ArrayList<Integer> numList = new ArrayList<Integer>(); //Flexible list to store elements inside

    for(int i = 0; i < num; i++) //System loops x amount of times based on user input
    {
      System.out.print("Enter an integer: "); //Enter a number
      int value = in.nextInt();
      numList.add(value);
    }
    in.close(); //Prevent resource leak

    int mode = 0; //Used to find the mode in the array list
    int total = 0; //Count number of occurances in the array list

    for(int j = 0; j < num; j++)
    {
      int counter = 0; //To compare elements with the same number with one of the numbers in the list (Default value after completing the loop is 1)
      for(int k = 0; k < num; k++)
      {
        if(numList.get(k) == numList.get(j))
        {
          counter += 1;
        }
      }
      if(counter > total) //Default value of total is 1
      {
        total = counter;
        mode = numList.get(j); //The iteration with the highest mode will be recorded here and the end of the outer loop the program will print out the mode in the list
      }
    }
    System.out.println(mode);
  }
}
