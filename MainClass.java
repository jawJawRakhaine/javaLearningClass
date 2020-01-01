package LearningClass;

public class MainClass {

	public static void main(String[] args) {
		
//		ourCar.manufacturerName = "BMW";
//		ourCar.engineCC = 2200;
//		ourCar.carWeight = 1500;
//		ourCar.fuelAmount = 7;

//		ourCar.setManufacturerName("BMW");
//		ourCar.setEngineCC(2200);
//		ourCar.setCarWeight(1650);
//		ourCar.setFuelAmount(17);

//		System.out.println("Manufacturer Name: "+ourCar.getManufacturerName());
//		System.out.println("Engine CC: "+ourCar.getEngineCC());
//		System.out.println("Car Weight: "+ourCar.getCarWeight());
//		System.out.println("Present amount of fuel:"+ourCar.presentAmountOfFuel());
		
		System.out.println("-----OUR BMW CAR-----\n");
		CarClass BMWcar = new CarClass("BMW","7 Series",2200,1500,14);
		System.out.println("Manufacturer Name: "+BMWcar.getManufacturerName());
		System.out.println("Model Name: "+BMWcar.getModelName());
		System.out.println("Engine CC: "+BMWcar.engineCC);
		System.out.println("Car Weight: "+BMWcar.carWeight);
		System.out.println("Present amount of fuel: "+BMWcar.getFuelAmount());
		System.out.println("Password matched: "+BMWcar.getKeyValue("Jaw JawRakhaine"));
		BMWcar.addFuel(21);
		System.out.println("After adding fuel the total fuel is: "+BMWcar.getFuelAmount());
		BMWcar.driveCar(200);
		System.out.println("Fuel amount after driving: "+BMWcar.getFuelAmount());
		
		System.out.println("\n\n-----OUR MAZDA CAR-----\n");
		CarClass MAZDAcar = new CarClass("MAZDA","Axela",2000,1700,21);
		System.out.println("Manufacturer Name: "+MAZDAcar.getManufacturerName());
		System.out.println("Model Name: "+MAZDAcar.getModelName());
		System.out.println("Engine CC: "+MAZDAcar.engineCC);
		System.out.println("Car Weight: "+MAZDAcar.carWeight);
		System.out.println("Present amount of fuel: "+MAZDAcar.getFuelAmount());
		System.out.println("Password matched: "+MAZDAcar.getKeyValue("JawJawRakhaine"));
		MAZDAcar.addFuel(12);
		System.out.println("After adding fuel : "+MAZDAcar.getFuelAmount());
		MAZDAcar.driveCar(500);
		System.out.println("Fuel amount after driving: "+MAZDAcar.getFuelAmount());

		System.out.println("\n\n-----OUR ALLION CAR-----\n");
		SubCarClass ALLIONcar = new SubCarClass("Allion", "A15", 1600, 1230, 30, "75%", "White");
		System.out.println("Manufacturer Name: "+ALLIONcar.getManufacturerName());
		System.out.println("Model Name: "+ALLIONcar.getModelName());
		System.out.println("Car Weight: "+ALLIONcar.carWeight);
		System.out.println("Present amount of fuel: "+ALLIONcar.getFuelAmount());
		ALLIONcar.addFuel(12);
		System.out.println("After adding fuel: "+ALLIONcar.getFuelAmount());
		ALLIONcar.driveCar(12000);
		System.out.println("Password Match: "+ALLIONcar.getKeyValue("JawJawRakhaine"));
		System.out.println("Battery In Charge: "+ALLIONcar.getBetterInCharge());
		System.out.println("Color of Car: "+ALLIONcar.getColor());

	}

}
