package Hotel;

import java.io.Serializable;

public class PlaneTicket implements Serializable{
   
	private String Reference;
	private TicketType flightType;
	public PlaneTicket(String Reference,TicketType flightType) {
	this.Reference=Reference;
	this.flightType=flightType;

	}

	//Getters and Setters
	public String getReference() {
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}


	public double TicketPrice() {
	   double  Ticket=0;
		if(flightType.equals(TicketType.Economy)) Ticket=1800.00;
		else  if(flightType.equals(TicketType.BusinessClass))Ticket= 2900.00;
		else  if(flightType.equals(TicketType.FirstClass)) Ticket= 4000.00;
	return Ticket;
	}

	@Override
	public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Ticket :Reference =");
	builder.append(Reference);
	builder.append(", Ticket Price=");
	builder.append(TicketPrice());
	builder.append(" , Ticket Type = "+flightType);
	builder.append("                                                    										 |\n|                    ");
	return builder.toString();
}



}
