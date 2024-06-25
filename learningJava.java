import java.util.*;

public class learningJava{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		String operation = sc.next();

		switch(operation){
		case "Addition":
			System.out.print(a + b);
			break;
		case "Subtraction":
			System.out.print(a - b);
			break;
		case "Multiplication":
			System.out.print(a * b);
			break;
		case "Division":
			System.out.print(a / b);
			break;
		case "Modulo":
			System.out.print(a % b);
			break;
		default:
			System.out.print("Invalid operation");
			break;
		}
		

	}

}