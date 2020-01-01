package LearningClass;


public class CarClass {
	
	public String manufacturerName;
	public String modelName;
	public float usedFuelAmount;
	final private float amountOfFuelConsumedInPerSecond = 0.02f; 
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	private String keyValue = "JawJawRakhaine";
	public int engineCC;
	public float carWeight;
	private float fuelAmount;
	
	public float getFuelAmount() {
//		return fuelAmount;
		
		if (usedFuelAmount<fuelAmount) {
			return fuelAmount;
		}else {
			return fuelAmount*0;
		}
	}

	public void setFuelAmount(float fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	public CarClass(String manufacturerName,String modelName,int engineCC,float carWeight,float fuelAmount) {
		this.manufacturerName = manufacturerName;
		this.modelName = modelName;
		this.engineCC = engineCC;
		this.carWeight = carWeight;
		this.fuelAmount = fuelAmount;
	}
	
	public String getManufacturerName() {
		return manufacturerName;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public boolean getKeyValue(String userInput) {
		
		if (keyValue.equals(userInput)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getEngineCC() {
		return engineCC;
	}
	
	public float getCarWeight() {
		return carWeight;
	}
	
	public float presentAmountOfFuel() {
		return fuelAmount*2;
	}
	
	public void addFuel(float fuelAmount) {
		this.fuelAmount+=fuelAmount;
	}
	
	public void driveCar(int runInSeconds) {
		
		float usedFuelAmount = runInSeconds*amountOfFuelConsumedInPerSecond;
		if (usedFuelAmount<fuelAmount) {
			fuelAmount-=usedFuelAmount;
			System.out.println("Fuel remaining after driving: "+fuelAmount);
		}else {
			System.out.println("Fuel amount status: Finished.!");
			fuelAmount-=usedFuelAmount;
			System.out.println("Fuel need to be continued to drive: "+Math.abs(fuelAmount));
		}
	}
	
}
