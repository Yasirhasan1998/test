package string;

public class ConvertToBase {

	public static void main(String[] args) {
		System.out.println(convertToBase7(-7));
		System.out.println(convertToBase7(100));

	}
	public static String convertToBase7(int num) {
	   
	   String ans="";
	    int n = Math.abs(num);
	    while (n > 0) {
	      ans = n % 7+ans;
	       
	        n /= 7;
	    }
	    if (num<0) {
	      ans="-"+ans;
	    }
	    return ans;
	}
}
