package model;

public class SubTask extends Task {
    private final Epic epic;

    public SubTask(Epic epic, String name, String description, TaskStatus aNew) {
        super(name, description, TaskStatus.NEW);

        this.epic = epic;
    }

    public Epic getEpic() {
        return epic;
    }

    @Override
    public String toString() {
        String result = "SubTask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", taskStatus=" + taskStatus +
                ", epicId=";
        if (epic == null) {
            result += "0";
        } else {
            result += epic.getId();
        }
        result += '}';
        return result;
    }
}
