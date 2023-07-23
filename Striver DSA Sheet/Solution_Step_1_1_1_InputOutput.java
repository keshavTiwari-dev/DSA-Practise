import java.util.Scanner;

public class Solution_Step_1_1_1_InputOutput {
    
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if( (int)ch >= (int)'A' && (int)ch <= (int)'Z' ) {
            System.out.print(1);
        }
        else if( (int)ch >= (int)'a' && (int)ch <= (int)'z' ) {
            System.out.print(0);
        }
        else{
            System.out.print(-1);
        }

    }
}