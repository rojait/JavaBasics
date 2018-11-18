package Controlstatements;

public class C2_SwitchStatement {

	public static void main(String[] args) {
		int month = 3;

		switch (month) {
		case 1:
			System.out.println("This month is January");
			break;
		case 2:
			System.out.println("This month is febuary");
			break;
		case 3:
			System.out.println("This month is march");
			break;
		case 4:
			System.out.println("This month is april");
			break;
		default:
			System.out.println("This is not a month");
			break;

		}

	}

}
/*
 * output:- This month is march
 */
