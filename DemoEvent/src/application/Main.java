package application;
	
import javafx.application.Application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox pane = new HBox(10);
			pane.setAlignment(Pos.CENTER);
			BorderPane root = new BorderPane();
			Button ok = new Button("Ok");
			Button cancel = new Button("Cancel");
			okHandlerClass handler1 = new okHandlerClass();
			cancelHandlerClass handler2 = new cancelHandlerClass();
			cancel.setOnAction(handler2);
			ok.setOnAction(handler1);
			
			pane.getChildren().addAll(ok, cancel);
			Scene scene = new Scene(pane,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	class okHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			System.out.println("Ok button clicked");
			
		}
		
	}
	
	class cancelHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			System.out.println("Cancel button clicked");
			
		}
		
	}
}
