import java.util.Arrays;
public class Q17
{
	public static void main(String[] args) {
	    int a[] = {1,2,3,4,5,6,7};
	    for(int i = 0;i<a.length;i++){
	        for(int j = i+1;j<a.length;j++){
	            if(i%2 == 0){
	                if(a[i] < a[j]){
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	            else{
	                if(a[i] > a[j]){
	                    int tem = a[i];
	                    a[i] = a[j];
	                    a[j] = tem;
	                }
	            }
	        }
	    }
	   System.out.println(Arrays.toString(a));
	}
}