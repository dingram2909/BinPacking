package com.Algorithms.BinPacking;

import java.util.ArrayList;
import java.util.List;

public class FirstFit {

	/**
	 * @author Daniel Ingram
	 */
	private final int MIN = 5;
	int count = 0;
	List<Integer> inStock = new ArrayList<Integer>();
	boolean succeed;
	WireOrders wires = new WireOrders();
	int x;
	
	public void custOrder(int order){
	
		succeed = false;
					
		for(x = 0; x < inStock.size(); x++){
			if(inStock.get(x) > order){
				
				inStock.set(x, inStock.get(x)-order);
				
				if(inStock.get(x) < MIN){
					
					inStock.remove(x);
										
				}
								
				succeed = true;
				break;
			}
			
		}
		
		if(succeed != true){
			
			inStock.add(wires.next());
			
			count++;
			
			x = (inStock.size()-1);
			
			if(inStock.get(x) - order < MIN){
				
				inStock.remove(x);
				
			}
			else{				
				inStock.set(x, (inStock.get(x) - order));
			}
			
		}
		
	}
	
	public void printStock(){
		
		for(int i = 0; i < inStock.size(); i++){
			
			System.out.println("Location: " + i + ": " + inStock.get(i));
			
		}
		
	}
	
}