package java_homework.hw6;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop HUAWEI53013PLV = new Laptop("HUAWEI", "53013PLV", "Black", 15.6, 256, 8);
        Laptop LenovoV14G2ITL = new Laptop("Lenovo", "V14 G2 ITL", "Black", 14, 256, 8);
        Laptop HPPavilion14 = new Laptop("HP", "Pavilion 14 ", "White", 14, 256, 8);
        Laptop AcerA315 = new Laptop("Acer", "A315-59-55KQ", "Gray", 15.6, 256, 8);
        Laptop AsusTUF555 = new Laptop("ASUS", "TUF-555", "Gray", 14,  512, 16);

        List<Laptop> notebookList = List.of(HUAWEI53013PLV, LenovoV14G2ITL, HPPavilion14, AcerA315, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (Laptop color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (Laptop brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();
    }

}
