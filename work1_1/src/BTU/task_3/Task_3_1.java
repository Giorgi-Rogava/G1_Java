package BTU.task_3;

import java.util.*;

public class Task_3_1 {
    public static void main(String[] args) {


        List<Integer> firstCollection = new ArrayList<>();
        List<Integer> secondCollection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            firstCollection.add(random.nextInt());
        }

        for (int i = 0; i < 12; i++) {
            if (i % 2 != 0) {
                secondCollection.add(firstCollection.get(i));
            }
        }

        Collections.sort(firstCollection);
        Collections.sort(secondCollection);


        System.out.println(firstCollection);
        System.out.println(secondCollection);

    }
}

