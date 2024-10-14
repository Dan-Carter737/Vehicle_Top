import java.util.NoSuchElementException;

public class Car extends Vehicle {

    int numberOfDoors = 4;


    public Car(String make, String model, int year) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;

    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void getDescription() {
        System.out.println("Марка: "  + getMake() +  " , " + " Модель: " + getModel() + " , "  + " Год: " +  getYear() + " количество дверей: " + getNumberOfDoors());
    }
}
