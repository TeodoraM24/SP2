public class ElectricCar extends ACar{
private int batteryCapacityKWh;
private int maxRangeKm;

public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm){
    super(registrationNumber,make,model,numberOfDoors);
  this.batteryCapacityKWh=batteryCapacityKWh;
  this.maxRangeKm=maxRangeKm;
}

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getWhPrKm() {
        return batteryCapacityKWh * 1000 / maxRangeKm;
    }
    @Override
    public String getRegistrationNumber(){
    return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getRegistrationFee() {
        int KWh= getWhPrKm();
        int kmPrLitre = (int) Math.floor(100 / (getWhPrKm() / 91.25));
        if ((kmPrLitre >= 20) && (kmPrLitre <= 50)) {
            return  330;
        } else if ((kmPrLitre >= 15 && kmPrLitre <= 19)) {
            return  1050;
        } else if (kmPrLitre >= 10 && kmPrLitre <= 14) {
            return  2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 9) {
            return  5500;
        } else if (kmPrLitre < 5) return 10470;
        return KWh;
    }


    @Override
    public String toString(){
    return super.toString() + " Registration fee: " + getRegistrationFee() + ".";
    }
}
