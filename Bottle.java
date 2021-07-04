
public class Bottle implements Recyclable {
	
	private String name;
	private String materialType;
	private double weight;
	private double materialCost;
	
	public Bottle(String name, String materialType, double weight, double materialCost) {
		this.name = name;
		this.materialType = materialType;
		this.materialCost = materialCost;
		this.weight = weight;
	}
	public Bottle() {
		name = "none";
		materialType = "none";
		materialCost = 0.00;
		weight = 0.00;
	}
	
	public double getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(double materialCost) {
		this.materialCost = materialCost;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void reusable() {
		System.out.println("reused");
		
	}
	@Override
	public double recycle() {
		double total_Two = 0.00;
		total_Two = weight * materialCost;
		return total_Two;
	}
	
	

}
