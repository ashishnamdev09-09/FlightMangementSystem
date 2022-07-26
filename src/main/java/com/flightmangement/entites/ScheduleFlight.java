package com.flightmangement.entites;

public class ScheduleFlight {
	private Flight flight;
	private int availableSeats;
	private Schedule schedule;
	
	//default 
	public ScheduleFlight() {
		super();
	}

	@Override
	public String toString() {
		return "ScheduleFlight [flight=" + flight + ", availableSeats=" + availableSeats + "]";
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Schedule getSchdule() {
		return schedule;
	}

	public void setSchdule(Schedule schdule) {
		this.schedule = schdule;
	}

	public ScheduleFlight(Flight flight, int availableSeats, Schedule schdule) {
		super();
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schdule;
	}


}
