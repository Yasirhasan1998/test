package string;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Yasir ");
		s.append(" hasan");
		System.out.println(s);

		StringBuffer s1 = new StringBuffer("Yasir ");
		s1.insert(1, "hasan");// first string will be change
		System.out.println(s1);

		StringBuffer s2 = new StringBuffer("Yasir");
		s2.replace(1, 3, "Java");
		System.out.println(s2);

		StringBuffer s3 = new StringBuffer("Yasir");
		s3.delete(1, 3);
		System.out.println(s3);

		s3.reverse();
		System.out.println(s3);

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb.ensureCapacity(10);// now no change
		System.out.println(sb.capacity());// now 34
		sb.ensureCapacity(50);// now (34*2)+2
		System.out.println(sb.capacity());// now 70

	}

}
