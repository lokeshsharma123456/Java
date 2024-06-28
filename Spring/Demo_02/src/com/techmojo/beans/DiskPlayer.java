package com.techmojo.beans;

public class DiskPlayer implements MediaPlayer {

	public void changeDisk() {
		System.out.println("Change the disk");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("PLAY");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("PAUSE");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("VOLUMEUP");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("VOLUMEDOWN");
	}
	
	
	
}
