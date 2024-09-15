public class Q24
{
	public static void main(String[] args) {
	    int rows = 4;
	    int k = 1;
	    for(int i = 1;i<=rows;i++){
	        for(int j = 1;j<=rows;j++){
	            if(j<=rows-i)
	                System.out.print(" ");
	            else 
	                System.out.print(k++ + " ");
	            }
	        System.out.println();
	    }
	}
}