package Hotel;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class HotelBooking implements Serializable {
	private int Room_n;
	private Date Start;
    private Date End;
    private int  N_nights;
    private RoomType roomType;
    private boolean Smooking;
     
    private List<Client>ListOfClient; 
    
    
    
   		
   	public  double RoomPrice() {
    	double prix=0;
    	 
    	  if(roomType.equals(RoomType.single) ) 
    		  		prix+=150*N_nights;
    	   else if(roomType.equals(RoomType.Double)) 
    		   		prix+=300*N_nights;
    	  else if(roomType.equals(RoomType.family)) 
    		  		prix+=500*N_nights;
    		
    	  if(Smooking==true)prix+=20;
    	return prix;
    }
    
   	
   	//Contractor for reserving a Room 
	public HotelBooking(int Room_n,Date start, Date end, RoomType roomType, boolean smooking) {
		this.Room_n=Room_n;
		this.Start = start;
		this.End = end;
		this.roomType = roomType;
		this.Smooking = smooking;
		
		//calculate number of nights
		long diffInMillies = end.getTime() - start.getTime();
	    this.N_nights=(int) TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);
	
		
	  }
	//Contractor Calling for Hotel  
	public HotelBooking(){
		ListOfClient =new ArrayList<Client>();
		
      }
	
	//List of cliets reserved 	at the Hotel $
	
	public void AddClientToHotel(Client guest) {
		ListOfClient.add(guest);
	}
	public void  removeClientfromHotel(Client guest) {
		ListOfClient.remove(guest);
	}
	public List<Client> ListOFClientsAtTheHotel(){
		
		return ListOfClient; 
	}

	
	
	//getters and setters
	public int getRoom_n() {
		return Room_n;
	}

	public Date getStart() {
		return Start;
	}

	public Date getEnd() {
		return End;
	}

	public int getN_nights() {
		return N_nights;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public boolean isSmooking() {
		return Smooking;
	}

	public void setRoom_n(int room_n) {
		Room_n = room_n;
	}

	public void setStart(Date start) {
		Start = start;
	}

	public void setEnd(Date end) {
		End = end;
	}

	public void setN_nights(int n_nights) {
		N_nights = n_nights;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public void setSmooking(boolean smooking) {
		Smooking = smooking;
	}


	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room : Room_n=");
		builder.append(Room_n);
		builder.append(" from ");
		builder.append(Start.getDate()+"/"+Start.getMonth()+"/"+Start.getYear());
		builder.append(" to ");
		builder.append(End.getDate()+"/"+End.getMonth()+"/"+End.getYear());
		builder.append(" N_nights=");
		builder.append(N_nights);
		builder.append(" RoomType=");
		builder.append(roomType);
		builder.append(" Smooking=");
		builder.append(Smooking);
		builder.append("\n|                    ");
		return builder.toString();
	}
	

}
