package atmmachine;
import java.util.*;

public class ATMCompleteProject {

	public static void main(String[] args) {
		
		int pin=1234;
		int balance=10000;
		int addamount=0;
		int takeamount=0;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your PIN number");
		int password = scanner.nextInt();
		
		if(password==pin) {
			System.out.println("Enter your name");
			name=scanner.next();
			System.out.println("welcome "+name);
			
			while(true) {
				System.out.println("press 1 to check balance");
				System.out.println("press 2 to Add amount");
				System.out.println("press 3 to widraw");
				System.out.println("press 4 to take recipt");
				System.out.println("press 5 to Exit");
				
				int opt = scanner.nextInt();
				switch(opt)
				{
				case 1:
					System.out.println("Your current balance is "+balance);
					break;
					
				case 2:
					System.out.println("How much you want to add");
					addamount= scanner.nextInt();
					System.out.println("succesfully credited");
					balance= addamount+balance;
					break;
				case 3:
					System.out.println("How much you want to widraw");
					takeamount=scanner.nextInt();
					if(takeamount>balance) {
						System.out.println("In sufficient balance");
					}else {
					System.out.println("succesfully debited");
					balance= balance-takeamount;
					}
					break;
				case 4:
					System.out.println("Welcome "+name);
					System.out.println("Current available balance is "+balance);
					System.out.println("last Amount Deposited is  "+addamount);
					System.out.println("last Amount Widrawn is  "+takeamount);
					System.out.println("Thank you "+name);
				    break;
					
					
				}
				
				if (opt==5){
					System.out.println("Thankyou "+name +" visit again");
					break;
				}
			}
		}else {
			System.out.println("Please enter the correct pin number");
		}
	}

}
