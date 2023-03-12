package hw4;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final Menu menu;
    private final Planner planner;
    private final Add add;
    protected static String csvPath = "/Users/test/Documents/Программирование/ООП/Seminars/MyPlanner/src/Planner.csv";
    protected static String jsonPath = "/Users/test/Documents/Программирование/ООП/Seminars/MyPlanner/src/Planner.json";
    protected static String xmlPath = "/Users/test/Documents/Программирование/ООП/Seminars/MyPlanner/src/Planner.xml";


    public UserInterface(Scanner scanner, Menu menu, Planner planner, Add add) {
        this.scanner = scanner;
        this.menu = menu;
        this.planner = planner;
        this.add = add;
    }

    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1": // показать все задачи
                    planner.showAll();
                    break;
                case "2": // найти задачу по теме
                    System.out.print("Введите тему задачи: ");
                    System.out.println(planner.getBySub(scanner.nextLine()));
                    break;
                case "3": // отсортировать задачи по приоритету
                    System.out.println("Сначала показаны задачи с наивысшим приоритетом : ");
                    planner.sortByPrior();
                    planner.showAll();
                    break;
                case "4": // выполнить запись планера в файл
                    saveFile();
                    break;
                case "5": // добавить новую задачу
                    planner.add(add.makeNewTask());
                    break;
                case "0": // выход
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

    public void saveFile() {
    }

    public void changeTask(Task changing) {
        while (true) {
            switch (menu.selectTaskMeth()) {
                case "1" -> { // меняем тему
                    System.out.println("Введите новую тему:");
                    changing.setSubject(scanner.nextLine());
                }
                case "2" -> { // имя автора
                    System.out.print("Введите нового автора");
                    changing.setAuthor(scanner.nextLine());
                }
                case "3" -> { //приоритет
                    System.out.print("1 - низкий, 2 - высокий, 3 - наивысший");
                    changing.setPriority(scanner.nextInt());
                }
                case "4" -> //меню
                        start();
                case "0" -> // выход
                        System.exit(0);
                default -> System.out.println("Неверный ввод");
            }
        }
    }
}
