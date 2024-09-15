public class Q25
{
	public static void main(String[] args) {
	    String s = "12345";
	    int rows = s.length();
	    for(int i = 0;i<rows;i++){
	        for(int j = 0;j<rows;j++){
	            if(i == j || i + j == s.length()-1)
	                System.out.print(s.charAt(j));
	            else 
	                System.out.print(" ");
	            }
	        System.out.println();
	    }
	}
}