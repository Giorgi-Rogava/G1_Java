package BTU.Task_2;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task2_1_2 {

    static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter("C:\\Users\\Giorgi\\Desktop\\G1_Java\\B_G1_Java-master\\Week_5\\src\\Task_2\\function.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static FileWriter calculateValue(double number) throws IOException {
        double result = number * number + 2 * number + 3;
        BigDecimal bd = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);


        fileWriter.write(String.valueOf(bd));
        fileWriter.append("\n");
        fileWriter.close();

        System.out.println("Function Value  - - > " + bd);
        return fileWriter;

    }

    private static void findMaxAndMinNumbers() throws IOException {

        File file = new File("C:\\Users\\Giorgi\\Desktop\\G1_Java\\B_G1_Java-master\\Week_5\\src\\Task_2\\function.txt");
        Scanner scanner = new Scanner(file);


        double max = Double.parseDouble(scanner.nextLine());
        double min = Double.parseDouble(scanner.nextLine());
        double compare = 0;

        while (scanner.hasNextLine()) {
            compare = Double.parseDouble(scanner.nextLine());

            if (compare > max) {
                max = compare;
            }
            if (compare < min) {
                min = compare;
            }

        }
        System.out.println("Maximum Number  - - > " + max);
        System.out.println("Minimum Number  - - > " + min);

    }

    public static void main(String[] args) throws IOException {

        calculateValue(1.7982);
        findMaxAndMinNumbers();

    }
}
