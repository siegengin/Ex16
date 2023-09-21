module com.example.ex16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex16 to javafx.fxml;
    exports com.example.ex16;
}