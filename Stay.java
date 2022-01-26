package Hotel;
import java.io.*;

import java.util.*;

public class Stay  implements Serializable {
    private Date start;
    private Date end;
    
    private final List<PlaneTicket>Transport;
    private final List<HotelBooking>HotelReservation;
    
    public  Stay(Date start ,Date end ,List<PlaneTicket> AirPlane ,List<HotelBooking> Hotel ) {
		this.start=start;
		this.end=end;
    	this.Transport  =AirPlane;
		this.HotelReservation =Hotel;
		}
	
    
    public double  CalculePrice() {
    	double PriceTotal=0;
    	
    	for (PlaneTicket Ticket :Transport) {
    	PriceTotal+=Ticket.TicketPrice();			
    	}    	
    	for(HotelBooking Room: HotelReservation) {
    	PriceTotal+=Room.RoomPrice();
    	}
   // System.out.println("\nLe prix Total de client est : "+PriceTotal+" DH");
    return PriceTotal;
    }
    
    
	
	//Lists of Hotel and PlaneTickets (relation Composition) 
	public List<PlaneTicket> getListofTickets() {
		return Transport;
	}
	public List<HotelBooking> getListofHotelBooking() {
		return HotelReservation;
	}





	//getters and sitters 
	public Date getStart() {return start;}
	public void setStart(Date start) {this.start = start;}
	public Date getEnd() {return end;}
	public void setEnd(Date end) {this.end=end;}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("--------------------------------------------------[Reservation information]-----------------------------------------------------------\n");
		builder.append("|Date              : from  "+start.getDate()+"/"+start.getMonth()+"/"+start.getYear()+"  to "+end.getDate()+"/"+end.getMonth()+"/"+end.getYear()+"\n");
		builder.append("|Hotel Information : "+HotelReservation+"\n|");
		builder.append("PLaneTicket       :"+Transport+"\n|");
		builder.append("Prix total de client est :"+CalculePrice()+"\n|");
		builder.append("---------------------------------------------------------------------------------------------------------------------------------------\n");
		
		return builder.toString();
	}
	



}
