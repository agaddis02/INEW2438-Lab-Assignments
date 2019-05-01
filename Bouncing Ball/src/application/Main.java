package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Create a ball pane
			BallPane ballPane = new BallPane();
			
			//pause and resume animation
			ballPane.setOnMousePressed(e -> ballPane.pause());
			ballPane.setOnMouseReleased(e -> ballPane.play());
			
			//increase and decrease animation
			ballPane.setOnKeyPressed(e -> {
				if (e.getCode() == KeyCode.UP) {
					ballPane.increaseSpeed();
				}
				else if (e.getCode() == KeyCode.DOWN) {
					ballPane.decreaseSpeed();
				}
			});		
			Scene scene = new Scene(ballPane,250,150);
			primaryStage.setTitle("Richland Bouncing Ball App");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			ballPane.requestFocus();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
