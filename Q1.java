import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Character");
	  char d = sc.next().charAt(0);
	  for(int i = d;i<='Z';i++)
	     System.out.print((char)(i) + " ");
	}
}