package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("views/menu.fxml"));
        Parent menu = fxmlLoader.load();
        scene = new Scene(menu, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Exercicios de Linguagem de Programação");

        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}