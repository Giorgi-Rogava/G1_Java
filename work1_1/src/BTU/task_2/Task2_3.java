package BTU.task_2;

import java.util.Scanner;
import java.util.TreeMap;

public class Task2_3 implements Task2_3_Methods {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Task2_3_Methods obj1 = new Task2_3();
        obj1.numbersFromAToB(a, b);
        obj1.divisorsOfA(a);
        obj1.primeNumberDivisorsOfB(b);
        obj1.frequentDigitForB(b);


    }

    private static boolean findPrimeNumber(int number) {
        int countDivisors = 0;
        boolean b = true;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDivisors++;
            }
            if (countDivisors > 2) {
                b = false;
                break;
            }
        }
        return b;
    }

    @Override
    public void divisorsOfA(int a) {
        System.out.println("\n\n  divisors Of A \n");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void primeNumberDivisorsOfB(int b) {
        System.out.println("\n\n  prime Number Divisors Of B \n");
        for (int i = 1; i <= b; i++) {
            if (findPrimeNumber(i)) {
                System.out.println(i);
            }
        }

    }

    @Override
    public void frequentDigitForB(int b) {
        System.out.println("\n\n  frequent Digit For B ");
        TreeMap<Integer, Integer> digitAndQuantity = new TreeMap<>();
        String[] array = String.valueOf(b).split("");
        int countdigits = 0;

        for (String string0 : array) {

            for (String string1 : array) {
                if (string0.equals(string1)) {
                    countdigits++;
                }
            }
            digitAndQuantity.put(Integer.valueOf(string0), countdigits);
            countdigits = 0;
        }
        System.out.println("  Number : Quantity  - - > " + digitAndQuantity);

    }

    @Override
    public void numbersFromAToB(int a, int b) {
        System.out.println("\n\n  numbers From A To B \n");
        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
        }
    }
}
