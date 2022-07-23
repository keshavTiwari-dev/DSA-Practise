import java.util.*;

public class Division {
    public static void main(String[] args) {
        int divisor, quotient, remainder, dividend;

        Scanner sc = new Scanner(System.in);
        
        //print does not change line
        System.out.print("Enter Dividend :- ");
        dividend = sc.nextInt();
        
        // for line change we use \n
        System.out.print("\nEnter Divisor :- ");
        divisor = sc.nextInt();

        //notice how line changes by combination of 'Enter', print, println and \n.20
        quotient = dividend / divisor;
        System.out.println("Quotient is :- "+quotient);

        remainder = dividend % divisor;
        System.out.println("\nQuotient is :- "+remainder);
    }
}
