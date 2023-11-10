public class DieselCar extends AFuelCar {
    private boolean harParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean hasParticleFilter){
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
        this.harParticleFilter=hasParticleFilter;
    }


     public boolean hasParticleFilter(){
        return harParticleFilter;
    }
    @Override
    String getFuelType(){
        return "diesel";
    }


    @Override
    public int getRegistrationFee(){
        int ekstraFe=0;
        if(!harParticleFilter){
            ekstraFe+=1000;
        }

        int kmPerLitre= getKmPerLitre();
        if(kmPerLitre>=20 && kmPerLitre<=50) {
            return 130;
        } else if (kmPerLitre>=15 && kmPerLitre<20){
            return 1390;
        } else if (kmPerLitre>=10 && kmPerLitre<15) {
            return 1850;
        } else if (kmPerLitre>=5 && kmPerLitre<10) {
            return 2770;
        } else {
            return 15260;
        }
    }
@Override
    public String toString(){
        return super.toString() + " Registration fee: " + getRegistrationFee() + ".";
}

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model ;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    }

