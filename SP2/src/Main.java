public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet=new FleetOfCars();

        GasolineCar car1= new GasolineCar("BY5325", "Mercedes","G", 5, 50);
        DieselCar car2= new DieselCar("CM6623", "Nissan", "Micra", 3, 18,true);
        ElectricCar car3= new ElectricCar("JY8495", "Tesla","Model 3", 5, 100,614 );

fleet.addCar(car1);
fleet.addCar(car2);
fleet.addCar(car3);

System.out.println(fleet.toString());
System.out.println("Registration fee for the fleet is: " + fleet.getTotalRegistrationFeeForFleet());
    }
}