//Extends ACar class and add fuel method
public abstract class AFuelCar extends ACar{
    private int kmPerLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre){
    super (registrationNumber,make,model, numberOfDoors);
    this.kmPerLitre=kmPerLitre;
    }
//abstract method for fuel type
    abstract String getFuelType();
    //method for km per l
    int getKmPerLitre(){
        return kmPerLitre;
    }


    public String toString(){
        return super.toString() + " Fuel type: " +getFuelType() + "."+ "Kilometer per liter: " + kmPerLitre +  ".";
    }
}
