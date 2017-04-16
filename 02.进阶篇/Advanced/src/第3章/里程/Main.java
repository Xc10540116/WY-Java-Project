package 第3章.里程;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.next();
		Map<String, city> city_list = new HashMap<String, city>();
		ArrayList<String> citylist = new ArrayList<String>();
		do {
			city_list.put(in, new city(in));
			citylist.add(in);
			in = scanner.next();
		} while(!in.equals("###"));
//		System.out.println(city_list);

		int[] distance = new int[citylist.size()];
//		System.out.println(distance);
		
		for(int i=0; i<citylist.size(); i++) {
			for(int j=0; j<citylist.size(); j++) {
				distance[j] = scanner.nextInt();
			}
			for(int j=0; j<citylist.size(); j++) {
				if(distance[j] == 0){
					String cityname = citylist.get(j);
//					System.out.println(cityname);
					for(int k=0; k<citylist.size(); k++) {
						String addcity = citylist.get(k);
						int addDistance = distance[k];
						city_list.get(cityname).setCity_distance(addcity, addDistance);
					}
//					System.out.println(city_list.get(cityname).getCity_distance());
				}
			}
		}
		
		// 输出距离
		String city = scanner.next();
		String city2 = scanner.next();
		String result = "NOT FOND THIS CIEY";
		if(city_list.containsKey(city) && city_list.containsKey(city2))
			result = city_list.get(city).getDistance(city2);
		System.out.println(result);
		
		scanner.close();
	}

}

class city {
	private String city;
	private Map<String, Integer> city_distance = new HashMap<String, Integer>();
	
	public city() {
		
	}
	
	public city(String city) {
		this.city = city;
	}
	
	public void setCity_distance(String city, int distance) {
		city_distance.put(city, distance);
	}
	
	public String getDistance(String city) {
		if(city_distance.containsKey(city))
			return city_distance.get(city).toString();
		else
			return null;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString(){
		return city;
	}
	
	public Map<String, Integer> getCity_distance() {
		return city_distance;
	}
}