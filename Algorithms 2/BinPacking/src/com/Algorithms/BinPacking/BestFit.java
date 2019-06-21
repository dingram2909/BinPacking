package com.Algorithms.BinPacking;

import java.util.ArrayList;
import java.util.List;

public class BestFit {

	/**
	 * @author Daniel Ingram
	 */
	
	public final int MIN = 5;
	int count = 0;
	List<Integer> inStock = new ArrayList<Integer>();
	WireOrders wires = new WireOrders();

	public void custOrder(int order){
		
		int x = -1;
		
		for(int i = 0; i < inStock.size(); i++){
			
			if(x < 0 || inStock.get(i) < inStock.get(x)){
				
				if(inStock.get(i) - order >= 0){
					
					x = i;
					
				}
				
			}
			
		}
		
		if(x < 0){
			
			inStock.add(wires.next());
			count++;
			x = inStock.size()-1;
			
		}
		
		inStock.set(x, inStock.get(x) - order);
		
		if(inStock.get(x) < MIN){
			inStock.remove(x);
		}
	}
	
	public void printStock(){
		
		for(int i = 0; i < inStock.size(); i++){
			
			System.out.println("Location: " + i + ": " + inStock.get(i));
			
		}
		
	}
	
}
