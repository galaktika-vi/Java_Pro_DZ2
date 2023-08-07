package setBatteryCharge;

class PetrolCar extends Car {
    private double petrolTankCapacity;
    private double petrolLevel;

    @Override
    void accelerate() {
        petrolLevel -= 0.1;
        System.out.println("Автомобиль с двигателем внутреннего сгорания ускоряется. Уровень топлива: " + petrolLevel + " л");
    }

    public void setPetrolTankCapacity(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }

    public void setPetrolLevel(double petrolLevel) {
        this.petrolLevel = petrolLevel;
    }
}
