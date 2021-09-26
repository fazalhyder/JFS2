import java.util.Scanner;
public class vote{
	public static void main(String [] args){
		int eligibilty=18;
		System.out.println("enter age: ");
		Scanner in = new Scanner(System.in);
		int age=in.nextInt();
		if(age>=eligibilty){
			System.out.println("YOU ARE ELIGIBLE TO VOTE ");
		}
		else{
			System.out.println("YOU ARE  NOT ELIGIBLE TO VOTE ");
		}
	}
}

		