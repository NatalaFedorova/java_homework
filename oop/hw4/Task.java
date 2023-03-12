package hw4;

public class Task {
    private String subject;
    private String author;
    private int priority;

    public Task(String subject, String author, int priority) {
        this.subject = subject;
        this.author = author;
        this.priority = priority;
    }

    public Task(String subject) {
        this.subject = subject;
    }

    public Task(){
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPriority() { //возвращает приоритет в зависимости от кода
        return switch (priority) {
            case 1 -> "низкий приоритет";
            case 2 -> "средний приоритет";
            case 3 -> "наивысший приоритет";
            default -> "приоритет не установлен";
        };
    }

    public int getPriorCode() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public String toString() {
        return "Название: " + getSubject() +
                ", автор: " + getAuthor() +
                ", важность: " + getPriority();
    }
}

