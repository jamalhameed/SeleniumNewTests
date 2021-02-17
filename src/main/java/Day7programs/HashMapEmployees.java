package Day7programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> employees = new HashMap();
		employees.put("E001", "Priti:CEO:30000");
		employees.put("E002", "Gayathri:CTO:30000");
		employees.put("E003","Jamal:CFO:30000");
		employees.put("E004","Archana:COO:30000");
		employees.put("E005", "Pallavi:Founder:30000");
		
		Object [] keyArray = employees.keySet().toArray();
		String data="";
		String[] data1;
		for(int i=0;i<keyArray.length;i++)
		{
			data=employees.get(keyArray[i]);
			data1=data.split(":");
			System.out.println("Employee Name :");
			System.out.println(data1[0]);
			System.out.println("Designation :");
			System.out.println(data1[1]);
			System.out.println("Salary :");
			System.out.println(data1[2]);
			
		}

	}

}
