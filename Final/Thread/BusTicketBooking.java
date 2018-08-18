class Booking{
	int avialibaleSeets = 10;
	public synchronized void bookSeats(String name,int seats){
       if(seats <= avialibaleSeets){
       	  try{Thread.sleep(3000);}catch(Exception e){}
           System.out.println(name +": You Booked :"+seats+" : seats");
           avialibaleSeets = avialibaleSeets-seats;
       }else{
       	System.out.println("Sorry !! : "+name +": No seats avialibale");
       }
	}
}

class BookingTest extends Thread{
	String name;
	Booking b;
	int seats;

	public BookingTest(Booking b,String name,int seats){
		this.b = b;
		this.name = name;
		this.seats = seats;
	}
	public void run(){
		b.bookSeats(name,seats);
	}


}
class BusTicketBooking{
	public static void main(String[] args) {
		Booking b = new Booking();
		new BookingTest(b,"Deep",5).start();
		new BookingTest(b,"Saurav",3).start();
		new BookingTest(b,"Aman",4).start();
	}
}