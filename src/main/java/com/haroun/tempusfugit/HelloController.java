package com.haroun.tempusfugit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static com.haroun.tempusfugit.HelloApplication.*;

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
    private Label userLabelID;

    @FXML
    private Label systemLabelID;

    @FXML
    private Label prefetchLabelID;

    @FXML
    private Button eliminateID;

    @FXML
    protected void eliminateTemp(ActionEvent event) {
        try {
            // Cargar la vista dialog-view.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dialog-view.fxml"));
            Parent root = loader.load();

            // Obtener el controlador de la vista cargada
            DialogViewController dialogController = loader.getController();

            // Crear una nueva escena y configurarla con la vista cargada
            Scene scene = new Scene(root);

            // Crear un nuevo Stage (ventana) para la vista
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Dialogo"); // Título de la ventana
            stage.initModality(Modality.APPLICATION_MODAL); // Bloquear interacción con otras ventanas
            stage.showAndWait(); // Mostrar la ventana y esperar hasta que se cierre
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize(){
        tufID.setText(tempUserFolderLocation);
        tsfID.setText(tempSystemFolderLocation);
        pfID.setText(prefetchFolderLocation);

        tufWID.setText(tempUserFolderWeight);
        tsfWID.setText(tempSystemFolderWeight);
        pfWID.setText(prefetchFolderWeight);

        userLabelID.setText(formattedUserPercentUsed+"%");
        systemLabelID.setText(String.valueOf(systemPercentUsed)+"%");
        prefetchLabelID.setText(String.valueOf(prefetchPercentUsed)+"%");
    }
}