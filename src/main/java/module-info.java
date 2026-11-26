module com.proyecto {
    requires javafx.controls;
    requires java.sql;
    requires javafx.fxml;
    opens com.proyecto to javafx.fxml;
    opens com.proyecto.controllers to javafx.fxml;
    exports com.proyecto;
   
}
