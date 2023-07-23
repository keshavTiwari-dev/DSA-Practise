import java.util.Scanner;

public class Solution_Step_1_1_3_IfElse {
    

	public static void main(String[] args) {

	Solution_Step_1_1_3_IfElse obj = new Solution_Step_1_1_3_IfElse();
	Scanner sc = new Scanner(System.in);
	int c = sc.nextInt();
	int d = sc.nextInt();
	
	obj.compareIfElse(c,d);
	
	}

    
	public String compareIfElse(int a, int b) {
        // Write your code here
        if(a<b){
            
        	return "smaller";
        }
        else if(a>b){
        	
        	return "greater";
        }
        else {
        	
        	return "equal";
        }
	}
	
}