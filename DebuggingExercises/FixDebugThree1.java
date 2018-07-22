// This class calculates a waitperson's tip as 15% of the bill
package DebuggingExercises;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FixDebugThree1
{
   public static void main(String args[])
   {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are $" + myCheck + "and $" + yourCheck);
      calcTip(myCheck);
      calcTip(yourCheck);
    }

    private static void calcTip(double bill)
    {
        final double RATE = 0.15;
        double tip = bill * RATE;

        DecimalFormat decForm = new DecimalFormat("##.##");
        decForm.setRoundingMode(RoundingMode.DOWN);

        System.out.println("The tip should be at least $" + decForm.format(tip));
    }
}