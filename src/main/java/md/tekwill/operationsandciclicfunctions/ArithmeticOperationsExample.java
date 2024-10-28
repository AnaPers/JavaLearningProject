package md.tekwill.operationsandciclicfunctions;

public class ArithmeticOperationsExample {

    public static void main (String [] args) {
        int a = 5;
        int c = 12;

        //Sum
        int sum = a + c;
        System.out.println("The sum is: " + (a + c));
        System.out.println("The sum is: " + sum);

        //Write a program that will change the value of the variable, as an output a = 12, c = 5
        a = a + c;
        c = a - c;
        a = a - c;
        System.out.println("Value after swapping: a = " + a);
        System.out.println("Value after swapping: c = " + c);

        //Substraction
        int dif = a - c;
        System.out.println("The dis is:" + dif);

        //Division
        int div = a / c;
        System.out.println("The div is: " + div);

        double div1 = a / c;
        System.out.println("The div is: " + div1);

        double a1 = a;
        double b1 = c;
        double div2 = (double) a / c; //proces numit castare
        System.out.println("The div2 is: " + div2);

        //Multiplication
        System.out.println("The multiplication is: " + (a1 * b1));

        //The result of remainder for division
        System.out.println("The remainder is: " + (a % c));

    }
}
