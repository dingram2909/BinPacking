package com.Algorithms.BinPacking;

public class TestClass {

	/**
	 * @author Daniel Ingram
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstFit first = new FirstFit();

		CustOrders orders = new CustOrders();
		
		
		long before = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){

			first.custOrder(orders.orders[i]);

		}
		long after = System.currentTimeMillis();
		long timeTaken = after - before;
		
		System.out.println("The (FirstFit) number of wires used is: " + first.count + ". This took " + timeTaken + " milliseconds.");
		
		BestFit best = new BestFit();
		
		orders = new CustOrders();
		
		before = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){
			
			best.custOrder(orders.orders[i]);
			
		}
		after = System.currentTimeMillis();
		timeTaken = after - before;
		
		System.out.println("The (BestFit) number of wires used is: " + best.count + ". This took " + timeTaken + " milliseconds.");
		
	}

}
