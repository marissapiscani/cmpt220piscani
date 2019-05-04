package lab10;

public class Toaster extends Appliance {
	private String size;
	private String brand;
	private String material;
	
	public Toaster(String size, String brand, String material, double voltage, 
			String color, String madeIn, double price) {
		super(voltage, color, madeIn, price);
		this.size = size;
		this.brand = brand;
		this.material = material;
	}
	
	Toaster(){
		super(0, "None", "None", 0);
	}

	public String getSize() {
		return size; 
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getMaterial() {
		return material;
	}
	

	@Override
	public String toString() {
		return "The toaster size: " + size + " brand: " + brand + " and material: " + material;
	}
	
}

