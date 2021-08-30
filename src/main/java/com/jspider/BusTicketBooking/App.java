package com.jspider.BusTicketBooking;

import com.jspider.BusTicketBooking.dao.BusDetailsDao;
import com.jspider.BusTicketBooking.dao.TicketDetailsDao;
import com.jspider.BusTicketBooking.entity.BusDetails;
import com.jspider.BusTicketBooking.entity.TicketDetails;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BusDetailsDao dao=new BusDetailsDao();
        dao.getBusList("ichchapuram","Vizag").forEach(each ->{System.out.println(each);});
    	
    	TicketDetails t=new TicketDetails();
    	t.setFrm("ichchapuram");
    	t.setDestination("vizag");
    	t.setTraveldate("01-SEP");
    	t.setPrice(500.00);
    	t.setNo_of_passangers(2);
    	t.setStatus("pending");
    	
    	TicketDetailsDao pass=new TicketDetailsDao();
        pass.BookTicket(t);
        pass.conformBookedTicket(1);
        pass.cancleTicket(1);
    	
    	
    	
    	
    	
    	
    	
    }
}
