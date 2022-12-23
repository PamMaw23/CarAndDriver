
public class Car{
	private int gasLevel;
	private boolean driving;
	private boolean booster;
	private boolean refuel;
	
	public Car(){
		this.gasLevel = 10;
		this.driving = false;
		this.booster = false;
		this.refuel = false;	
	}
	
	public void startDriving(int times){
		this.driving = true;
		this.gasLevel-=times;
		System.out.println("You have started driving. Gas level: " + this.gasLevel);
		
		}
	
	public boolean isDriving(){
		return this.driving;
	}
	
	public void useBooster(int boost) {
		booster = true;
		gasLevel-=3*boost;
		System.out.println("Driver using booster. Gas level: " + this.gasLevel);
		
	}
	
	public boolean usingBooster(){
		return this.booster;
	}
	
	public void willRefuel(int moreGas) {
		refuel = true;
		gasLevel+=2*moreGas;
		System.out.println("Driver stopped to refuel. Gas level: " + this.gasLevel);
		
	}
	
	public boolean isRefueling(){
		return this.refuel;
	}

	public int getGasLevel() {
		return gasLevel;
	}

	public void setGasLevel(int gasLevel) {
		this.gasLevel = gasLevel;
	}

	public boolean isBooster() {
		return booster;
	}

	public void setBooster(boolean booster) {
		this.booster = booster;
	}

	public boolean isRefuel() {
		return refuel;
	}

	public void setRefuel(boolean refuel) {
		this.refuel = refuel;
	}

	public void setDriving(boolean driving) {
		this.driving = driving;
	}
	
	public void display(){
		System.out.println("You drive the car");
		System.out.println("Gas left in car: " + this.gasLevel);
		}
}


