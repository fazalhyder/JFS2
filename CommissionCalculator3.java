import java.util.Scanner ;

public class CommissionCalculator3
{
    public static void main(String[] args)
   {
	   Double rate;
   
   // Output message for user to input  sales
   System.out.println("Please input sales: ") ;
   Scanner input = new Scanner(System.in) ;
   Double annual = input.nextDouble() ;
   if(annual<=10000.0){
	   rate=0.0;
      Double commission = annual * rate ;
	  Double total=annual+commission;
      System.out.println("Your commission is: "+commission) ;
	  System.out.println("Your sales is: "+annual) ;
	  System.out.println("Your total is: "+total) ;
      System.out.println("------------------------------------");
   }
     if(annual>=10001.0 && annual<=20000.0){
	   rate=0.10;
      Double commission = annual * rate ;
	  Double total=annual+commission;
      System.out.println("Your commission is: "+commission) ;
	  System.out.println("Your sales is: "+annual) ;
	  System.out.println("Your total is: "+total) ;
      System.out.println("------------------------------------");
   }
    if(annual>=20001.0 && annual<=30000.0){
	   rate=0.20;
      Double commission = annual * rate ;
	  Double total=annual+commission;
      System.out.println("Your commission is: "+commission) ;
	  System.out.println("Your sales is: "+annual) ;
	  System.out.println("Your total is: "+total) ;
      System.out.println("------------------------------------");
   }
    if(annual>=30001.0){
	   rate=0.25;
      Double commission = annual * rate ;
	  Double total=annual+commission;
      System.out.println("Your commission is: "+commission) ;
	  System.out.println("Your sales is: "+annual) ;
	  System.out.println("Your total is: "+total) ;
      System.out.println("------------------------------------");
   }
   }
   
}