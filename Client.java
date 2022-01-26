package Hotel;
import java.io.Serializable;
import java.util.*;


public class Client implements Serializable{
	 private String name;
	 private String Adresse;
	 private int id;
 	 private static int num_client=0;
	
 	 private List <Stay>subject;
	
	 private List <PlaneTicket>TravelDocument;
	 
	 private List <HotelBooking>ReservationHotel;
	 
	 
	 
	 

	public Client(String name ,String Adresse) {
			this.name=name;
			this.Adresse=Adresse;
			++num_client;
			id=num_client;
			this.subject=new ArrayList<Stay>();
			this.TravelDocument=new ArrayList<PlaneTicket>();
			this.ReservationHotel=new ArrayList<HotelBooking>();
		   }
	
				
	
				//Relation entre Client et Stay (1 to Many) (client Order subject)
					public void addOrder(Stay subject ) {
						this.subject.add(subject);
						}
					public List<Stay> getOrders(){
						return this.subject;
						}
					public void delateOrder(Stay subject) {
					this.subject.remove(subject);
					}
					
			   //Relation entre Client et PlaneTicket (1 to Many) (client reserve ticket)
						public void addTicket(PlaneTicket ticket ) {
							this.TravelDocument.add(ticket);
							}
						public List<PlaneTicket> getTickets(){
							return this.TravelDocument;
							}
						@SuppressWarnings("unlikely-arg-type")
						public void delateTicket(PlaneTicket Ticket) {
						this.subject.remove(Ticket);
						}

				//Relation entre Client et Hotel (1 to Many) (client reserve Room)
						public void addRoom(HotelBooking Room ) {
							this.ReservationHotel.add(Room);
							}
						public List<HotelBooking> getRooms(){
							return this.ReservationHotel;
							}
						public void deleteRoom(HotelBooking Room) {
						this.ReservationHotel.remove(Room);
						}

				//getters and Setters		
						public String getName() {
							return name;
						}

						public String getAdresse() {
							return Adresse;
						}

						public int getId() {
							return id;
						}

						public void setName(String name) {
							this.name = name;
						}

						public void setAdresse(String adresse) {
							Adresse = adresse;
						}

						public void setId(int id) {
							this.id = id;
						}

						
				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder();
					builder.append("\nClient : name=");
					builder.append(name);
					builder.append(", Adresse=");
					builder.append(Adresse);
					builder.append(", id=");
					builder.append(id);
					//builder.append(",\n\n Stay Orders=");
					//builder.append(client);
					//builder.append(",\n\n Ticket Reserved=");
					//builder.append(Ticket);
					//builder.append(",\n\n Rooms Reserved=");
					//builder.append(Hotel);
					 builder.append("\n");
					return builder.toString();
				}

				
				
			
	
	
	
	
}
	
	
	
 

