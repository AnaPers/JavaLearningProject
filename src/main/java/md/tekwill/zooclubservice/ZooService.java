package md.tekwill.zooclubservice;

public class ZooService {
    public static void main(String[] args){
        Animal cat001 = new Cat("Aliss", 5);
        Dog dog1 = new Dog("Leo", 10);
        Lion lion001 = new Lion("Simba", 23);

        System.out.println(lion001.getAge());
        lion001.makeSound();
        cat001.makeSound();
        dog1.makeSound();
        dog1.eat();
        System.out.println(dog1.getName() + " is " + dog1.getAge() + " years old ");
    }
}
