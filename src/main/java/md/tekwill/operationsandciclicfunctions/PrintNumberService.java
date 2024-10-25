package md.tekwill.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int start = 0;
        int stop = 500;

        int whileCounter = start;
        while(whileCounter < stop) {
            System.out.println(whileCounter + " , ");
            whileCounter++;
            //whileCounter +=1;
            //whileCounter = whileCounter + 1
        }
        System.out.println();

        do {
            System.out.println(whileCounter + " , ");
            whileCounter--;
        } while (whileCounter > start);

        System.out.println();

        for (int i = start; i <= stop; i++){
            System.out.println(i + " , ");
        }
        //Calculate the sum of the numbers between start and stop which are divisible by 5
        int sum = 0;

        for (int i = start; i < stop; i++) {
            if (i % 5 == 0) {
                sum = sum + i;
                System.out.println("For i = " + i + " the sum is " + sum);
            }
        }

        System.out.println("The sum of the numbers divisible by 5 from the allocated number range");
    }

}
