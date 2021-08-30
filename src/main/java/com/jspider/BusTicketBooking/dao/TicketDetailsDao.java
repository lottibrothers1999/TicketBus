package com.jspider.BusTicketBooking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jspider.BusTicketBooking.entity.BusDetails;
import com.jspider.BusTicketBooking.entity.TicketDetails;

public class TicketDetailsDao {
	public void BookTicket(TicketDetails t) {	
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(Movie.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(t);
		transaction.commit();		
	}
	
	public void conformBookedTicket(int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(Movie.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="update TicketDetails set status='Conformed' where id=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i", id);
		query.executeUpdate();
		transaction.commit();
	}
	
	public void cancleTicket(int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(Movie.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="delete from TicketDetails where id=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i", id);
		query.executeUpdate();
		transaction.commit();
	}
}
