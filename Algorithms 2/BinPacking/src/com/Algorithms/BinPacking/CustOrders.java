package com.Algorithms.BinPacking;

import java.util.Random;

public class CustOrders {

	/**
	 * @author Daniel Ingram
	 */
	private final int ARRAY_SIZE = 1000000;
	int[] orders = new int[ARRAY_SIZE];
	
	public CustOrders(){
		
		Random generate = new Random(50);
		
		for(int i = 0; i < ARRAY_SIZE; i++){
			
			orders[i] = (generate.nextInt(100) + 1);
			
		}
		
	}
	
}
