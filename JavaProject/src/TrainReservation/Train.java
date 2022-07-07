package TrainReservation;

public class Train {
	private int trainno;
	private boolean ac;
	private int capacity;	
	
	 Train(int trainno, boolean ac, int cap) {
		this.trainno = trainno;
		this.ac = ac;
		this.capacity = cap;
	}
	 
	 public int getTrainno() {
		 return trainno;
	 }
	 public boolean isAc() {
		 return ac;
	 }
	 
	 public int getCapacity(){
		 return capacity;
	 }
	 
	 public void setAc(boolean val) {
		 ac=val;
	 }
	 public void setCapacity(int cap) {
		 capacity= cap;
	 }
	 
	 
	 public void trainInfo() {
		 System.out.println("Train no "+trainno + "The Train has ac or not "+ac +"Total capacitity "+capacity);
	 }
	 

}
