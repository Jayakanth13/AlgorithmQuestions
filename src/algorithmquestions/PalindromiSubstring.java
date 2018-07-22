package algorithmquestions;

public class PalindromiSubstring {

	public static void main(String[] args) {

		String s = "babad";
		int size = 0;
		//
		char[] charArray = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			size = isPallindrome(charArray, i);

		}
		System.out.println(size);

	}

	private static int isPallindrome(char[] charArray, int i) {
		for (int j = 0; j < charArray.length /2 -1; j++) {

			if (charArray[j] != charArray[charArray.length - 1 - j - i]) {

				return 0;
			}

		}
		return charArray.length - i;

	}

}
