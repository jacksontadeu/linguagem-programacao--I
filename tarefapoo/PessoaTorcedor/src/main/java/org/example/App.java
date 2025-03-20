package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        String arquivoCss = getClass().getResource("torcedor.css").toExternalForm();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("torcedor.fxml"));
        scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(arquivoCss);
        stage.setTitle("Torcedor");


        stage.getIcons().add(new Image(getClass().getResourceAsStream("imagens/timao.jpeg")));
        stage.setScene(scene);
        stage.show();
    }





    public static void main(String[] args) {
        launch();
    }

}