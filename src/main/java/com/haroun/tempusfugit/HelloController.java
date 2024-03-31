package com.haroun.tempusfugit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static com.haroun.tempusfugit.HelloApplication.*;
import static com.haroun.tempusfugit.HelloApplication.prefetchFolderWeight;

public class HelloController {
    @FXML
    private TextField tufID;

    @FXML
    private TextField tsfID;

    @FXML
    private TextField pfID;

    @FXML
    private TextField tufWID;

    @FXML
    private TextField tsfWID;

    @FXML
    private TextField pfWID;

    @FXML
    private Button eliminateID;

    @FXML
    protected void eliminateTemp(ActionEvent event) {
        tufID.setText(tempUserFolderLocation);
        tsfID.setText(tempSystemFolderLocation);
        pfID.setText(prefetchFolderLocation);

        tufWID.setText(tempUserFolderWeight);
        tsfWID.setText(tempSystemFolderWeight);
        pfWID.setText(prefetchFolderWeight);
    }
}