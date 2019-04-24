package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/*

1. HBox should contain the following buttons: Add Course, Add Student, Drop Student, Display Registration

2. Add Course stage
3. Add Student stage
4. Drop Student stage
5. Display Registration stage

The Add Course stage should contain a text field in the VBox section: course name and a button "Submit"
The Add Student stage should contain three text fields  in the VBox section : Student Id, First Name, Last Name and a button "Add Submit"
The Drop student should contain Student ID, First Name, Last Name and a button "Drop Student"
The Display registration should display the following labels: 
Course Name, Student ID, First Name, Last Name
INEW24, 1233, John Doe 
INEW24, 1274, Kevin Johnson 
*/

public class Main extends Application {
	static Stage SetupPrimaryStage = new Stage();
	static Stage SetupCourseStage = new Stage();
	static Stage SetupStudentStage = new Stage();
	static Stage SetupDropStudentStage = new Stage();
	static Stage SetupDisplayRegStage = new Stage();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btnAddCourse = new Button("Add Course");
			Button btnAddStudent = new Button("Add Student");
			Button btnDropStudent = new Button("Drop Student");
			Button btnDisplayReg = new Button("Display Registration");
			
			SetupPrimaryStage(primaryStage, btnAddCourse, btnAddStudent, btnDropStudent, btnDisplayReg);
			SetupCourseStage(btnAddCourse);
			SetupStudentStage(btnAddStudent);
			SetupDropStudentStage(btnDropStudent);
			SetupDisplayRegStage(btnDisplayReg);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void SetupDisplayRegStage(Button btnDisplayReg) {
		//Create a pane to hold the controls
		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		//Create Text Field and place on pane
		pane.getChildren().addAll(
		new Label("Course Name:"), new Label("Student ID:"), new Label("First Name:"), new Label("Last Name:"), 
		new Label("INEW24"), new Label("1233"), new Label("John Doe"), 
		new Label("INEW24"), new Label("1274"), new Label("Kevin Johnson"));
        
		Button btnCloseRegistration = new Button("Close Registration");
		pane.getChildren().add(btnCloseRegistration);
		//Create a scene and place pane on it
		Scene scene = new Scene(pane);
		SetupDisplayRegStage.setTitle("Richland Course & Student Registration Tool");
		SetupDisplayRegStage.setScene(scene);
		btnCloseRegistration.setDefaultButton(true);
		btnDisplayReg.setOnAction(e -> {  
			SetupDisplayRegStage.show();    
			
		});

		btnCloseRegistration .setOnAction(e -> {  
			SetupDisplayRegStage.close();  
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	static void SetupPrimaryStage(Stage primaryStage, Button btnAddCourse, Button btnAddStudent, Button btnDropStudent, Button btnDisplayReg) {
		//Create a pane to hold the controls
		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		//Define button controls

		
		//place the controls on pane
		pane.getChildren().addAll(btnAddCourse,btnAddStudent,btnDropStudent,btnDisplayReg);
		
		//Create a scene and place pane on it
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Richland Course & Student Registration Tool");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	static void SetupCourseStage(Button btnAddCourse) {
		//Create a pane to hold the controls
		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		//Create Text Field and place on pane
		pane.getChildren().addAll(new Label("Course Name:"), new TextField());
        
        //Create button
        Button btnSubmit = new Button("SUBMIT");
		
		//place the button on pane
        pane.getChildren().add(btnSubmit);
		
		//Create a scene and place pane on it
		Scene scene = new Scene(pane);
		SetupCourseStage.setTitle("Richland Course & Student Registration Tool");
		SetupCourseStage.setScene(scene);
		btnAddCourse.setOnAction(e -> {
			SetupCourseStage.show();
		});
		btnSubmit.setOnAction(e -> {  
			SetupCourseStage.close();  
		});

	}
	
	static void SetupStudentStage(Button btnAddStudent) {
		//Create a pane to hold the controls
		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		//Create Text Field and place on pane
		pane.getChildren().addAll(new Label("Student ID:"), new TextField(), 
		new Label("First Name:"), new TextField(), new Label("Last Name:"), new TextField());
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        
        //Create button
        Button btnAddSubmit = new Button("Add Submit");
		
		//place the button on pane
        pane.getChildren().add(btnAddSubmit);
		
		//Create a scene and place pane on it
		Scene scene = new Scene(pane);
		SetupStudentStage.setTitle("Richland Course & Student Registration Tool");
		SetupStudentStage.setScene(scene);
		btnAddStudent.setOnAction(e -> {  
			SetupStudentStage.show();     
		});
		btnAddSubmit.setOnAction(e -> {  
			SetupStudentStage.close();  
		});
                         
		
	}

	static void SetupDropStudentStage(Button btnDropStudent) {
		//Create a pane to hold the controls
		VBox pane = new VBox();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		//Create Text Field and place on pane
		pane.getChildren().addAll(new Label("Student ID:"), new TextField(), 
		new Label("First Name:"), new TextField(), new Label("Last Name:"), new TextField());
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        
        //Create button
        Button btnDropSubmit = new Button("Drop Student");
		
		//place the button on pane
        pane.getChildren().add(btnDropSubmit);
		
		//Create a scene and place pane on it
		Scene scene = new Scene(pane);
		SetupDropStudentStage.setTitle("Richland Course & Student Registration Tool");
		SetupDropStudentStage.setScene(scene);
		btnDropStudent.setOnAction(e -> {  
			SetupDropStudentStage.show();     
		});
		btnDropSubmit.setOnAction(e -> {  
			SetupDropStudentStage.close();  
		});
	}
}

