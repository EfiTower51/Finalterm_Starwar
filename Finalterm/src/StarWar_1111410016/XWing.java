package StarWar_1111410016;

public class XWing {
	String HyperSpaceEngine="Class 1 Koensayr R300-H";
	
	String[] Weapon= {"Taim & Bak KX9 Laser Cannons",
			"Taim & Bak KX9 Laser Cannons",
			"Taim & Bak KX9 Laser Cannons",
			"Taim & Bak KX9 Laser Cannons",
			"Krupx MG7",
			"Proton Torpedo Launchers",
			"Proton Torpedo Launchers"};
	double[] weapon_power= {1000,1000,1000,1000,5,5} ;
	
	
	AirCraft ct=new AirCraft(" ","Incom Corporation T65B X-Wing Space Superiority Fighter",
			12.5,1050,"100MGL",
			"80MGLT",2);
	
	
	@Override
	public String toString() {
		return "Manufacturer: " + ct.getManufacturer() + "\n" +
				"Model: " + ct.getModel() + "\n" +
				"Length: " + ct.getLength() + "\n" +
				"AirSpeed: " + ct.getAirSpeed() + "\n" +
				"SpaceSpeed: " + ct.getSpaceSpeed() + "\n" +
				"Weapon: "+ Weapon[0] +"\n"+
				"Weapon Power: "+ weapon_power[0] +"\n"+
				"StdandardEngine: " + ct.getStdandardEngine() + "\n" +
				"Passenger: " + ct.getPassenger() + "\n";
	}

}
