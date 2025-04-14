package org.example.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.example.model.Casa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CasaController implements Initializable {

    @FXML
    private Button btn_detalhes;

    @FXML
    private TextField txt_area;

    @FXML
    private TextField txt_cor;

    @FXML
    private TextField txt_proprietario;

    @FXML
    private TextField txt_quartos;

    @FXML
    private TextField txt_valor;

  

    Casa c1 = new Casa();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }
    @FXML
    void detalharCasa(ActionEvent event) {
        receberDados();
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Detalhe da casa!!!");
        
        alert.setHeaderText(c1.detalharCasa().toString());
        alert.show();
        limparDados();
    }
    void receberDados(){
        c1.setProprietario(txt_proprietario.getText());
        c1.setCor(txt_cor.getText());
        c1.setQtdeQuartos(Integer.valueOf(txt_quartos.getText()));
        c1.setArea(Double.valueOf(txt_area.getText()));
        c1.setValor(Double.valueOf(txt_valor.getText()));


    }
    void limparDados(){
        txt_area.setText("");
        txt_proprietario.setText("");
        txt_cor.setText("");
        txt_valor.setText("");
        txt_quartos.setText("");
    }

}
