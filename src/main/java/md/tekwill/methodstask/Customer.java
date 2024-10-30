package md.tekwill.methodstask;

public class Customer {
    private String name;
    private String email;
    private int age;

    //Specify a constructor that will get the necessary parameters to populate all properties of the new objects
public Customer(String name, String email, int age){
    this.name = name;
    this.email = email;

    if(age > 100 || age <=18){
        System.out.println("The entered age is not valid");
        this.age = 0;
    } else {
        this.age = age;
    }
}

public Customer(String vladislav, int randomInt, String mail){

}
    public void setName(String enteredName) {
        name = enteredName;
    }

public void setAge(int age){
    if(age > 100 || age <=18){
        this.age = 0;
        System.out.println("The entered age is not valid");
    } else {
        this.age = age;
    }
}
public void setEmail(String email){
    this.email = email;
}
public String getName(){
    return this.name;
}
public int getAge(){
    return this.age;
}
public String getEmail(){
    return email;
}

public String getTheObjectInformation(){
    return "The name of the customer is [" + this.name + "] with email [" + email + "] and age [" + age + "]";
}

//@Override
    //public String toString(){
    //return "Customer {" +
    // "name=' " + name + '\'' +
    //", age= " + age +
    // ", email=' " + email + '\'' +
    // '}';
    //}
}
