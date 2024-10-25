package md.tekwill.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 88;

        if (testResult >= 90) {
            System.out.println("Calificativ A");
        } else if (testResult >= 80) {
            System.out.println("Calificativ B");
        } else if (testResult >= 70) {
            System.out.println("Calificativ C");
        } else if (testResult >= 60) {
            System.out.println("Calificativ D");
        } else {
            System.out.println("Un astfel de calificativ nu este definit");
        }

        System.out.println("Programul s-a finalizat");
    }
}