public class Vehicle {

    public String make;
    public String model;
    public int year;


    public Vehicle (String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void getDescription() {

        System.out.println("Марка: "  + getMake() +  " , " + " Модель: " + getModel() + " , "  + " Год: " +  getYear());

    }

}
