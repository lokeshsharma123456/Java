package com.techmojo.apps;

import com.techmojo.beans.Entertainment;
import com.techmojo.beans.Mercedes;
import com.techmojo.beans.Vehicle;

public class MercedesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mercedes m1 = new Mercedes();
		Vehicle car = m1;
		Entertainment e = m1;
		
		car.accelerate();
		car.stop();
		car.turn();
		
		e.watchMovie();
		e.listenSong();
 	}

}
