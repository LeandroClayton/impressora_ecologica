module com.ifpr.edu.impressora {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ifpr.edu.impressora to javafx.fxml;
    exports com.ifpr.edu.impressora;
}
