package TrainReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainDemo {

	public static void main(String[] args) {
		
		ArrayList<Train> trains = new ArrayList<Train>();
		ArrayList<Booking> bookings= new ArrayList<Booking>();
		trains.add(new Train(1,true,2));
		trains.add(new Train(2,false,3));
		trains.add(new Train(3,false,2));
		
	    int userOpt=1;
	    Scanner scanner = new Scanner(System.in);
	    
	    for(Train t:trains) {
	    	t.trainInfo();
	    }
	    
		while(userOpt==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt= scanner.nextInt();
		if(userOpt==1) {
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,trains)) {
				bookings.add(booking);
				System.out.println("your booking is confirmed");
			}else
				System.out.println("booking full");
		}
		}
	}

}
