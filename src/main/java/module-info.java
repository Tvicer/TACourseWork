module com.example.tacoursework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tacoursework to javafx.fxml;
    exports com.example.tacoursework;
}