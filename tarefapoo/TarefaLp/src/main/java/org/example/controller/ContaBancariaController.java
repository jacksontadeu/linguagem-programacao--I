package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.model.ContaBancaria;

import java.net.URL;
import java.util.ResourceBundle;

public class ContaBancariaController implements Initializable {

    @FXML
    private Button btn_depositar;

    @FXML
    private Button btn_sacar;

    @FXML
    private Button btn_saldo;

    @FXML
    private Label lbl_valor;

    @FXML
    private TextField txt_numero;

    @FXML
    private TextField txt_titular;

    @FXML
    private TextField txt_valor;

    ContaBancaria conta = new ContaBancaria();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void consularSaldo(ActionEvent event) {
        receberDados();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Consulta de Saldo");
        alert.setHeaderText("Extrato da Conta");
        alert.setContentText(conta.toString());
        alert.show();

    }

    @FXML
    void depositar(ActionEvent event) {


        receberDados();
        double valor = Double.valueOf(txt_valor.getText());
        if(valor > 0 ){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Depósitoo");
            alert.setHeaderText("Depósitor!!!");
            alert.setContentText("Depósito realizado com sucesso!!!!");
            alert.show();
            conta.depositar(valor);
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Valor inválido");
            alert.setHeaderText("Verificar valor!!!");
            alert.setContentText("O valor deve ser maior que zero!!!!");
            alert.show();

        }


    }

    @FXML
    void sacar(ActionEvent event) {
        double valor = Double.valueOf(txt_valor.getText());
        if(valor > 0 && conta.getSaldo() >= valor){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Saque");
            alert.setHeaderText("Saque!!!");
            alert.setContentText("Saque realizado com sucesso!!!!");
            alert.show();
            conta.sacar(valor);
        }else if (valor > 0 && conta.getSaldo() < valor){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Saque");
            alert.setHeaderText("Verificar valor!!!");
            alert.setContentText("Saldo insuficiente!!!!");
            alert.show();

        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Valor inválido");
            alert.setHeaderText("Verificar valor!!!");
            alert.setContentText("O valor deve ser maior que zero!!!!");
            alert.show();
        }

    }
    void receberDados(){
        conta.setTitular(txt_titular.getText());
        conta.setNumero(Integer.valueOf(txt_numero.getText()));

    }


}