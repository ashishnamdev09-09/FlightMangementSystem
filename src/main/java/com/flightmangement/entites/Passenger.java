package com.flightmangement.entites;

public class Passenger {
	private int pnrNumber;
	private String passengerName;
	private int passengerAge;
	private int passengerUIN;
	private double lugagge;
	
	
	@Override
	public String toString() {
		return "Passenger [pnrNumber=" + pnrNumber + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerUIN=" + passengerUIN + ", lugagge=" + lugagge + "]";
	}
	public int getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public int getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(int passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getLugagge() {
		return lugagge;
	}
	public void setLugagge(double lugagge) {
		this.lugagge = lugagge;
	}
	public Passenger() {
		super();
	}
	public Passenger(int pnrNumber, String passengerName, int passengerAge, int passengerUIN, double lugagge) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.lugagge = lugagge;
	}

}
