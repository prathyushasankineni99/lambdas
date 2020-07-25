package com.epam.lambdas;
import java.util.*;
import java.util.stream.*;
public class Avg
{
public Double findAverage(ArrayList<Integer> list)
    		{
	            OptionalDouble average = list.stream().mapToInt(i->i).average();
    			return average.getAsDouble();
    		}
    		}
}
