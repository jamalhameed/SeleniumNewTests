package Day8programs;

import java.util.ArrayList;
import java.util.Scanner;

public class userCityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many Cities? ");
		int numberofcities = input.nextInt();
		City [] cities = new City[numberofcities];
		ArrayList<City> newlist = new ArrayList<City>();
		
		for(int i=0;i<numberofcities;i++)
		{
			Scanner cityname = new Scanner(System.in);
			System.out.println("Enter City Name ");
			String cityname1 = cityname.next();
		
			System.out.println("Enter longitude ");
			double longitude = cityname.nextDouble();
			System.out.println("Enter latitude ");
			double latitude = cityname.nextDouble();
			
			cities[i]= new City(cityname1,longitude,latitude);
			
			cities[i].printinformation();
		}
		
	
		for(int i=0;i<cities.length;i++)
		{
			for(int j=1;j<cities.length;j++)
			{
			
				if(j==i)
				{
					break;
				}
			double variable1=cities[i].distanceFromCity(cities[j], "N");
			System.out.println("City "+ cities[i].name + " is "+ variable1+ " units away from " + cities[j].name);
			}
		}

	}

}
