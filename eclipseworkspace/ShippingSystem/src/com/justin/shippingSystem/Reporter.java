package com.justin.shippingSystem;

import java.util.ArrayList;
import java.util.List;

public class Reporter {
	List<Parcel> parcels;
	
	public Reporter(){
		parcels = new ArrayList<>();
	}
	
	public Parcel setParcels(List<Parcel> managePackages){
		this.parcels = managePackages;
		return managePackages.get(0);
	}
	
	public String printParcels(){
		StringBuilder stringBuilder = new StringBuilder();
		for(int count = 0; count < parcels.size(); count++){
			
			stringBuilder.append(parcels.get(count).whatAmI());
			stringBuilder.append(" id:").append(parcels.get(count).getId());
			stringBuilder.append(" ").append(parcels.get(count).getDestination());
			stringBuilder.append(" ").append(parcels.get(count).specialInformation()).append("\n");
			
		}
		System.out.println(stringBuilder.toString());
		
		return stringBuilder.toString();
	}
	
	
	//print each item 
	//print special stuff for box or letter too
	
	
	//naming, for loop
}
