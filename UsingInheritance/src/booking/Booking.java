package booking;

public class Booking {
	private int persons;
	private int total_Days;
	private double tariff;
	private String roomType;
	private int discount;
	private int month;
	private int peakCharges;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
		public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getTotal_Days() {
		return total_Days;
	}
	public void setTotal_Days(int total_Days) {
		this.total_Days = total_Days;
	}
	public int getPeakCharges() {
		return peakCharges;
	}
	public void setPeakCharges(int peakCharges) {
		this.peakCharges = peakCharges;
	}
	
	
	double roomBooking(int persons, int total_Days, double tariff, String roomType)
	{
		double totalamount=persons*total_Days*tariff;
		return totalamount;
		}
	
	}

