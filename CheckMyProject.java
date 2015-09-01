package sendtosir;

public class CheckMyProject {

	public static void main(String[] args) {
		System.out.println("----- This is my project ----- ");
		addNumber();
		multi(20, 60, 10);
		subtraction();
		loop();
		loop1();
		loop2();
		check1();
	}

	public static void addNumber() {
		int Number1 = 100;
		int Number2 = 121;
		int Number = Number1 + Number2;
		System.out.println(" result of two numbers = " + Number);
	}

	public static void multi(int x, int y, int z) {
		// it should be answer 130 instead of that getting 1210.
		int multi = ((x * y) + z);
		System.out.println(" result of three numbers = " + multi);
	}

	public static void subtraction() {
		double value1 = 207.5;
		double value2 = 101.2;
		double subtraction = value1 - value2;
		System.out.println(" result ot two numbers = " + subtraction);

	}

	public static void loop() {
		for (int i = 2; i < 10; i += 2) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " ----- " + j);

			}
		}
	}

	public static void loop1() {
		for (int i = 0; i <= 2; i++) {
			// if ( i >0 && i < 4){
			for (int j = 0; j <= 2; j++) {
				System.out.print(i + " look " + j);

			}

		}

	}

	public static void loop2() {
		for (int i = 1; i < 10; i++) {
			a[i] = a[i - 1] + i;
// having trouble shoot this error
		}
	
	
	}

	public static void check1() {
		int x = 20;
		int y = 30;
		if (x == y)
		{
		System.out.println(" x is equl to y");
		if (x <= y) {

			System.out.println(" x is greater then equal y ");
		}

		if (x >= y) {

			System.out.println(" x is not greather then y ");
		}

		if (x != y) {
			System.out.println(" x is not equal to y ");
		}

		if (x > y) {
			System.out.println(" x is greater then y ");
		}

		if (x < y) {
			System.out.println(" x is less then y ");
		}
	}

}
