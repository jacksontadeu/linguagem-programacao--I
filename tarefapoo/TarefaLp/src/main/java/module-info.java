module org.example {
    requires javafx.fxml;
    requires java.management;
    requires org.controlsfx.controls;
    requires javafx.graphics;
    requires java.desktop;

    opens org.example to javafx.fxml;
    opens org.example.controller;
    opens org.example.model;
    
    exports org.example;
}
