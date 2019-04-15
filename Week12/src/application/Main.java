package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;


public class Main extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			// Create buttons
			Button addStudent = new Button("Add Student");
			Button addCourse = new Button("Add Course");
			Button dropStudent = new Button("Drop Student");
			Button enrollment = new Button("Display Enrollment");
			
			// Button Actions
			addStudent.setOnAction(e -> {
				
			});
			
			// Change position of buttons
			addCourse.setTranslateY(-80);
			addStudent.setTranslateY(-120);
			dropStudent.setTranslateY(-40);
			enrollment.setTranslateY(0);
			
			// Create instance of StackPane
			StackPane layout = new StackPane();
			
			// add buttons to Stack Pane
			layout.getChildren().addAll(addStudent, addCourse, dropStudent, enrollment);
			
			// Set scene
			Scene scene = new Scene(layout, 200, 300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setResizable(false);
			primaryStage.setTitle("Class Registration");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
