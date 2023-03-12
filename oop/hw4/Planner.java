package hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Planner{
    private final List<Task> tasks;

    public Planner() {
        this.tasks = new ArrayList<>();
    }

    public void add(Task task) {
        this.tasks.add(task);
    }

    public int getSize() {
        return tasks.size();
    }

    public void showAll() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public Task getBySub(String subject) {  //поиск по названию задачи
        return tasks.stream()
                .filter(task -> task.getSubject().equals(subject))
                .findFirst()
                .orElse(null);
    }

    public void sortByPrior() {
        Comparator<Task> priorComp = new TaskComparator();
        tasks.sort(priorComp);
    }


}
