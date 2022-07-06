import java.util.Arrays;
import java.util.List;

public class Arifmatics {
    private static int calculate(int number1, int number2, String operation) {
        int result = 0;
        switch (operation) {
            case ("*"):
                result = number1 * number2;
                break;
        }
        switch (operation) {
            case ("-"):
                result = number1 - number2;
                break;
        }
        switch (operation) {
            case ("/"):
                result = number1 / number2;
                break;
        }
        switch (operation) {
            case ("+"):
                result = number1 + number2;
                break;
        }
        return result;

    }

    public static boolean contains(String test) {

        for (RimNumb c : RimNumb.values()) {

            if (test.contains((c.name()))) {
                return true;
            }
        }

        return false;
    }

    void result(String scanInput) {
        NumberConversion converse = new NumberConversion();

        int number1 = 0;
        int number2 = 0;

        String[] parts = scanInput.split(" ");

        String operation = parts[1];
        Boolean value1 = contains(parts[0]);
        Boolean value2 = contains(parts[2]);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(parts[1]);
        try {
            if (value1 && value2) {
                String result;
                number1 = converse.romanToArabic(parts[0]);
                number2 = converse.romanToArabic(parts[2]);
                System.out.println(converse.arabicToRoman(calculate(number1, number2, operation)));
            } else {
                number1 = Integer.parseInt(parts[0]);
                number2 = Integer.parseInt(parts[2]);
                System.out.println(calculate(number1, number2, operation));

            }
        } catch (IllegalArgumentException e) {
            if ((number1 > 10 || number1 < 1) || (number2 > 10 || number2 < 1))
                throw new IllegalArgumentException();
        }


    }


}
