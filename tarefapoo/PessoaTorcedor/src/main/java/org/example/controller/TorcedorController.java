package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.example.model.Pessoa;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class TorcedorController implements Initializable {

    @FXML
    private Button bt_comemorar;

    @FXML
    private TextField tf_idade;

    @FXML
    private TextField tf_nome;

    @FXML
    private TextField tf_time;

    Pessoa torcedor = new Pessoa();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void comemorarTitulo(ActionEvent event) {
        if (!receberDados()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ERRO!!!");
            alert.setHeaderText(" Os campos são obrigatórios!!!!");
            alert.setContentText("Por favor preenchê-los!!!!");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Comemoração");
            alert.setHeaderText("Somos CAMPEÂO!!!!!!!!!!!!");
            alert.setContentText("Vai " + torcedor.getTime() + "!!!!!!!!");
            alert.show();
        }


    }

    @FXML
    void lamentarTitulo(ActionEvent event) {
        if (!receberDados()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ERRO!!!");
            alert.setHeaderText(" Os campos são obrigatórios!!!!");
            alert.setContentText("Por favor preenchê-los!!!!");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Choradeira");
            alert.setHeaderText(torcedor.getNome().toUpperCase() + " Lamentando e chorando!!!");
            alert.setContentText("Que raiva desse time " + torcedor.getTime() + "!!!!");
            alert.show();
        }


    }


    boolean receberDados() {
        String nome = tf_nome.getText().toString();
        String idade = tf_idade.getText().toString();
        String time = tf_time.getText().toString();

        if (nome == null || nome.isBlank() || nome.isEmpty())
            return false;
        else if (idade == null || idade.isBlank() || idade.isEmpty())
            return false;

        else if (time == null || time.isEmpty() || time.isBlank())
            return false;
        else {
            torcedor.setNome(nome);
            torcedor.setIdade(Integer.valueOf(idade));
            torcedor.setTime(time);
            return true;

        }
    }
}

