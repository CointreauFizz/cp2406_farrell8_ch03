// This application gets a user's name and displays a greeting

package DebuggingExercises;
import java.util.Scanner;
public class FixDebugThree3
{
   public static void main(String args[])
   {
      String name;
      name = getName();
      displayGreeting(name);           
   }
   private static String getName() {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name");
      name = input.nextLine();
      return name; }

   private static void displayGreeting(String n) {
      System.out.println("Hello, " + n + "!");
   }
}