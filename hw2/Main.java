package hw.java_homework.hw2;


import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Задача про палиндром
        System.out.println(isPalindrome("Madam, I'm Adam!")); // true

        // Генерация строки и запись в файл
        generatingStringAndWritingFile("TEST", 100);
    }
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\W", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }
    public static void generatingStringAndWritingFile(String text, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(text).repeat(Math.max(0, n)));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            fileOutputStream.write(stringBuilder.toString().getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();
        }
    }


}
