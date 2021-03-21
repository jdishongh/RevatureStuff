
public class Exercise1 {
	public static void main(String[] args) {
		int oddValue = 1;
		do {
			if(oddValue % 2 != 0) {
				System.out.println("Odd value: " + oddValue);
			}
			oddValue++;
			
		}while(oddValue < 10);
	}
}