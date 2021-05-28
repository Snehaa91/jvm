package JavaPractice.Synchronization;

class Movieticket1 {
	
	int total_seats = 10;
	
	void bookseat(int seats) {  //Resource which will be accessed by both the threads - mt1 & mt2
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		
		synchronized(this){  //only if and else block is synchronized
		
		if (total_seats>=seats) {
			System.out.println("Seats booked successfully " + seats);
			total_seats = total_seats - seats;
			System.out.println("Seats left " + total_seats);
		}
		
		else {
		
		System.out.println("Sorry seats cannot be booked");
			}
		
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		}
	}
}

public class SyncBlock extends Thread{
	static Movieticket1 mt;  
	int seats;

    public void run() {
    mt.bookseat(seats);
    }

    public static void main(String[] args) {

    mt = new Movieticket1();

    SyncBlock sm1 = new SyncBlock();
    sm1.seats = 7;
    sm1.start();

    SyncBlock sm2 = new SyncBlock();
    sm2.seats = 6;
    sm2.start();
}
}

