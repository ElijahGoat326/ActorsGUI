module com.example.actorsgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.actorsgui to javafx.fxml;
    exports com.example.actorsgui;
}