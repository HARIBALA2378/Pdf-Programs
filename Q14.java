import java.util.Scanner;
import java.util.Arrays;
public class Q14
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int c = sc.nextInt();
		int a[] = new int [c];
		System.out.println("Enter the array elements");
		for(int i = 0;i<a.length;i++)
		    a[i] = sc.nextInt();
		System.out.println("Original Array " + Arrays.toString(a));
		int b [] = new int [a.length];
		for(int i = 0;i<a.length;i++)
		    b[i] = a[i];
		System.out.println("Copied Array " + Arrays.toString(b));
	}
}