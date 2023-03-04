package hw1;

public class Dog extends Animal implements SomeoneSleep {

    public void animalSound() {

        System.out.println("Собака говорит: Гав! Гав!");
    }

    @Override
    public void sleep() {

    }
}
