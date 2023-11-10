import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> cars=new ArrayList<>();
    void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString(){
       StringBuilder sbild= new StringBuilder("Fleet of cars: \n ");
        for( Car car:cars){
            sbild.append(car.toString()).append("\n");
        }
        return sbild.toString();

        //en anden ikke så pæn måde
        // String result="";
        //for(Car car: cars){
            //result+=car;
        //}
        //return result+ "\n total registration fee: " + getTotalRegistrationFeeForFleet();
    }
    int getTotalRegistrationFeeForFleet(){
        int totalFee=0;
        for(Car car: cars){
            totalFee+=car.getRegistrationFee();
        }
        return totalFee;
    }
}
