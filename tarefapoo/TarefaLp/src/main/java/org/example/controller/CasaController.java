package org.example.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.example.model.Casa;
import org.example.model.Regiao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private Label lbl_valor;

    @FXML
    private ComboBox<Regiao> cbx_regiao;

  

    Casa c1 = new Casa();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        cbx_regiao.getItems().setAll(Regiao.values());
        
    }
    @FXML
    void detalharCasa(ActionEvent event) {
        receberDados();
        lbl_valor.setText(String.valueOf(c1.getValor()));
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
        c1.setRegiao(cbx_regiao.getValue());
        c1.calcularValorVenda();
        c1.setRegiao(cbx_regiao.getValue());


    }
    void limparDados(){
        txt_area.setText("");
        txt_proprietario.setText("");
        txt_cor.setText("");
       
        txt_quartos.setText("");
        
    }

}
