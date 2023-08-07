package setBatteryCharge;

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.setBatteryCharge(80);

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setPetrolTankCapacity(50);
        petrolCar.setPetrolLevel(30);

        electricCar.accelerate();
        petrolCar.accelerate();
    }
}
