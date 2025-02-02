//question : 1 define a class CARRENTAL with the following details :
//Class Member are : car1d of int type, carType of string type and rent of float type.
//Defie GetCar() method which accepts Carid and CarType.
//GetRent() method which return rent of the car on the basis of car type, i.e. small car = 1000,van = 800,suv=2500
//showcar() method which allow user to view the contents of car i.e. id,type and rent.

package oocpsDay1;

public class First {
	
	private int carId;
    private String carType;
    private float rent;

    public void GetCar(int carId, String carType) {
        this.carId = carId;
        this.carType = carType;
        this.rent = GetRent();
    }

    public float GetRent() {
        switch (carType.toLowerCase()) {
            case "small car":
                return 1000;
            case "van":
                return 800;
            case "suv":
                return 2500;
            default:
                return 0; 
        }
    }

    public void ShowCar() {
        System.out.println("Car ID: " + carId);
        System.out.println("Car Type: " + carType);
        System.out.println("Rent: " + rent);
    }

    public static void main(String[] args) {
    	First car = new First();

        car.GetCar(1, "SUV");

        car.ShowCar();
        
    }
}

	