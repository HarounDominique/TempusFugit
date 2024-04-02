package com.haroun.tempusfugit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.event.EventType;

import java.lang.reflect.InvocationTargetException;

import static com.haroun.tempusfugit.HelloApplication.*;

public class DialogViewController {

    private HelloController helloController;

    @FXML
    private Button deleteID;

    @FXML
    private Button cancelID;

    // Método para establecer la referencia al controlador de la primera vista
    public void setHelloController(HelloController helloController) {
        this.helloController = helloController;
    }

    @FXML
    protected void cancelButton(ActionEvent event) throws InvocationTargetException {
        Stage stage = (Stage) cancelID.getScene().getWindow();
        stage.close();

        Stage parentStage = (Stage) stage.getOwner();
        if (parentStage != null) {
            parentStage.close();
        }

        bussinessLogic();

        helloController.updateFolderSizes(tempUserFolderWeight, tempSystemFolderWeight, prefetchFolderWeight);
    }

    @FXML
    protected void deleteButton(ActionEvent event) {
        deleteFolderContent(System.getProperty("java.io.tmpdir"));
        deleteFolderContent(System.getenv("windir") + "\\temp");
        deleteFolderContent(System.getenv("windir") + "\\Prefetch");

        bussinessLogic();

        helloController.updateFolderSizes(tempUserFolderWeight, tempSystemFolderWeight, prefetchFolderWeight);

        Stage stage = (Stage) cancelID.getScene().getWindow();
        stage.close();
    }

    public class ViewClosedEvent extends Event {
        public static final EventType<ViewClosedEvent> VIEW_CLOSED_EVENT = new EventType<>(Event.ANY, "VIEW_CLOSED_EVENT");

        public ViewClosedEvent() {
            super(VIEW_CLOSED_EVENT);
        }
    }
}
