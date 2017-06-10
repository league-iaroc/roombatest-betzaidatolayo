package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		
		driveDirect(500,500);
		sleep(3000);
		driveDirect(100,500);
		sleep(2300/2);
		driveDirect(500,500);
		sleep(7000);
	driveDirect(200,300);
	
	
	
	}

	public void loop() {
	
	}
}
