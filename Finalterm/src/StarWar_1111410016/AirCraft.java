package StarWar_1111410016;

public class AirCraft {
	String Manufacturer;
	String model;
	double length;
	
	double AirSpeed;
	String SpaceSpeed;
	
	String StdandardEngine;
	
	int Passenger;
	
	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getAirSpeed() {
		return AirSpeed;
	}

	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}

	public String getSpaceSpeed() {
		return SpaceSpeed;
	}

	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}

	public String getStdandardEngine() {
		return StdandardEngine;
	}

	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}

	public int getPassenger() {
		return Passenger;
	}

	public void setPassenger(int passenger) {
		Passenger = passenger;
	}

	public AirCraft(String Manufacturer,String model,double length,
	double AirSpeed,String SpaceSpeed,
	String StdandardEngine,
	int Passenger)
	{
		this.setManufacturer(Manufacturer);
		this.setModel(model);
		this.setLength(length);
		this.setAirSpeed(AirSpeed);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setPassenger(Passenger);
		
		
	}
	
	abstract class Attack
	{
		double power;
	}
	
	/* @Override
	public String toString() {
		return "Manufacturer: " + this.getManufacturer() + "\n" +
				"Model: " + this.getModel() + "\n" +
				"Length: " + this.getLength() + "\n" +
				"AirSpeed: " + this.getAirSpeed() + "\n" +
				"SpaceSpeed: " + this.getSpaceSpeed() + "\n" +
				"StdandardEngine: " + this.getStdandardEngine() + "\n" +
				"Passenger: " + this.getPassenger() + "\n";
	}
	*/
}
