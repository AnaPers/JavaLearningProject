package md.tekwill.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        //Atribuire simpla
        int c = a;
        System.out.println("Atribuire simpla: " + c);

        //Atribuire cu adunare
        a+=c;
        //a = a + c
        System.out.println("Atribuire cu adunare: " + a);

        //Atribuire cu scadere
        a -= b;
        // a = a - b
        System.out.println("Atribuire cu scadere: " + a);

        //Atrubuire simpla cu "-" in fata
        a = -b;

        //Atribuire cu inmultire
        a *=c;
        // a = a * c
        System.out.println("Atribuire cu inmultire: " + a);

        //Atribuire cu impartire
        a /= a;
        //a = a / a
        System.out.println("Atribuire cu impartire: " + a);

        //Atribuire cu restul impartirii
        a %= b;
        //a = a % b
        System.out.println("Atribuire cu restul impartirii: " + a);
    }
}
