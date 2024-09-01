package util;

public class CaesarCypher extends Utilities {

	public String encryptText(String s, int key) {
		return encrypt(s, key);
	}

	public String decryptText(String s, int key) {
		return decrypt(s, key);
	}

	private String encrypt(String s, int key) {
		int[] input = getStringAsAsciiArray(s);
		int length = input.length;
		int[] output = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = input[i] + key;
		}

		return getStringFromAsciiArray(output);
	}

	private String decrypt(String s, int key) {
		int[] input = getStringAsAsciiArray(s);
		int length = input.length;
		int[] output = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = input[i] - key;
		}
		return getStringFromAsciiArray(output);
	}

}
