package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Java_Programs {
	
	public void charCount()
	{
		String str="Concsultancyc";
		HashMap <Character,Integer> map=new HashMap <Character,Integer> ();
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);				
			}
			else
			{
				map.put(c,1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry: map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ ":"+ entry.getValue());
			}
		}
	}
	
	public void addSet()
	{
		HashSet <String> set=new HashSet <String>();
		set.add("a");
		set.add("b");
		System.out.println(set);
		
		for(String s:set)
		{
			System.out.println(s);
		}
	}
	
	

	public static void main(String[] args) 
	{
		
		Java_Programs j=new Java_Programs();
		//j.charCount();
		j.addSet();
		

	}

}
