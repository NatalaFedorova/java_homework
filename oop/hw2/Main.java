package hw1;

public class Main {
    public static void main(String[] args) {
        Person Ivan = new Person("Иван");
        Person Natalia = new Person("Наталья");
        Person Lisa = new Person("Лиза");
        Person Nastya = new Person("Настя");


        GeoTree gt = new GeoTree();

        gt.appendParentChild(Ivan, Lisa);
        gt.appendParentChild(Natalia, Lisa);
        gt.appendParentChild(Ivan, Nastya);
        gt.appendParentChild(Natalia, Nastya);

        GeoTree.appendWifeHusband(Natalia, Ivan);

        System.out.println("Дети Натальи");
        System.out.println(new Research(gt).spend(Natalia, Relationship.parent));

        System.out.println("Дети Игоря");
        System.out.println(new Research(gt).spend(Ivan, Relationship.parent));

        System.out.println("Муж Натальи");
        System.out.println(new Research(gt).spend(Natalia, Relationship.wife));



        Cat Murzik = new Cat();
        Cat Murka = new Cat();


        Murzik.animalSound();
        Murka.sleep();


    }
}
