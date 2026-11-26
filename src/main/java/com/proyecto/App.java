package com.proyecto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.SQLException;

import com.proyecto.database.dbConnect;


//JavaFX App

public class App extends Application {
    @Override
    public void start(Stage stage) {
        
        
        try {
            Connection conn = dbConnect.connect();
            System.out.println("todo jala.");
            
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("No se pudo conectar a la base de datos: " + e.getMessage());
            }
            
            /**
            /*
        
        VBox layout = new VBox();

        layout.setSpacing(15);
        layout.setAlignment(javafx.geometry.Pos.CENTER);

        Label lblName = new Label("Name:");
        lblName.setText("Name:");
        TextField inputName = new TextField();
        inputName.setMaxWidth(200);

        Label lblEmail = new Label();
        lblEmail.setText("Email:");
        TextField inputEmail = new TextField();
        inputEmail.setMaxWidth(200);
        

        Label lblPhone = new Label();
        lblPhone.setText("Phone:");
        TextField inputPhone = new TextField();
        inputPhone.setMaxWidth(200);


        Label lblPassword = new Label();
        lblPassword.setText("Password:");
        TextField inputPassword = new TextField();
        inputPassword.setMaxWidth(200);
        

        Label lblPassword2 = new Label();
        lblPassword2.setText("Confirm Password:");
        TextField inputPassword2 = new TextField();
        inputPassword2.setMaxWidth(200);


        Button btnSave = new Button("Save");

        btnSave.setOnAction(e -> {
            //Deshabilitamos el boton de guardar para que no se pueda presionar mientras se valida la información
            btnSave.setDisable(true);

            String name = inputName.getText().toLowerCase();

            Alert notification = new Alert(Alert.AlertType.ERROR);
            Alert successfulNotification = new Alert(Alert.AlertType.INFORMATION);
            
            String validCharacter = "^[a-z]+$";

            //valida longitud del nombre de usuario
            if(name.length() <= 3 || name.length() > 20 || !name.matches(validCharacter)){

                //soltamos error
                notification.setTitle("Error de nombre de usuario");
                notification.setContentText("¡Para crear una cuenta, debes mandar un nombre con al menos 3 caracteres y máximo 20!");
                //espera a que el usuario cierre la ventana de error
                notification.showAndWait();
                //habilitamos el boton de guardar
                btnSave.setDisable(false);
                return;

            }
            
            String regexPwd = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&*!?_.-]).{8,}$";
            String password = inputPassword.getText();
            String password2 = inputPassword2.getText();

            if (!password.matches(regexPwd) || !password.equals(password2)){

                notification.setTitle("Error de contraseña");
                notification.setContentText("¡Las contraseñas no coinciden o no cumplen los requisitos!\nMinimo 8 caracteres\nAl menos una letra mayúscula\nAl menos una letra minúscula\nUn número\nUn caracter especial de las siguientes opciones: @#$%&*!?_.-");

                notification.showAndWait();
                btnSave.setDisable(false);
                return;
        
            }
        
             
            String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*\\.(com|mx)$";
            String email = inputEmail.getText();

            if (!email.matches(EMAIL_REGEX)) {

                notification.setTitle("Error de correo electrónico");
                notification.setContentText("¡El correo electrónico no es válido!");
                notification.showAndWait();
                btnSave.setDisable(false);
                return;

            }

            String PHONE_REGEX = "^\\d{10}$";
            String phone = inputPhone.getText();
            
            
         

            //Funcion que almacena el usuario en la base de datos
            successfulNotification.setTitle("Usuario creado con éxito :v");

            successfulNotification.setContentText("El usuario ya puede iniciar sesión con su nombre de usuario y contraseña");


        });

  
        
        layout.getChildren().addAll(lblName, inputName, lblEmail, inputEmail, lblPhone, inputPhone, lblPassword, inputPassword, lblPassword2, inputPassword2, btnSave);
        layout.setSpacing(10);  
        
        */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/pages/Login.fxml"));
        Parent root;
        try {
            root = loader.load();
        } catch (Exception e) {
         System.out.println("Error loading FXML: " + e.getMessage());
            return;
        }
    
    
    
        Scene scene = new Scene(root, 800, 600);    
        stage.setScene(scene);
        stage.show();
        scene.getStylesheets().add(getClass().getResource("/CSS/styles.css").toExternalForm());


        // Scene scene = new Scene(layout, 800, 600);



        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + "."+ " VALGO PURA VERGA, YA TENGO C1, NO TENGO QUE PAGARLO ");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}