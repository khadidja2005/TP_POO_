package org.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage; // Initialize the primaryStage variable
        Parent root = FXMLLoader.load(getClass().getResource("get_started.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void loadPage(String fxmlFile) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource(fxmlFile));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
