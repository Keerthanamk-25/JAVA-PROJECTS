package MyInterface;

public interface Railways {
	void bookings();
	
	public static void main(String[] args) {
		Onetier ob=new Onetier();
		twotier ob1=new twotier();
		
		ob.bookings();
		ob1.bookings();
		
	}

}
