package org.example.controller;

import java.io.IOException;

import org.controlsfx.control.Notifications;
import org.controlsfx.control.action.Action;
import org.example.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuController {

    @FXML
    private MenuBar menuprincipal;

    @FXML
    private MenuItem mni_casa;

    @FXML
    private MenuItem mni_cachorro;

    @FXML
    private MenuItem mni_celular;

    @FXML
    private MenuItem mni_carro;

    @FXML
    private MenuItem mni_computation;
    @FXML
    private MenuItem mni_conta;

    @FXML
    private MenuItem mni_instrumento;

    @FXML
    private MenuItem mni_sairdosistema;

    @FXML
    void onClickCachorro(ActionEvent event) throws IOException {
        App.setRoot("views/cachorro");

    }

    @FXML
    void onClickCarro(ActionEvent event) throws IOException {
        App.setRoot("views/carro");

    }

    @FXML
    void onClickCasa(ActionEvent event) throws IOException {
        App.setRoot("views/casa");
    }
    @FXML
    void onClickInstrumentoMusical(ActionEvent event) throws IOException {
    App.setRoot("views/instrumentomusical");
    }


    @FXML
    void onClickComputation(ActionEvent event) throws IOException {
        App.setRoot("views/computation");
    }

    @FXML
    void onClickCelular(ActionEvent event) throws IOException {
        App.setRoot("views/celular");
    }
    @FXML
    void onClickContaBancaria(ActionEvent event) throws IOException {
        App.setRoot("views/contabancaria");
    }

    @FXML
    void onClickSairDoSistema(ActionEvent event) {
        Notifications.create()
                .title("Sair do Sistema")
                .text("Deseja sair???")
                .darkStyle()
                .position(Pos.TOP_CENTER)
                .action(new Action("Sim, sair", e -> {
                    System.exit(0);
                }))
                .showConfirm();
    }


}
