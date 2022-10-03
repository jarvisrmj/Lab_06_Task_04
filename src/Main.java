import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double meter = 0;


        System.out.print("\nEnter how many meters: ");
        if(in.hasNextDouble())
        {
            meter = in.nextDouble();
            in.nextLine();
            System.out.print("\nYou said there are " + meter + " meters");
            double mile = (meter /1609 ) ;
            double feet = (meter * 3.281) ;
            double inch = (meter * 39.37) ;
            System.out.print("\nThere are " + mile + " miles");
            System.out.print("\nThere are " + feet + " feet");
            System.out.print("\nThere are " + inch + " inches");

        }
        else
        {
            trash = in.nextLine ();
            System.out.println(trash + " is a bad input!");
        }

    }
}