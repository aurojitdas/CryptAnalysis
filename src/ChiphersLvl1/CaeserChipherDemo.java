package ChiphersLvl1;

import util.CaesarCypher;

public class CaeserChipherDemo {

	
	public static void main(String[] args) {
		CaesarCypher c = new CaesarCypher();
		String encryptedText = c.encryptText("A Hello World!!!", 0);
		System.out.println(encryptedText);
		String decryptedText = c.decryptText(encryptedText, 0);
		System.out.println(decryptedText);
	}
	
}
