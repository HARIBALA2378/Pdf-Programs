import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class Q15
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
		HashSet<Integer> e = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
		for(int i:a){
		    if(!e.add(i)){
		        if(!dup.contains(i)){
		            dup.add(i);
		        }
		    }
		}
		System.out.println(dup);
	}
}