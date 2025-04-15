package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import org.example.model.Computador;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

public class ComputationController implements Initializable {

    @FXML
    private Button btn_ligar;

    @FXML
    private Hyperlink hpl_chrome;

    @FXML
    private Hyperlink hpl_youtube;

    @FXML
    private TextField txt_marca;

    @FXML
    private TextField txt_modelo;

    Computador c = new Computador();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void abrirChrome(ActionEvent event) throws IOException {
       if(c.isLigado()){
           Desktop desktop = Desktop.getDesktop();
           desktop.browse(URI.create("www.google.com.br"));
       }else{
           Alert alert = new Alert(Alert.AlertType.WARNING);
           alert.setTitle("Ligando o PC!!!");
           alert.setHeaderText("Pc Desligado!!!!");
           alert.setContentText("Por favor ligue o Pc!!!");
           alert.show();
       }


    }

    @FXML
    void ligarPc(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Ligando o PC!!!");
        alert.setHeaderText("Ligando!!!!");
        alert.setContentText("O Pc está ligado!!!");
        alert.show();
        c.setLigado(true);

    }
    @FXML
    void abrirYoutube(ActionEvent event) throws IOException {
        if(c.isLigado()){
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(URI.create("www.youtube.com.br"));

        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ligando o PC!!!");
            alert.setHeaderText("Pc Desligado!!!!");
            alert.setContentText("Por favor ligue o Pc!!!");
            alert.show();
        }
    }



}
