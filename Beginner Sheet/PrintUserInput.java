// have scanner class in it
import java.util.*;

public class PrintUserInput {
    public static void main(String[] args) {
        
        int usrInput;
        // Scanner class object is used to take input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number :- ");

        usrInput = sc.nextInt();

        System.out.println("The entered number is "+ usrInput);


    }
}
