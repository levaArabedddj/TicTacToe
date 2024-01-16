package com.example.test4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;

public class GameController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    char nowsymbol = 'x';

    private char gameFild[][] = new char [3][3];
    private  boolean isGame = true;


    @FXML
    void btnClick(ActionEvent event) {

        Button button = (Button)event.getSource();
        if(!isGame|| button.getText()!= "") return;

        int rowIndex = GridPane.getRowIndex(button) == null ? 0:GridPane.getRowIndex(button) ;
        int colIndex = GridPane.getColumnIndex(button) == null ? 0: GridPane.getColumnIndex(button);

        gameFild[rowIndex][colIndex] = nowsymbol;
        button.setText(String.valueOf(nowsymbol));

        if (gameFild[0][0] == gameFild[0][1] && gameFild[0][0] == gameFild[0][2]
                && (gameFild[0][0] == 'x' || gameFild[0][0] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameFild[1][0] == gameFild[1][1] && gameFild[1][0] == gameFild[1][2]
                && (gameFild[1][0] == 'x' || gameFild[1][0] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameFild[2][0] == gameFild[2][1] && gameFild[2][0] == gameFild[2][2]
                && (gameFild[2][0] == 'x' || gameFild[2][0] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameFild[0][0] == gameFild[1][0] && gameFild[0][0] == gameFild[2][0]
                && (gameFild[0][0] == 'x' || gameFild[0][0] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameFild[0][1] == gameFild[1][1] && gameFild[0][1] == gameFild[2][1]
                && (gameFild[0][1] == 'x' || gameFild[0][1] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameFild[0][2] == gameFild[1][2] && gameFild[0][2] == gameFild[2][2]
                && (gameFild[0][2] == 'x' || gameFild[0][2] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameFild[0][0] == gameFild[1][1] && gameFild[0][0] == gameFild[2][2]
                && (gameFild[0][0] == 'x' || gameFild[0][0] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameFild[2][0] == gameFild[1][1] && gameFild[2][0] == gameFild[0][2]
                && (gameFild[2][2] == 'x' || gameFild[2][2] == 'o')) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Победил игрок <<" + button.getText() + ">>", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        }


        nowsymbol = nowsymbol=='x' ? 'o' : 'x';


    }

    @FXML
    void initialize() {

    }

}
