///I need some help with the if and else if statements in the code thanks!
import java.util.Scanner;

//import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int small1 = Math.max(a, b);
        int middle1 = Math.min(small1, c);
        return middle1;
        
        
    }

    
    //Right now, this method prints out the value of the largest absolute value, but does not account for the negative numbers in it so only prints out
    //the positive nums. For the code that is now in comments, I just need to know how to use an else if statment in order to return the orginal ints.
    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int abva = Math.abs(a);
        int abvb = Math.abs(b);
        int compr = Math.max(abva, abvb);
        return compr;
        //int hey = abva;
        //int hey2 = abvb;
        //int woah = compr;
        //if (hey == woah);
        //{
        //    return a;
        //}     
        //else if (woah == hey2);
        //{
        //    return b;
        //}
    }

    

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        //double aa =  a;
        double aye = Math.pow(a, 2);
        double bee = Math.pow(b, 2);
        double leftside = aye + bee;
        double cequals = Math.sqrt(leftside);
        return cequals; // REPLACE WITH YOUR CODE
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        //System.out.println(median(1, 2, 3)); // should be 2
        //System.out.println(magnitude(-7, -1)); // should be -7
        //System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
         System.out.print("what method?");
         String methodname = scan.next();
         //Just need to know how to use the else/if statemnents in order to pick which method?

         if (methodname == "median");
            System.out.print("Pick three numbers to find the middle value");
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            int c = Integer.parseInt(scan.next());
            System.out.println(median( a, b, c));

         if (methodname == "magnitude");
            System.out.print("Pick two numbers to use to find the larger absolute value:");
            int d = Integer.parseInt(scan.next());
            int e = Integer.parseInt(scan.next());
            System.out.println(magnitude(d, e));

         if (methodname == "pythagoras");
         System.out.print("Pick two values of sides to use to find the third side to a right triangle");
            int f = Integer.parseInt(scan.next());
            int g = Integer.parseInt(scan.next());
            System.out.println(pythagoras(f, g));
        
            


         scan.close();
         
    }

    
}
