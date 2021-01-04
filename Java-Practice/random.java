import java.util.Scanner;

public class random {

	static float sum(float a, float b){
		return a+b;
	}
	static float sub(float a, float b){
		return a-b;
	}
	static float mul(float a, float b){
		return a*b;
	}
	static float div(float a, float b){
		return a/b;
	}


	public static void main(String[]args)
	{
		float num1, num2;
		Scanner numbers = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		num1 = numbers.nextFloat();
		System.out.println("Enter The Second Number:");
		num2 = numbers.nextFloat();
		System.out.println("Select from 1 for +, 2 for -, 3 for *, 4 for /");
		int select;
		select = numbers.nextInt();
		switch (select){
			case 1:
				System.out.println("Sum is "+sum(num1, num2));
				break;
			case 2:
				System.out.println("Difference is "+sub(num1, num2));
				break;
			case 3:
				System.out.println("Product is "+mul(num1, num2));
				break;
			case 4:
				System.out.println("Quotient is "+div(num1, num2));
				break;
			default:
				System.out.println("Please enter valid response");

		}



	}

}
