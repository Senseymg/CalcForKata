import java.util.Scanner;

public class Scannerok {
    String ScannerRun() {
        String value;

        System.out.println(" Enter operation");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        System.out.println(value);

        return value.toUpperCase();
    }
}
