import java.util.ArrayList;
public class Q16
{
	public static void main(String[] args) {
	    int a[] = {2,4,5,6,7,9,10,13};
	    int b[] = {2,3,4,5,6,7,8,9,11,15};
	    ArrayList<Integer> al = new ArrayList<>();
	    int i = 0;int j = 0;
	    while(i < a.length && j < b.length){
	        if(a[i] < b[j])
	            al.add(a[i++]);
	        else if(a[i] > b[j])
	            al.add(b[j++]);
	        else{
	            al.add(a[i++]);
	            j++;
	        }
	    }
	    while(i<a.length)
	        al.add(a[i++]);
	    while(j<b.length)
	        al.add(b[j++]);
	   System.out.println(al);
	}
}