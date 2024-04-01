package com.haroun.tempusfugit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static com.haroun.tempusfugit.HelloApplication.*;

public class DialogViewController {

    @FXML
    private Button deleteID;

    @FXML
    private Button cancelID;

    @FXML
    protected void cancelButton(ActionEvent event) {
        Stage stage = (Stage) cancelID.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void deleteButton(ActionEvent event) {
        deleteFolderContent(System.getProperty("java.io.tmpdir"));
        deleteFolderContent(System.getenv("windir") + "\\temp");
        deleteFolderContent(System.getenv("windir") + "\\Prefetch");

        Stage stage = (Stage) cancelID.getScene().getWindow();
        stage.close();
    }
}
