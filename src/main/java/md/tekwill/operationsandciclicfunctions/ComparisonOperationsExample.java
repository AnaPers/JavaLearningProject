package md.tekwill.operationsandciclicfunctions;

public class ComparisonOperationsExample {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        //Diferit de
        boolean isNotEqual = a != b;
        System.out.println("Diferit de: " + isNotEqual);

        //Mai mare decat
        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decat: " + isGreaterThan);

        //Mai mic decat
        boolean isLessThan = a < b;
        System.out.println("Mai mic decat: " + isLessThan);

        //Mai mare sau egal cu
        boolean isGreaterThanOrEqualTo = a >= b;
        System.out.println("Mai mare sau egal cu: " + isGreaterThanOrEqualTo);

        //Mai mic sau egal cu
        boolean isLessThanOrEqualTo = a <= b;
        System.out.println("Mai mic sau egal cu: " + isLessThanOrEqualTo);
    }
}
