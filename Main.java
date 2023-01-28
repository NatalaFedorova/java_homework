package hw1;
    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        findMinMax();
        isItLeapYear();
        sortArr();
    }
    public static void findMinMax (){
        int[] arr = new int[]{5, 13, 1, 0, 4, 4, 9, 7};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void isItLeapYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();
        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }
        }
        else
            leapYear = false;
        System.out.println(leapYear);
    }

    public static void sortArr() {
        int[] arr = new int[10];
        int val = 3;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(arr));
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != val) {
                i++;
            }
            if (arr[j] == val) {
                j--;
            }
            if (arr[i] == val) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
