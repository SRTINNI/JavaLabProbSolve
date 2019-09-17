
public class Testt
{
    public static void main(String [] args)
    {
            System.out.print("Enter the number of quarters: ");
            int quarters = in.nextInt();
            int total = total + quarters * 0.25;
            if (in.hasNextInt())
            {
                total = total + quarters * 0.25;
                System.out.println("Total: " + total);
            }
            else
            {
                System.out.println("Input error.");
            }
    }
            
}