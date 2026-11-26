package com.proyecto.controllers;

import javafx.scene.control.Alert;

public class MainController {

    public void saludar(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
}
