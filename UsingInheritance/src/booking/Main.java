package booking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int persons;
		int total_Days;
		double tariff;
		String roomType;
		int month;
		int peakCharges;
		int discount;
		double c;
		 Booking b1=new Booking(); 
		 Peak p1=new Peak();
		 Lean l1=new Lean();


		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Booking");
		System.out.println("Enter the number of persons");
		persons=Integer.parseInt(br.readLine());
		b1.setPersons(persons);
		System.out.println("Enter the number of days");
		total_Days=Integer.parseInt(br.readLine());
		b1.setTotal_Days(total_Days);
		System.out.println("Enter the room type");
		roomType=br.readLine();
		b1.setRoomType(roomType);
		System.out.println("Enter the month");
		month=Integer.parseInt(br.readLine());
		p1.setMonth(month);
		
		if(month==4||month==5||month==6||month==9||month==11||month==12)
		{
		System.out.println("Enter the discount");
		discount=Integer.parseInt(br.readLine());
		l1.setDiscount(discount);
		System.out.println("Enter the tariff for single person");
		tariff=Integer.parseInt(br.readLine());
		b1.setTariff(tariff);

		c=l1.roomBooking(persons, total_Days, tariff, roomType,discount);
		//System.out.println(Mathround(c));
		System.out.println("Total Tariff: "+Math.round(c));
		}
		if(month==1||month==2||month==3||month==7||month==8||month==12)
		{
			System.out.println("Enter the peakCharge");
			peakCharges=Integer.parseInt(br.readLine());
			p1.setPeakCharges(peakCharges);
			System.out.println("Enter the tariff for single person");
			tariff=Integer.parseInt(br.readLine());
			b1.setTariff(tariff);

			c=p1.roomBooking(persons, total_Days, tariff, roomType, peakCharges);
			System.out.println("Total Tariff: "+Math.round(c));

		}
		
		
					

}

	}