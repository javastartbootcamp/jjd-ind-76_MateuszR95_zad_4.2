package pl.javastart.task;

public class Task {

    String name;
    String description;
    int priority;
    Person assignedPerson;

    public Task(String name, String description, int priority, Person assignedPerson) {
        this(name, description, priority);
        this.assignedPerson = assignedPerson;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority() {
        boolean isHighPriority = priority > 0;
        return isHighPriority;
    }

    boolean mediumPriority() {
        boolean isMediumPriority = priority == 0;
        return isMediumPriority;
    }

    boolean lowPriority() {
        boolean isLowPriority = priority < 0;
        return isLowPriority;
    }

    String printPriorityStatus() {
        if (highPriority()) {
            return name + ": Wysoki priorytet";
        } else if (mediumPriority()) {
            return name + ": Średni priorytet";
        } else {
            return name + ": Wysoki priorytet";
        }
    }

}



