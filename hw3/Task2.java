package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Task2 {

    public static void toFillList (ArrayList<Integer> list1) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Список целых чисел %s\n", list1);
    }
    private static double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i: list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        toFillList (list1);
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        double avg = getAverage(list1);
        System.out.println(avg);
    }

}
