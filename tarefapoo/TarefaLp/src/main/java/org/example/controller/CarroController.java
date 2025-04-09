package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.controlsfx.control.Notifications;
import org.example.model.Carro;

public class CarroController {

    @FXML
    private Button btn_acelerar;

    @FXML
    private Button btn_freiar;
    @FXML
    private TextField txt_ano;

    @FXML
    private TextField txt_cor;

    @FXML
    private TextField txt_nome;


    @FXML
    private Button btn_ligar;
    @FXML
    private Label lbl_velocidade;


    Carro carro = new Carro();

    @FXML
    void freiarCarro(ActionEvent event) {
        if (carro.ligarCarro() && carro.getVelocidade() > 0){
            Notifications.create()
                    .title("Carro")
                    .position(Pos.CENTER)
                    .text("O carro " + carro.getNome() + " da cor " + carro.getCor() +
                            " ano de fabricação " + carro.getAnoFabricacao()+ " está freiando!!!")
                    .showInformation();
            carro.frearCarro();
            lbl_velocidade.setText(String.valueOf(carro.getVelocidade()));

        }else  {
            Notifications.create()
                    .title("Carro")
                    .position(Pos.CENTER)
                    .text("O carro " + carro.getNome() + " da cor " + carro.getCor() +
                            " ano de fabricação " + carro.getAnoFabricacao()+ " já está parado!!!")
                    .showInformation();
        }
    }
    @FXML
    void ligarCarro(ActionEvent event) {
        receberDados();
        if (carro.ligarCarro()){
            Notifications.create()
                    .title("Carro")
                    .position(Pos.CENTER)
                    .text("O carro " + carro.getNome() + " da cor " + carro.getCor() +
                            " ano de fabricação " + carro.getAnoFabricacao()+ " já está ligado!!!")
                    .showInformation();

        }else  {
            Notifications.create()
                    .title("Carro")
                    .position(Pos.CENTER)
                    .text("VRRRUUUUUMMMMMMM!!!")
                    .showInformation();
            carro.setEstaLigado(true);

        }
    }
    @FXML
    void acelerarCarro(ActionEvent event) {
        if(carro.ligarCarro()){
            carro.acelerarCarro();
            lbl_velocidade.setText(String.valueOf(carro.getVelocidade()));
        }else{
            Notifications.create()
                    .title("Carro")
                    .position(Pos.CENTER)
                    .text("Carro desligado, por favor lique-o")
                    .showInformation();
        }
    }
    void receberDados(){
        carro.setNome(txt_nome.getText());
        carro.setCor(txt_cor.getText());
        carro.setAnoFabricacao(Integer.valueOf(txt_ano.getText()));
    }
}
