package setBatteryCharge;

class ElectricCar extends Car {
    private int batteryCharge;

    @Override
    void accelerate() {
        batteryCharge -= 10;
        System.out.println("Электромобиль ускоряется. Заряд батареи: " + batteryCharge + "%");
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }
}
