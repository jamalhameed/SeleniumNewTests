package Day8programs;
import java.lang.Math;

public class City {
	
	String name;
	double longitude;
	double latitude;
	
	public City(String name,double longitude, double latitude)
	{
		this.name=name;
		this.longitude=longitude;
		this.latitude=latitude;
	}
	
	public double distanceFromCity(City otherCity, String unit)
	{
		double dlat=0.0;
		double dtheta=0.0;
		double distance = 0.0;
		
		
			
			dtheta= otherCity.longitude - this.longitude;
			distance = Math.sin(Math.toRadians(this.latitude)) * Math.sin(Math.toRadians(otherCity.latitude)) + Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(otherCity.latitude)) * Math.cos(Math.toRadians(dtheta));
			distance = Math.acos(distance);
			distance = Math.toDegrees(distance);
			if (unit.equals("K")) {
				distance = distance * 1.609344;
			} else if (unit.equals("N")) {
				distance = distance * 0.8684;
			}
		
		
		
		
		return (distance);
	}
	
	public void printinformation()
	{
		System.out.println("City "+this.name+" is at: " +this.longitude + " and "+this.latitude);
	}

}
