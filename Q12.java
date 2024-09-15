import java.util.Scanner;
public class Q12
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char c = sc.next().charAt(0);
		System.out.println(isChar(c));
	}
	static boolean isChar(char t){
	    return Character.isLetter(t);
	}
}