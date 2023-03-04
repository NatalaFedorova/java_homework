package hw1;

public abstract class Someone implements SomeoneSleep{
    private String fullName;

    public Someone (String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }


    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public String toString() {
        return "Person: " + fullName;
    }
}
