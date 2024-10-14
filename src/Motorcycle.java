public class Motorcycle extends Vehicle {

    boolean hasSideCar = false;

    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void getDescription() {
        System.out.println("Марка: "  + getMake() +  " , " + " Модель: " + getModel() + " , "  + " Год: " +  getYear() + " коляска: " + hasSideCar);
    }
}
