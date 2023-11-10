//making the abstract class that uses car interface and attributes
public abstract class ACar implements Car{
    protected String registrationNumber;
    protected String model;
    protected String make;
    protected int numberOfDoors;
//making a constructor
    public ACar(String registrationNumber, String make, String model, int numberOfDoors){

        this.registrationNumber= registrationNumber;
        this.make= make;
        this.model=model;
        this.numberOfDoors= numberOfDoors;
    }
    //toString method as representation for the object
    @Override
    public String toString(){
        return "Registration number: " + registrationNumber + "." + "Make: " + make + "."+ "Model: " + model+  "."+ "Number of doors: " + numberOfDoors + ".";
    }

}
