package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

	public int sum(List<Integer> list)
	{
		if(list == null)
		{
			return 0;
		}

		int sum = list.stream().filter(i->i != null).mapToInt(Number::intValue).sum();
		return sum;
	}
	
	public String emptyString(String s)
	{
		if(s == null || s.isEmpty())
		{
			return null;
		}
		else
		{
			return s;
		}
	}
	
	public List<Integer> filterEvenNumbers(List<Integer> list)
	{
		if(list == null)
		{
			return null;
		}
		return list.stream().filter(i->i != null).filter(i->(i%2==0)).collect(Collectors.toList());
	}
	
	public List<Float> transformSquarePlusPointFive(List<Integer> list)
	{
		if(list == null)
		{
			return null;			
		}
		
		if(list.isEmpty())
		{
			return (List<Float>)new ArrayList<Float>();
		}
		
		
		return list.stream().filter(i->i != null).map(x->new Float(Math.pow(x,2)+0.5f)).collect(Collectors.toList());
	}

}
