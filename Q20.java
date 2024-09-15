public class Q20
{
	public static void main(String[] args) {
	    int rows = 9;
	    for(int i = 1;i<=rows;i++){
	        int k = 1;
	        for(int j = 1;j<rows+i;j++){
	            if(j<=rows-i)
	                System.out.print(" ");
	            else if(j>rows-i && j <= rows)
	                System.out.print(k++);
	            else{
	                System.out.print(--k);
	            }
	        }
	        System.out.println();
	    }
	}
}