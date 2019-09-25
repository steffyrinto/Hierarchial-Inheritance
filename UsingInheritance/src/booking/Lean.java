package booking;

public class Lean extends Booking {
	int discount;
	int month;
	public double roomBooking(int persons, int total_Days, double tariff, String roomType,int discount)
	{
		double total=super.roomBooking(persons, total_Days, tariff, roomType);
		double ratediscount=total*discount/100;
		double actualamount=total-ratediscount;
		return actualamount;

	}
}
