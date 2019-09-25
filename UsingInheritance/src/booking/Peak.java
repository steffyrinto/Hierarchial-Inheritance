package booking;

public class Peak extends Booking{
	int month;
	int peakCharges;
	double roomBooking(int persons, int total_Days, double tariff, String roomType,int peakCharges)
{
	double peakrate=super.roomBooking(persons, total_Days, tariff, roomType);
	double totalpeak=peakrate*peakCharges;
	return  totalpeak;
}
}
