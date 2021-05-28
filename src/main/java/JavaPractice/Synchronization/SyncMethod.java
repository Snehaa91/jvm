package JavaPractice.Synchronization;

class Movieticket {
	
	int total_seats = 10;
	
	synchronized void bookseat(int seats) {  //Resource which will be accessed by both the threads - mt1 & mt2
		
		if (total_seats>=seats) {
			System.out.println("Seats booked successfully " + seats);
			total_seats = total_seats - seats;
			System.out.println("Seats left " + total_seats);
		}
		
		else {
		
		System.out.println("Sorry seats cannot be booked");
			}
	}
}


public class SyncMethod extends Thread{
	
	static Movieticket mt;  //In static main method -> reference sm was created which act as a static 
                            //and and that reference should be static only - if you don't write static error will be there
                            //If you don't use reference then no need to make is as static but then inside run() method sm will create error
    int seats;

    public void run() {
       mt.bookseat(seats);
     }

    public static void main(String[] args) {

    mt = new Movieticket();

    SyncMethod sm1 = new SyncMethod();
    sm1.seats = 7;
    sm1.start();

    SyncMethod sm2 = new SyncMethod();
    sm2.seats = 6;
    sm2.start();
}
}
