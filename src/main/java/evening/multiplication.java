package evening;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numberOne = Integer.parseInt(args[0]);
int numberTwo = Integer.parseInt(args[1]);
int result = multiplication (numberOne,numberTwo);
System.out.println("multiplication is "+result);
	}

	public static int multiplication(int numberOne, int numberTwo) {
		// TODO Auto-generated method stub
		int multiply = numberOne*numberTwo;
		return multiply;
	}

}
