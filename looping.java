public class looping {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		boolean check = true;
		int count = 0;
		// do while looping
		do {
			
			// check if 'count' variable is more than 100, if it is, set 'check' to false.
			if (count > 100) {
				// set 'check' to false.
				check = false;
			}
			// print 'count' variable value to console.
			System.out.println(count);
			
			// increment 'count' variable by 1.
			count++;
			
		} while (check == true);
	}
}