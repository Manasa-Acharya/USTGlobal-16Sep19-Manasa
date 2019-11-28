package com.ustglobal.maps;


	

	import java.util.Map;
import java.util.TreeMap;
	public class TestE {
		public static void main(String[] args) {
	
		TreeMap<String,Integer> lh = new TreeMap<String,Integer>();
		lh.put("Bengaluru", 560004);
		lh.put("Sagar", 577401);
		lh.put("Mangaluru", 567802);
		lh.put("haryana", null);

		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String Key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is " +Key+ " ------"+ " Value "+value);

			System.out.println("--------------------");
		}
	}
	


}
