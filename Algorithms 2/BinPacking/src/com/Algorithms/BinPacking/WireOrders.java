package com.Algorithms.BinPacking;

import java.util.Random;

public class WireOrders {

	/**
	 * @author Daniel Ingram
	 */
	private final int ARRAY_SIZE = 1000000;
	private int[] wires = new int[ARRAY_SIZE];
	int count = 0;
	
	public WireOrders(){
		
		Random generate = new Random(50);
		
		for(int i = 0; i < ARRAY_SIZE; i++){
			
			wires[i] = (generate.nextInt(101) + 100);
			
		}
			
	}
	
	public int next(){
		
		int x = wires[count];		
		count++;
		return x;
		
	}
		
}
