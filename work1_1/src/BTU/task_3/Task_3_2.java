package BTU.task_3;

import java.util.*;

public class Task_3_2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            list.add(5 + random.nextInt(6));
        }

        System.out.println(list);

        for (int i = 3; i < 12; i += 3) {
            list.add(i, 20 + random.nextInt(6));
        }

        System.out.println(list);


    }
}
