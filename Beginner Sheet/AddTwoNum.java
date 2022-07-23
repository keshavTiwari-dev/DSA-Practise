import java.util.*
;
public class AddTwoNum {
    public static void main(String[] args) {
        int inp1, inp2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 :- ");
        inp1 = sc.nextInt();
        System.out.println("Enter number 2 :- ");
        inp2 = sc.nextInt();
        int outp = inp1 + inp2;
        System.out.println("The addition of the two is "+outp);
    }
}
