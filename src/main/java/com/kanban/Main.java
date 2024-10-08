package main.java.com.kanban;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.kanban.view.KanbanView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        KanbanView kanbanView = new KanbanView();
        Scene scene = new Scene(kanbanView, 1600, 900);

        primaryStage.setTitle("Kanban App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

