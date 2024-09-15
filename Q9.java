import java.util.Scanner;
public class Q9
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int d = sc.nextInt();
	    int rev = 0;
	    while(d>0){
	        int rem = d%10;
	        rev = rev * 10 + rem;
	        d /= 10;
	    }
	    System.out.println("The reversed number is " + rev);
	}
}