
public class Cans implements Recyclable {
	
	protected String name;
	protected String materialType;
	protected double weight;
	protected double materialCost;
	
	public Cans(String name, String materialType, double weight, double materialCost) {
		this.name = name;
		this.weight = weight;
		this.materialType = materialType;
		this.materialCost = materialCost;
	}
	public Cans() {
		name = "none";
		weight = 0.00;
		materialType = "none";
		materialCost = 0.00;
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
	public double getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(double materialCost) {
		this.materialCost = materialCost;
	}
	@Override
	public void reusable() {
		System.out.println("reused");
		
	}

	@Override
	public double recycle() {
		double total_One = 0.00;
		total_One = weight * materialCost;
		return total_One;
		
	}
	

}
