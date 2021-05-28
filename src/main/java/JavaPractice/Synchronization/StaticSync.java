package JavaPractice.Synchronization;

class BookTheatreSeats {
	
	static int total_seats = 20;
	
	static synchronized public void bookseats(int seats) {
		if(total_seats>=seats) {
			System.out.println("Booking completed of " +seats+ "seats");
			total_seats = total_seats - seats;
			System.out.println("Tickets left "+total_seats);
		}
		else {
			System.out.println("Booking cannot be done");
		}
	}
	
}

class Thread1 extends Thread{
	
	BookTheatreSeats b;
	int seats;
	
	Thread1(BookTheatreSeats b, int seats){
		this.b =b;
		this.seats=seats;
	}
	
	public void run() {
		b.bookseats(seats);
	}
}

class Thread2 extends Thread{
	
	BookTheatreSeats b;
	int seats;
	
	Thread2(BookTheatreSeats b, int seats){
		this.b =b;
		this.seats=seats;
	}
	
	public void run() {
		b.bookseats(seats);
	}
}

public class StaticSync {
	
	public static void main(String[] args) {
		
		BookTheatreSeats obj1 = new BookTheatreSeats(); //object 1 created
		
		Thread1 t1 = new Thread1(obj1,7);
		t1.start();
		Thread2 t2 = new Thread2(obj1,6);
		t2.start();
		
        BookTheatreSeats obj2 = new BookTheatreSeats(); //object 2 created
		
		Thread1 t3 = new Thread1(obj2,9);
		t3.start();
		Thread2 t4 = new Thread2(obj2,3);
		t4.start();
	}

}
