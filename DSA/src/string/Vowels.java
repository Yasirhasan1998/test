package string;

public class Vowels {

	public static void main(String[] args) {
		String s = "hello";

		int vowelCount = countVowels(s);
		System.out.println("The number of vowels in the string is: " + vowelCount);

	}

	private static int countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}
		return count;
	}

}
