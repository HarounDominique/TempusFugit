package com.haroun.tempusfugit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {

    public static String tempUserFolderLocation;
    public static String tempSystemFolderLocation;
    public static String prefetchFolderLocation;
    public static String tempUserFolderWeight;
    public static String tempSystemFolderWeight;
    public static String prefetchFolderWeight;

    private static int iterator = 0;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 340, 560);
        stage.setTitle("TempusFugit");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        bussinessLogic();
        launch();
    }

    public static void bussinessLogic() {
        String[] folderPaths = {
                System.getProperty("java.io.tmpdir"), // Carpeta temporal del usuario
                System.getenv("windir") + "\\temp", // Carpeta temporal del sistema en Windows
                System.getenv("windir") + "\\Prefetch", // Carpeta Prefetch en Windows
        };

        for (String folderPath : folderPaths) {

            iterator++;

            File folder = new File(folderPath);
            if (folder.exists() && folder.isDirectory()) {
                long totalSizeBytes = 0;

                File[] files = folder.listFiles();
                if (files != null) {
                    for (File file : files) {
                        totalSizeBytes += file.length();
                    }
                }

                System.out.println("Carpeta: " + folderPath);
                System.out.println("Tamaño ocupado: " + formatSize(totalSizeBytes));
                System.out.println();

                if(iterator==1){
                    tempUserFolderLocation = folderPath;
                    tempUserFolderWeight = formatSize(totalSizeBytes);
                } else if (iterator==2) {
                    tempSystemFolderLocation = folderPath;
                    tempSystemFolderWeight = formatSize(totalSizeBytes);
                } else if(iterator ==3){
                    prefetchFolderLocation = folderPath;
                    prefetchFolderWeight = formatSize(totalSizeBytes);
                }
            }
        }
    }

    private static String formatSize(long size) {
        if (size < 1024) {
            return size + " bytes";
        } else if (size < 1024 * 1024) {
            return size / 1024 + " KB";
        } else if (size < 1024 * 1024 * 1024) {
            return size / (1024 * 1024) + " MB";
        } else if (size < 1024L * 1024 * 1024 * 1024) {
            return size / (1024 * 1024 * 1024) + " GB";
        } else {
            return size / (1024L * 1024 * 1024 * 1024) + " TB";
        }
    }
}
