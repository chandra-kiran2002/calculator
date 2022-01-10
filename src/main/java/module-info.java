module com.example.first_java_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.first_java_fx to javafx.fxml;
    exports com.example.first_java_fx;
}