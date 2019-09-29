package dl.ald.day20190925_test;

public class CargoVehicle extends AVehicle implements ICarryCargo{
	private double weight; 
	
	public CargoVehicle() {
		super();
	}
	
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void carry_cargo() {
		// TODO Auto-generated method stub
		System.out.println("‘ÿªı£∫"+this.weight);
	}

}
