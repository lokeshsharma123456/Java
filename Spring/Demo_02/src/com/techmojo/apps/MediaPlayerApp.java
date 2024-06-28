package com.techmojo.apps;

import com.techmojo.beans.DiskPlayer;
import com.techmojo.beans.MediaPlayer;
import com.techmojo.beans.Walkman;

public class MediaPlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DiskPlayer p = new DiskPlayer();
//		p.pause();
//		p.play();
//		p.volumeDown();
//		p.volumeUp();
//		p.changeDisk();
		
		Walkman p = new Walkman();
		p.equilizer();
		p.pause();
		p.play();
		p.volumeDown();
		p.volumeUp();
	}

}
