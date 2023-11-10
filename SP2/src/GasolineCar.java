public class GasolineCar extends AFuelCar{

    public GasolineCar(String registrationNumber,String make, String model, int numberOfDoors, int kmPerLitre){
        super(registrationNumber,make,model,numberOfDoors,kmPerLitre);
    }

    @Override
    String getFuelType(){
        return "gasoline";
    }

    @Override
    public int getRegistrationFee(){
        int kmPerLitre= getKmPerLitre();
        if(kmPerLitre>=20 && kmPerLitre<=50) {
            return 330;
        } else if (kmPerLitre>=15 && kmPerLitre<20){
            return 1050;
        } else if (kmPerLitre>=10 && kmPerLitre<15) {
            return 2340;
        } else if (kmPerLitre>=5 && kmPerLitre<10) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getModel(){
        return model;
    }

    @Override
    public String getMake(){
        return make;
    }

    @Override
    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public String toString(){
        return super.toString() + " Registration fee: " + getRegistrationFee() + ".";
    }
}
