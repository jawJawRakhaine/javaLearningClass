package LearningClass;

public class SubCarClass extends CarClass {

	private String chargeInBattery;
	private String subCarColor;
	
	public SubCarClass(String manu,String model,int CC,float weight,float fuel,String bettery,String subCarColor) {
		super(manu, model, CC, weight, fuel);
		chargeInBattery = bettery;
		this.subCarColor = subCarColor;
	}

	public String getBetterInCharge() {
		return chargeInBattery;
	}

	public void setBetterInCharge(String betterInCharge) {
		this.chargeInBattery = betterInCharge;
	}

	
	public String getColor() {
		return subCarColor;
	}

	public void setColor(String color) {
		this.subCarColor = color;
	}
	
}
