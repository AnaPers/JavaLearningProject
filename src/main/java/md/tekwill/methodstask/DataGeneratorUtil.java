package md.tekwill.methodstask;

import java.util.UUID;
import java.util.Random;

public class DataGeneratorUtil {
    private static final Random random = new Random();

    public static int getRandomInt(int startLimit, int endLimit){
        if (startLimit >= endLimit){
            System.out.println("Valoarea minima trebuie sa fie mai mica decat cea maxima");
            return 0;
        }
        int delta = endLimit - startLimit;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber;
        randomNumber = deltaRandomInt + startLimit;
        return randomNumber;
    }
    public static int getRandomInt(int limit){
        return random.nextInt(limit);
    }

    public static double getRandomDouble(double limit){
        if (limit <= 0){
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * limit;
    }
    public static boolean getRandomBoolean(){
        return random.nextBoolean();
    }
    public static String getRandomEmail(String emailDomain){
        return UUID.randomUUID() + emailDomain;
    }
    public static String getRandomEmail(String prefix, String emailDomain){
        return prefix + getRandomInt(888888) + emailDomain;
    }
    public static String generateValidRandomString(int length){
        String acceptedChars = "ABCDEFGHIJKLMNOPRSTUVWXYZabcdefghklmnoprst";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++){
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caraterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
    public static String generateInvalidRandomString(int length){
        String acceptedChars = "@#$%^&*()_+!}><,.";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}