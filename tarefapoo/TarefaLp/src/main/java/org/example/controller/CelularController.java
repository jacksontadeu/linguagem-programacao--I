package org.example.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.example.model.Celular;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CelularController implements Initializable{

    @FXML
    private Button brn_musica;

    @FXML
    private Button btn_app;

    @FXML
    private Button btn_ligacao;

    @FXML
    private TextField txt_marca;

    @FXML
    private TextField txt_modelo;

    @FXML
    private TextField txt_nome;

    Celular c = new Celular();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

    @FXML
    void fazerLigacao(ActionEvent event) {
        receberDados();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Fazendo ligação!!!");
        alert.setHeaderText("Ligando para ....");
        alert.setContentText("O celular " + c.getNome() + " modelo " + c.getModelo() + " está realizando uma chamada!!!");
        alert.show();

    }

    @FXML
    void instalarApp(ActionEvent event) throws InterruptedException {
        receberDados();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Instalando App!!!");
        alert.setHeaderText("Instalando aguarde ....");
        Thread.sleep(2000);
        alert.setContentText("O celular " + c.getNome() + " modelo " + c.getModelo() + " terminou de instalar o app!!!");
        alert.show();
    }

    @FXML
    void ouvirMusica(ActionEvent event) {
        receberDados();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Ouvindo música!!!");
        alert.setHeaderText("Ouvindo música ....");
        alert.setContentText("O celular " + c.getNome() + " modelo " + c.getModelo() + " está tocando um hit!!!");
        alert.show();

    }
    void receberDados(){
        c.setNome(txt_nome.getText());
        c.setMarca(txt_marca.getText());
        c.setModelo(txt_modelo.getText());
    }

   

}
