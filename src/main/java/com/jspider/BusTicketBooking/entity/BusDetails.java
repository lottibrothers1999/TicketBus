package com.jspider.BusTicketBooking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "bus_details")
public class BusDetails implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Override
	public String toString() {
		return "BusDetails [id=" + id + ", name=" + name + ", timings=" + timings + ", from=" + from + ", destination="
				+ destination + ", price=" + price + "]";
	}
	@Column(name = "timings")
	private String timings;
	
	@Column(name = "frm")
	private String from;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "price")
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}