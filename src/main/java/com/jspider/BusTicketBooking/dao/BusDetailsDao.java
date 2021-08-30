package com.jspider.BusTicketBooking.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jspider.BusTicketBooking.entity.BusDetails;

public class BusDetailsDao {
	public void saveBusDetails(BusDetails bus) {	
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(Movie.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(bus);
		transaction.commit();		
	}
	
public List<BusDetails> getBusList(String from,String destination) {
	    Configuration cfg = new Configuration();
	    cfg.configure();
	    //cfg.addAnnotatedClass(Movie.class);
	    SessionFactory sessionFactory = cfg.buildSessionFactory();
	    Session session = sessionFactory.openSession();
		String hqlquery="from BusDetails where from=:f and destination=:d";
		Query query = session.createQuery(hqlquery);
		query.setParameter("f",from);
		query.setParameter("d",destination);
		return query.list();
		
	}
}
