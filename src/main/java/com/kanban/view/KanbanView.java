package main.java.com.kanban.view;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import main.java.com.kanban.controller.TaskController;
import main.java.com.kanban.model.TaskList;
import main.java.com.kanban.model.Task;

public class KanbanView extends BorderPane {
    private TaskController controller;

    public KanbanView() {
        controller = new TaskController();

        VBox todoBox = createTaskBox("To Do", controller.getTodoList());
        VBox inProgressBox = createTaskBox("In Progress", controller.getInProgressList());
        VBox doneBox = createTaskBox("Done", controller.getDoneList());

        setLeft(todoBox);
        setCenter(inProgressBox);
        setRight(doneBox);
    }

    private VBox createTaskBox(String title, TaskList taskList) {
        VBox box = new VBox();
        ListView<Task> listView = new ListView<>();
        TextField taskTitle = new TextField();
        TextField taskDescription = new TextField();
        Button addButton = new Button("Add Task");

        addButton.setOnAction(event -> {
            controller.addTask(taskTitle.getText(), taskDescription.getText());
            listView.getItems().add(new Task(taskTitle.getText(), taskDescription.getText()));
            taskTitle.clear();
            taskDescription.clear();
        });

        box.getChildren().addAll(taskTitle, taskDescription, addButton, listView);
        return box;
    }
}
