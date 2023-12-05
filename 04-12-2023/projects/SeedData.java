package projects;

public class SeedData {
	
	private String Name;
	private float Distance;
	private float Area;
	private int Amount;
	
	public SeedData(String Name, float Distance, float Area, int Amount) {
		this.Name = Name;
		this.Distance = Distance;
		this.Area = Area;
		this.Amount = Amount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getDistance() {
		return Distance;
	}

	public void setDistance(float distance) {
		Distance = distance;
	}

	public float getArea() {
		return Area;
	}

	public void setArea(float area) {
		Area = area;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}
	
}
