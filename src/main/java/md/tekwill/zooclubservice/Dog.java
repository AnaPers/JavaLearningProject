package md.tekwill.zooclubservice;

public class Dog extends Animal {

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating bones with meat");
        System.out.println("Bones with meat - neam neam");
    }

    @Override
    public void makeSound(){
        System.out.println("The dog named " + getName() + " says: Woof");
    }
}
