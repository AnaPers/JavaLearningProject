package md.tekwill.accessmodifiers;

import md.tekwill.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {

        Person felixArsenii = new Person("Felix", "Arsenii",123456);
        System.out.println(felixArsenii.firstName);
        System.out.println("ID=" + felixArsenii.ID);

        Person mirceaB = new Person("Mircea","B",568888,34,false);
        System.out.println(mirceaB.firstName);
        System.out.println(mirceaB.getAge());

        if (mirceaB.isRetired) {
            System.out.println("Mircea is retired");
        }else{
            System.out.println("Mircea is not retired");
        }

        Person luciaMantu = new Person("Lucia","Mantu",568888,69,true);
        System.out.println(luciaMantu.firstName);
        System.out.println(luciaMantu.getAge());
        if (luciaMantu.isRetired) {
            System.out.println("Lucia is retired");
        }else{
            System.out.println("Lucia is not retired");
        }

        Person madalinaSteve = new Person("Madalina", "Steve",2445436, 349,false);
        System.out.println(madalinaSteve.firstName);
        System.out.println(madalinaSteve.getAge());

        Person paulaBishop = new Person("Paula", "Bishop",2445436, -6,false);
        System.out.println(paulaBishop.firstName);
        System.out.println(paulaBishop.getAge());

        mirceaB.printRetirementStatus();

        luciaMantu.printRetirementStatus();

        Person.isHuman = true;

    }
}
