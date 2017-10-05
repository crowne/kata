package com.crowlines.kata;

import java.util.Observable;

public class Counter extends Observable {

	private int count = 0;
	
	public int getCount() {
		super.clearChanged();
		return this.count;
	}
	
	private void increment() {
		this.count++;
		super.setChanged();
		super.notifyObservers();
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.count) ;
	}
	
	public static void main(String[] args) {
		try {
			Counter cnt = new Counter();
			FizzBuzz fb = new FizzBuzz();
			cnt.addObserver(fb);
			
			while (true) {
				cnt.increment();
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Done");
		}
	}

}
