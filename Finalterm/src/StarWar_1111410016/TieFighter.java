package StarWar_1111410016;

public class TieFighter {
	String Manufacturer="Sienar Fleet Systems";
	String[] Shield= {"Defender Deflector-Screen Projector",
						"Deflector Shield Projector",
						"Chempat"};
	String[] Weapon= {"SFS L-s1","SFS L-s1"};
	double[] weapon_power= {1000,1000};
	double[] ShieldPower= {2000,3000,1000};
	
	AirCraft ct=new AirCraft("Sienar Fleet Systems","Twin Ion Engine Line Starfighter",
			6.3,1200,"4100G",
			"SFS P-s4",1);
	
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