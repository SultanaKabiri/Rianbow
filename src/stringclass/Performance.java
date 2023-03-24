package stringclass;

public class Performance {
	
	public static void main(String[] args) {
		// Speed: StringBuffer Vs StringBuilder

		long start_time = System.currentTimeMillis(); // long number
		// StringBuffer
		StringBuffer sbf = new StringBuffer("Hello");

		// for loop
		for (int i = 0; i < 5; i++) {
			sbf.append(" World");
			System.out.println(sbf);
		}

		System.out.println("Time consumed: " + (System.currentTimeMillis() - start_time) + " milli seconds");

		// System.out.println(start_time);
		//StringBuilder

		StringBuilder sb = new StringBuilder("Hello");
		// for loop
		for (int i = 0; i < 15; i++) {
			sb.append(" World");
			System.out.println(sb);
		}

		System.out.println("Time consumed: " + (System.currentTimeMillis() - start_time) + " milli seconds");

	}


}
