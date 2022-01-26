package Hotel;

import java.io.*;
import java.util.Vector;

public class Desirialisation {
    public static void main (String[] args)throws IOException,ClassNotFoundException {
    	FileInputStream f=new  FileInputStream("DataSerialization.txt");
	    ObjectInputStream o=new ObjectInputStream(f);
	    
	   final Vector<Object> Data=(Vector<Object>)o.readObject();		
	   final HotelBooking Hotel=(HotelBooking) o.readObject();   
	    
	    	
	    	o.close();
		System.out.println(Data.toString());
		System.out.println(Hotel.ListOFClientsAtTheHotel());
    	
    }
				
}