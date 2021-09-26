import java.util.*;

class M
{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// taking input from user 
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		
		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);

		
		// checking if user is female
		if(sex == 'F'&& age>21) {
			System.out.println("You will work only in urban areas");
		}
		if(sex == 'M' && age>25){
			System.out.println("eligible for marriage");
		}
			else{
				System.out.println("elig marriage");
			}
	}
}
