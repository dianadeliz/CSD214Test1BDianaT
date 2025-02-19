package com.trios.csd214test1bdianat;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/trios/csd214test1bdianat/LoginView.fxml"));
            VBox root = loader.load();
            Scene scene = new Scene(root, 300, 250);
            primaryStage.setTitle("Login Page - Diana T ID:23094277 Date: Feb19,2025");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

