package md.tekwill.operationsandciclicfunctions;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 6;

        //Increment
        int b = a++;
        System.out.println("Value after incrementing: " + a);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Prior-fixed increment
        int c = ++a;
        System.out.println("Value after pre-fixed increment: " + a);

        System.out.println("a = " + a);
        System.out.println("b = " + c);
        System.out.println("Display b = " + b + " a = " + a + " c = " + c);

        //Decrement
        int d = a--;
        System.out.println("a = " + a);
        System.out.println("c = " + d);

        //Prior-fixed decrement
        int e = --a;
        System.out.println("Value after pre-fixed decrement: " + a);

        System.out.println("a = " + a);
        System.out.println("c = " + e);


    }
}
