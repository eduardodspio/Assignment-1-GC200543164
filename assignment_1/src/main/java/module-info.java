module assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens assignment_1 to javafx.fxml;
    exports assignment_1;
}