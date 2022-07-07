package TrainReservation;

import java.util.*;

public class Booking {
	String Passengername;
	int trainno;
	int date;
	
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of passenger ");
		Passengername =  scanner.next();
		System.out.println("Enter the train no ");
		trainno = scanner.nextInt();
		System.out.println("Enter the date in number");
		date =scanner.nextInt();
	}
		public boolean isAvailable(ArrayList<Booking>bookings, ArrayList<Train>trains){
			 int cap=0;
			 for(Train train:trains) {
				 if(train.getTrainno()== trainno)
					 cap= train.getCapacity();
			 }
			 int booked=1;
			 for (Booking b:bookings) {
				 if(b.trainno == b.date ) {
					 booked++;
					 
				 }
			 }
		return booked<cap?true:false;
		
		}
		
		
	}


