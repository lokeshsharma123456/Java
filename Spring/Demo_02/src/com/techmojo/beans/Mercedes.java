package com.techmojo.beans;

public class Mercedes implements Vehicle, Entertainment {
	
	
	@Override
	public void watchMovie() {
		// TODO Auto-generated method stub
		System.out.println("Watch movie from Entertainment interface");
	}

	@Override
	public void listenSong() {
		// TODO Auto-generated method stub
		System.out.println("Listen song from Entertainment interface");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("Take turn from Vehicle");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the Vehicle");

	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate the Vehicle");
	}

}
