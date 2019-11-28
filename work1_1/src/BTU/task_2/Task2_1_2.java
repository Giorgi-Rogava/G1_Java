package BTU.task_2;

import java.io.*;
import java.util.*;

public class Task2_1_2 {

    private static void fileWriter(String fileName, double number) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName, true);
        double result = number * number + 2 * number + 3;
        fileWriter.append(String.valueOf(result).substring(0, 4));
        fileWriter.append("\n");
        fileWriter.close();
    }


    private static void findMaxAndMinNumbers(String filePath) throws IOException {

        FileReader file = new FileReader(filePath);
        Scanner scanner = new Scanner(file);


        double max = Double.parseDouble(scanner.nextLine());
        double min = Double.parseDouble(scanner.nextLine());
        double compare;

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

        fileWriter("D:\\BTU_G1_Java\\G1_Java\\work1_1\\src\\BTU\\Task_2\\function.txt", 1.1039111110);
        findMaxAndMinNumbers("D:\\BTU_G1_Java\\G1_Java\\work1_1\\src\\BTU\\Task_2\\function.txt");

    }
}
