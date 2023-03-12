package hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Task t1 = new Task("Приготовить обед", "Наталья", 2);
            Task t2 = new Task();
            Task t3 = new Task("Сделать дз", "Наталья", 3);
            Task t4 = new Task("Пойти на работу", "Наталья", 1);
            Task t5 = new Task("Сходить в магазин", "Иван", 2);
            Planner myP = new Planner();
            myP.add(t1);
            myP.add(t2);
            myP.add(t3);
            myP.add(t4);
            myP.add(t5);
            Scanner scanner = new Scanner(System.in);
            Add add = new Add(scanner);
            Menu menu = new Menu(scanner);
            UserInterface userInterface = new UserInterface(scanner, menu, myP, add);
            userInterface.start();
    }
}
