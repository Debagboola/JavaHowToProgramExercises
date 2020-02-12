import java.util.Scanner;

public class Demo{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		
		String userGrade = input.nextLine().toUpperCase();
		
		switch (userGrade){
			case "A+":
			case "A":
				System.out.println("Distinction");
				break;
			case "B":
				System.out.println("B Grade");
				break;
			case "C":
				System.out.println("C Grade");
				break;
			default:
				System.out.println("Fail");
				break;

		}

	}
}