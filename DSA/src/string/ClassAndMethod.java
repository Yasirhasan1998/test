package string;

public class ClassAndMethod {

	public static void main(String[] args) {
		String s = " Yasir ";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.length());
		
		String s1="Kamal";
		System.out.println(s1.startsWith("Ka"));
		System.out.println(s1.endsWith("l"));
		System.out.println(s1.startsWith("n"));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		
		String a=new String("Sachin");    
		String s2=a.intern();    
		System.out.println(s2);
		
		int n=10;
		String n1=String.valueOf(n);
		System.out.println(n1);
		
		String text="india is a freedom country.india can't stop there progress";
		String re=text.replace("india", "bengaladesh");
		System.out.println(re);
	}

}
