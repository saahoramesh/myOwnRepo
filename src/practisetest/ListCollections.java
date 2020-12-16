package practisetest;

import java.util.*;
import java.util.Map.Entry;

public class ListCollections {

	public static void main(String[] args) {
		
		
	int arr[] = { 2, 4, 5, 3, 2, 3, 4, 2, 6 };
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
	
				if(map.containsKey(arr[i]))
				{
					map.put(arr[i], map.get(arr[i])+1);
			
				}
				else 
				{
					map.put(arr[i], 1);
					
				}
		}
		for(Entry<Integer, Integer> element:map.entrySet())
		{
			if(element.getValue()>1)
			System.out.println("Value "+element.getKey()+" is : repeated for "+element.getValue());
		}
		
		Iterator<Entry<Integer, Integer>> it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,Integer> me=(Map.Entry<Integer,Integer>)it.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
	
			
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int k = 1;
			if (!arrList.contains(arr[i])) {
				arrList.add(arr[i]);

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						k++;

					}

				}

				System.out.println("Number is " + arrList.get(arrList.size() - 1) + " repeated " + k + " times");
			}

		}
	}
}
