module com.example.desktop_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desktop_project to javafx.fxml;
    exports com.example.desktop_project;
}