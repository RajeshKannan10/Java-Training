package com.MVN.DependencyMethods;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayInsertion {
	
	

	public void elementinsert() {	
		
		String[] names = new String[] {"Rajesh","vimalraj","Murali"};
		
		String[] addname = ArrayUtils.insert(1, names,"Kannan");
		System.out.println(Arrays.toString(addname));
		
		String[] addname1 = ArrayUtils.add(addname, "Eizhivel");
		System.out.println(Arrays.toString(addname1));
		
		String[] removename = ArrayUtils.remove(addname1, 4);
		System.out.println(Arrays.toString(removename));
	}

}
