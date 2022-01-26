package Hotel;


import java.io.*;
import java.util.*;

public class Voyageur {

	public static void main(String[] args)throws IOException/*,ClassNotFoundException*/{
		
		System.out.println("--------------------------[Project : Hotel Resevation  by : Abdellah belcaid ]------------------------------\n");
		
		
 		HotelBooking Hotel=new  HotelBooking();
 		
 		
 		//Test for client 1
 		Client c1=new Client("abdellah","casa");
 		c1.addRoom(new HotelBooking(102,new Date(2021,11,3),new Date(2021,11,9),RoomType.single,true));
		c1.addRoom(new HotelBooking(13,new Date(2021,12,17),new Date(2021,12,23),RoomType.Double,true));
 		c1.addTicket(new PlaneTicket("Royal Maroc AirLine ",TicketType.Economy));
 		Stay stay1=new Stay(new Date(2021,12,3),new Date(2021,12,29),c1.getTickets(),c1.getRooms());
		
 		//Test for client 2
 		Client c2=new Client("khalid","agadir");
		c2.addRoom(new HotelBooking(66,new Date(2021,11,23),new Date(2021,11,27),RoomType.single,false));
		c2.addRoom(new HotelBooking(67,new Date(2022,2,8),new Date(2022,2,10),RoomType.family,false));
		c2.addTicket(new PlaneTicket("Royal Maroc AirLine ",TicketType.BusinessClass));
		Stay stay2=new Stay(new Date(2021,12,7),new Date(2021,12,26),c2.getTickets(),c2.getRooms());
				
		//add client To Hotel
		Hotel.AddClientToHotel(c1);
		Hotel.AddClientToHotel(c2);
		
		
	    //Vector to store all the objects created 
	    Vector<Object> Data=new Vector<Object>(); 
	    Data.add(0, c1);
	    Data.add(1, stay1);
	    Data.add(2, c2);
	    Data.add(3, stay2);
	    
	      System.out.println(Data.toString());
	    
	    
	    
	    //Serialization 
	    FileOutputStream f= new FileOutputStream("DataSerialization.txt");
		ObjectOutputStream o=new ObjectOutputStream(f); 
		o.writeObject(Data);
		o.writeObject(Hotel);
		
		o.close();
	
		
		
		
	}
}
