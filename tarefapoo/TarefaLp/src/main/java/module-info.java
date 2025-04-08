module org.example {
    requires javafx.fxml;
    requires java.management;
    requires org.controlsfx.controls;

    opens org.example to javafx.fxml;
    opens org.example.controller;
    exports org.example;
}
