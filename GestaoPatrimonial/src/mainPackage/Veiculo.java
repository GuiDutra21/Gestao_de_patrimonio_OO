package mainPackage;

public class Veiculo extends Patrimony{
	private String model;
	private String brand;
	private int productionYear;
	
	// Constructs
	
	public Veiculo(String name, double value) {
		this(name,0,value,null,null,0);
	}
	
	public Veiculo(String name, int amount) {
		this(name, amount,0.0,null,null,0);
	}
	
	public Veiculo(String name, int amount, double value) {
		this(name, amount, value,null,null,0);
		
	}
	
	public Veiculo(String name, int amount, double value, String model) {
		this(name, amount, value,model,null,0);
	}
	
	public Veiculo(String name, int amount, double value, String model,String brand) {
		this(name, amount, value,model,brand,0);
	}
	
	public Veiculo(String name, int amount, double value, String model, String brand, int productionYear) {
		super(name, amount, value);
		this.model = model;
		this.brand = brand;
		if(productionYear >= 0) {
			this.productionYear = productionYear;
		} else {
			this.productionYear = 0;
		}
		
	}
	
	//////////////////////////////////////////////////////
	
	/// Setters e getters
	
	public void setModel(String type) {
		this.model = type;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	
	public int getProductionYear() {
		return productionYear;
	}
	///////////////////////////////////////////////////////////
	
	
}
