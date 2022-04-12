package demo4_4;

public class Car18 {

	public static void main(String[] args) {

		int tesla = 50;
		int bogatti = 100;

		int honda = 600;

		int yamaha = 900;

		bogatti = tesla;
		honda = bogatti;
		yamaha = honda;

		System.out.print("Assign valu is = " + yamaha);

	}

}
