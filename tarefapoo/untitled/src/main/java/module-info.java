module com.datatech {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.datatech to javafx.fxml;
    exports com.datatech;
}
