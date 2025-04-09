package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;
import org.example.model.Cachorro;

import java.net.URL;
import java.util.ResourceBundle;

public class CachorroController implements Initializable {

    @FXML
    private Button btn_latir;

    @FXML
    private Button btn_passear;

    @FXML
    private TextField txt_cor;

    @FXML
    private TextField txt_nome;

    @FXML
    private TextField txt_raca;

    @FXML
    private TextField txt_tutor;

    Cachorro cao = new Cachorro();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void onClickLatir(ActionEvent event) {
        receberDados();
        String latido = cao.latir();
        Notifications.create()
                .title("Cachorro latindo")
                .text("O " + cao.getNome() + " está latindo " + latido)
                .position(Pos.CENTER)
                .showInformation();

    }

    @FXML
    void onClickPassear(ActionEvent event) {
        receberDados();
        Notifications.create()
                .title("Cachorro Passeando")
                .text("O " + cao.getNome() + " da cor " + cao.getCor() + " da raça " +
                        cao.getRaca() + " está passeando com o seu dono " + cao.getTutor())
                .position(Pos.CENTER)
                .showInformation();

    }

    void receberDados() {
        cao.setNome(txt_nome.getText());
        cao.setTutor(txt_tutor.getText());
        cao.setCor(txt_cor.getText());
        cao.setRaca(txt_raca.getText());
    }


}
