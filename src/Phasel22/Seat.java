package Phasel22;

public class Seat {
	private int seatnumber; //defined the seat number
	private boolean reserved; //defined the reserved

	/////////////////////////////////////////////////////////////
	public Seat(int newseatnumber, boolean newreserved) { //main constractor
		seatnumber = newseatnumber;
		reserved = newreserved;
	}

	/////////////////////////////////////////////////////////////
	public int getSeatnumber() { //getter for seat number
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) { //setter for seat number
		this.seatnumber = seatnumber;
	}

	///////////////////////////////////////////////////////////////
	public boolean getReserved() {  //getter for reserved
		return reserved;
	}

	public void setResrved(boolean resrved) {  //setter for seat number
		this.reserved = resrved;
	}

	///////////////////////////////////////////////////////////////
	public boolean isValid() { //method to return if seat is valid or not
		return reserved;
	}
    //////////////////////////////////////////////////////////////
	public void printInfo() {//method to return 
		System.out.println(seatnumber + " " + reserved);
	}

}