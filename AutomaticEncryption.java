package program;

public class AutomaticEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeeeekkkksssss";
		int n = str.length();
		String str1 = "geeks";
		int n1 = str1.length();
		System.out.println("string : " + str);
		System.out.println(" decryptString : " + decryptString(str, n));
		System.out.println("string : " + str1);
		System.out.println(" encryptString : " + encryptString(str1, n1));

	}

	static String decryptString(String str, int n) {
		int i = 0, jump = 1;
		String decryptedStr = "";
		while (i < n) {
			decryptedStr += str.charAt(i);
			i += jump;
			jump++;
		}
		return decryptedStr;
	}

	static String encryptString(String str, int n) {
		int i = 0, cnt = 0;
		String encryptedStr = "";

		while (i < n) {
			cnt = i + 1;
			while (cnt-- > 0)
				encryptedStr += str.charAt(i);
			i++;
		}
		return encryptedStr;
	}
}
