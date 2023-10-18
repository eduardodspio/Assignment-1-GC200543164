package assignment_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TableView<?> taskTable;
    @FXML
    private TextField taskNameField;
    @FXML
    private TextField taskDescriptionField;

    @FXML
    private void initialize() {
        // Initialize the TableView, load tasks, etc.
    }

    @FXML
    private void onAddTask() {
        // Add task logic
    }

    @FXML
    private void onUpdateTask() {
        // Update task logic
    }

    @FXML
    private void onDeleteTask() {
        // Delete task logic
    }
}