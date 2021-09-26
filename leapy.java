import java.util.Scanner;
public class leapy{
	public static void main(String [] args){
		System.out.println("enter year: ");
		Scanner in = new Scanner(System.in);
		int year=in.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)){
			System.out.println("the given year is leap year ");
		}
		else {
			System.out.println("the given year is not a leap year ");
		}
		
}
}
