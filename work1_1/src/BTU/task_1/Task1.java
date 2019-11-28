package BTU.task_1;

import java.util.*;

class C {
    private int aNumber, bNumber, cNumber;

    private void assignment() { // 1
        Scanner scanner = new Scanner(System.in);
        aNumber = scanner.nextInt();
        bNumber = scanner.nextInt();
        cNumber = scanner.nextInt();
    }

    private int returnLastDigitOfaNumber() { // 2
        return aNumber % 10;
    } // 2

    private int returnFirstDigitOfbNumber() { // 3
        return Integer.parseInt(String.valueOf(bNumber).split("")[0]);
    } // 3

    private long returnSumOfcNumberDigits() { // 4
        long sumOfcNumberDigits = 0;
        for (String digit : String.valueOf(cNumber).split("")) {
            sumOfcNumberDigits += Integer.parseInt(digit);
        }
        return sumOfcNumberDigits;
    }

    private long multiplyOfMethod2AndMethod3() { // 5
        return (returnLastDigitOfaNumber() * returnFirstDigitOfbNumber());
    }

    private long sumOfMethod3AndMethod5() { // 6
        return returnFirstDigitOfbNumber() + multiplyOfMethod2AndMethod3();
    }


    // ----------------------------------------
    static class A {
        Scanner scanner = new Scanner(System.in);
        int xNumber;


        A() {
            System.out.println("Hello");
        }

        void inputXValue() {
            xNumber = scanner.nextInt();
        }

        void printXPlus12() {
            this.xNumber = xNumber + 12;
            System.out.println(xNumber);
        }

        void defineNumber() {
            if (xNumber % 2 == 0) {
                System.out.println(xNumber + " is even number ");
            } else {
                System.out.println(xNumber + " is odd number ");
            }
        }

        static class B extends A {
            int yNumber;

            void inputYValue() {
                yNumber = scanner.nextInt();
            }

            int returnSumOfxAndy(int xValue) {
                return xValue + yNumber;
            }

        }
    }


    // ---------------------------------------------------------


    private void randomNumbers() {
        Scanner scanner = new Scanner(System.in);
        int aNumber = scanner.nextInt();
        int bNumber = scanner.nextInt();
        int countEvenNumbers = 0;
        int randomNumber;
        Random random = new Random();
        int temporaryVar = aNumber;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;


        if (aNumber > bNumber) {
            aNumber = bNumber;
            bNumber = temporaryVar;
        }

        System.out.print("\n40 Random Numbers ");
        for (int i = 0; i < 40; i++) {
            randomNumber = random.nextInt(aNumber) + (bNumber - aNumber);
            System.out.println(randomNumber);

            if (randomNumber % 2 == 0) {
                countEvenNumbers++;
                sumOfEvenNumbers += randomNumber;
            } else {
                sumOfOddNumbers += randomNumber;
            }

        }

        System.out.println("\n\n" + countEvenNumbers + " Even Numbers \n" + (40 - countEvenNumbers) + " Odd Numbers ");
        System.out.println("Sum of Even Numbers - - > " + sumOfEvenNumbers);
        System.out.println("Sum of Odd Numbers - - > " + sumOfOddNumbers);

        System.out.print("\n\n5 Random Numbers ");
        for (int j = 0; j < 5; j++) {
            System.out.println(random.nextInt(Math.min(sumOfEvenNumbers, sumOfOddNumbers) + (Math.max(sumOfEvenNumbers, sumOfOddNumbers) - Math.min(sumOfEvenNumbers, sumOfOddNumbers))));
        }

    }

    public static void main(String[] args) {

        // -------------------------- 1

        C object = new C();
        object.assignment();
        System.out.println(object.returnLastDigitOfaNumber());
        System.out.println(object.returnFirstDigitOfbNumber());
        System.out.println(object.returnSumOfcNumberDigits());
        System.out.println(object.multiplyOfMethod2AndMethod3());
        System.out.println(object.sumOfMethod3AndMethod5() + "\n\n\n");


        // -------------------------- 2
        A object2 = new A();
        object2.inputXValue();
        object2.printXPlus12();
        object2.defineNumber();

        A.B object3 = new A.B();
        object3.inputYValue();
        System.out.println(object3.returnSumOfxAndy(object2.xNumber) + "\n\n\n");

        //-------------------------- 3
        object.randomNumbers();
    }
}

