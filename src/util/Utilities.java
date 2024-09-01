package util;

public class Utilities {

	public static char[] getStringAsCharArray(String input) {
		char[] charA = input.toCharArray();
		return charA;
	}

	public int[] getStringAsAsciiArray(String s) {
		char[] ch = getStringAsCharArray(s);
		int length = ch.length;
		int[] asciiA = new int[length];

		for (int i = 0; i < length; i++) {
			asciiA[i] = (int) ch[i];

		}

		return asciiA;
	}

	public String getStringFromAsciiArray(int[] a) {
		int length = a.length;
		char[] charA = new char[length];

		for (int i = 0; i < length; i++) {
			charA[i] = (char) a[i];

		}

		return new String(charA);
	}
	
	public void getInputFromUser() {
		
	}

}