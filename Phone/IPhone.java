package com.codingdojo.phoneassignment;

public class IPhone extends Phone implements Ringable{
	public IPhone ( String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring () {
		return getRingTone ();
	}
	@Override
	public String unlock() {
		return "Unlocking via finger print";
		
	}
	@Override
	public void displayInfo() {
		System.out.println("Iphone's version number: "+getVersionNumber()+". Battery Percentage: "+getBatteryPercentage()+". Carrier: "+getCarrier()+". Ringtone: "+getRingTone()+".");
	}
}
