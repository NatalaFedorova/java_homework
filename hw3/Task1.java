package hw3;

import java.util.ArrayList;
import java.util.Random;
public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        toFillList (list1);
        toDeleteEvenNumbers(list1);
    }
    public static ArrayList<Integer> toFillList (ArrayList<Integer> list1) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Список целых чисел %s\n", list1);
        return list1;
    }
    public static void toDeleteEvenNumbers(ArrayList<Integer> list1) {
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список с удаленными четными числами %s", list1);
    }
}
