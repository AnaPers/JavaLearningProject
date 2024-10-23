package md.tekwill.accessmodifiers.peopleevidence;

public class Person {

    public static boolean isHuman;

    public String firstName;

    /* The protected access modifier is accessible within package and outside the package but through inheritance only
    */
     protected String lastName;

     /*The final modifier represents that the value of the variable cannot be changed. It also makes the primitive data type immutable or unchangeable */
    public final int ID;


    /*The access level of a private modifier is only within the class. It cannot be accessed from outside the class */
    private int age;

    public boolean isRetired;

   /* public void setAge(int enteredAge){
        if (enteredAge > 0 && enteredAge <100){
            this.age = enteredAge;
        } else{
            System.out.println("The entered age is not valid, the age property is still empty");
    } */

    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
    }

    public Person(String firstName, String lastName, int id, int age, boolean isRetired){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
        if (age > 0 && age <100){
            this.age = age;
        }else{
            System.out.println("The entered age is not valid, the property age is still empty");

        }
        this.isRetired = isRetired;
    }

    public int getAge(){
        return this.age;
    }
    public void printRetirementStatus(){
        if (isRetired) {
            System.out.println(firstName + " is retired");
        }else{
            System.out.println(firstName + " is not retired");
        }
    }

}
