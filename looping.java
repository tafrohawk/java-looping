public class looping {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		boolean check = true;
		int count = 0;
		// do while looping
		do {
			if (count > 100) {
					check = false;
			}
			
			System.out.println(count);
			count++;
		} while (check == true);
	}
}