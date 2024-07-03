import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		float n1,n2;
		System.out.print("Enter Number1:");
		n1= SC.nextFloat();
		System.out.print("Enter Number2:");
		n2=SC.nextFloat();
		
		
		System.out.print("\n=====[ Maths Operation ] =====\n");
		System.out.print("1-Add\n");
		System.out.print("2-Subtract\n");
		System.out.print("3-Multiply\n");
		System.out.print("4-Divide]n");
		
		
		int menu;
		System.out.print("Enter your preference");
		menu=SC.nextInt();
		switch(menu) {
		case 1: 
				System.out.printf("Answer = %.2f\n", (n1+n2));
				break;
				
		case 2:
			System.out.printf("Answer = %.2f\n" ,(n1-n2));
			break;
			
		case 3: 
			System.out.printf("Answer = %.2f\n", (n1*n2));
			break;
			
		case 4: 
				System.out.printf("Answer = %.2f\n", (n1/n2));
				break;
			default: 
				System.out.print("Enter number");
		}
}

}
