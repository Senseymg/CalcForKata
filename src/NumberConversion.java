import java.util.List;

public class NumberConversion {
    public static int romanToArabic(String input) {
        String rimNumb = input.toUpperCase();
        int result = 0;
        // System.out.println(rimNumb);
        List<RimNumb> rimNumbs = RimNumb.getReverseSortedValues();
        int i = 0;

        while ((rimNumb.length() > 0) && (i < rimNumbs.size())) {
            RimNumb symbol = rimNumbs.get(i);
            if (rimNumb.startsWith(symbol.name())) {
                result += symbol.getValue();
                rimNumb = rimNumb.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        if (rimNumb.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }


        return result;
    }

    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 100)) {
            throw new IllegalArgumentException(number + " is not in range");
        }
        List<RimNumb> rimNumbs = RimNumb.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();
        while ((number > 0) && (i < rimNumbs.size())) {
            RimNumb currentSymbol = rimNumbs.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}
