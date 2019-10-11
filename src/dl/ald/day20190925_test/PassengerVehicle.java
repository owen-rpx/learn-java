package dl.ald.day20190925_test;

public class PassengerVehicle extends AVehicle implements ICarryPassenger {

	private int passengers;

	public PassengerVehicle(String name, String usage, String type,
			String engine, double hgt, double lng, double price) {
		this.name = name;
		this.type = type;
		this.usage = usage;
		this.engine = engine;
		this.hgt = hgt;
		this.lng = lng;
		this.price = price;
	}

	@Override
	public void carry_passenger() {
		// TODO Auto-generated method stub

	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public void print(String no) {
		// TODO Auto-generated method stub
		System.out.println("_____________________________________________________________________");
		System.out.println(no+"\t"+this.usage + "\t"
				+ this.name + "\t" + this.price
				+ "/天		车长高:" + this.lng + " "
				+ this.hgt);
	}

}
