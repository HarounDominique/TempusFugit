package com.haroun.tempusfugit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.lang.reflect.InvocationTargetException;

import static com.haroun.tempusfugit.HelloApplication.*;

public class DialogViewController {

    @FXML
    private Button deleteID;

    @FXML
    private Button cancelID;

    @FXML
    protected void cancelButton(ActionEvent event) throws InvocationTargetException {
        Stage stage = (Stage) cancelID.getScene().getWindow();
        stage.close();

        Stage parentStage = (Stage) stage.getOwner();
        if (parentStage != null) {
            parentStage.close();
        }
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
