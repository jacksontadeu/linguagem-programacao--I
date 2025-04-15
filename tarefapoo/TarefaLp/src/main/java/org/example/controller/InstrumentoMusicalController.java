package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import org.example.model.Instrumento;
import org.example.model.InstrumentoMusical;

import java.awt.*;
import java.io.IOException;

import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

import static org.example.model.Instrumento.*;

public class InstrumentoMusicalController implements Initializable {

    @FXML
    private ComboBox<Instrumento> cbx_instrumentos;

    @FXML
    private Hyperlink hp_video;

    InstrumentoMusical i = new InstrumentoMusical();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbx_instrumentos.getItems().setAll(Instrumento.values());
    }

    @FXML
    void assistirVideo(ActionEvent event) throws IOException {
        receberDados();
        String instrumento = String.valueOf(cbx_instrumentos.getValue());
        Desktop desktop = Desktop.getDesktop();
        switch (i.getNome()){
            case GUITARRA:
                desktop.browse(URI.create("https://www.youtube.com/watch?v=bAIvjg7eqK8"));
                break;
            case TROMPETE:
                desktop.browse(URI.create("https://www.youtube.com/watch?v=B1eyZAedhY4"));
                break;
            case BATERIA:
                desktop.browse(URI.create("https://www.youtube.com/watch?v=PC-ZdPrFzdk"));
                break;

        }
    }
    void receberDados(){
        i.setNome(cbx_instrumentos.getValue());
    }


}
