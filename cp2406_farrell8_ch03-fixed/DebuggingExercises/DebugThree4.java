// This program calculates tutition bills as credits times rate per credit hour
public class DebugThree4
{
   public static void main(String args[])
   {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84d;
      System.out.println("My tuition:");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition:");
      tuitionBill(yourCredits, rate);
   }
   public static void tuitionBill(int credits, double r)
   {

      System.out.println("Total due " + (r * credits));
   }
}
