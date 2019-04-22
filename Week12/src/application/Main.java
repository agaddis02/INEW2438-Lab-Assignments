package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Parent;
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
			
			Stage addStudentStage = new Stage();
			Stage dropStudentStage = new Stage();
			Stage addCourseStage = new Stage();
			Stage displayRegistrationStage = new Stage();
			HBox hBox = new HBox(15);
			VBox vBox = new VBox(15);
			ImageView imageView = new ImageView(new Image("images/rlc1.jpg"));
			BorderPane pane = new BorderPane();
			Scene scene = new Scene(pane);
			
			//Define button controls
			Button addCourse = new Button("Add Course");
			Button addStudent = new Button("Add Student");
			Button dropStudent = new Button("Drop Student");
			Button displayReg = new Button("Display Registration");	
			addCourseHandler newCourse = new addCourseHandler();
			addCourse.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	Label label1 = new Label("Name:");
			    	TextField textField = new TextField ();
			    	BorderPane coursePane = new BorderPane();
			    	Scene course = new Scene(coursePane);
			    	hBox.getChildren().addAll(label1, textField);
			    	hBox.setSpacing(10);
			    	coursePane.setTop(hBox);
			    	primaryStage.setScene(course);
			    	primaryStage.show();
			    	
			    	System.out.println("Hello");
			    }});

			hBox.setPadding(new Insets(15,15,15,15));
			hBox.setStyle("-fx-background-color: gold");

			imageView.setFitHeight(100);
			imageView.setFitWidth(100);
			hBox.getChildren().addAll(addCourse, addStudent, dropStudent, displayReg, imageView);
			
			
			
			
			// Vbox ceation

			vBox.setPadding(new Insets(15, 5, 5, 5));
			vBox.getChildren().add(new Label("Detail Section"));
			
			//Create border pane object

			
			//Place nodes in the pane
			pane.setTop(hBox);
			pane.setLeft(vBox);
			
			//Create a scene and place it in the stage

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Richland Course & Student Registration Tool");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/* Method - Application entry  */
	public static void main(String[] args) {
		launch(args);
	}
	
	
	class addStudentHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
		}
		
	}
	
	
	class dropStudentHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class addCourseHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {

		}
		public void action(HBox hBox) {
			Label label1 = new Label("Name:");
			TextField textField = new TextField ();
			hBox.getChildren().addAll(label1, textField);
			hBox.setSpacing(10);
		}
	}

	
	class displayRegistrationHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
}
