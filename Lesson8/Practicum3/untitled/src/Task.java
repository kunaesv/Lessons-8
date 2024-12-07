public class Task {

    private TaskPriority priority;// добавьте переменную priority с приоритетом задачи
    private String description;

    // добавьте конструктор класса
    Task(TaskPriority priority, String description){
        this.description = description;
        this.priority = priority;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}