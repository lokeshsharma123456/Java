package com.techmojo.beans;

public class Walkman implements MediaPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play the walkman");

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause the walkman");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Increase volume the walkman");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Decrease volume the walkman");
	}
	
	public void equilizer() {
		System.out.println("Tuning by the way: it is not override");
	}

}
