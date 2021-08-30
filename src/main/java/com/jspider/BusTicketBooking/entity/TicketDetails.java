package com.jspider.BusTicketBooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ticket_details")
public class TicketDetails {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "id")	
  private int id;
	
  @Column(name = "frm")	
  private String frm;
  
  @Column(name = "destination")
  private String destination;
  
  @Column(name = "traveldate")
  private String traveldate;
  
  @Column(name = "price")
  private double price;
  
  @Column(name = "no_of_pass")
  private int no_of_passangers;
  
  @Column(name = "booking_status")
  private String status;
  
  
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFrm() {
	return frm;
}
public void setFrm(String frm) {
	this.frm = frm;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getTraveldate() {
	return traveldate;
}
public void setTraveldate(String traveldate) {
	this.traveldate = traveldate;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNo_of_passangers() {
	return no_of_passangers;
}
public void setNo_of_passangers(int no_of_passangers) {
	this.no_of_passangers = no_of_passangers;
}
  
  
  
  
}
