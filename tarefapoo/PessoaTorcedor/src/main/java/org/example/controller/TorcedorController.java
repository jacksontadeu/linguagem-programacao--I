package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.model.Pessoa;

public class TorcedorController {

    @FXML
    private Button bt_comemorar;

    @FXML
    private TextField tf_idade;

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_time;

    Pessoa torcedor= new Pessoa();

    @FXML
    void comemorarTitulo(ActionEvent event) {
        receberDados();
        Alert alert= new Alert(Alert.AlertType.INFORMATION);

        alert.setHeaderText("Comemoração!!!!!");
        alert.setContentText("Vai " + torcedor.getTime());
        alert.show();


    }
    @FXML
    void lamentarTitulo(ActionEvent event) {
        receberDados();
        Alert alert= new Alert(Alert.AlertType.WARNING);

        alert.setHeaderText(torcedor.getNome().toUpperCase() + "Lamentando e chorabdo");
        alert.setContentText("Que raiva desse time " + torcedor.getTime() + "!!!!");
        alert.show();


    }
    void receberDados(){
        torcedor.setNome(tf_nome.getText().toString());
        torcedor.setIdade(Integer.valueOf(tf_idade.getText().toString()));
        torcedor.setTime(tf_time.getText().toString());
    }

}

