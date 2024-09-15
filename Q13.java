import java.util.Scanner;
import java.util.Arrays;
public class Q13
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int c = sc.nextInt();
		int a[] = new int [c];
		System.out.println("Enter the array elements");
		for(int i = 0;i<a.length;i++)
		    a[i] = sc.nextInt();
		System.out.println(Arrays.toString(a));
		System.out.println("The lowest element in array is " + lowest(a));
	}
	static int lowest(int []t){
	    int min = Integer.MAX_VALUE;
	    for(int i:t)
	        if(i<min)
	            min = i;
	    return min;
	}
}