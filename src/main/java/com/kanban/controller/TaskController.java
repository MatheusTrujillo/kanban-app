package main.java.com.kanban.controller;

import main.java.com.kanban.model.Task;
import main.java.com.kanban.model.TaskList;

public class TaskController {
    private TaskList todoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public TaskController() {
        todoList = new TaskList("To Do");
        inProgressList = new TaskList("In Progress");
        doneList = new TaskList("Done");
    }

    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        todoList.addTask(task);
    }

    public TaskList getTodoList() {
        return todoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
