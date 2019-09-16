package dl.ald.day20190916;

public class Phone {
	public String brand;
	public double size;
	public int memory;
	public int cpu;
	
	public Phone(String brand, double size, int memory, int cpu) {
		this.brand = brand;
		this.size = size;
		this.memory = memory;
		this.cpu = cpu;
	}

	public void call() {
		System.out.println("call function running...");
	}
	
	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", size=" + size + ", memory=" + memory + ", cpu=" + cpu + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + cpu;
		result = prime * result + memory;
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cpu != other.cpu)
			return false;
		if (memory != other.memory)
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}
	
	
}
