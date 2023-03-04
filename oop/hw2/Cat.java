package hw1;

public class Cat extends Animal implements SomeoneSleep{
    public void animalSound() {

        System.out.println("Кот говорит: Мяу! Мяу!");
    }

    @Override
    public void sleep() {

    }
}
