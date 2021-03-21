
public class Exercise2 {
	public static char[] getAlphabetArray() {
		char[] values = new char[26];
		char startVal = 'a';
		int index = 0;
		do {
			values[index] = startVal;
			startVal++;
			index++;
		}while(startVal <= 'z');
		
		return values;
	}
	public static void main(String args[]) {
		char[] alphabet = getAlphabetArray();
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}
	}
}
