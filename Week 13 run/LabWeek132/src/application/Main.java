package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane pane = new BorderPane();
			
			//Place nodes in the pane
			pane.setTop(getHbox());
			pane.setLeft(getDetailPrimaryBox());
			
			//Create a scene and place it in the stage
			Scene scene = new Scene(pane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Richland Course & Student Registration Tool");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/* Method - Add controls to the horizontal pane */
	private HBox getHbox() {
		//Define button controls
		Button btnAddCourse = new Button("Add Course");
		Button btnAddStudent = new Button("Add Student");
		Button btnDropStudent = new Button("Drop Student");
		Button btnDisplayReg = new Button("Display Registration");
		
		//create button handler
		AddCourseHandler addCourseHandler = new AddCourseHandler();
		AddStudentHandler addStudentHandler = new AddStudentHandler();
		DropStudentHandler dropStudentHandler = new DropStudentHandler();
		DisplayCourseRegHandler displayCourseHandler = new DisplayCourseRegHandler(); 
		
		//attach handlers to buttons
		btnAddCourse.setOnAction(addCourseHandler);
		btnAddStudent.setOnAction(addStudentHandler);
		btnDropStudent.setOnAction(dropStudentHandler);
		btnDisplayReg.setOnAction(displayCourseHandler);
				
		HBox hBox = new HBox(15);
		hBox.setPadding(new Insets(15,15,15,15));
		hBox.setStyle("-fx-background-color: gold");
		hBox.getChildren().add(btnAddCourse);
		hBox.getChildren().add(btnAddStudent);
		hBox.getChildren().add(btnDropStudent);
		hBox.getChildren().add(btnDisplayReg);
		ImageView imageView = new ImageView(new Image("images/rlc1.jpg"));
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		
		hBox.getChildren().add(imageView);
		return hBox;
	}
	
	/* Method - Add controls to vertical columns on the primary scene */
	private VBox getDetailPrimaryBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Detail Section"));
		return vBox;
	}	
	
	/*Method - Add controls to course scene */
	private VBox getDetailCourseBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Course Name:"));
		vBox.getChildren().add(new TextField());
		return vBox;
	}
	
	/*Method - Add controls to add student scene */
	private VBox getDetailAddStudentBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Student Name:"));
		vBox.getChildren().add(new TextField());
		return vBox;
	}
	
	/*Method - Add controls to drop student scene */
	private VBox getDetailDropStudentBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Student ID:"));
		vBox.getChildren().add(new TextField());
		return vBox;
	}
	
	/*Method - Add controls to display course enrollment scene */
	private VBox getDetailCourseEnrollBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Student ID:"));
		return vBox;
	}
}
