package md.tekwill.classesandobjects;

public class ManageAutoService {

    public static void main(String[] args) {

        Car car0001 = new Car("Q5", "Audi", "Black");
        Car car0002 = new Car("508", "Peugeot", "Gray");

        System.out.println(car0002.make + " " + car0002.model + " " + car0002.color);
        Car car0003 = new Car("BMW", "Q7", "White", "TG 92DRV", 5677698);

        Tool tool0001 = new Tool("Hammer", 2);
        System.out.println("The name of the tool is " + tool0001.name + " and its weight is " + tool0001.weight);

        Garage garage00001 = new Garage();
        System.out.println(garage00001.name + " on address: " + garage00001.address);
        garage00001.name = "Auto-Fix";
        garage00001.address = "Strada Crinului";
        System.out.println(garage00001.name + " on address: " + garage00001.address);

        Worker worker001 = new Worker();
        System.out.println(worker001.name);
        worker001.name = "David";
        worker001.salary = 56000;
        worker001.age = 26;
        System.out.println(worker001.name);
        System.out.println(worker001.age);
        System.out.println(garage00001.name);
    }
}
